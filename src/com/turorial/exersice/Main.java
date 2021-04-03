package com.turorial.exersice;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Array numbers = new Array(3);
//        numbers.insert(10);
//        numbers.insert(11);
//        numbers.insert(12);
//        numbers.insert(13);
//        numbers.insert(14);
//        numbers.removeAt(2);
////        System.out.println(numbers.indexOf(1));
////        numbers.print();
//
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(60);
//        list.size();
//
//        System.out.println(list);

        // LinkedList

        var list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
//        list.reverse();
        System.out.println(list.getKthFromTheEnd(4));


//        list.removeFirst(20);
//        list.removeLast();
//        System.out.println(Arrays.toString(list.toArray()));
    }
}
