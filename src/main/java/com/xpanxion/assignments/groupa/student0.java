package com.xpanxion.assignments.groupa;

import java.math.BigDecimal;
import java.sql.Array;
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

//        int[] ints = {1,2,3,4};
//        int[] ints2 = {1,4};
//        var s2 = Arrays.stream(ints).boxed().collect(Collectors.toSet());
//        var s1 = Arrays.stream(ints2).boxed().collect(Collectors.toSets());
//        s2.removeAll(s1);
//        System.out.println(s2);

//        int[] ints = {1, 2, 3, 5, 6, 9, 11};
//        var intList = Arrays.stream(ints).boxed().toList();
//        var missingNumbers = new ArrayList<Integer>();
//        for (int i = 1; i < ints[ints.length - 1]; i++) {
//            if (!intList.contains(i)) {
//                missingNumbers.add(i);
//            }
//        }
//        System.out.println(missingNumbers);


        var shoppingCart = new ArrayList<BigDecimal>();
        shoppingCart.add(new BigDecimal(1.11));



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
