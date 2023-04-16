package com.example.intexc10;

import android.app.Application;

import androidx.room.Room;

import com.yandex.mapkit.MapKitFactory;

import java.util.ArrayList;
import java.util.List;

public class IntexcApplication extends Application {
    public ExcursionDao excursionDao;
    @Override
    public void onCreate() {
        super.onCreate();
        MapKitFactory.setApiKey("4f697435-bb41-4f3a-a999-4265dee587be");
        AppDatabase db = Room.databaseBuilder(getApplicationContext(), AppDatabase.class, "Excursions").build();
        excursionDao = db.excursionDao();
        Excursion exc1 = new Excursion();
        exc1.name = "Тестовая Экскурсия";
        List<Question> questions = new ArrayList<Question>();
        Question question = new Question();
        question.question = "Что такое любовь";
        question.answers = new String[]{"Любовь", "Хз", "Дэб"};
        questions.add(question);
        exc1.questions = questions;
        excursionDao.insert(exc1);
    }
}
