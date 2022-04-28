package com.xpanxion.assignments.groupf;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class student25 {
    public static void main(String[] args) {

//        ex1();
        //       ex2();
//        ex3();
//        ex4();
//        ex5();
//        ex6();
        ex7();
    }

    private static void ex1() {
        int[] ints = {1, 2, 3}; // declare ints array
        var numList = new ArrayList<Integer>(ints.length);
        for (int i : ints) {   // Enhanced for loop: for each i inside ints array,// we are adding each i element to the num list
            numList.add(i);    // this is how we how we convert ints arrays into array list
        }                     //we are joining each element of i to numList
        var sum = addNumbers(numList); // sending numList to the addNumbers function
        System.out.println("The sum is " + sum);
    }

    // this function is private we can use this only inside this class,
    //integer type of return value of this function.
    private static Integer addNumbers(ArrayList<Integer> numList) {
        int sum = 0;
        for (int i = 0; i < numList.size(); i++) { // numList.size helps us get the lenght of the array
            sum += numList.get(i);
        } // we are using numList.get to obtain(get) each value from the array list and adding it to the sum
        return sum;

    }

    private static void ex2() {

        int[] ints = {1, 2, 3, 4};
        // Define an ArrayList of integers.
        var newList = new ArrayList<Integer>();
        // Create for loop to add integers.for each i inside ints array, we are converting ints to array list
        for (int i : ints) {
            newList.add(i); // adding every integer in the array to the numList
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

        // System.out.println("The average of the Array is: " + average);

        return average;// returning the average value back to where its being called
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
        for (int i = 0; i < ints.length; i++) {
            numList.add(ints[i]);
        }
        System.out.println(findMissingNumbers(numList));
    }

    private static ArrayList findMissingNumbers(ArrayList<Integer> numList) {
        var missingNumbers = new ArrayList<Integer>();
        int firstNumber = numList.get(0);
        int lastNumber = numList.get(numList.size() - 1);
        for (int i = firstNumber; i < lastNumber; i++) {
            if (!numList.contains(i)) {
                missingNumbers.add(i);
            }
        }
        return missingNumbers;
    }
    // Write a Java function that returs a `String` with all the zeros on the left side
    //and all the ones on the right side:

    private static void ex6() {
        int[] ints = {0, 1, 1, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0};
        System.out.println(organizeZerosOnes(ints));
    }

    private static String organizeZerosOnes(int[] ints) {
        String A = "";
        //initializing left string
        String Left = "";
        //initializing right string
        String Right = "";
//for loop because we are iterating through every element of ints array
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == 0) {
                //we are calling the object integer to convert an array element to string element
                Left = Left + Integer.toString(ints[i]);
            } else {
                Right = Right + Integer.toString(ints[i]);
            }
        }
        A = Left + Right;
        return A;
    }

    private static void ex7() {
        //  Write a Java function that retuns a random number from `ArrayList` of type `Integer`.

    }
}








