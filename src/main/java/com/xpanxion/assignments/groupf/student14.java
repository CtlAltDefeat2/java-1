package com.xpanxion.assignments.groupf;

import java.util.*;

import static java.lang.System.*;

public class student14 {
    public static void main(String[] args) {
//      ex1();
//      ex2();
//      ex3();
//      ex4();
//      ex5();
//      ex6();
//      ex7();
        ex8();
    }

    //vars, loops, ifs, functions
    private static void ex1() {
        int[] ints = {1, 2, 3}; //declare array

        var numList = new ArrayList<Integer>();//declare new array list
        //Implement function
        for (int i : ints) {
            numList.add(i);
        } // map

        var sum = addNumbers(numList);
        out.println("The sum is " + sum);
    }

    private static Integer addNumbers(ArrayList<Integer> numList) {
        // implementing numList function
        int sum = 0;
        for (int i = 0; i < numList.size(); i++) {
            sum += numList.get(i);
        }
        return sum;
    }

    private static void ex2() {
        ArrayList<Integer> numList = new ArrayList<>();//declare new array list
        //convert int to integer
        int[] ints = {11, 2, 3, 4, 5};
        //var newList = new ArrayList<Integer>();
        for (int i : ints) {
            numList.add(i);
        }

        //take sum of list
        var r = avgNumbers(numList);

        out.println(r);
    }

    private static Float avgNumbers(ArrayList<Integer> numList) {
        Float retVal = 0F;
        var sum = addNumbers(numList);
        float length = numList.size();
        float average = sum / length;
        return average;
    }


    private static void ex3() {
        var numList = new ArrayList<Integer>();//declare new array list
        //convert int to integer
        int[] ints = {1, 2, 3, 4};
        //add the numbers to the numList
        for (int i : ints) {
            numList.add(i);
        }
        doubleNumbers(numList);
        out.println(numList);//print list
    }

    private static void doubleNumbers(ArrayList<Integer> numList) {
        for (int i = 0; i < numList.size(); i++) {
            int timesTwo = numList.get(i);
            numList.set(i, (timesTwo * 2));
        }
    }

    private static void ex4() {
        var list = createList(5);
        out.println(list);
    }

    private static ArrayList<Integer> createList(Integer maxNumber) {
//create list
//for loop to determine the type of numbers in list
        ArrayList<Integer> numList = new ArrayList<>();
        for (int i = 1; i <= maxNumber; i++) {
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
        out.println(findMissingNumbers(numList));
    }

    private static ArrayList<Integer> findMissingNumbers(ArrayList<Integer> numList) {
        var missingNumbers = new ArrayList<Integer>();
        int firstNumber = numList.get(0);
        int lastNumber = numList.get(numList.size() - 1);
        for (int i = firstNumber; i < lastNumber; i++) {
            if (!numList.contains(i)) { // ! means "not" negation operator
                missingNumbers.add(i);
            }
        }
        return missingNumbers;
    }

//    private static void ex6() {
//        int[] ints = {0, 1, 1, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0};
//        ArrayList<Integer> numList = new ArrayList<>();
//       // int[] sorted = sortCollection;
//
//        for (int i = 0; i < ints.length; i++) {
//            numList.add(ints [i]);
//        }
//        System.out.println((Arrays.toString(sortCollection(ints))));
//    }
//    private static int[] sortCollection (int[] ints) {
//             Arrays.sort(ints);
//        return ints;

    private static void ex6() {
        //ints array
        int[] ints = {0, 1, 1, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0};
        //initializing string a
        out.println(organizeZerosAndOnes(ints));
    }

    private static String organizeZerosAndOnes(int[] ints) {
        String result = "";
        //initializing left string
        String leftZeros = "";
        //initializing right string
        String rightOnes = "";
        //for loop because we are iterating through every element of ints array
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == 0) {
                //we are calling the object integer to convert an array element to string element
                leftZeros += Integer.toString(ints[i]);
            } else {
                rightOnes += Integer.toString(ints[i]);
            }
        }
        result = leftZeros + rightOnes;
        return result;
    }

    //Write a Java function that retuns a random number from ArrayList of type Integer.
    private static void ex7() {
        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        var numList = new ArrayList<Integer>(ints.length);
        for (int i : ints) {
            numList.add(i);
        }
        out.println(randomNumber(numList));
    }
    private static Integer randomNumber(ArrayList<Integer> numList) {
        //var random = 0;
        for (int i = 0; i < numList.size(); i++) {
            if (numList.contains(i)) {
                Collections.shuffle(numList);
            }
        }
        int firstNumber = numList.get(0);
        return firstNumber;
    }
/* Write a function that calculates the total cost of a shopping cart. The items in the shopping cart are contained in an ArrayList of type Float.

The total cost is calculated by the following:

Sum the cost of all the items in the ArrayList
Apply 10% sales tax
Apply shipping and handling fees:
Add $5.00 for orders under $10.00
Add $4.00 for orders > $10.00 and < $20.00
Free shipping and handling for orders > $20.00 */
    private static void ex8() {
        //int items =
        float[] itemPrice = {2.00F,2.00F};
        var itemList = new ArrayList<Float>();//declare new array list
        float withShippingAndHandling = 0;
        //var sumPrices = 0.00F;
        //sum array list done in previous exercise function
        for (float i : itemPrice) {
            itemList.add(i);
        }
        //Implement function
        float itemsTotal = addPrices(itemList);
        System.out.println(itemsTotal);
/////Apply 10% sales tax to itemsTotal
        float salesTax = itemsTotal *.1F ;
        float total = salesTax + itemsTotal;
        //itemsTotal+salesTax=total;
/////Apply shipping and handling fees
        if (total < 10) {
            withShippingAndHandling = total + 5;
        } else if (total >= 10 && total < 20) {
            withShippingAndHandling = total + 4;
        }
        else  {
            withShippingAndHandling = total;
        }
        //print total cost = itemsTotal + shipping and handling fees
        System.out.println(withShippingAndHandling);
    }
    private static Float addPrices(ArrayList<Float> itemList) {
        //float [] itemPrice = { };
            float sum = 0;
            for (int i = 0; i < itemList.size(); i++) {
                sum += itemList.get(i);
            }
            return sum;
    }

}
