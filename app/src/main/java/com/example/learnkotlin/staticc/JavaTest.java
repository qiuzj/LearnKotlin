package com.example.learnkotlin.staticc;

import com.example.myapplication.LearnKotlinKt;

public class JavaTest {
    public static void main(String[] args) {
        System.out.println("ok");
        LearnKotlinKt.voidMethod("ok", 1.0);
        new Util().doAction1();
        Util.doAction3();
    }
}