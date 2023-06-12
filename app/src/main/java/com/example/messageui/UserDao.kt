package com.example.messageui

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Upsert


@Dao
interface UserDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertUser_other(user: User)// @Query("INSERT INTO otherTable

    @Query("SELECT * FROM user ")
    fun getAllUsers(): List<User>

}