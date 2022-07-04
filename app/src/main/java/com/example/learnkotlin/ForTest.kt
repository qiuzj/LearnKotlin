package com.example.myapplication

fun main() {
    for (i in 0..10) {
        kotlin.io.println(i)
    }

    println()
    val range = 5..9
    for (i in range) {
        println(i)
    }

    println()
    val range2 = 5 until 10
    for (i in range2) {
        println(i)
    }

    println()
    for (i in 2 until 10 step 2) {
        println(i)
    }

    println()
    for (i in 10 downTo 1) {
        println(i)
    }
}
