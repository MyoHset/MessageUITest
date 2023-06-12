package com.example.messageui



import androidx.compose.runtime.MutableState

data class Person(
    var name:String,
    var img: Int,
    var text:String,
    var type:String,
    var date:Long,
    var state: MutableState<Boolean>,
)


