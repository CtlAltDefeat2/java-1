package com.xpanxion.assignments.groupb;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class student8 {
    public static void main(String[] args) {
        ex4();

    }

    // EX 1
    private static void ex1() {
        int[] ints = {1, 2, 3};

        var newList = new ArrayList<Integer>();
        for (int i = 0; i < ints.length; i++) {
            newList.add(ints[i]);
        }
        var result = addNumbers(newList);

        System.out.println(result);

    }
    private static Integer addNumbers(ArrayList<Integer> numList) {
        var sum = 0;
        for (int i = 0; i < numList.size(); i++) {
            sum = sum + numList.get(i);
        }
        return sum;
    }


    // EX 2
    private static void ex2() {
        int[] ints = {1, 2, 3};

        var numList = new ArrayList<Integer>();
        for (int i = 0; i < ints.length; i++) {
            numList.add(ints[i]);
        }

        var result = avgNumbers(numList);
        System.out.println(result);

    }

    private static Float avgNumbers(ArrayList<Integer> numList) {
        var sum = 0;
        var avg = 0;

        for (int i = 0; i < numList.size(); i++) {
            sum = sum + numList.get(i);
            avg = sum / numList.size();
        }
        return (float) avg;
    }

    // EX 3
    private static void ex3() {
        int[] ints = {1, 2, 3};
        var newList = new ArrayList<Integer>();

        for (int i = 0; i < ints.length; i++) {
            newList.add(ints[i]);
        }

        var result = doubleNumbers(newList);
        System.out.println(result);

    }

    private static ArrayList<Integer> doubleNumbers(ArrayList<Integer> numList) {
        var doubledNumbers = new ArrayList<Integer>();
        for (int i = 0; i < numList.size(); i++) {
            doubledNumbers.add(numList.get(i) * 2);
        }

        return doubledNumbers;

    }

    // EX 4
    private static void ex4() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the max numbers you'd like in an array: ");
        var maxNumber = scanner.nextLine();

        var result = createList(Integer.valueOf(maxNumber));
        System.out.println(result);

    }
    private static ArrayList<Integer> createList(Integer maxNumber) {
        var numList = new ArrayList<Integer>(maxNumber);
        for (int i = 0; i < maxNumber; i++) {
            numList.add(i + 1);
        }
        return numList;
    }

    // EX 5
    private static void ex5() {
//        int[] ints = {1, 2, 3, 5, 6, 9, 11};
//        var missingNumbers = new ArrayList<Integer>(ints.length - 1);
//
//        for (int i = 1; i < ints[ints.length-1] + 1; i++) {
//            while {
//
//            }
//            //System.out.println(i);
//        }

        //System.out.println(missingNumbers);
        //System.out.println(ints[ints.length - 1]);
    }

    private static void ex6() {
        System.out.println("Ex. 3");
    }
}
