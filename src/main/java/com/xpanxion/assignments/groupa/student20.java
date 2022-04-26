package com.xpanxion.assignments.groupa;

import java.util.ArrayList;

import static com.xpanxion.assignments.groupa.student20.main;

public class student20 {
    public static void main(String[] args) {
        ex1();


    }

    private static void ex1() {
        System.out.println("Ex. 1");
        addNumbers(new ArrayList<>());
    }
    private static Integer addNumbers(ArrayList<Integer> numList) {
        int[] ints = {1, 2, 3};
        int sum = 0;
        var list1 = new ArrayList<Integer>();
        for (int i = 0; i < ints.length; i++) {
            list1.add(ints[i]);
            sum += list1.get(i);
        }
        System.out.println("Sum of all numbers in Array: " + sum);
        return null;
    }
    }





