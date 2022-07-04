package com.example.learnkotlin.smallmagic

fun printParams2(num: Int = 100, str: String) {
    println("num is $num , str is $str")
}
fun main() {
    printParams2(str = "hello")
}