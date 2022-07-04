package com.example.learnkotlin.npe

fun main() {
    var a = null;
    var b = 2;
    val c = if (a != null) {
        a
    } else {
        b
    }
}

fun getTextLength(text: String?): Int {
    if (text != null) {
        return text.length
    }
    return 0
}

fun getTextLength2(text: String?): Int {
    return text?.length ?: 0
}

fun getTextLength3(text: String?) = text?.length ?: 0
