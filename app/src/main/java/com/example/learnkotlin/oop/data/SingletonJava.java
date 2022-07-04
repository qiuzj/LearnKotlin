package com.example.learnkotlin.oop.data;

public class SingletonJava {
    private static SingletonJava instance;

    private SingletonJava() {}

    public synchronized static SingletonJava getInstance() {
        if (instance == null) {
            instance = new SingletonJava();
        }
        return instance;
    }

    public void singletonTest() {
        System.out.println("singletonJavaTest is called.");
    }
}