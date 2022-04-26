package com.xpanxion.assignments.groupa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class student4 {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
    }

    private static Integer addNumbers(ArrayList<Integer> numList) { // 1,2,3,4
        Integer retval = 0;
        for (Integer i : numList) { // For each Integer "i" in this numList, I'm going to do the following...
            retval = retval + i; // = is an assignment operator.
        }
        return retval;
    }

    private static void ex1() {
        int[] ints = {1, 2, 3, 4};
        var newList = new ArrayList<Integer>();
        for (int i : ints) {
            newList.add(i);
        }
        var result = addNumbers(newList);
        System.out.println("the sum of the Array is: " + result);
    }




    private static void ex2() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        double sum = 0;
        for (int i : list) {
            sum += i;
        }
        double average = sum / list.size();

        System.out.println("Average = " + average);
    }



    private static void ex3() {

    }
}
