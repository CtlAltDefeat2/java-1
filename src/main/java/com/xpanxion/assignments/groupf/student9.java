package com.xpanxion.assignments.groupf;

import java.util.ArrayList;

public class student9 {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
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
        int[] ints = {1, 2, 3};

        // Define an ArrayList of integers.
        var newList = new ArrayList<Integer>();

        // Create for loop to add integers.
        for (int i : ints) {
            newList.add(i);
        }
        // Use "var r" to help the conversion and to print out float.
        var r = avgNumbers(newList);
        System.out.println(r);
    }

    private static Float avgNumbers(ArrayList<Integer> numList) {
        Float retVal = 0F;


        float length = numList.size();
        var sum = addNumbers(numList);

        float average = sum / length;

        return average;
    }

    private static void ex3() {
        // Create an array list.
        ArrayList<Integer> numList = new ArrayList<>();
        int[] ints = {1, 2, 3};
        // Create a for each loop to add integers.
        for (int i : ints) {
            numList.add(i);
        }
        doubleNumbers(numList);
    }

    // Write a function with the following signature.
    private static void doubleNumbers(ArrayList<Integer> numList) {
        // Create a for loop through each integer.
        for (int i = 0; i < numList.size(); i++) {
            // Double every number in numList.
            int timesTwo = numList.get(i);
            numList.set(i, (timesTwo * 2));
        }
        // Print out the results.
        System.out.println(numList);
    }


    private static void ex4() {
        // Create an int array list.
        var list = createList(5);
        System.out.println(list);
    }
    // Create a "createList" function.
    private static ArrayList<Integer> createList(Integer maxNumber) {
        ArrayList<Integer> numList = new ArrayList<>();
        // Do a for loop starting with element 1.
        for (int i = 1; i <= maxNumber; ++i) {
            numList.add(i);
        }
        // Return the numList.
        return numList;
    }
}










