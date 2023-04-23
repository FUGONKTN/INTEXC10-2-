package com.example.intexc10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import java.util.List;

public class MainActivity2 extends AppCompatActivity {

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btn = findViewById(R.id.button2);
        btn.setOnClickListener(v -> {
            Intent in = new Intent(MainActivity2.this, ChooseExc.class);
            startActivity(in);
        });
    }
}