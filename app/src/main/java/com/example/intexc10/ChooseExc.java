package com.example.intexc10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.Room;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ChooseExc extends ListActivity {
    ListView lv;
    ExcursionDao excursionDao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String[] names = {"Тестовая экскурсия", "Ещё тестовая экскурсия"};
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_exc);
        excursionDao = ((IntexcApplication) getApplication()).excursionDao;
        lv = findViewById(R.id.ExcursionsView);
        ArrayAdapter<String> namesAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, names);
        lv.setAdapter(namesAdapter);

    }
    @Override
    protected void onListItemClick(ListView l, View V, int position, long id){
        Toast.makeText(this, position, Toast.LENGTH_SHORT).show();
        Toast.makeText(this, (int)id, Toast.LENGTH_SHORT).show();

    }
}


