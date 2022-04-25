package com.xpanxion.assignments.groupb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class student8 {
    public static void main(String[] args) {
        ex2();

    }

    // EX 1
    private static void ex1() {

        var output = addNumbers(null);
        System.out.println(output);
    }

    private static Integer addNumbers(ArrayList<Integer> numlist) {

        int[] ints = {1, 2, 3};
        int sum = 0;
        for (int i = 0; i < ints.length; i++) {
            sum = sum + ints[i];
        }
        return sum;
    }

    // EX 2
    private static void ex2() {
        int[] ints = {1, 2, 3};

        var output = avgNumbers(null);
        System.out.println(output);
    }

    private static Float avgNumbers(ArrayList<Integer> numlist) {

        int[] ints = {1, 2, 3};
        int sum = 0;
        Float avg = Float.valueOf(0);

        for (int i = 0; i < ints.length; i++) {
            sum = sum + ints[i];
            avg = Float.valueOf(sum / ints.length);
        }
        return avg;
    }

    private static void ex3() {
        System.out.println("Ex. 3");
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
