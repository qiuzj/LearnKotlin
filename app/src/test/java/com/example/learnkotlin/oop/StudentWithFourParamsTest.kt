package com.example.myapplication.oop

fun main() {
    val student1 = StudentWithFourParams()
    val student2 = StudentWithFourParams("qiuzj", 20)
    val student3 = StudentWithFourParams("1", 9, "hfyan", 18)

    student1.log()
    student2.log()
    student3.log()
}