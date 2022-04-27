package com.xpanxion.assignments.groupc;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.math.BigInteger.*;

public class student5 {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
        ex5();
        ex6();
    }
    public static void ex1() {
        int[] ints1 = {1, 2, 3};
        var array = new ArrayList<Integer>();
        for (int i: ints1) {
            array.add(i);
        }
        var result = addNumbers(array);
        System.out.print("Ex. 1    ");
        System.out.println(result);
    }
    public static Integer addNumbers(ArrayList<Integer> numList) {
        Integer returnValue = 0;
        for (Integer i: numList) {
            returnValue += i;
        }
        return returnValue;
    }
    public static void ex2() {
        int[] ints2 = {1, 2, 3};
        var array2 = new ArrayList<Integer>();
        for (int i: ints2) {
            array2.add(i);
        }
        var results2 = avgNumbers(array2);
        System.out.print("Ex. 2    ");
        System.out.println(results2);
    }
    private static Float avgNumbers(ArrayList<Integer> avgArray) {
        float avg;
        float sum = 0;
        for (int i = 0; i < avgArray.size(); i++) {
            sum += avgArray.get(i);
        }
        avg = sum / avgArray.size();
        return avg;
    }
    private static void ex3() {
        int[] ints3 = {1, 2, 3};
        var array3 = new ArrayList<Integer>();
        for (int i: ints3) {
            array3.add(i);
        }
        System.out.print("Ex. 3    ");
        System.out.println(dblNumbers(array3));
    }
    private static ArrayList<Integer> dblNumbers(ArrayList<Integer> dblArray) {
        for (int i = 0; i < dblArray.size(); i++) {
            dblArray.set(i, dblArray.get(i) * 2);
        }
        return dblArray;
    }
    public static void ex4() {
        System.out.print("Ex. 4    ");
        int max = 16;
        createList(max);
    }
    private static void createList(Integer maxNumber) {
        var array4 = new ArrayList<Integer>();
        for (int i = 0; i < maxNumber; i++) {
            array4.add(i + 1);
        }
        System.out.println(array4);
    }
    public static void ex5() {
//        int[] ints5 = {1, 2, 3, 5, 6, 9, 11};
//        Integer missingInts = 0;
//        int maxNumber = 11;
//        var missingNumbers = findMissingNumbers(ints5, maxNumber);
        System.out.println("Ex. 5    (In progress)");
//        System.out.println(missingNumbers);
    }
//    private static Integer findMissingNumbers(int[] ints5, Integer maxNumber) {
//
//        int xorArray = ints5[0];
//        //XOR of elements of the array
//        for(int i=1; i<=maxNumber-1; i++) {
//            xorArray = xorArray ^ i;
//        }
//        int xorAll = ints5[0];
//        //XOR of elements of the array
//        for(int i=1; i<=maxNumber+1; i++) {
//            xorAll = xorAll ^ i;
//        }
//        int missingInts = xorArray ^ xorAll;
//        return missingInts;
//    }
    public static void ex6() {
        int[] ints6 = {0,1,1,1,0,0,1,0,0,1,0,0,0};
        Arrays.sort(ints6);
        var sortedInts = Arrays.stream(ints6).sorted().toArray();
        System.out.print("Ex. 6    ");
        System.out.println(Arrays.toString(ints6));

    }
    public static void ex7() {
        System.out.print("Ex. 7    ");
    }
    public static void ex8() {
        System.out.print("Ex. 8    ");
    }
    public static void ex9() {
        System.out.print("Ex. 9    ");
    }
    public static void ex10() {
        System.out.print("Ex. 10   ");
    }
}