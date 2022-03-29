package com.example.appcursos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CorelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_corel);
    }

    public void chamaCorel(View v) {
        Intent i;
        i = new Intent(this, Corel2Activity.class);
        startActivity(i);
    }
}