package com.example.intexc10;

import androidx.room.ColumnInfo;
import androidx.room.Database;
import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.Relation;
import androidx.room.RoomDatabase;

import java.util.List;

@Entity
public class Excursion {
        @Embedded public List<Question> questions;

        @PrimaryKey
        public int ExcId;

        @ColumnInfo(name = "Name")
        public String name;

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

