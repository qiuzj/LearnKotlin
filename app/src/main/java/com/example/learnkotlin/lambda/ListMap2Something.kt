package com.example.learnkotlin.lambda

fun main() {
    val list = listOf("Apple", "Banana", "Orange", "Pear", "Grape", "Watermelon")
    val list2 = list.map { it.lowercase() }
    for (fruit in list2) {
        println(fruit)
    }


    val list3 = list.filter { it.startsWith("O") }.map { it.uppercase() }
    for (fruit in list3) {
        println(fruit)
    }


    val list4 = listOf("Apple", "Banana", "Orange", "Pear", "Grape", "Watermelon")
    val anyResult = list4.any { it.length <= 5 }
    val allResult = list4.all { it.length <= 5 }
    println("anyResult is " + anyResult + ", allResult is " + allResult)
}