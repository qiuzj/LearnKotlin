package com.example.learnkotlin.lambda.javaapi;

public class JavaNewRunnable {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread is running");
            }
        }).start();
    }
}
