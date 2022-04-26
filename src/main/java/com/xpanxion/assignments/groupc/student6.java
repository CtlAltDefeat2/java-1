package com.xpanxion.assignments.groupc;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class student6 {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();

        // temp space

/*
        var list = new ArrayList<Integer>();
        list.add(1);
        list.set(0, 5150);


        System.out.println(list.get(0));
*/

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

    private static Float avgNumbers(ArrayList<Integer> numList) {
        float sum = 0, avg;
        for (int i=0; i < numList.size(); i++)
            sum += numList.get(i);
        avg = (float) sum / numList.size();
        return avg;
    }
    private static int addNumbers(ArrayList<Integer> numList) {
        int sum = 0;
        for (int i=0; i < numList.size(); i++)
            sum += numList.get(i);
        return sum;
    }
}
