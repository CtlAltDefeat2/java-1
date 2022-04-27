package com.xpanxion.assignments.groupf;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

    public class student15 {
        public static void main(String[] args) {
            ex1();
            ex2();
            ex3();
            ex4();
            ex5();
        }

        private static void ex1() {
            int[] ints = {1, 2, 3};
            var numList = new ArrayList<Integer>(ints.length);
            for (int i : ints) {
                numList.add(i);
            }
            var sum = addNumbers(numList);
            System.out.println("The sum is " + sum);
        }

        private static Integer addNumbers(ArrayList<Integer> numList) {
            int sum = 0;
            for (int i = 0; i < numList.size(); i++) {
                sum += numList.get(i);
            }
            return sum;
        }

        private static void ex2() {
            int[] ints = {1, 2, 3, 4};
            // Define an ArrayList of integers.
            int length = ints.length;
            var newList = new ArrayList<Integer>();
            // Create for loop to add integers.
            for (int i : ints) {
                newList.add(i);
            }
            var r = avgNumbers(newList);
            System.out.println(r);
        }

        private static Float avgNumbers(ArrayList<Integer> numList) {
            Float retVal = 0F;
            var sum = addNumbers(numList);

            float length = numList.size();
            float average = sum / length;
            return average;
        }

        private static void ex3() {
            ArrayList<Integer> numList = new ArrayList<>();//declare new array list
            //convert int to integer
            int[] ints = {1, 2, 3, 4};
            //add the numbers to the numList
            for (int i : ints) {
                numList.add(i);
            }
            doubleNumbers(numList);

        }

        private static void doubleNumbers(ArrayList<Integer> numList) {

            for (int i = 0; i < numList.size(); i++) {

                int timesTwo = numList.get(i);
                numList.set(i, (timesTwo * 2));
            }
            System.out.println(numList);//print list

        }
         private static void ex4() {
            var list = createList(5);
            System.out.println(list);
        }
        private static ArrayList<Integer> createList(Integer maxNumber) {
            // create List
            // for loop to determine the type of numbers in list
            ArrayList<Integer> numList = new ArrayList<>();
            for (int i = 1; i <= maxNumber; ++i) {
                numList.add(i);
            }
         return numList;
    }

        private static void ex5() {

            int[] ints = {1, 2, 3, 5, 6, 9, 11};
            ArrayList<Integer> numList = new ArrayList<>();
            for (int i=0; i<ints.length;i++){
                numList.add(ints[i]);
            }
            System.out.println(findMissingNumbers(numList));
        }

        private static ArrayList<Integer> findMissingNumbers(ArrayList<Integer>numList){
        var missingNumbers = new ArrayList<Integer>();
        int firstNumber=numList.get(0);
        int lastNumber = numList.get(numList.size()-1);
        for(int i = firstNumber; i<lastNumber; i++) {
            if(!numList.contains(i)) {
                missingNumbers.add(i);
            }
        }
        return missingNumbers;

        }
    }
// define new array list
// identify first number and last number
// last index for list
// for loop to loop through numbers in array
// some statement to show what is NOT contained in the