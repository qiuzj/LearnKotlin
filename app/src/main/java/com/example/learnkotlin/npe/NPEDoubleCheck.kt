package com.example.learnkotlin.npe

var content: String? = "hello"

fun main() {
    if (content != null) {
        printUpperCase()
    }
}

fun printUpperCase() {
    // Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String?
//    val upperCase = content.toUpperCase()
    val upperCase = content?.toUpperCase()
    println(upperCase)
}

fun printUpperCase2() {
    // 如果我们想要强行通过编译，可以使用非空断言工具，写法是在对象的后面加上!!
    val upperCase = content!!.toUpperCase()
    println(upperCase)
}