package com.xpanxion.assignments.groupf;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class student14 {
    public static void main(String[] args) {
//        ex1();
//        ex2();
//        ex3();
        ex4();
    }

    //vars, loops, ifs, functions
    private static void ex1() {
        int[] ints = {1, 2, 3}; //declare array

        ArrayList<Integer> numList = new ArrayList<>();//declare new array list
        //Implement function
        for (int i : ints) {
            numList.add(i);
        }
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
        int[] ints = {1, 2, 3, 4};
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
//create list
//for loop to determine the type of numbers in list
        ArrayList<Integer> numList = new ArrayList<>();
        for (int i = 1; i <= maxNumber; ++i) {
            numList.add(i);
        }
        return numList;
    }

}





