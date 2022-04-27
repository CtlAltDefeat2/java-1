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
        for (int i: ints) {
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
        int[] ints = {1, 2, 3};
        var array2 = new ArrayList<Integer>();
        for (int i: ints) {
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
        int[] ints = {1, 2, 3};
        var array3 = new ArrayList<Integer>();
        for (int i: ints) {
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
        var scanner  = new Scanner(System.in);
        System.out.print("Ex. 4    ");
        System.out.print("Please enter an integer from 1 to 50:  ");
        int max = scanner.nextInt();
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
        System.out.print("Ex. 5    ");
    }
    public static void ex6() {
        System.out.print("Ex. 6    ");
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