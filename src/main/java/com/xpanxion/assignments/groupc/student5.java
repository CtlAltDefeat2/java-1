package com.xpanxion.assignments.groupc;

import java.util.*;
import java.util.stream.Collectors;

public class student5 {
    public static void main(String[] args) {
        //ex1();
        ex2();
    }
    public static void ex1() {
        var array = new ArrayList<Integer>();
        System.out.println("Ex. 1");
        System.out.println(addNumbers(array));
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
    public static void ex3() {
        System.out.println("Ex. 3");
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