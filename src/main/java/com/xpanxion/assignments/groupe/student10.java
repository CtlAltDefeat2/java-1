package com.xpanxion.assignments.groupe;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class student10 {

    public static void main(String[] args) {
        ex1();
    }

    private static void ex1() {
        int[] ints = {1, 2, 3};
        var newList = new ArrayList<Integer>();
        for (int i : ints) {
            newList.add(i);
        }
        var result = addNumbers(newList);
        System.out.println(result);
    }

    private static Integer addNumbers(ArrayList<Integer> numList) {
        Integer retVal = 0;
        for (Integer i : numList) {
            retVal = retVal + i;
        }
        return retVal;
    }
}

//        private static void addNumbers(ArrayList<Integer> numList) {
//            // TODO: Implement this function.
//            int[] ints = {1, 2, 3};
//            int sum = IntStream.of(ints).sum();
//            System.out.println("The sum of all numbers in the array is: " + sum);
//        }


//   // private static void ex2() {
//      //  System.out.println("Ex. 2");
//    }
//
//    //private static void ex3() {
//   //     System.out.println("Ex. 3");
//    }
//}
