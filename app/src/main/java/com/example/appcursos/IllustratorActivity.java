package com.example.appcursos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class IllustratorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_illustrator);
    }

    public void chamaIllustrator(View v) {
        Intent i;
        i = new Intent(this, Illustrator2Activity.class);
        startActivity(i);
    }
}