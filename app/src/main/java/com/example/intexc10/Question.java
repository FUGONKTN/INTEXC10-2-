package com.example.intexc10;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Question {
    @PrimaryKey
    public int QuestId;
    @ColumnInfo(name = "QuestionOne")
    public String questionone;
    @ColumnInfo( name = "QuestionTwo")
    public String questiontwo;
    @ColumnInfo(name = "QuestionThree")
    public String questionthree;
    public String question;
    @ColumnInfo(name = "AnsOne")
    public String ansone;
    @ColumnInfo(name = "AnsTwo")
    public String anstwo;
    @ColumnInfo(name = "AnsThree")
    public String ansthree;
}