package com.example.bunkertest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.Random;


public class Players_card extends AppCompatActivity {
    TextView tv[] = new TextView[28];
    String Genders[];
    String Profesions[];
    String Player_info[][] = new String[28][3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_players_card);
        Bundle myBundle = getIntent().getExtras();
        String name_players[] = myBundle.getStringArray("name_lst");
        //Add StringArray
        Resources res = getResources();
        Genders = res.getStringArray(R.array.Gender);
        Profesions = res.getStringArray(R.array.Profesion);
        //Add all pos to players
        Random random = new Random();
        for (int i = 0; i < 28; i++){
            Player_info[i][0] = Genders[random.nextInt(Genders.length)];
            Player_info[i][1] = Integer.toString(15 + (int) Math.round((Math.random() * 65) + 1)) ;
            Player_info[i][2] = Profesions[random.nextInt(Profesions.length)];
            System.out.println(Player_info[i][0] + Player_info[i][1] + Player_info[i][2]);
        }
        //ListView
        ListView Lv_players_card = (ListView) findViewById(R.id.Lv_players_card);
        //Create adapter
        ArrayAdapter<String> adapted_players_card = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, name_players);
        Lv_players_card.setAdapter(adapted_players_card);
        Lv_players_card.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent_6 = new Intent(Players_card.this, Card_Info.class);
                intent_6.putExtra("pos_item", position);
                intent_6.putExtra("players_info", Player_info);
                startActivity(intent_6);
            }
        });
    }
}
