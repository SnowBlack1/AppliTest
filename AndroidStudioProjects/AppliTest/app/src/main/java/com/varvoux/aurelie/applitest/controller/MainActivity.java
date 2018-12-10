package com.varvoux.aurelie.applitest.controller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.varvoux.aurelie.applitest.R;

public class MainActivity extends AppCompatActivity {

    private TextView mBloc;
    private EditText mFormulaire;
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBloc = findViewById(R.id.bloc1);
        mFormulaire = findViewById(R.id.form);
        mButton = findViewById(R.id.button);

        mButton.setEnabled(false);

        mFormulaire.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mButton.setEnabled(s.toString().length()!= 0); //variable s (qu'on convertit en string)
                // si sa longueur diff de 0 donc on active button
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {//each time user clicks on button
                Intent GameActivity = new Intent(MainActivity.this, com.varvoux.aurelie.applitest.controller.GameActivity.class);
                startActivity(GameActivity);

            }
        });
        TextView mQuestion;
       Button mRep1, mRep2, mRep3, mRep4;
        mQuestion = findViewById(R.id.question_txt);
        mRep1 = findViewById(R.id.rep1_btn);
        mRep2 = findViewById(R.id.rep2_btn);
        mRep3 = findViewById(R.id.rep3_btn);
        mRep4 = findViewById(R.id.rep4_btn);



    }


}
