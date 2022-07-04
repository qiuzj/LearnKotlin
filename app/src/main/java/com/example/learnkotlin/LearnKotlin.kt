package com.example.myapplication

import kotlin.math.max

fun main() {
    var a = 10
    println("Hello, a=" + a)
    a = 11;
    println("Hello, a=" + a)
    var c = "b"
    var d = 10.0

    val b = 10
    println("b = " + b)
//    b = 11 // Val cannot be reassigned
//    println("b = " + b)

    println(largerNumber1(3,21))
    voidMethod("ok", 123.0)
    val a1 = 2;
    val b1 = 5;
    val c1 = largerNumber2(a1, b1)
    println(c1)

    val c2 = largerNumber3(a1, b1)
    println(c2)
}

fun largerNumber1(a: Int, b: Int): Int {
    return max(a,b)
}

fun largerNumber2(a: Int, b: Int): Int = max(a, b)

fun largerNumber3(a: Int, b: Int) = max(a, b)

fun voidMethod(str: String, db: Double) {
    println(str + db)
}