package com.xpanxion.assignments.groupc;

import java.util.*;

public class student5 {
    public static void main(String[] args) {
        ex1();
    }
    public static void ex1() {
        var array = new ArrayList<Integer>();
        System.out.println("Ex. 1");
        System.out.println(addNumbers(array));
    }
    public static Integer addNumbers(ArrayList<Integer> numList) {
        int[] ints = {1, 2, 3};
        int sum = 0;
        List<Integer> array = Arrays.stream(ints).boxed().toList();
        int intSum = Arrays.stream(ints).sum();
        return intSum;
    }
    public static void ex2() {
        System.out.println("Ex. 2");
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