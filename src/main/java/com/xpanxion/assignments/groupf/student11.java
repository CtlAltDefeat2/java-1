package com.xpanxion.assignments.groupf;

import javax.print.attribute.IntegerSyntax;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class student11 {
    public static void main(String[] args) {
        //ex1();
        //ex2();
        //ex3();
        //ex4();
        ex5();
    }

    private static void ex1() {
        int[] ints = {1, 2, 3};
        var numList = new ArrayList<Integer>(ints.length);
        for (int i : ints) {
            numList.add(i);
        }
        var sum = addNumbers(numList);
        System.out.println("The sum is" + sum);
    }

    private static Integer addNumbers(ArrayList<Integer> numList) {
        int sum = 0;
        for (int i = 0; i < numList.size(); i++) {
            sum += numList.get(i);
        }
        return sum;
    }


    private static void ex2() {
        ArrayList<Integer> numList = new ArrayList<>(); //declare new array list
        //convert int to integer
        int[] ints = {1, 2, 3, 4};
        //var newList = new ArrayList<Integer>();
        for (int i : ints) {
            numList.add(i);
        }
        //take sum of list
        var r = avgNumbers(numList);

        System.out.println(r);

    }

    private static Float avgNumbers(ArrayList<Integer> numList) {
        Float retVal = 0F;
        var sum = addNumbers(numList);
        float Length = numList.size();

        float average = sum / Length;

        return average;
    }


    private static void ex3() {
        ArrayList<Integer> numList = new ArrayList<>(); //declare new array list
        //convert int to integer
        int[] ints = {1, 2, 3, 4};
        //add the number to the numList
        for (int i : ints) {
            numList.add(i);
        }
        doubleNumbers(numList);
    }

    private static void doubleNumbers(ArrayList<Integer> numList) {

        for (int i = 0; i < numList.size(); i++) {

            int temp = numList.get(i);

            numList.set(i, (temp * 2));
        }
        System.out.println(numList); //print list
    }

    private static void ex4() {
        var list = createList(5);
        System.out.println(list);
    }

    private static ArrayList<Integer> createList(Integer maxNumber) {

        ArrayList<Integer> numList = new ArrayList<>();
        for (int i = 1; i <= maxNumber; ++i) {
            numList.add(i);
        }
        return numList;
    }

    private static <Integers> void ex5() {
        int[] ints = {1, 2, 3, 5, 6, 9, 11};
        ArrayList<Integer> numList = new ArrayList<>();
        for (int i = 0; i < ints.length; i++) {
            numList.add(ints[i]);
        }
        System.out.println(findMissingNumbers(numList));
    }

    private static ArrayList<Integer> findMissingNumbers(ArrayList<Integer> numList) {
        var missingNumbers = new ArrayList<Integer>();
        // identify first number and last number
        int firstNumber = numList.get(0);
        int lastNumber = numList.get(numList.size() - 1);
        for (int i = firstNumber; i < lastNumber; i++) {
            if (!numList.contains(i)) {
                missingNumbers.add(i);
            }
        }
        return missingNumbers;
    }

}






