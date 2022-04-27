package com.xpanxion.assignments.groupe;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class student26 {
    public static void main(String[] args) {

        ex2();

    }

    private static void ex1() {

        //Test writing in code
        int[] ints = {1, 2, 3};
        var newList = new ArrayList<Integer>();
        // TODO: convert ints to newList.

        for (int i:ints) {
            newList.add(i);
        }

        //System.out.println(newList);
        var result = addNumbers(newList);
         System.out.println(result);

    }
     private static  Integer addNumbers(ArrayList<Integer>numList) {

        //TODO:Implement this function
          Integer retval=0;

         for (Integer i :numList) {
            retval =  retval + i;
        }
         return  retval;

     }

//Example 2 Begin

    private static void ex2() {

        int[] ints = {1, 2, 3,12};
        var listnew = new ArrayList<Integer>();
        // TODO: convert ints to newList.

        for (int i:ints) {
            listnew.add(i);
        }

        var result = avgNumbers(listnew);
        System.out.println(result);


        }
        private static Float avgNumbers(ArrayList<Integer> numList) {
            // TODO: Implement this function.

            var retval = addNumbers(numList);
            return Float.valueOf(retval)/numList.toArray().length;


        }



        private static void ex3() {
        System.out.println("Ex. 3");
    }
}
