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
            var newList = new ArrayList<Integer>();
            for (int i = 0; i< ints.length; i++) {

                newList.add(ints[i]);
            }
            System.out.println(addNumbers(newList));
    }


    private static Integer addNumbers(ArrayList<Integer> numList) {

        int sum = 0;
       for( int i = 0; i < numList.size(); i++ ){
            sum += numList.get(i);
        }
        return (sum);
    }


       private static void ex2() {
           int[] ints = {1, 2, 3};
          ArrayList<Integer> num = new ArrayList<Integer>();

          for (int i = 0; i < ints.length; i++) {
               num.add(ints[i]);
           }
           System.out.println(avgNumbers(num));
        }
       private static Float avgNumbers(ArrayList<Integer> numList){

          float f = 0;
           int sum = 0;
            for(int i=0; i< numList.size();i++) {
               sum += numList.get(i);
            }
           f = sum / numList.size();
            return f;
    }
       private static void ex3() {
           int[] ints = {1, 2, 3};
            ArrayList<Integer> num = new ArrayList<Integer>();

           for (int i = 0; i < ints.length; i++) {
               num.add(ints[i]);
            }
           Doubles(num);

       }
    private static void Doubles (ArrayList<Integer> numList) {
      double d = 0;
        int sum = 0;
        for(int i=0; i< numList.size();i++) {
          int temp = numList.get(i);
           numList.set(i,(temp*2));
        }
       System.out.println(numList);
   }

    }




