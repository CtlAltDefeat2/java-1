package com.xpanxion.assignments.groupf;

import java.util.ArrayList;
import java.util.Arrays;

public class student14 {
    public static void main(String[] args) {
        ex1();
    }

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
        int[] ints = {1, 2, 3};
        ArrayList<Integer> numList = new ArrayList<>();//declare new array list

        for (int i : ints) {
            numList.add(i);
        }

        //Convert int to integer to use function in array probably need a foreach function
        var average = avgNumbers(numList);
        System.out.println("Ex. 2");
    }

    private static Float avgNumbers(ArrayList<Integer> numList) {
        // TODO: Implement this function.
        return ?;

//}
////
////        private static void ex3 () {
////            System.out.println("Ex. 3");
////        }
//  //