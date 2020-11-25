package com.example.registrationdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menuu extends AppCompatActivity {

    private Button btnMenu1, btnMenu2;
    private Button btnMenu3, btnMenu4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuu);

        btnMenu1 = findViewById(R.id.btnMenu1);
        btnMenu2 = findViewById(R.id.btnMenu2);
        btnMenu3 = findViewById(R.id.btnMenu3);
        btnMenu4 = findViewById(R.id.btnMenu4);

        btnMenu1.setOnClickListener((View.OnClickListener) this);
        btnMenu2.setOnClickListener((View.OnClickListener) this);
        btnMenu3.setOnClickListener((View.OnClickListener) this);
        btnMenu4.setOnClickListener((View.OnClickListener) this);
    }


    public void onClick(View v) {
        if (v.getId() == R.id.btnMenu1){
            Intent menu1 = new Intent(this, menu1.class);
            startActivity(menu1);
        }else if(v.getId() == R.id.btnMenu2){
            Intent menu2 = new Intent(this, menu2.class);
            startActivity(menu2);
        }else if(v.getId() == R.id.btnMenu3){
            Intent menu3 = new Intent(this, menu3.class);
            startActivity(menu3);
        }else if(v.getId() == R.id.btnMenu4){
            Intent menu4 = new Intent(this, menu3.class);
            startActivity(menu4);
        }
    }
}