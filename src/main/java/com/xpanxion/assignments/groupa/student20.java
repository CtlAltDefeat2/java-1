package com.xpanxion.assignments.groupa;

import java.util.ArrayList;

public class student20 {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
        ex5();
        ex6();
        ex7();
//        ex8();
//        ex9();
//        ex10();
    }

    private static void ex1() {
        System.out.println("Ex. 1");
        addNumbers(new ArrayList<>());
    }
    private static Integer addNumbers(ArrayList<Integer> numList) {
        int[] ints = {1, 2, 3};
        int sum = 0;
        var list1 = new ArrayList<Integer>();
        for (int i = 0; i < ints.length; i++){
            list1.add(ints[i]);
            sum += list1.get(i);
        }
        System.out.println("Sum of all numbers in Array: " + sum);
    }

    private static void ex3() {
        System.out.println("Ex. 3");
    }

    private static int addNumbers(ArrayList<Integer> numList) {
        // TODO: Implement this function.
        return 0;
    }
    { private static Float avgNumbers(ArrayList<Integer> numList)
        // TODO: Implement this function.
        return 0;
    }
}
