package com.xpanxion.assignments.groupd;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class student7 {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3};
        ArrayList<Integer> num = new ArrayList<Integer>() ;
        for (int i = 0; i < ints.length; i++) {
            num.add(ints[i]);
        }
        System.out.println(addNumbers(num));

    }

    private static Integer addNumbers(ArrayList<Integer> numList) {
        int sum = 0;
        for (int i = 0; i < numList.size(); i++) {
            sum += numList.get(i);
        }
        // TODO: Implement this function.

        return sum;
    }

    private static void ex2() {
        System.out.println("Ex. 2");
    }

    private static void ex3() {
        System.out.println("Ex. 3");
    }
}
