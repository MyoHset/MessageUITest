package com.example.messageui

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    entities = [(User::class)],
    version = 1,
    exportSchema = false
)

abstract class UserDatabase : RoomDatabase (){
    abstract fun dao() : UserDao
    /*companion object {
        fun create(context: Context):
                UserDatabase {
            return Room.databaseBuilder(
                context,
                UserDatabase::class.java,
                "chat data"
            ).build()
        }
    }*/
}