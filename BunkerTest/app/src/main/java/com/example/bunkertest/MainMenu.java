package com.example.bunkertest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainMenu extends AppCompatActivity implements View.OnClickListener{
    Button Button_Start;
    Button Button_Settings;
    Button Button_Libary;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        //add values
        Button_Start = (Button) findViewById(R.id.Button_Start);
        Button_Start.setOnClickListener(this);
        Button_Settings = (Button) findViewById(R.id.Button_Settings);
        Button_Settings.setOnClickListener(this);
        Button_Libary = (Button) findViewById(R.id.Button_Libary);
        Button_Libary.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.Button_Start:
                // TODO Call Choice_qp
                Intent intent_1 = new Intent(this, Choice_qp.class);
                startActivity(intent_1);
                break;
            case R.id.Button_Settings:
                // TODO Call Settings
                Intent intent_2 = new Intent(this, Settings.class);
                startActivity(intent_2);
                break;
            case R.id.Button_Libary:
                // TODO Call Libary
                Intent intent_3 = new Intent(this, Library.class);
                startActivity(intent_3);
                break;
            default:
                break;
        }
    }
}