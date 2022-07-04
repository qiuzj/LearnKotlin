package com.example.myapplication.oop

class StudentWithFourParams(val sno: String, val grade: Int, name: String, age: Int) : PersonWithTwoParams(name, age) {
    constructor(name: String, age: Int) : this("", 0, name, age) {
    }
    constructor() : this("", 0) {
    }

    fun log() {
        println("sno=$sno, grade=$grade, name=$name, age=$age")
    }
}