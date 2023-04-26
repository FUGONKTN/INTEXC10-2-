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
    @Query("SELECT LatitudeOne FROM Excursion WHERE ExcId = :id")
    Double getLatOne(int id);
    @Query("SELECT LongitudeOne FROM Excursion WHERE ExcId = :id")
    Double getLongOne(int id);
    @Query("SELECT LatitudeTwo FROM EXCURSION WHERE ExcId = :id")
    Double getLatTwo(int id);
    @Query("SELECT LongitudeTwo FROM EXCURSION WHERE ExcId = :id")
    Double getLongTwo(int id);
    @Query("SELECT LatitudeThree FROM Excursion WHERE ExcId = :id")
    Double getLatThree(int id);
    @Query("SELECT LatitudeThree FROM excursion WHERE ExcId = :id")
    Double getLongThree(int id);
    @Query("SELECT QuestionOne FROM Question WHERE QuestId = :id")
    String getQuestionOne(int id);
    @Query("SELECT QuestionTwo FROM Question WHERE QuestId = :id")
    String getQuestionTwo(int id);
    @Query("SELECT QuestionThree FROM Question WHERE QuestId = :id ")
    String getQuestionThree(int id);
    @Query ("SELECT AnsOne FROM Question WHERE QuestId = :id")
    String getAnswerOne(int id);
    @Query("SELECT AnsTwo FROM Question WHERE QuestId = :id")
    String getAnswerTwo(int id);
    @Query("SELECT AnsThree FROM Question WHERE QuestId = :id")
    String getAnswerThree(int id);
    @Insert
    void insert(Excursion... excursions);
    @Delete
    void delete(Excursion excursion);
    @Update
    void update(Excursion excursion);
}
