package com.xpanxion.assignments.groupf;

import java.util.ArrayList;
import java.util.Arrays;

public class student14 {
    public static void main(String[] args) {
        ex1();
        ex2();
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
        System.out.println("Ex. 3");
    }
}