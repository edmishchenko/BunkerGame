package com.example.bunkertest;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.content.Intent;
import android.text.InputFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;



public class Players_name extends AppCompatActivity implements View.OnClickListener {
    Button Button_next_players_name;
    final int defaultValue = 0;
    int q_choice_qp;
    int i = 0;
    EditText name[] = new EditText[28];

    //Metod create new EditText
    public void CreateEd(){
        //Set LinearParams
        LinearLayout.LayoutParams Param1 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        //Create new values
        LinearLayout Llmain = (LinearLayout) findViewById(R.id.Llmain);
        Button Button_next_players_name = (Button) findViewById(R.id.Button_next_players_name);
        Button_next_players_name.setOnClickListener(this);
        //From Players_card
        Intent intent = getIntent();
        q_choice_qp = intent.getIntExtra("myIntVariableName", defaultValue);
        //New EditText
        if ( i < q_choice_qp) {
            name[i] = new EditText(this);
            name[i].setText(String.format("Name%d", i+1));
            name[i].setFilters(new InputFilter[]{new InputFilter.LengthFilter(10)});
            Llmain.addView(name[i], Param1);
            i++;
            CreateEd();
        }
    }
        /*;

        newEditText = new EditText(this);
            newEditText.setText(String.format("Name%d", i+1));
            newEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(10)});
            Llmain.addView(newEditText, Param1);*/

    @SuppressLint("DefaultLocale")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_players_name);
        Button_next_players_name = (Button) findViewById(R.id.Button_next_players_name);
        Button_next_players_name.setOnClickListener(this);
        //TODO CALL CreateEd
        CreateEd();
    }


    @Override
        public void onClick(View view) {
        String lst_name[] = new String[q_choice_qp];
        switch (view.getId()) {
                case R.id.Button_next_players_name:
                    for (int i = 0; i < q_choice_qp; i++ ){
                        lst_name[i] = name[i].getText().toString();
                        System.out.println(lst_name[i]);
                    }
                    //TODO Call PLayers card activity
                    Intent intent_5 = new Intent(this, Players_card.class);
                    intent_5.putExtra("name_lst", lst_name);
                    startActivity(intent_5);
                    break;
                default:
                    break;
            }
        }


}