package com.xpanxion.assignments.groupf;

import java.lang.reflect.Array;
import java.util.*;

public class student14 {
    public static void main(String[] args) {
//        ex1();
 //       ex2();
 //      ex3();
 //      ex4();
//        ex5();
       ex6();
    }

    //vars, loops, ifs, functions
    private static void ex1() {
        int[] ints = {1, 2, 3}; //declare array

        var numList = new ArrayList<Integer>();//declare new array list
        //Implement function
        for (int i : ints) {
            numList.add(i);
        } // map

        var sum = addNumbers(numList);
        System.out.println("The sum is " + sum);
    }

    private static Integer addNumbers(ArrayList<Integer> numList) {
        // implementing numList function
        int sum = 0;
        for (int i = 0; i < numList.size(); i++) {
            sum += numList.get(i);
        }
        return sum;
    }

    private static void ex2() {
        ArrayList<Integer> numList = new ArrayList<>();//declare new array list
        //convert int to integer
        int[] ints = {11, 2, 3, 4, 5};
        //var newList = new ArrayList<Integer>();
        for (int i : ints) {
            numList.add(i);
        }

        //take sum of list
        var r = avgNumbers(numList);

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
        var numList = new ArrayList<Integer>();//declare new array list
        //convert int to integer
        int[] ints = {1, 2, 3, 4};
        //add the numbers to the numList
        for (int i : ints) {
            numList.add(i);
        }
        doubleNumbers(numList);
        System.out.println(numList);//print list
    }

    private static void doubleNumbers(ArrayList<Integer> numList) {
        for (int i = 0; i < numList.size(); i++) {
            int timesTwo = numList.get(i);
            numList.set(i, (timesTwo * 2));
        }
    }

    private static void ex4() {
        var list = createList(5);
        System.out.println(list);
    }

    private static ArrayList<Integer> createList(Integer maxNumber) {
//create list
//for loop to determine the type of numbers in list
        ArrayList<Integer> numList = new ArrayList<>();
        for (int i = 1; i <= maxNumber; i++) {
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
            if (!numList.contains(i)) { // ! means "not" negation operator
                missingNumbers.add(i);
            }
        }
        return missingNumbers;
    }

//    private static void ex6() {
//        int[] ints = {0, 1, 1, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0};
//        ArrayList<Integer> numList = new ArrayList<>();
//       // int[] sorted = sortCollection;
//
//        for (int i = 0; i < ints.length; i++) {
//            numList.add(ints [i]);
//        }
//        System.out.println((Arrays.toString(sortCollection(ints))));
//    }
//    private static int[] sortCollection (int[] ints) {
//             Arrays.sort(ints);
//        return ints;

    private static void ex6() {
        //ints array
        int[] ints = {0, 1, 1, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0};
        //initializing string a
        System.out.println(organizeZerosAndOnes(ints));
    }
     private static String organizeZerosAndOnes(int[] ints) {
        String result = "";
        //initializing left string
        String leftZeros = "";
        //initializing right string
        String rightOnes = "";
        //for loop because we are iterating through every element of ints array
        for (int i = 0; i < ints.length; i++) {
            if(ints[i] == 0) {
                //we are calling the object integer to convert an array element to string element
                leftZeros += Integer.toString(ints[i]);
            }
            else {
                rightOnes += Integer.toString(ints[i]);
            }
        }
        result = leftZeros + rightOnes;
        return result;
    }

}


