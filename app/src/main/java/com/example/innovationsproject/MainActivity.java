package com.example.innovationsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.PopupMenu;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button annButton = findViewById(R.id.annButton);
        Button claButton = findViewById(R.id.claButton);
        Button ageButton = findViewById(R.id.ageButton);
        Button notButton = findViewById(R.id.notButton);
        Button dirButton = findViewById(R.id.dirButton);
        Button setButton = findViewById(R.id.setButton);
        ImageButton proButton = findViewById(R.id.proButton);

        annButton.setOnClickListener(this);
        claButton.setOnClickListener(this);
        ageButton.setOnClickListener(this);
        notButton.setOnClickListener(this);
        dirButton.setOnClickListener(this);
        setButton.setOnClickListener(this);
        proButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.annButton:
                Intent intent = new Intent(this, announcements.class);
                startActivity(intent);
                break;
            case R.id.claButton:
                Intent intent2 = new Intent(this, classes.class);
                startActivity(intent2);
                break;
            case R.id.ageButton:
                Intent intent3 = new Intent(this, agenda.class);
                startActivity(intent3);
                break;
            case R.id.notButton:
                Intent intent4 = new Intent(this, notes.class);
                startActivity(intent4);
                break;
            case R.id.dirButton:
                Intent intent5 = new Intent(this, directory.class);
                startActivity(intent5);
                break;
            case R.id.setButton:
                Intent intent6 = new Intent(this, settings.class);
                startActivity(intent6);
                break;
            case R.id.proButton:

                break;
        }
    }
}