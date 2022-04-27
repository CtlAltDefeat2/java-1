package com.xpanxion.assignments.groupa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class student0 {

    // Framework: SpringBoot Web API
    // Collections, data structures, streams, lambda
    // OOP (classes, interfaces)
    // vars, loops, ifs, functions  <=============== We are here

    public static void main(String[] args) {
        //ex1();

        int[] ints = {1,2,3,4};
        int[] ints2 = {1,4};
        var s2 = Arrays.stream(ints).boxed().collect(Collectors.toSet());
        var s1 = Arrays.stream(ints2).boxed().collect(Collectors.toSet());
        s2.removeAll(s1);
        System.out.println(s2);
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
