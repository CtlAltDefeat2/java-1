package com.xpanxion.assignments.groupe;

import java.util.ArrayList;
import java.util.Scanner;

public class student23 {
    public static void main(String[] args) {
//        Ex1();
//        Ex2();
//        Ex3();
        Ex4();
    }

    private static void Ex1() {
        int[] ints = {1, 2, 3, 4};
        var newList = new ArrayList<Integer>();
        for (int i : ints)
            newList.add(i);

        var result = addNumbers(newList);
        System.out.println(result);
    }

    private static void Ex2() {
        int[] ints = {1, 2, 3, 4};
        var newList = new ArrayList<Integer>();
        for (int i : ints)
            newList.add(i);

        var result = avgNumbers(newList);
        System.out.println(result);
    }

    private static void Ex3() {
        int[] ints = {10, 20, 30, 40};
        var newList = new ArrayList<Integer>();
        for (int i : ints)
            newList.add(i);

        var result = doubleArray(newList);
        System.out.println(result);
    }

    private static void Ex4(){
        Integer maxNum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value for the length of the array to be created");
        maxNum = Integer.parseInt(scanner.next());
        var r= createList(maxNum);
        System.out.println(r);
    }


    private static Integer addNumbers(ArrayList<Integer> numList) {
        Integer retVal = 0;
        for (Integer i : numList) {
            retVal = retVal + i;
        }
        return retVal;
    }

    private static Float avgNumbers(ArrayList<Integer> numList) {
        Float Average;
        Average = Float.valueOf(addNumbers(numList)) / numList.size();
        return (Average);
    }

    private static ArrayList<Integer> doubleArray(ArrayList<Integer> numList) {
        for (int i = 0; i < numList.size(); i++) {
            numList.set(i, numList.get(i) * 2);
        }
        return numList;
    }

    private static ArrayList<Integer> createList(Integer maxNumber){
        var numList = new ArrayList<Integer>();
        for(int i = 0; i <maxNumber; i++){
            numList.add(i+1);
        }
        return numList;
    }

}

