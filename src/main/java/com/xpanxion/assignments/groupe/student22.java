package com.xpanxion.assignments.groupe;

import java.util.ArrayList;
import java.util.Scanner;

public class student22 {
    public static void main(String[] args) {

            ex1();
            ex2();
        }
        private static void ex1() {
            int[] ints = {1, 2, 3};
            var newList = new ArrayList<Integer>();
            // TODO: convert ints to newList.
            for(int i : ints){
                newList.add(i);
            }
            var result = addNumbers(newList);
            System.out.println(result);
        }
        //
        // My functions
        //
        private static Integer addNumbers(ArrayList<Integer> numList) {
            // TODO: Implement this function
            Integer retVal = 0;
             for(int i : numList){
                 retVal += i;
             }
            return retVal;
        }
    private static void ex2() {
        int[] ints = {1, 2, 3, 4};
        var renewList = new ArrayList<Integer>();
        // TODO: convert ints to newList.
        for(int i : ints){
            renewList.add(i);
        }
        var result = avgNumbers(renewList);
        System.out.println(result);
    }


        private static Float avgNumbers(ArrayList<Integer> numList) {
        int myVal = 0;
        Float returnVal = 0.0f;
        for( float i : numList){
            myVal += i;
            returnVal = Float.valueOf(myVal)/numList.toArray().length;
        }
        return returnVal;
    }
    }