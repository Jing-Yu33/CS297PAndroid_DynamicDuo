package com.example.cs297pandroid_dynamicduo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void signUp(View view) {
        Intent intent = new Intent(this, SignUpActivity.class);

        startActivity(intent);
    }
    public void logIn(View view) {
        Intent intent = new Intent(this, LogInActivity.class);

        startActivity(intent);
    }
}