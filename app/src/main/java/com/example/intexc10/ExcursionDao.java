package com.example.intexc10;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface ExcursionDao {
    @Insert
    void insert(Excursion... excursions);
    @Delete
    void delete(Excursion excursion);
}
