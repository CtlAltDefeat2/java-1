package com.xpanxion.assignments.groupf;

import java.util.ArrayList;
import java.util.List;

public class student9 {
    public static void main(String[] args) {
        ex1();
    }

    private static void ex1() {
        int[] ints = {1, 2, 3};
        // Declare array.
        var numList = new ArrayList<Integer>(ints.length);
        for (int i : ints) {
            numList.add(i);
        }
        var sum = addNumbers(numList);
        System.out.println("The sum is " + sum);
    }

    // TODO: Implement this function.
    private static Integer addNumbers(ArrayList<Integer> numlist) {
       int sum = 0;
       for (int i = 0; i < numlist.size(); i++) {
           // sum = sum + ints[i];
        }
        return sum;

        //System.out.println("arrayList");
    }
}




