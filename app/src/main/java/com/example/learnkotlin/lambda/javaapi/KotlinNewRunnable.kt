package com.example.learnkotlin.lambda.javaapi

fun main() {
    Thread(object : Runnable {
        override fun run() {
            println("Thread is running1")
        }
    }).start()

    Thread(Runnable {
        run {
            println("Thread is running2")
        }
    }).start()

    Thread(Runnable {
        println("Thread is running3")
    }).start()

    Thread{
        println("Thread is running4")
    }.start()
}