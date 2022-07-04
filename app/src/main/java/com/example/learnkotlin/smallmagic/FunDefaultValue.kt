package com.example.learnkotlin.smallmagic

fun printParams(num: Int, str: String = "hello") {
    println("num is $num , str is $str")
}
fun main() {
    printParams(123)
    printParams(123, "qiuzj")
}