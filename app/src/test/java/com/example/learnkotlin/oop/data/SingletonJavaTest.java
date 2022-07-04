package com.example.learnkotlin.oop.data;

import org.junit.Test;

public class SingletonJavaTest {

    @Test
    public void test() {
        SingletonJava singleton = SingletonJava.getInstance();
        singleton.singletonTest();
    }

}
