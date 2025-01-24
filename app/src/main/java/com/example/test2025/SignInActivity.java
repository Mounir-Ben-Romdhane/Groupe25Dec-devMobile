package com.example.test2025;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SignInActivity extends AppCompatActivity {
    //Declaration des variables
    private TextView goToSignUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        // Affectation des variables
        goToSignUp = findViewById(R.id.go_to_sign_up);

        // actions
        goToSignUp.setOnClickListener(v -> {
            // to do after click to text view
            startActivity(new Intent(this, SignUpActivity.class));
        });

    }

    // Declaration des methodes
}