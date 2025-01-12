package com.example.test2025;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Declaration des variables
    private EditText firstNumber, secondNumber;
    private Button btnPlus;
    private TextView result;

    private String val1, val2, res;

    private int resultInt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Affectation des variables
        firstNumber = findViewById(R.id.first_number);
        secondNumber = findViewById(R.id.second_number);
        btnPlus = findViewById(R.id.btn_plus);
        result = findViewById(R.id.result);

        // actions
        btnPlus.setOnClickListener(v -> {
            val1 = firstNumber.getText().toString();
            val2 = secondNumber.getText().toString();
            resultInt = Integer.parseInt(val1) + Integer.parseInt(val2);
            res = Integer.toString(resultInt);

            result.setText("Result: "+ res);
        });
    }

    // Declaration des methodes
}