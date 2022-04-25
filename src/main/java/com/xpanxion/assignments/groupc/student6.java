package com.xpanxion.assignments.groupc;

import java.util.ArrayList;
import java.util.Arrays;

public class student6 {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
    }

    private static void ex1() {
        int[] ints = {1, 2, 3};
        var intList = new ArrayList<Integer>(ints.length);
        int sum = 0;
        for (int i : ints)
        {
            intList.add(i);
        }
        System.out.println(addNumbers(intList));
    }
    private static void ex2() {
        int[] ints = {1, 2, 3};
        var intList = new ArrayList<Integer>(ints.length);
        int sum  = 0;
        for (int i : ints)
        {
            intList.add(i);
        }
        System.out.println(avgNumbers(intList));
    }

    private static void ex3() {
        int[] ints = {1, 2, 3};
        var intList = new ArrayList<Double>(ints.length);
        int sum = 0;
        for (int i : ints)
        {
            intList.add(i);
        }
        System.out.println(double(intList));
    }

    private static void doubleNum(ArrayList<Integer> numList) {
        int[] ints = {1, 2, 3};
        ArrayList<Integer> doubleArray = ints.stream().map






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
