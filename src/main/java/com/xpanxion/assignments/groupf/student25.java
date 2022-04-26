package com.xpanxion.assignments.groupf;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class student25 {
    public static void main(String[] args) {

        ex1();
        ex2();
    }

    private static void ex1() {
        int[] ints = {1, 2, 3};
        var numList = new ArrayList<Integer>(ints.length);
        for (int i : ints) {
            numList.add(i);
        }
        var sum = addNumbers(numList);
        System.out.println("The sum is " + sum);
    }

    private static Integer addNumbers(ArrayList<Integer> numList) {
        int sum = 0;
        for (int i = 0; i < numList.size(); i++) {
            sum += numList.get(i);
        }
        return sum;

    }

    private static void ex2() {

        int[] ints = {1, 2, 3, 4};
        // Define an ArrayList of integers.
        var newList = new ArrayList<Integer>();
        // Create for loop to add integers.
        for (int i : ints) {
            newList.add(i);
            // Use "var r" to help the conversion and to print out float.
        }
        var r = avgNumbers(newList);
        System.out.println(r);
    }

    private static Float avgNumbers(ArrayList<Integer> numList) {
        Float retVal = 0F;
        var sum = addNumbers(numList);
        float length = numList.size();
        float average = sum / length;

        System.out.println("The average of the Array is: " + average);

        return average;
    }
}



//    private static void ex3() {
//        System.out.println("Ex. 3");
//    }
//}}
