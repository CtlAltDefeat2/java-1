package com.xpanxion.assignments.groupc;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.math.BigInteger.*;

public class student5 {
    public static void main(String[] args) {
        //ex1();
        //ex2();
        //ex3();
        ex4();
    }
    public static void ex1() {
        var array = new ArrayList<Integer>();
        System.out.println("Ex. 1");
        System.out.print(addNumbers(array));
    }
    public static Integer addNumbers(ArrayList<Integer> numList) {
        int[] ints = {1, 2, 3};
        List<Integer> array = Arrays.stream(ints).boxed().toList();
        int intSum = Arrays.stream(ints).sum();
        return intSum;
    }
    public static void ex2() {
        var array2 = new ArrayList<Integer>();
        System.out.println("Ex. 2");
        System.out.print(avgNumbers(array2));
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
        System.out.println("Ex. 3");
        System.out.print(dblNumbers(array3));
    }
    private static String dblNumbers(ArrayList<Integer> dblArray) {
        int[] ints = {1, 2, 3};
        dblArray = new ArrayList<>();
        int[] intsDoubled = IntStream.of(ints).map(e -> e * 2).toArray();
        for (int i = 0; i < intsDoubled.length; i++) {
            dblArray.add(intsDoubled[i]);
        }
        String finalArray = dblArray.toString();
        return finalArray;
    }
    public static void ex4() {
        System.out.println("Ex. 4");
    }
    public static void ex5() {
        System.out.println("Ex. 5");
    }
    public static void ex6() {
        System.out.println("Ex. 6");
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