package com.xpanxion.assignments.groupc;

import java.util.ArrayList;

public class student12 {
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
        for (int i = 0; i < ints.length; i++){
            list1.add(ints[i]);
            sum += list1.get(i);
        }
        System.out.println("Sum of all numbers in Array: " + sum);

        return 0;
    }

    private static void ex2() {
        System.out.println("Ex. 2");
    }

    private static void ex3() {
        System.out.println("Ex. 3");
    }

}

