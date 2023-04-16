package com.example.intexc10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class ChooseExc extends AppCompatActivity {
    Button excone;
    ExcursionDao excursionDao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String[] names = {"Тестовая экскурсия", "Ещё тестовая экскурсия"};
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_exc);
        excone = findViewById(R.id.exconebutton);
        excursionDao = ((IntexcApplication) getApplication()).excursionDao;
        excone.setOnClickListener(v -> {
            Intent intent = new Intent(this, MapActivity.class);
            startActivity(intent);
        });
        ArrayAdapter<String> namesAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, names);

    }
}


