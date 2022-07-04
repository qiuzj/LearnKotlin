package com.example.myapplication.oop

open class PersonCanBeExtendsWithParams(val name: String) {
    var age = 0

    fun eat() {
        println(name + " is eating, " + "he is $age years old")
    }
}