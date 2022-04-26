package com.xpanxion.assignments.groupa;

import java.util.ArrayList;

public class student0 {

    // Framework: SpringBoot Web API
    // Collections, data structures, streams, lambda
    // OOP (classes, interfaces)
    // vars, loops, ifs, functions  <=============== We are here

    public static void main(String[] args) {
        ex1();
    }

    private static void ex1() {
        int[] ints = {1, 2, 3};
        var tempList = new ArrayList<Integer>();
        for (int i: ints) {
            tempList.add(i);
        }
        var result = addNumbers(tempList);
        System.out.println(result);
    }

    //
    // My functions
    //

    private static Integer addNumbers(ArrayList<Integer> numList) {
        Integer retval = 0;
        for (Integer i: numList) {
            retval += i;
        }
        return retval;
    }

}
