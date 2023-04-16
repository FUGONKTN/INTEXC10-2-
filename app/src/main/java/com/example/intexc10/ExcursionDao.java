package com.example.intexc10;

import android.renderscript.Double4;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface ExcursionDao {
    @Query("SELECT * FROM Excursion")
    List<Excursion> getAllExcursions();
    @Query("SELECT name FROM Excursion WHERE ExcId = :id")
    String getName(int id);
    @Query("SELECT question  FROM Question WHERE QuestId = :id")
    String getQuestion(int id);
    @Query("SELECT answers FROM Question WHERE QuestId = :id")
    String[] getAnswers(int id);
    @Query("SELECT LatitudeOne, LongitudeOne, LatitudeTwo, LongitudeTwo, LatitudeThree, LongitudeThree FROM Excursion WHERE ExcId = :id")
    List<Double> getPoints(int id);
    @Insert
    void insert(Excursion... excursions);
    @Delete
    void delete(Excursion excursion);
    @Update
    void update(Excursion excursion);
}
