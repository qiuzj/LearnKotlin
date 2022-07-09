package com.example.learnkotlin.func

fun main() {
    val list = listOf("Apple", "Banana", "Orange", "Pear", "Grape")
    val builder = StringBuilder()
    builder.append("Start eating fruits.\n")
    for (fruit in list) {
        builder.append(fruit).append("\n")
    }
    builder.append("Ate all fruits.")
    val result = builder.toString()
    println(result)

    // 使用with函数
    val result2 = with(StringBuilder()) {
        append("Start eating fruits.\n")
        for (fruit in list) {
            append(fruit).append("\n")
        }
        append("Ate all fruits.")
        toString()
    }
    println("------")
    println(result2)
}