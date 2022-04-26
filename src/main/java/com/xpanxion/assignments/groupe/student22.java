package com.xpanxion.assignments.groupe;

import java.util.ArrayList;
import java.util.Scanner;

public class student22 {
    public static void main(String[] args) {

            ex1();
        }
        private static void ex1() {
            int[] ints = {1, 2, 3};
            var newList = new ArrayList<Integer>();
            // TODO: convert ints to newList.
            for(int i : ints){
                newList.add(i);
            }
            var result = addNumbers(newList);
            System.out.println(result);
        }
        //
        // My functions
        //
        private static Integer addNumbers(ArrayList<Integer> numList) {
            // TODO: Implement this function
            Integer retVal = 0;
             for(int i : numList){
                 retVal += i;
             }
            return retVal;
        }
    }