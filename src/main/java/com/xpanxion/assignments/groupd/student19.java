package com.xpanxion.assignments.groupd;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class student19 {

   public static void main (String[] args) {
      ex1();
      ex2();
      ex3();
   }


      private static void ex1(){
      int[] ints = {1, 2, 3};
            var numList = new ArrayList<Integer>();

            for(int i: ints) {
                numList.add(i);
            }
            System.out.println(addNumbers(numList));
    }


    private static Integer addNumbers(ArrayList<Integer> numList) {
       int retval = 0;

       for( int i : numList ){
            retval += i;
        }

        return retval;
    }


       private static void ex2() {
           int[] ints = {1, 2, 3};
          ArrayList<Integer> numList = new ArrayList<Integer>();

          for (int i : ints) {
               numList.add(i);
           }

           System.out.println(avgNumbers(numList));
        }

       private static Float avgNumbers(ArrayList<Integer> numList){

          float f = 0;
           int sum = 0;

            for(int i: numList) {
               sum += i;
            }

           f = sum / numList.size();
            return f;
    }

       private static void ex3() {
           int[] ints = {1, 2, 3};
            ArrayList<Integer> numList = new ArrayList<Integer>();

           for (int i : ints) {
               numList.add(i);
            }

           System.out.println(doubles(numList));

       }

    private static ArrayList<Integer> doubles (ArrayList<Integer> numList) {
      var doubleList = new ArrayList<Integer>();

        for(int i: numList) {
          doubleList.add(i*2);
        }

       return doubleList;
   }

    }




