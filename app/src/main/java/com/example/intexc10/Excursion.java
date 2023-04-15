package com.example.intexc10;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
@Entity
public class Excursion {

        @PrimaryKey
        public int uid;

        @ColumnInfo(name = "Name")
        public String name;

        @ColumnInfo(name = "QuestionOne")
        public String quest1;

        @ColumnInfo(name = "QuestionTwo")
        public String quest2;

        @ColumnInfo(name = "QuestionThree")
        public String quest3;

        @ColumnInfo(name = "AnswerOne")
        public String ans1;

        @ColumnInfo(name = "AnswerTwo")
        public String ans2;

        @ColumnInfo(name = "AnswerThree")
        public String ans3;

        @ColumnInfo(name = "LatitudeOne")
        public double latitude1;

        @ColumnInfo(name = "LongitudeOne")
        public double longitude1;

        @ColumnInfo(name = "LatitudeTwo")
        public double latitude2;

        @ColumnInfo(name = "LongitudeTwo")
        public double longitude2;

        @ColumnInfo(name = "LatitudeThree")
        public double latitude3;

        @ColumnInfo(name = "LongitudeThree")
        public double longitude3;
}
