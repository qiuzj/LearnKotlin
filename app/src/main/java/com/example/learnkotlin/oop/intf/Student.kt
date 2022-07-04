package com.example.myapplication.oop.intf

import com.example.myapplication.oop.PersonWithTwoParams

class Student(name: String, age: Int) : PersonWithTwoParams(name, age), Study {
    override fun readBooks() {
        println(name + " is reading")
    }

    override fun doHomework() {
        println(name + " is doing homework")
    }
}