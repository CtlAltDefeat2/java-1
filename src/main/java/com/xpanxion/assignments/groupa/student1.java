package com.xpanxion.assignments.groupa;

import java.util.ArrayList;
import java.util.Scanner;


public class student1 {

    public static void main(String[] args) {
        ex1();
        //ex2();
        //ex3();
    }
    private static void ex1() {
        int[] array = {1, 2, 3}; // n = 3, n-1 = 2

        // Convert int[] array to ArrayList<Integer>



        var list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);

        var r = addNumbers(list);
        System.out.println(r);

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
    }

    private static void ex2() {
        System.out.println("Ex. 2");
    }

    private static void ex3() {
        System.out.println("Ex. 3");
    }

    private static Integer addNumbers(ArrayList<Integer> numList) {
        Integer retVal = 0;
        for (Integer i : numList) { // foreach
            retVal += i;
        }
        return retVal;
    }

}

