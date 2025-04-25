package com.example.dozy.FirebaseService;


import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;

public class FirebaseService {
    private static final String TAG = "FirebaseService";

    private static FirebaseService instance;
    private final FirebaseAuth mAuth;
    private final FirebaseFirestore db;

    private FirebaseService(){
        mAuth = FirebaseAuth.getInstance();
        db = FirebaseFirestore.getInstance();
    }
    public static FirebaseService getInstance(){
        if(instance == null){
            instance = new FirebaseService();
        }
        return instance;
    }

    public void registerUser(User user, String password, OnCompleteListener<AuthResult> listener){
        mAuth.createUserWithEmailAndPassword(user.getEmail(),password)
                .addOnCompleteListener(task -> {
                    if(task.isSuccessful()){
                        FirebaseUser firebaseUser = mAuth.getCurrentUser();
                        if(firebaseUser != null){
                            String uid = firebaseUser.getUid();
                            user.setUid(uid);

                            db.collection("Users").document(uid).set(user)
                                    .addOnCompleteListener(unused ->{
                                        Log.d(TAG, "User Created Successfully");

                                        db.collection("users").document(uid)
                                                .collection("tasks")
                                                .document("_init")
                                                .set(new HashMap<>())
                                                .addOnSuccessListener(aVoid -> Log.d(TAG, "Coleccion Task Initialized"))
                                                .addOnFailureListener(e -> Log.w(TAG,"error starting Task",e));
                                    })
                                    .addOnFailureListener(e -> Log.w(TAG,"Error creating User document",e));
                        }
                    }
                    listener.onComplete(task);
                });
    }

    public void loginUser(String email, String password, OnCompleteListener<AuthResult> listener) {
        mAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(listener);
    }

    public void logoutUser() {
        mAuth.signOut();
    }

    public FirebaseUser getCurrentUser(){
        return mAuth.getCurrentUser();
    }

    public String getUserId() {
        FirebaseUser user = getCurrentUser();
        return user != null ? user.getUid() : null;
    }

    public FirebaseFirestore getDb() {
        return db;
    }

    public CollectionReference getTasksCollection() {
        return db.collection("users").document(getUserId()).collection("tasks");
    }

    public CollectionReference getSubjectsCollection() {
        return db.collection("users").document(getUserId()).collection("subjects");
    }

    public CollectionReference getUsersCollection() {
        return db.collection("users");
    }




}
