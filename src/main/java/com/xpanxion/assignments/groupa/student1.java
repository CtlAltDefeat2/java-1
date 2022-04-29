package com.xpanxion.assignments.groupa;

import java.util.ArrayList;


public class student1 {

    public static void main(String[] args) {
        //ex1();
        //ex2();
        //ex3();
        //ex4();
        //ex5();
        ex6();
    }

    private static void ex1() {
        int[] nums = {1, 2, 3};
        ArrayList<Integer> numList = new ArrayList<Integer>();
        for (int i : nums) {
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
        int[] nums = {1, 2, 3};
        var numList = new ArrayList<Integer>();
        for (int i : nums) {
            numList.add(i);
        }
        var r = avgNumbers(numList);
        System.out.println("Average:" + r);
    }

    private static Float avgNumbers(ArrayList<Integer> numList) {
        var sum = addNumbers(numList);
        Float length = Float.valueOf(numList.size());
        Float average = sum / length;
        return average;
    }

    private static void ex3() {
        int[] ints = {10, 20, 30, 40};
        var newList = new ArrayList<Integer>();
        for (int i : ints) {
            newList.add(i);
        }
        var result = doubleArray(newList);
        System.out.println(result);
    }

    private static ArrayList<Integer> doubleArray(ArrayList<Integer> numList) {
        for (int i = 0; i < numList.size(); i++) {
            numList.set(i, numList.get(i) * 2);
        }
        return numList;
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

    private static void ex5() {
        int[] ints = {1, 2, 3, 5, 6, 9, 11};
        ArrayList<Integer> numList = new ArrayList<>();
        for (int i = 0; i < ints.length; i++) {
            numList.add(ints[i]);
        }
        System.out.println(findMissingNumbers(numList));
    }

    private static ArrayList<Integer> findMissingNumbers(ArrayList<Integer> numList) {
        var missingNumbers = new ArrayList<Integer>();
        int firstNumber = numList.get(0);
        int lastNumber = numList.get(numList.size() - 1);
        for (int i = firstNumber; i < lastNumber; i++) {
            if (!numList.contains(i)) {
                missingNumbers.add(i);
            }
        }
        return missingNumbers;
    }

    private static void ex6() {
        //ints array
        int[] ints = {0, 1, 1, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0};
    System.out.println(organizeZerosAndOnes(ints));
    }
    private static String organizeZerosAndOnes(int [] ints) {
        //initialing string result
        String result = "";
        //initializing left string
        String leftZeros = "";
        //initializing right string
        String rightOnes = "";
        //for loop because we are iterating through every element of the int array
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == 0) {
                //we are calling the object integer to convert an array element to string element
                leftZeros += Integer.toString(ints[i]);
            }
            else {
                rightOnes += Integer.toString(ints[i]);
            }
        }
        result = leftZeros + rightOnes;
        return result;
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


