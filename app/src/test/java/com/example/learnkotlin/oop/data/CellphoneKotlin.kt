package com.example.myapplication.oop.data

fun main() {
    val c = CellphoneKotlin("hw", 10000.0)
    println(c)

    val cellphone1 = CellphoneKotlin("Samsung", 1299.99)
    val cellphone2 = CellphoneKotlin("Samsung", 1299.99)
    println(cellphone1)
    println("cellphone1 equals cellphone2 " + (cellphone1 == cellphone2))
}