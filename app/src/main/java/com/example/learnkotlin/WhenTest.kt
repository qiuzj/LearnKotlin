package com.example.myapplication

fun main() {
    println(getScore("Tome"))
    println(getScore("sldfj"))
    println(getScore2("Tome"))
    println(getScore2("sldfj"))
    println(getScore3("Tome"))
    println(getScore3("sldfj"))

    checkNumber(1)
    checkNumber(1.1)
    checkNumber(10L)
}

fun getScore(name: String) = if (name == "Jack") {
    88
} else if (name == "Tome") {
    90
} else if (name == "Lili") {
    75
} else {
    60
}

fun getScore2(name: String) = when (name) {
    "Jack" -> 88
    "Tome" -> 90
    "Lili" -> 75
    else -> 60
}

fun getScore3(name: String) = when {
    name.startsWith("Tom") -> 90
    name == "Jack" -> 88
    name == "Lili" -> 75
    else -> 60
}

fun checkNumber(num: Number) {
    when (num) {
        is Int -> println("number $num is Int")
        is Double -> println("number $num is Double")
        else -> println("number $num is not support")
    }
}