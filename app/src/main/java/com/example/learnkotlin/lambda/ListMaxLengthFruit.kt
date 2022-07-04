package com.example.learnkotlin.lambda

fun main() {
    val list = listOf("Apple", "Banana", "Orange", "Pear", "Grape", "Watermelon")
    var maxLengthFruit = ""
    for (fruit in list) {
        if (fruit.length > maxLengthFruit.length) {
            maxLengthFruit = fruit
        }
    }
    println("max length fruit is " + maxLengthFruit)


    val list2 = listOf("Apple", "Banana", "Orange", "Pear", "Grape", "Watermelon")
    val lambda = { fruit: String -> fruit.length }
    val maxLengthFruit3 = list2.maxByOrNull(lambda)
    println("max length fruit is " + maxLengthFruit3)

    // 很多等价写法
//    val maxLengthFruit = list.maxBy() { fruit: String -> fruit.length }
//    val maxLengthFruit = list.maxBy { fruit: String -> fruit.length }
//    val maxLengthFruit = list.maxBy { fruit -> fruit.length }
//    val maxLengthFruit = list.maxBy { it.length }


    val maxLengthFruit2 = list.maxByOrNull{ it.length }
    println("max length fruit is " + maxLengthFruit2)
}