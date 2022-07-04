package com.example.learnkotlin.oop.data;

import org.junit.Test;

public class CellphoneJavaTest {
    @Test
    public void test() {
        CellphoneJava c = new CellphoneJava("hw", 10000);
        System.out.println(c.toString());
    }
}
