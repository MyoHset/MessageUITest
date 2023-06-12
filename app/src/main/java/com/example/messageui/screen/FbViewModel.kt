package com.example.messageui.screen

import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.messageui.User
import com.example.messageui.UserDao
import com.example.messageui.Person
import com.example.messageui.R

//class FbViewModel(
//    private val dao: UserDao
//) : ViewModel(){
//
//    var personLists = listOf(
//
//        Person("Myo Hset" , R.drawable.rose,"bbbbbbb","me",System.currentTimeMillis(), state = mutableStateOf(false)),
//        Person("Swe Zin Nye/*/in" , R.drawable.rose1,"bbbbbbb","me",System.currentTimeMillis(), state = mutableStateOf(false)),
//        Person("Eiei Kyaw" , R.drawable.rose1,"bbbbbbb","me",System.currentTimeMillis(), state = mutableStateOf(false))
//    )
//
//    //var list = dao.getAll()
//
//
//    var personList = mutableStateListOf<com.example.messageui.Person>()
//    init {
//        personList.addAll(personLists)
//
//    }
//
//    fun getAllPerson() : List<Person>{
//        return personList
//    }
//
//fun getAllM() : List<User>{
//        return list
//    }
//
//
//}
