package com.xpanxion.assignments.groupc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class student13 {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
        ex5();
    }

    // Ex. 1
    private static void ex1() {
        int[] ints = {1, 2, 3};
        var numList = new ArrayList<Integer>();

        for (int i = 0;i < ints.length; i++) {
            numList.add(ints[i]);
        }
        System.out.println("Ex. 1");
        var result = addNumbers(numList);
        System.out.println("Sum of the array: " + result);
    }
    private static Integer addNumbers(ArrayList<Integer> numList) {
        int sum = 0;

        for (int i = 0;i < numList.size(); i++) {
            sum = sum + numList.get(i);
        }
        return sum;
    }

    // Ex. 2
    private static void ex2() {
        int[] ints = {1, 2, 3};
        var numList = new ArrayList<Integer>();

        for (int i = 0;i < ints.length; i++) { 
            numList.add(ints[i]);              
        }
        System.out.println("Ex. 2");
        var result = avgNumbers(numList);
        System.out.println("Average of the array: "+ result);
    }

    private static Float avgNumbers(ArrayList<Integer> numList) {
        int sum = 0;

        for (int i = 0;i < numList.size(); i++) {
             sum = sum + numList.get(i);
        }
        var avgArray = (float) sum / numList.size();
        return avgArray;
    }

    // Ex. 3
    private static void ex3() {
        int[] ints = {1, 2, 3};
        var numList = new ArrayList<Integer>();

        for (int i = 0;i < ints.length; i++) {
            numList.add(ints[i]);               
        }
        System.out.println("Ex. 3");
        doubleArray(numList);
    }

    private static void doubleArray(ArrayList<Integer> numList) {
        for (int i = 0;i < numList.size(); i++) {
            numList.set(i, 2*numList.get(i));
        }
        System.out.println("Double array list: " + numList);
    }

    // Ex. 4
    private static void ex4(){
        System.out.println("Ex. 4");
        System.out.print("Enter value to create list: ");
        Scanner sc = new Scanner(System.in);
        var maxNum = sc.nextInt();

        createList(maxNum);
    }
    private static void createList(Integer maxNum) {
        ArrayList<Integer> newList = new ArrayList<Integer>();
        for (int i = 0; i < maxNum; i++) {
            newList.add(i+1);
        }
        System.out.println(newList);
    }

    // Ex. 5
    private static void ex5() {
        int[] ints = {1, 2, 3, 5, 6, 9, 11};
        System.out.println("Ex. 5");
        var missingNumbers = findMissingNumbers(ints);
        System.out.println("The array of missing numbers: " + missingNumbers);
    }

    private static ArrayList findMissingNumbers(int[] ints) {
        var numList = new ArrayList<Integer>();
        var numList2 = new ArrayList<Integer>();

        for (int i = 0; i < ints.length; i++) {
            numList.add(ints[i]);
        }

        for (int i = 0; i < numList.get(6); i++) {
            numList2.add(i+1);
        }
        var missingNumList = numList2.removeAll(numList);

        return numList2;
    }
    private static void ex6(){

    }

    // Ex. 6
    private static
}
