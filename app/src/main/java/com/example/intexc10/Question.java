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
    @ColumnInfo(name = "Answers")
    public String[] answers;
}