package com.xpanxion.assignments.groupb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class student8 {
    public static void main(String[] args) {
        ex3();

    }

    // EX 1
    private static void ex1() {
        int[] ints = {1, 2, 3};
        var sum = 0;
        var numList = new ArrayList<Integer>();
        for (int i = 0; i < ints.length; i++) {
            numList.add(ints[i]);
        }

        for (int i = 0; i < numList.size(); i++) {
            sum = sum + numList.get(i);
        }

        System.out.println(numList);
        System.out.println(sum);

    }

    // EX 2
    private static void ex2() {
        int[] ints = {1, 2, 3};
        var sum = 0;
        var avg = 0;

        var numList = new ArrayList<Integer>();
        for (int i = 0; i < ints.length; i++) {
            numList.add(ints[i]);
        }

        for (int i = 0; i < numList.size(); i++) {
            sum = sum + numList.get(i);
            avg = sum / numList.size();
        }

        System.out.println(numList);
        System.out.println(avg);

    }

    // EX 3
    private static void ex3() {

        int[] ints = {1, 2, 3};

        var numList = new ArrayList<Integer>();
        for (int i = 0; i < ints.length; i++) {
            numList.add(ints[i] * 2);
        }

        System.out.println(Arrays.toString(ints));
        System.out.println(numList);

    }

    private static void ex4() {
        System.out.println("Ex. 3");
    }

    private static void ex5() {
        System.out.println("Ex. 3");
    }

    private static void ex6() {
        System.out.println("Ex. 3");
    }
}
