package com.example;
public class Addition {
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Addition addition = new Addition();
        System.out.println("Sum: " + addition.add(5, 10));
    }
}
