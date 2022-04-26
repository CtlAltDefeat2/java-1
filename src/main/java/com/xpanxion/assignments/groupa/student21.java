package com.xpanxion.assignments.groupa;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class student21 {
    public static void main(String[] args) {

        ex1();
    }

    private static void ex1() {
        // here..
        int[] ints = {1, 2, 3, 4, 5};
       //creates new ArrayList object for Integers call numList
        var numList = new ArrayList<Integer>();
        //enhanced for loop adds all elements of the original array to the numList arraylist
       for(int number:ints){
           numList.add(number);
       }
       //result equals the addNumbers method with the numList array as the parameter being passed in
        var result = addNumbers(numList);
        System.out.println(result);

    }


    private static void ex2() {
        System.out.println("Ex. 2");
    }

    private static void ex3() {
        System.out.println("Ex. 3");
    }

    //
    // My functions
    //

    //This function goes through the ArrayList and adds all the integers together
    private static Integer addNumbers(ArrayList<Integer> numList){
        int total = 0;
        for(int number:numList){
            total += number;
        }
        return total;
    }
}
