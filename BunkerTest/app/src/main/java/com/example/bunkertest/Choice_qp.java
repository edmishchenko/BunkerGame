package com.example.bunkertest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class Choice_qp extends AppCompatActivity implements View.OnClickListener {
    Button Button_next_choice_qp;
    Button Less;
    Button More;
    TextView Qp_players;
     int i = 3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice_qp);
        //add values
        Button_next_choice_qp = (Button) findViewById(R.id.Button_next_choice_qp);
        Button_next_choice_qp.setOnClickListener(this);
        Less = (Button) findViewById(R.id.less);
        Less.setOnClickListener(this);
        More = (Button) findViewById(R.id.more);
        More.setOnClickListener(this);
        Qp_players = (TextView) findViewById(R.id.qp_players);

    }

    @Override
    public void onClick(View view) {
        int c = i;
        switch (view.getId()) {
            case R.id.Button_next_choice_qp:
                // TODO Call activity_players_name activity
                Intent intent1 = new Intent(this, Players_name.class);
                intent1.putExtra("myIntVariableName", c);
                startActivity(intent1);
                break;
            case R.id.less:
                if(i > 3){
                    i -= 1;
                }
                break;
            case R.id.more:
                if(i < 28) {
                    i += 1;
                }
                break;
            default:
                break;
        }
        String b = String.valueOf(i);
        Qp_players.setText(b);
    }
}