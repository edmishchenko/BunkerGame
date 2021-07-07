package com.example.bunkertest;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class Card_Info extends AppCompatActivity {
    TextView tvGender;
    TextView tvAge;
    TextView tvProfesion;
    private int position;
    String Player_info[][];
    String player_info[];
    int i = 0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_cardinfo);
        tvGender = (TextView) findViewById(R.id.tvGender);
        tvAge = (TextView) findViewById(R.id.tvAge);
        tvProfesion = (TextView) findViewById(R.id.tvProfesion);
        Intent intent_7 = getIntent();
        if (intent_7 != null){
            position = intent_7.getIntExtra("pos_item", 0);
        }
        Object entries[] = (Object[]) getIntent().getExtras().get("players_info");
        Player_info = new String[entries.length][];
        for (Object obj : entries) {
            player_info = (String[])obj;

            //создаем массив по столбцам по количеству столбцов
            Player_info[i] = new String[player_info.length];

            for (int j=0; j<player_info.length; j++) {

                //заполняем элементы результирующего массива
                Player_info[i][j] = player_info[j];
            }
            i++;
        }

        switch (position){
            case 0:
                setTextTV();
                break;
            case 1:
                setTextTV();
                break;
            case 2:
                setTextTV();
                break;
            case 3:
                setTextTV();
                break;
            case 4:
                setTextTV();
                break;
            case 5:
                setTextTV();
                break;
            case 6:
                setTextTV();
                break;
            case 7:
                setTextTV();
                break;
            case 8:
                setTextTV();
                break;
            case 9:
                setTextTV();
                break;
            case 10:
                setTextTV();
                break;
            case 11:
                setTextTV();
                break;
            case 12:
                setTextTV();
                break;
            case 13:
                setTextTV();
                break;
            case 14:
                setTextTV();
                break;
            case 15:
                setTextTV();
                break;
            case 16:
                setTextTV();
                break;
            case 17:
                setTextTV();
                break;
            case 18:
                setTextTV();
                break;
            case 19:
                setTextTV();
                break;
            case 20:
                setTextTV();
                break;
            case 21:
                setTextTV();
                break;
            case 22:
                setTextTV();
                break;
            case 23:
                setTextTV();
                break;
            case 24:
                setTextTV();
                break;
            case 25:
                setTextTV();
                break;
            case 26:
                setTextTV();
                break;
            case 27:
                setTextTV();
                break;
            default:
                break;

        }
    }
    private void setTextTV(){
        tvGender.setText(Player_info[position][0]);
        tvAge.setText(Player_info[position][1]);
        tvProfesion.setText(Player_info[position][2]);
    }
}
