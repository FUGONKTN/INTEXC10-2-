package com.example.intexc10;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.room.Room;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

import com.yandex.mapkit.MapKitFactory;

import java.util.ArrayList;
import java.util.List;

public class IntexcApplication extends Application {
    public ExcursionDao excursionDao;
    @Override
    public void onCreate() {
        super.onCreate();

        MapKitFactory.setApiKey("4f697435-bb41-4f3a-a999-4265dee587be");
        new Thread(()->{
            Migration mgr = new Migration(1,2) {
                @Override
                public void migrate(@NonNull SupportSQLiteDatabase database) {
                }
            };
            AppDatabase db = Room.databaseBuilder(getApplicationContext(), AppDatabase.class, "Excursions").addMigrations(mgr).allowMainThreadQueries().build();
            excursionDao = db.excursionDao();
            Question quest1 = new Question();
            quest1.questionone = "blabla";
            quest1.questiontwo = "3+3";
            quest1.questionthree = "4+4";
            quest1.ansone = "4";
            quest1.anstwo = "6";
            quest1.ansthree = "8";
            Excursion exc1 = new Excursion();
            exc1.name = "GoodExcursion";
            exc1.question = quest1;
            excursionDao.insert(exc1);
        }).start();
    }
}
