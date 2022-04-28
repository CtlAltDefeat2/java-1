package com.xpanxion.assignments.groupf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static com.sun.tools.javac.comp.ConstFold.floatValue;

public class student15 {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
        ex5();
        ex6();
        ex7();
        ex8();
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
        int length = ints.length;
        var newList = new ArrayList<Integer>();
        // Create for loop to add integers.
        for (int i : ints) {
            newList.add(i);
        }
        var r = avgNumbers(newList);
        System.out.println(r);
    }

    private static Float avgNumbers(ArrayList<Integer> numList) {
        Float retVal = 0F;
        var sum = addNumbers(numList);

        float length = numList.size();
        float average = sum / length;
        return average;
    }

    private static void ex3() {
        ArrayList<Integer> numList = new ArrayList<>();//declare new array list
        //convert int to integer
        int[] ints = {1, 2, 3, 4};
        //add the numbers to the numList
        for (int i : ints) {
            numList.add(i);
        }
        doubleNumbers(numList);

    }

    private static void doubleNumbers(ArrayList<Integer> numList) {

        for (int i = 0; i < numList.size(); i++) {

            int timesTwo = numList.get(i);
            numList.set(i, (timesTwo * 2));
        }
        System.out.println(numList);//print list

    }

    private static void ex4() {
        var list = createList(5);
        System.out.println(list);
    }

    private static ArrayList<Integer> createList(Integer maxNumber) {
        // create List
        // for loop to determine the type of numbers in list
        ArrayList<Integer> numList = new ArrayList<>();
        for (int i = 1; i <= maxNumber; ++i) {
            numList.add(i);
        }
        return numList;
    }

    private static void ex5() {

        int[] ints = {1, 2, 3, 5, 6, 9, 11};
        ArrayList<Integer> numList = new ArrayList<>();
        for (int i = 0; i < ints.length; i++) {
            numList.add(ints[i]);
        }
        System.out.println(findMissingNumbers(numList));
    }

    private static ArrayList<Integer> findMissingNumbers(ArrayList<Integer> numList) {
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

    private static void ex6() {
        //ints array
        int[] ints = {0, 1, 1, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0};
        System.out.println(organizeZerosOnes(ints));
}
    private static String organizeZerosOnes (int[] ints){
        String A ="";
        // Initializing left string
        String Left="";
        //Initializing right string
        String Right="";
        // for loop because we are iterating through every element of ints array
        for (int i=0; i<ints.length;i++) {
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
         // Write a Java function that returns a random number from 'ArrayList' of type integer.
         int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9};
         var numList = new ArrayList<Integer>(ints.length);
         for (int i : ints) {
             numList.add(i);
         }
         System.out.println(randomNumber(numList));
     }
     private static Integer randomNumber(ArrayList<Integer> numList){
        for(int i=0; i<numList.size(); i++) {
            if (numList.contains(i)) {
                Collections.shuffle(numList);
            }
        }
        int firstNumber=numList.get(0);
        return firstNumber;
        }}

     // Write a function that calculates the total cost of a shopping cart. The items in the shopping cart are contained in an ArrayList of type Float.
//The total cost is calculated by the following:
//Sum the cost of all the items in the ArrayList
//Apply 10% sales tax    float sales tax = 0.1F
//Apply shipping and handling fees: float S&H = 3.0F
//Add $5.00 for orders under $10.00
//Add $4.00 for orders > $10.00 and < $20.00
//Free shipping and handling for orders > $20.00
//
//   // private static void ex8() {
//        // Write a Java function that returns a random number from 'ArrayList' of type integer.
//        float[] items = {15.2f,20.30f,17.8f,14.70f};
//        var numList = new ArrayList<Float>(items.length);
//        for (float i : items) {
//            numList.add(i);
//        }
//        System.out.println(totalCost(numList));
//    }
//    public static Float totalCost(ArrayList<Float> numList){
//        Float sum = 0f;
//        Float i = 0f;
//        for (i=0f;i < numList.size(); i++) {
//            sum += numList.get(floatValue(i));
//        }
//        float salesTax = 0.1F;
//        float shipHandle = 3.0F;
//        if(sum < 10.0f){
//            sum = sum + 5.0f;
//            else (sum>10.0f && sum<20.0f);{
//                sum = sum + 4.0f;
//            else(sum == sum)
//
//        }
//        return sum;
//
//    }}}
