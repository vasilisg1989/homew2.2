package com.example.mycalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText edTxt_num1 = findViewById(R.id.edTxt_num1);
        EditText edTxt_num2 = findViewById(R.id.edTxt_num2);
        EditText edTxt_result = findViewById(R.id.edTxt_result);

        Button btn_add = findViewById(R.id.btn_add);


        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strNum1 = edTxt_num1.getText().toString();
                String strNum2 = edTxt_num2.getText().toString();

                double result = Double.valueOf(strNum1) + Double.valueOf(strNum2);

                edTxt_result.setText(String.valueOf(result));
            }
        });

        Button btn_minus = findViewById(R.id.btn_minus);

        btn_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strNum1 = edTxt_num1.getText().toString();
                String strNum2 = edTxt_num2.getText().toString();

                double result = Double.valueOf(strNum1) - Double.valueOf(strNum2);

                edTxt_result.setText(String.valueOf(result));
            }
        });

        Button btn_multi = findViewById(R.id.btn_multi);

        btn_multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strNum1 = edTxt_num1.getText().toString();
                String strNum2 = edTxt_num2.getText().toString();

                double result = Double.valueOf(strNum1) * Double.valueOf(strNum2);

                edTxt_result.setText(String.valueOf(result));
            }
        });

        Button btn_division = findViewById(R.id.btn_division);

        btn_division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strNum1 = edTxt_num1.getText().toString();
                String strNum2 = edTxt_num2.getText().toString();

                double result = Double.valueOf(strNum1) / Double.valueOf(strNum2);

                edTxt_result.setText(String.valueOf(result));
            }
        });

        Button btn_clear = findViewById(R.id.btn_clear);

        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edTxt_num1.setText("");
                edTxt_num2.setText("");
                edTxt_result.setText("");


            }


        });
    }
}