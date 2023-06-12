package com.example.messageui

import androidx.compose.runtime.MutableState
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class User (

    @PrimaryKey(autoGenerate = true )
val id: Int = 0,
val text: String,
val type: String,
var state: Boolean,
var time: Long,
    )