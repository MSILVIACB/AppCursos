package com.example.appcursos;

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

    public void chamaCorel (View v) {
        Intent i;
        i = new Intent (this, CorelActivity.class);
        startActivity(i);
    }

    public void chamaPhoto (View v) {
        Intent i;
        i = new Intent (this, PhotoActivity.class);
        startActivity(i);
    }

    public void chamaIllustrator (View v) {
        Intent i;
        i = new Intent (this, IllustratorActivity.class);
        startActivity(i);
    }

}