package com.example.bunkertest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;



public class Rules extends AppCompatActivity implements View.OnClickListener {
    Button Button_next_rules;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rules);
        //add values
        Button_next_rules = (Button) findViewById(R.id.Button_next_rules);
        Button_next_rules.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.Button_next_rules:
                // TODO Call main activity
                Intent intent = new Intent(this, MainMenu.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}