package com.turorial.exersice;

public class Main {
    public static void main(String[] args) {
        Array numbers = new Array(3);
        numbers.insert(10);
        numbers.insert(11);
        numbers.insert(12);
        numbers.insert(13);
        numbers.insert(14);
        numbers.removeAt(2);
        System.out.println(numbers.indexOf(1));
//        numbers.print();
    }
}
