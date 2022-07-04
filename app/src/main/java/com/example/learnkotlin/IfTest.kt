package com.example.myapplication

fun main() {
    println(largerNumber11(1, 2))
    println(largerNumber12(1, 2))
    println(largerNumber13(1, 2))
    println(largerNumber14(1, 2))
    println(largerNumber15(1, 2))
}

fun largerNumber11(num1: Int, num2: Int): Int {
    var value = 0
    if (num1 > num2) {
        value = num1
    } else {
        value = num2
    }
    return value
}

fun largerNumber12(num1: Int, num2: Int): Int {
    val value = if (num1 > num2) {
        num1
    } else {
        num2
    }
    return value
}

fun largerNumber13(num1: Int, num2: Int): Int {
    return if (num1 > num2) {
        num1
    } else {
        num2
    }
}


fun largerNumber14(num1: Int, num2: Int) = if (num1 > num2) {
    num1
} else {
    num2
}


fun largerNumber15(num1: Int, num2: Int) = if (num1 > num2) num1 else num2

