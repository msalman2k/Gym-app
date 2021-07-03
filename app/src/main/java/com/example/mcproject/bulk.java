package com.example.mcproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class bulk extends AppCompatActivity {


    Button btn_exercise_bulk,btn_diet_bulk,btn_athome_bulk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bulk);
        getSupportActionBar().hide();

        btn_exercise_bulk   = findViewById(R.id.btn_exercise_bulk);
        btn_diet_bulk = findViewById(R.id.btn_diet_bulk);
        btn_athome_bulk = findViewById(R.id.btn_athome_bulk);

        getSupportFragmentManager().beginTransaction().add(R.id.maincontainer1, new Bulk_exercise()).commit();


        btn_exercise_bulk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.maincontainer1, new Bulk_exercise()).commit();
            }
        });
        btn_diet_bulk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.maincontainer1, new Bulk_diet()).commit();
            }
        });
        btn_athome_bulk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.maincontainer1, new Bulk_athome()).commit();
            }
        });

    }
}