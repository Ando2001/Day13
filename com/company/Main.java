package com.company;

public class Main {

    public static void main(String[] args) {

StringBuilder one = new StringBuilder("Hello");
String test = one.insert(4,"Val").toString();
        System.out.println(test);
    }
}
