package com.example.registrationdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText number1, number2;
    Button btn_plus, btn_minus;
    Button btn_multi, btn_divide;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculus);

        number1 = findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);

        btn_plus = findViewById(R.id.btn_plus);
        btn_minus = findViewById(R.id.btn_minus);
        btn_multi = findViewById(R.id.btn_multi);
        btn_divide = findViewById(R.id.btn_divide);

        result = findViewById(R.id.result);

        btn_plus.setOnClickListener(this);
        btn_minus.setOnClickListener(this);
        btn_multi.setOnClickListener(this);
        btn_divide.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        int res = 0;

        if(view.getId() == R.id.btn_plus){

            res = Integer.parseInt(number1.getText().toString()) +
                    Integer.parseInt(number2.getText().toString());

        }else if(view.getId() == R.id.btn_minus){

            res = Integer.parseInt(number1.getText().toString()) -
                    Integer.parseInt(number2.getText().toString());

        }else if(view.getId() == R.id.btn_multi){

            res = Integer.parseInt(number1.getText().toString()) *
                    Integer.parseInt(number2.getText().toString());

        }else if(view.getId() == R.id.btn_divide){

            res = Integer.parseInt(number1.getText().toString()) /
                    Integer.parseInt(number2.getText().toString());

        }


        result.setText("Result: " + res);
    }

    public void btn_plusClicked(View view) {
        int res = Integer.parseInt(number1.getText().toString()) +
                Integer.parseInt(number2.getText().toString());

        result.setText("Result: " + res);
    }

    public void btn_minusClicked(View view) {
        int res = Integer.parseInt(number1.getText().toString()) -
                Integer.parseInt(number2.getText().toString());

        result.setText("Result: " + res);
    }

    public void btn_multiClicked(View view) {
        int res = Integer.parseInt(number1.getText().toString()) *
                Integer.parseInt(number2.getText().toString());

        result.setText("Result: " + res);
    }

    public void btn_divideClicked(View view) {
        int res = Integer.parseInt(number1.getText().toString()) /
                Integer.parseInt(number2.getText().toString());

        result.setText("Result: " + res);
    }
}