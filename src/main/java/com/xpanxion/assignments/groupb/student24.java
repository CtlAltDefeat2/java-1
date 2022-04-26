package com.xpanxion.assignments.groupb;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class student24 {
    public static void main(String[] args) {

        ex1();
        ex2();
    }
    //EXERCISE NUMBER 1
    private static void ex1() {
       int[] ints = {1,2,3};
       var numList = new ArrayList<Integer>();
        for(int i: ints){
          numList.add(i);
       }
       var sum = addNumbers(numList);
       System.out.println("The sum is " + sum);
   }
   private static Integer addNumbers(ArrayList<Integer> numList) {
       int sum = 0;
       for (int i = 0; i < numList.size(); i++) {
           sum +=numList.get(i);
       }
       return sum;
    }
//EXERCISE NUMBER 2
   private static void ex2(){
       int[] ints = {1,2,3};
       var numList = new ArrayList<Integer>();
       for(int i: ints){
           numList.add(i);
       }
       var average = average(numList);
       System.out.println("The average is " + average);
   }
    public static Float average(ArrayList<Integer> numList){
        float average = 0;
        int sum =0;
        for(int i=0; i< numList.size(); i++){
            sum += numList.get(i);
        }
        average = sum/numList.size();
        return average;
    }
}

