package com.example.intexc10;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Question {
    @PrimaryKey
    public int QuestId;
    @ColumnInfo(name = "Question")
    public String question;
    @ColumnInfo(name = "WrongAnsOne")
    public String wrans1;
    @ColumnInfo(name = "WrongAnsTwo")
    public String wrans2;
    @ColumnInfo(name = "RightAns")
    public String rightans;
    @ColumnInfo(name = "RightAnswerIndex")
    public int indexright;
}