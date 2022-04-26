package com.xpanxion.assignments.groupe;

import java.util.ArrayList;
import java.util.Scanner;

public class student22 {
    public static void main(String[] args) {

//            ex1();
//            ex2();
            ex3();
        }
        private static void ex1() {
            int[] ints = {1, 2, 3};
            var newList = new ArrayList<Integer>();
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
            Integer retVal = 0;
             for(int i : numList){
                 retVal += i;
             }
            return retVal;
        }
    private static void ex2() {
        int[] ints = {1, 2, 3, 4};
        var renewList = new ArrayList<Integer>();
        for(int i : ints){
            renewList.add(i);
        }
        var result = avgNumbers(renewList);
        System.out.println(result);
    }


        private static Float avgNumbers(ArrayList<Integer> numList) {
           var returnVal = addNumbers(numList);
            return Float.valueOf(returnVal)/numList.toArray().length;
//        int myVal = 0;
//        Float returnVal = 0.0f;
//        for( float i : numList){
//            myVal += i;
 //           returnVal = Float.valueOf(myVal)/numList.toArray().length;
        }
    private static void ex3() {
        int[] ints = {1, 2, 3};
        var newList = new ArrayList<Integer>();
        for (int i : ints) {
            newList.add(i);
        }
        doubleNumber(newList);
        System.out.println(newList);
    }


    private static void doubleNumber(ArrayList<Integer> numList){

        for(int i = 0; i < numList.size(); i++)
        numList.set(i, numList.get(i) *2);


//        for(int i : numList){
//            //retVal1 = i *2 ;
//            numList.add(retVal1);
//        }
    }

    }
