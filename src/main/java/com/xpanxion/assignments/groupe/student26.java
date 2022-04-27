package com.xpanxion.assignments.groupe;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class student26 {
    public static void main(String[] args) {

        ex4();

    }

    private static void ex1() {

        //Test writing in code
        int[] ints = {1, 2, 3};
        var newList = new ArrayList<Integer>();
        // TODO: convert ints to newList.

        for (int i:ints) {
            newList.add(i);
        }

        //System.out.println(newList);
        var result = addNumbers(newList);
         System.out.println(result);

    }
     private static  Integer addNumbers(ArrayList<Integer>numList) {

        //TODO:Implement this function
          Integer retval=0;

         for (Integer i :numList) {
            retval =  retval + i;
        }
         return  retval;

     }

//Example 2 Begin

    private static void ex2() {

        int[] ints = {1, 2, 3,12};
        var listnew = new ArrayList<Integer>();
        // TODO: convert ints to newList.

        for (int i:ints) {
            listnew.add(i);
        }

        var result = avgNumbers(listnew);
        System.out.println(result);


        }
        private static Float avgNumbers(ArrayList<Integer> numList) {
            // TODO: Implement this function.

            var retval = addNumbers(numList);
            return Float.valueOf(retval)/numList.toArray().length;


        }



        private static void ex3() {


            int[] list = {1, 2, 3};

            var listnew = new ArrayList<Integer>();

            for (int i : list) {
                listnew.add(i);
            }

            System.out.println(listnew);

            doublenumber(listnew);
            System.out.println("The numbers doubled are: " +listnew);

    }


    private static void doublenumber(ArrayList<Integer> numList) {



        for ( int i = 0; i < numList.size(); i ++) {

            numList.set(i, numList.get(i)*2);
        }
    }



    private static void ex4() {


        Scanner enter = new Scanner (System.in);
        System.out.print("Max value:");
        int number = enter.nextInt();

        createList(number);
        System.out.println(number);

    }



    private static void createList(Integer maxNumber) {

        var arraylist = new ArrayList<>();


        for(int i = 1; i <= maxNumber; i++) {
            arraylist.add(i);
        }

        System.out.println(arraylist);
    }

    private static void ex5() {


    }

}
