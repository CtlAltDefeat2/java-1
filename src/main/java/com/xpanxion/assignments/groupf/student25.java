package com.xpanxion.assignments.groupf;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class student25 {
    public static void main(String[] args) {

        ex1();
        ex2();
        ex3();
        ex4();
        ex5();
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

    private static void ex3() {
        // Write a function with the following signature:
        //This function doubles every number in numList;
        int[] ints = {1, 2, 3, 4};
        // Define an ArrayList of integers.
        var numList = new ArrayList<Integer>();
        for (int i : ints) {
            numList.add(i);

        }
        doubleNumbers(numList);
    }

    private static void doubleNumbers(ArrayList<Integer> numList) {
        for (int i = 0; i < numList.size(); i++) {
            int double1 = numList.get(i);
            numList.set(i, (double1 * 2));
        }
        System.out.println(numList);
    }

    private static void ex4() {

        var list = createList(5);
        System.out.println(list);

    }

    private static ArrayList<Integer> createList(Integer maxNumber) {
        ArrayList<Integer> numList = new ArrayList<>();
        for (int i = 1; i <= maxNumber; ++i) {
            numList.add(i);
        }
        return numList;
    }

    private static void ex5() {
        ////Write a function that returns the number of missing numbers from this array.
        int[] ints = {1, 2, 3, 5, 6, 9, 11};
        ArrayList<Integer> numList = new ArrayList<>();
        for (int i=0; i < ints.length; i++){
            numList.add(ints[i]);
        }
        System.out.println(findMissingNumbers(numList));
    }
        private static ArrayList findMissingNumbers(ArrayList<Integer> numList){
        var missingNumbers = new ArrayList<Integer>();
        int firstNumber = numList.get(0);
        int lastNumber = numList.get(numList.size() - 1);
        for (int i = firstNumber; i < lastNumber; i++){
            if (!numList.contains(i)){
                missingNumbers.add(i);
            }
        }
         return missingNumbers;
    }
}


