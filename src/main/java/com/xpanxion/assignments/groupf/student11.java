package com.xpanxion.assignments.groupf;

import java.util.ArrayList;
import java.util.List;

public class student11 {
    public static void main(String[] args) {
    ex1();
    }
    private static void ex1() {
    int[] ints = {1, 2, 3};
    var numList = new ArrayList<Integer>(ints.length);
    for(int i : ints) {
        numList.add(i);
    }
    var sum = addNumbers(numList);
        System.out.println("The sum is" + sum);
    }
private static Integer addNumbers(ArrayList<Integer> numList) {
    int sum = 0;
    for (int i = 0; i < numList.size(); i++) {
        sum +=numList.get(i);
    }
    return sum;
}







    private static void ex2() {
        System.out.println("Ex. 2");
    }

    private static void ex3() {
        System.out.println("Ex. 3");
    }


    }
