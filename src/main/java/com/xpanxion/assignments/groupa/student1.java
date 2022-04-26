package com.xpanxion.assignments.groupa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class student1 {

    public static void main(String[] args) {
        ex1();
        //ex2();
        //ex3();
    }

    private static void ex1() {
        int[] nums = {1, 2, 3};
        var numList = new ArrayList<Integer>();
        for (int i: nums) {
            numList.add(i);
        }
        var r = addNumbers(numList);
        System.out.println(r);
    }

    private static Integer addNumbers(ArrayList<Integer> numList) {
        Integer retVal = 0;
        for (Integer i : numList) {   // for each integer "i" in this numList
            retVal = retVal + i;      //retVal += i;
        }
        return retVal;
    }

    private static void ex2() {
        System.out.println("Ex. 2");
    }

    private static void ex3() {
        System.out.println("Ex. 3");
    }
}



     /*var list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);

        var r = addNumbers(list);
        System.out.println(r);*/

//        int sum = 0;
//            /*for(int i=0; i<=array.length-1; i++);   //0 1 2  //a.length =3, a.length-1=2
//            {
//                sum=sum+array[i]; //1,2,3 ==6
//            }*/
//
//        //Enhanced for loop
//        for (int value : array) {
//            sum = sum + value;   //0+1=1, 1+2=3, 3+3=6
//        }
//        System.out.println("Sum of Array:" + sum);