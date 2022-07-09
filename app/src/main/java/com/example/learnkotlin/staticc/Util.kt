package com.example.learnkotlin.staticc

class Util {
 fun doAction1() {
   println("do action1")
 }

 companion object {
   fun doAction2() {
     println("do action2")
   }

     @JvmStatic
     fun doAction3() {
         println("do action2")
     }
 }
}