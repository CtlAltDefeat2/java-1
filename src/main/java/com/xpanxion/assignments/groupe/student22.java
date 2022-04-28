package com.xpanxion.assignments.groupe;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.RandomAccess;
import java.util.Scanner;

public class student22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//            ex1();
//            ex2();
//            ex3();
//            ex4();
//            ex5();
//            ex6();
//               ex7();
        ex9();
    }

    private static void ex1() {
        int[] ints = {1, 2, 3};
        var newList = new ArrayList<Integer>();
        for (int i : ints) {
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
        for (int i : numList) {
            retVal += i;
        }
        return retVal;
    }

    private static void ex2() {
        int[] ints = {1, 2, 3, 4};
        var renewList = new ArrayList<Integer>();
        for (int i : ints) {
            renewList.add(i);
        }
        var result = avgNumbers(renewList);
        System.out.println(result);
    }


    private static Float avgNumbers(ArrayList<Integer> numList) {
        var returnVal = addNumbers(numList);
        return Float.valueOf(returnVal) / numList.toArray().length;
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


    private static void doubleNumber(ArrayList<Integer> numList) {

        for (int i = 0; i < numList.size(); i++)
            numList.set(i, numList.get(i) * 2);


//        for(int i : numList){
//            //retVal1 = i *2 ;
//            numList.add(retVal1);
//        }
    }

    private static void ex4() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter max Number");
        int maxNumber = input.nextInt();
        createList(maxNumber);
    }

    private static void createList(Integer maxNumber) {
        // Scanner input = new Scanner(System.in);
        // System.out.println( "enter max Number");
        // maxNumber = input.nextInt();
        var myArrayList = new ArrayList<>();
        for (int i = 0; i <= maxNumber; i++) {
            myArrayList.add(i);
        }
        System.out.println(myArrayList);
    }

    private static void ex5() {
        int[] ints = {1, 2, 3, 5, 6, 9, 11};


        var newList = new ArrayList<Integer>();
        for (int i = 0; i < ints.length; i++) {
            newList.add(i);
        }
        missingNumber(newList);
    }//System.out.println(newList);

    private static void missingNumber(ArrayList<Integer> numList) {
        var myArrayList = new ArrayList<Integer>();
           for(int i : numList) {
        //for (int i : numList) {
        for (int j = 0; j != i; j++) {
            myArrayList.add(j);
        }
    }
            System.out.println(myArrayList);
}

    private static void ex6() {
        int[] ints = {0,1,1,1,0,0,1,0,0,1,0,0,0};
        var myArray = new ArrayList<Integer>();
        for(int i : ints){
            myArray.add(i);

        }
        System.out.println(createZerosAndOnes(myArray));
    }

    private static String createZerosAndOnes(ArrayList<Integer> numList) {
        String myZeros = "";
        String myOnes = "";
        String zerosAndOnes = "";
        for (int i : numList) {
            if (i == 0) {
                myZeros += "0";
            } else {
                myOnes += "1";
            }
            zerosAndOnes = myZeros+myOnes;
        }
//        zerosAndOnes = myZeros + myOnes;
        return zerosAndOnes;
    }
    private static void ex7() {
        int[] ints = {1,2,5,7,8,99,24,56,89,67};
        var myArray = new ArrayList<Integer>();
        for(int i : ints){
            myArray.add(i);

        }
        System.out.println(randomNumber(myArray));
    }


    private static int randomNumber(ArrayList<Integer> numList){
        int rnd = new Random().nextInt(numList.toArray().length);
        return rnd;
    }
    private static void ex9() {
        int[] ints = {1,2,3,1};
        var myArray = new ArrayList<Integer>();
        for(int i : ints){
            myArray.add(i);

        }
        checkArray(myArray);
    }


    private static void checkArray(ArrayList<Integer> numList){
        int arraySum = (addNumbers(numList));
        if (arraySum % 2 == 0){
            System.out.println("this array is even.");
        }
        else
            System.out.println("this array is odd.");
    }


}



