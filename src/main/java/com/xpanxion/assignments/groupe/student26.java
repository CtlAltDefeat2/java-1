package com.xpanxion.assignments.groupe;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class student26 {
    public static void main(String[] args) {

        ex1();

    }

    private static void ex1() {

        //Test writing in code
        int[] ints = {1, 2, 3};
        var newList = new ArrayList<Integer>();
        // TODO: convert ints to newList.

        for (int i:ints) {
            newList.add(i);
        }


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



    private static void ex2() {







    }

    private static void ex3() {
        System.out.println("Ex. 3");
    }
}
