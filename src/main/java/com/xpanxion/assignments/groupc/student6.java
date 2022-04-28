package com.xpanxion.assignments.groupc;

import java.sql.Array;
import java.util.*;

public class student6 {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
        ex5();
        ex6();
        ex7();
        ex8();
    }
    private static void ex8() {

    }
    private static void totalCost() {

    }
    private static void ex7() {
        int[] ints = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        getRandomNum();
    }
    private static void getRandomNum() {
        var intList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20));
        Random randomMethod = new Random();
        int N = intList.size();
        System.out.println(intList.get(randomMethod.nextInt(intList.size())));
    }
    private static void ex6() {
        int[] ints = {0, 1, 1, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0};
        Arrays.sort(ints);
        int N = ints.length;
        numSort(ints, N);
    }
    private static void numSort(int ints[], int N) {
        HashMap<Integer, String> mp = new HashMap<>();
        int i;
        mp.put(0, "0");
        mp.put(1, "1");
        for ( i = 0; i < N; i++) {
            System.out.print(mp.get(ints[i]));
        }
        System.out.println();
    }
    private static void ex5() {
        int[] ints = {1, 2, 3, 5, 6, 9, 11};
        int N = ints.length;
        var missingNumbers = findMissingNumbers(ints, N);
        System.out.println(missingNumbers);
    }
    private static ArrayList<Integer> findMissingNumbers(int ints[], int N) {
        var missingNumbers = new ArrayList<Integer>();
        int diff = ints[0] - 0;
        for (int i =0; i < N; i++)
        {
            if (ints[i] - i != diff)
            {
                while (diff < ints[i] - i)
                {
                    missingNumbers.add(i + diff);
                    diff++;
                }
            }
        }
        return missingNumbers;
    }
    private static void ex4() {
        var numList = new ArrayList<>(5);
        Integer maxNumber = 5;
        createList(5);
    }
    private static void createList(Integer maxNumber) {
        var numList = new ArrayList<>(5);
        for (int i = 0; i < maxNumber; i++) {
            numList.add(i+1);
        }
        System.out.println(numList);
    }
    private static void ex3() {
        int[] ints = {1, 2, 3};
        var numList = new ArrayList<Integer>(ints.length);
        for (int i = 0; i < ints.length; i++)
        {
            numList.add(ints[i]);
        }
        doubled(numList);
    }
    private static void doubled(ArrayList<Integer> numList) {
        for (int i = 0; i < numList.size(); i++) {
            numList.set(i, numList.get(i) * 2);
        }
        System.out.println(numList);
    }
    private static void ex2() {
        int[] ints = {1, 2, 3};
        var numList = new ArrayList<Integer>(ints.length);
        int sum  = 0;
        for (int i : ints)
        {
            numList.add(i);
        }
        System.out.println(avgNumbers(numList));
    }
    private static Float avgNumbers(ArrayList<Integer> numList) {
        float sum = 0, avg;
        for (int i=0; i < numList.size(); i++)
            sum += numList.get(i);
        avg = (float) sum / numList.size();
        return avg;
    }
    private static void ex1() {
        int[] ints = {1, 2, 3};
        var numList = new ArrayList<Integer>(ints.length);
        int sum = 0;
        for (int i : ints)
        {
            numList.add(i);
        }
        System.out.println(addNumbers(numList));
    }
    private static int addNumbers(ArrayList<Integer> numList) {
        int sum = 0;
        for (int i=0; i < numList.size(); i++)
            sum += numList.get(i);
        return sum;
    }
}