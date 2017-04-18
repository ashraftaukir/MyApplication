package com.example.hello.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private static final String TAG="TESTING";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        accessinggithub();

    }

    private void accessinggithub() {

        Log.d(TAG, "accessinggithub: "+"hello github");
    }
}
