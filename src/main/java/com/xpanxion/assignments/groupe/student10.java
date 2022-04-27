package com.xpanxion.assignments.groupe;

import java.sql.Array;
import java.util.ArrayList;
import java.util.stream.IntStream;

public class student10 {

    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
    }

    private static void ex1() {
        int[] ints = {1, 2, 3};
        var newList = new ArrayList<Integer>();
        for (int i : ints) {
            newList.add(i);
        }
        var result = addNumbers(newList);
        System.out.println(result);
    }

    private static Integer addNumbers(ArrayList<Integer> numList) {
        Integer retVal = 0;
        for (Integer i : numList) {
            retVal = retVal + i;
        }
        return retVal;
    }


    private static void ex2() {
        int[] ints = {1, 2, 3};
        var list2 = new ArrayList<Integer>();
        for (int i = 0; i < ints.length; i++){
            list2.add(ints[i]);
        }
        var result = avgNumbers(list2);
        System.out.println(result);
    }
    private static Float avgNumbers(ArrayList<Integer> list2) {
        int sum = 0;
        float avg = 0;
        for (int i = 0; i < list2.size(); i++) {
            sum += list2.get(1);
        }
        avg = sum/list2.size();
        return avg;
    }

    private static void ex3() {
        int[] ints = {1, 2, 3};
        var list3 = new ArrayList<Integer>();
        for (int i = 0; i < ints.length; i++) {
            list3.add(ints[i]);
        }
        doubler(list3);
    }
    private static void doubler(ArrayList<Integer> list3) {
        for (int i = 0; i < list3.size(); i++) {
            list3.set(i, list3.get(i) * 2);
        }
        System.out.println(list3);
    }
}