package com.xpanxion.assignments.groupd;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class student7 {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
    }
    private static void ex1() {
        int[] ints = {1, 2, 3};
        var num = new ArrayList<Integer>() ;
        for (Integer i :ints) {
            num.add(i);
        }
        System.out.println("Ex. 1");
        System.out.println(addNumbers(num));
    }
    private static void ex2() {
        int[] ints = {1, 2, 3};
        ArrayList<Integer> num = new ArrayList<Integer>() ;
        for (Integer i : ints) {
            num.add(i);
        }
        System.out.println("Ex. 2");
        System.out.println(avgNumbers(num));
    }
    private static void ex3() {
        int[] ints = {1, 2, 3};
        ArrayList<Integer> num = new ArrayList<Integer>() ;
        for (int i :ints) {
            num.add(i);
        }
        System.out.println("Ex. 3");
        doubleNumber(num);
    }
    private static Integer addNumbers(ArrayList<Integer> numList) {
        int sum = 0;
        for (int i : numList) {
            sum += i;
        }
        return sum;
    }

    private static Float avgNumbers(ArrayList<Integer> numList) {//ex2 get the average

        int sum = 0;
        float avg ;
        for (int i : numList) {
            sum += i;
        }
        avg = sum/numList.size();
        return avg;
    }
    private static void doubleNumber(ArrayList<Integer> numList) {
        for (int i = 0; i < numList.size(); i++) {
            int temp = numList.get(i);
            numList.set(i, (temp*2));
        }
        System.out.println(numList);
    }
}
