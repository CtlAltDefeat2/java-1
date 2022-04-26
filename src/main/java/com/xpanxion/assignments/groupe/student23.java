package com.xpanxion.assignments.groupe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class student23{
    public static void main(String[] args) {
//          var numList = new ArrayList<Integer>();
//          Scanner scanner = new Scanner(System.in);
//        while(scanner.hasNextInt()){
//           numList.add(scanner.nextInt());
//        }
//        Integer[] ints = new  Integer[numList.size()];
//        var newList = new ArrayList<Integer>();
//        for (int i : ints) {
//            newList.add(i);
//        }
         Ex1();
         Ex2();
//         Ex3(newList);

//        var newList = new ArrayList<Integer>();
//        newList.add(5150);
//        newList.set(1, 5151);
//        var r = newList.get(0); // Give me the first item list.
//        System.out.println(r);
    }

    private static void Ex1(){
        int[] ints = {1,2,3,4};
        var newList = new ArrayList<Integer>();
        for (int i : ints) {
            newList.add(i);
        }
        var result = addNumbers(newList);
        System.out.println(result);
    }

    private static void Ex2(){
        int[] ints = {1,2,3,4};
        var newList = new ArrayList<Integer>();
        for (int i : ints) {
            newList.add(i);
        }
        var result = avgNumbers(newList);
        System.out.println(result);


    }

//   private static void Ex3(ArrayList<Integer>numList){
//       int[] ints = {1,2,3,4};
//       var newList = new ArrayList<Integer>();
//       for (int i : ints) {
//            newList.add(i);
//        }
//        doubleArray(newList);
//    }

    private static Integer addNumbers(ArrayList<Integer> numList) {
        Integer retVal = 0;
        for (Integer i : numList) {
            retVal = retVal + i;
        }
        return retVal;
    }
    private static Float avgNumbers(ArrayList<Integer> numList) {
        // TODO: Implement this function.
        Float Average;
        Average = Float.valueOf(addNumbers(numList))/numList.size();
        return(Average);
    }

//    private static void doubleArray(ArrayList<Integer> numList){
//        var newList = new ArrayList<Integer>();
//        for (int i : numList) {
//           newList.add(i*2);
//        }
//       System.out.println(newList);
//    }
}

