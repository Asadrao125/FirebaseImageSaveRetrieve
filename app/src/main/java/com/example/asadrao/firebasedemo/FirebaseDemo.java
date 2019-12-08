package com.example.asadrao.firebasedemo;

import android.app.Application;

import com.firebase.client.Firebase;

public class FirebaseDemo extends Application
{
    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);

    }
}