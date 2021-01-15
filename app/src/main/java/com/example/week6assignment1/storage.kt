package com.example.week6assignment1

import com.example.week6assignment1.model.student


private var listStudent = arrayListOf<student>()
var loggedIn: student? = null
class Storage {
    fun appendStudent(student: student){
        listStudent.add(student)
        println(listStudent.size)
    }
    fun returnStudent():ArrayList<student>{
        return listStudent
    }
    fun deleteStudent(student: student){
        listStudent.remove(student)
    }
    public fun setLoggedIn(id: student?){
        println(id)
        loggedIn = id
    }
    public fun getLoggedIn(): student? {
        return loggedIn
    }
}