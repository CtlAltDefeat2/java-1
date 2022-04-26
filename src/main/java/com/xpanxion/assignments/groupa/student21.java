package com.xpanxion.assignments.groupa;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;



public class student21 {
    public static void main(String[] args) {

        ex1();
        ex2();
        ex3();
        ex4();
    }

    private static void ex1() {
        int[] ints = {1, 2, 3, 4, 5};
        //creates new ArrayList object for Integers call numList
        var numList = new ArrayList<Integer>();
        //enhanced for loop adds all elements of the original array to the numList arraylist
        for (int number : ints) {
            numList.add(number);
        }
        //result equals the addNumbers method with the numList array as the parameter being passed in
        var result = addNumbers(numList);
        System.out.println(result);

    }


    private static void ex2() {
        int[] ints = {1, 2, 3, 4, 5};
        var numList = new ArrayList<Integer>();
        for (int number : ints) {
            numList.add(number);
        }
        var result = avgNumbers(numList);
        System.out.println("The average is " + result);
    }

    private static void ex3() {
        int[] ints = {1, 2, 3, 4, 5};
        var numList = new ArrayList<Integer>();
        for (int number : ints) {
            numList.add(number);
        }
        doubleNumbers(numList);

    }

    private static void ex4() {
        //creates an array up to the number you put in
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the maximum number for the array: ");
        int maxNumber = scanner.nextInt();
        createList(maxNumber);

    }

    //
    // My functions
    //

    //This function goes through the ArrayList and adds all the integers together
    private static Integer addNumbers(ArrayList<Integer> numList) {
        int total = 0;
        for (int number : numList) {
            total += number;
        }
        return total;
    }

    private static Float avgNumbers(ArrayList<Integer> numList) {
        int total = 0;


        for (int number : numList) {
            total += number;
        }
        float avg = Float.valueOf((total / numList.size()));
        return avg;
    }

    private static void doubleNumbers(ArrayList<Integer>numList){ // 1,2,3,4,5. Need to use numlist.get(i) cause if
        // we use regular i it will use the int i = 0; instead and do 0*2, 1*2, 2*2, etc. the for loop is just a COUNTER.
        for (int i=0; i<numList.size(); i++){
            numList.set(i, numList.get(i) * 2);
        }
        System.out.println(numList);
    }


    private static void createList(Integer maxNumber){
        var numList = new ArrayList<Integer>(maxNumber);
        for (int i = 0; i<maxNumber; i++){
            numList.add(i);
            numList.set(i,numList.get(i)+1);
        }
        System.out.println(numList);
    }

}
