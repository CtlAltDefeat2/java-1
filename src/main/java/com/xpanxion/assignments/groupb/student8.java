package com.xpanxion.assignments.groupb;

import java.util.Arrays;
import java.util.Scanner;

public class student8 {
    static int[] ints = {1, 2, 3};
    public static void main(String[] args) {
        ex1();

    }

    public static void ex1() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter size of the array: ");
//        int size = scanner.nextInt();
        //int[] intArray = new int[size];
        int[] intArray = {1, 2, 3};
        int sum = 0;
        //System.out.println("Enter the elements of the array: ");

        for (int i = 0; i < intArray.length; i++) {
            //intArray[i] = scanner.nextInt();
            sum = sum + intArray[i];
        }

        System.out.println(Arrays.toString(intArray));
        System.out.println("Sum of everything is: " + sum);
    }

//    private static void addNumbers() {
//
//    }

    public static void ex2() {
        int intArray = {1, 2, 3};

    }

    private static void ex3() {
        System.out.println("Ex. 3");
    }
}
