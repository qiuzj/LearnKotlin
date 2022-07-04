package com.example.myapplication.oop

class StudentMainConstructInit(var sno: String, var grade: Int) : PersonCanBeExtends() {
    var c = ""
    init {
        sno = "2"
        grade = 0
    }
}