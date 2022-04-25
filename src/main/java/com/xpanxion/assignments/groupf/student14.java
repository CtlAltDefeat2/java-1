package com.xpanxion.assignments.groupf;

import java.util.ArrayList;
import java.util.Arrays;

public class student14 {
    public static void main(String[] args) {
        ex1();
    }

    private static void ex1() {
        int[] ints = {1, 2, 3}; //declare array

        ArrayList<Integer> numList = new ArrayList<>();//declare new array list
        //Implement function
        for (int i: ints){
            numList.add(i);
        }
             var sum = addNumbers(numList);
        System.out.println("The sum is " + sum);
    }

    private static Integer addNumbers(ArrayList<Integer> numList) {
        // implementing function
        int[] ints = {1, 2, 3}; //declare array
        int sum = 0;
        for (int i=0; i< ints.length; i++){
            sum = sum + ints[i];
                }
        return sum;
    }
}
//        private static void ex2 () {
//            System.out.println("Ex. 2");
//        }
//
//        private static void ex3 () {
//            System.out.println("Ex. 3");
//        }
  //