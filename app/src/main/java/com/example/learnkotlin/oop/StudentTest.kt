package com.example.myapplication.oop

fun main() {
    val student = StudentExtendsParentWithParams("qiuzj2")
    student.eat()
    println(student.age)
    student.age = 5;
    println(student.age)
}
