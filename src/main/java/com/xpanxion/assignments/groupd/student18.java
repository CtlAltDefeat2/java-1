package com.xpanxion.assignments.groupd;

import java.awt.desktop.OpenFilesEvent;
import java.util.ArrayList; //import the ArrayList class
import java.util.List;

public class student18 {

    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
    }

    private static void ex1() {
        // Consider the following array:
        int[] ints = {1, 2, 3};
        var numList = new ArrayList<Integer>(ints.length);
        for (Integer i : ints) {
           //enhanced for loop. For each Integer i, in ints
            numList.add(i);
            //adding elements of integer array to numList array list
        }
        var sum  = addNumbers(numList);
        System.out.println("The sum is" + sum);
    }
//Implement the following function, which returns the sum of all the numbers in the array.
    private static Integer addNumbers(ArrayList<Integer> numList) {
        int sum = 0;
        for (int i = 0; i < numList.size(); i++) {
            sum = sum + numList.get(i);
        }
        return sum;
        // Note: The array of ints must be converted to an ArrayList of type Integer first.
    }

    private static void ex2() {
        ArrayList<Integer> numList = new ArrayList<>();
        //Consider the following array:
        int[] ints = {1, 2, 3};
        for (int i : ints) {
            //for each i in ints . Converting ints to array list
            numList.add(i);
            //adding integers from array to numList
        }
        var r  = avgNumbers(numList);
        //r = "result"
        System.out.println(r);

    }
    //Implement the following function, which returns the average of all the numbers in the array.
    private static Float avgNumbers(ArrayList<Integer> numList) {

    var sum  = addNumbers(numList);
    float Length = numList.size();

    float average = sum / Length;

    return average;
    }

    // Note The array of ints must be converted to an ArrayList of type Integer first
    private static void ex3() {
        ArrayList<Integer> numList = new ArrayList<>();
        //convert in to integer. defining an array of integers. Index is 0,1,2...shouldn't pass 3
        int[] ints = {1, 2, 3};
        for (int i : ints) {
            numList.add(i);
        }
        doubleNumbers(numList);
        //calling numList to go to the doubleNumbers function with no value returned

    }
    //Write a function with the following signature:
    //This function doubles every number in numList
    private static void doubleNumbers(ArrayList<Integer> numList) {
     //defining the type of variable that can go through this function
        for (int i = 0; i < numList.size(); i++){
        //starting at index 0 and incrementing by one
            int temp = numList.get(i)*2;

            numList.set(i, temp);
        }
        System.out.println(numList);
    }

    private static void ex4() {
    var list = createList(5);
    System.out.println(list);
    }
    private static ArrayList<Integer> createList(Integer maxNumber) {

        ArrayList<Integer> numList = new ArrayList<Integer>();
        for (int i = 1; i <= maxNumber; ++i) {
        }
        return numList;
    }

}

