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
    }
    public static void ex1() {
        int[] ints = {1, 2, 3};
        var array = new ArrayList<Integer>();
        for (int i = 0; i < ints.length; i++) {
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
        var array2 = new ArrayList<Integer>();
        System.out.print("Ex. 2    ");
        System.out.println(avgNumbers(array2));
    }
    private static Float avgNumbers(ArrayList<Integer> avgArray) {
        int[] ints = {1, 2, 3};
        float avg = 0;
        float sum = 0;
        avgArray = new ArrayList<>();
        for (int i = 0; i < ints.length; i++) {
            avgArray.add(ints[i]);
            sum += avgArray.get(i);
        }
        avg = sum / avgArray.size();
        return avg;
    }
    private static void ex3() {
        var array3 = new ArrayList<Integer>();
        System.out.print("Ex. 3    ");
        System.out.println(dblNumbers(array3));
    }
    private static String dblNumbers(ArrayList<Integer> dblArray) {
        int[] ints = {1, 2, 3};
        dblArray = new ArrayList<>();
        int[] intsDoubled = IntStream.of(ints).map(e -> e * 2).toArray();
        for (int i = 0; i < intsDoubled.length; i++) {
            dblArray.add(intsDoubled[i]);
        }
        //String finalArray = dblArray.toString();
        return dblArray.toString();
    }
    public static void ex4() {
        System.out.print("Ex. 4    ");
        createList(16);
    }
    private static void createList(Integer maxNumber) {
        var array4 = new ArrayList<Integer>();
        for (int i = 0; i < maxNumber; i++) {
            array4.add(i + 1);
        }
        System.out.println(array4);
    }
    public static void ex5() {
        System.out.print("Ex. 5    ");
    }
    public static void ex6() {
        System.out.print("Ex. 6");
    }
    public static void ex7() {
        System.out.println("Ex. 7");
    }
    public static void ex8() {
        System.out.println("Ex. 8");
    }
    public static void ex9() {
        System.out.println("Ex. 9");
    }
    public static void ex10() {
        System.out.println("Ex. 10");
    }
}