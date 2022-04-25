package com.xpanxion.assignments.groupe;

import java.util.ArrayList;
import java.util.Collections;

public class student22 {
    public static void main(String[] args) {
        addNumbers();
        avgNumbers();
    }

   private static void addNumbers(){
        int[] ints = {1,2,3};
       int sumOfInts = 0;
        for(int i = 0; i < ints.length; i++) {
             sumOfInts += ints[i];

         }
       System.out.println(sumOfInts);
   }
    private static void avgNumbers(){
      int[] ints = {1,2,3};
        int sumOfInts = 0;
        float avgOfInts = 0;
        for(int i = 0; i < ints.length; i++) {
            sumOfInts += ints[i];
            avgOfInts = sumOfInts / 2;

        }
        System.out.println(avgOfInts);

    }
    private static void ex1() {
        System.out.println("Ex. 1");
    }


    private static void ex2() {
        System.out.println("Ex. 2");
    }

    private static void ex3() {
        System.out.println("Ex. 3");
    }

}
