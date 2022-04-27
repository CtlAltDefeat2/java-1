package com.xpanxion.assignments.groupa;

import java.util.ArrayList;

import static com.xpanxion.assignments.groupa.student20.main;

public class student20 {
    public static void main(String[] args) {
        ex1();


    }

    private static void ex1() {
        System.out.println("Ex. 1");
        addNumbers(new ArrayList<>());
    }
    private static Integer addNumbers(ArrayList<Integer> numList) {
        int[] ints = {1, 2, 3};
        int sum = 0;
        var list1 = new ArrayList<Integer>();
        for (int i = 0; i < ints.length; i++) {
            list1.add(ints[i]);
            sum += list1.get(i);
        }
        System.out.println("Sum of all numbers in Array: " + sum);
        return null;
    }


    private static void ex2() {
        System.out.println("Ex. 2");
        avgNumbers(new ArrayList<>());
    }

    private static Float avgNumbers(ArrayList<Integer> numList) {
        // TODO: Implement this function.
        int[] ints = {1, 2, 3};
        float avg = 0;
        int sum = 0;
        var list = (new ArrayList<Integer>());
        for (int i = 0; i < ints.length; i++){
            list.add(ints[i]);
            sum += list.get(i);
        }
        avg =sum/ints.length;

        return null;
    }
    private static void ex3() {
        System.out.println("Ex. 3");
        int[] ints = {1, 2, 3};
        var list = new ArrayList<Integer>();
        for (int i = 0; i < ints.length; i++){
            list.add(ints[i]);

        }
        multiply(list);
    }
    private static void multiply(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(1) *2);
        }
        System.out.println("This is the doubled Array: " + list);
    }
    }










