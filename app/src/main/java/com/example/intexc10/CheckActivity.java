package com.example.intexc10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class CheckActivity extends AppCompatActivity {
    TextView ans1;
    TextView ans2;
    TextView ans3;
    TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Intent answers = getIntent();
        String ansone = answers.getStringExtra("t1");
        String anstwo = answers.getStringExtra("t2");
        String ansthree = answers.getStringExtra("t3");
        ans1 = findViewById(R.id.AnswerOne);
        ans2 = findViewById(R.id.AnswerTwo);
        ans3 = findViewById(R.id.AnswerThree);
        ans1.setText(ansone);
        ans2.setText(anstwo);
        ans3.setText(ansthree);

    }
}