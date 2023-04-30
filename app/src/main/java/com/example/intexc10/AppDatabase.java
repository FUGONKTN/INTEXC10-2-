package com.example.intexc10;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Excursion.class, Question.class},version = 2)
abstract class AppDatabase extends RoomDatabase {
    public abstract ExcursionDao excursionDao();
}
