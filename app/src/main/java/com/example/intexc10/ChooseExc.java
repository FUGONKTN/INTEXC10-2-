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

    ExcursionDao excursionDao;
    String[] names = {"Тестовая экскурсия", "Ещё тестовая экскурсия"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        excursionDao = ((IntexcApplication) getApplication()).excursionDao;
        ArrayAdapter<String> excadapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, names);
        setListAdapter(excadapter);
    }
    @Override
    protected void onListItemClick(ListView l, View V, int position, long id){
        String name = excursionDao.getName(position);
        String questionOne = excursionDao.getQuestionOne(position);
        Toast.makeText(this, name + " " + questionOne, Toast.LENGTH_SHORT).show();
        Intent intt = new Intent(this, MapActivity.class);
        startActivity(intt);

    }


}


