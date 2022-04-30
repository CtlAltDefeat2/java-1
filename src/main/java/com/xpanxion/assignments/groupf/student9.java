package com.xpanxion.assignments.groupf;

import java.util.ArrayList;

public class student9 {
    public static void main(String[] args) {
        //ex1();
        //ex2();
        //ex3();
        //ex4();
        //ex5();
        ex6();
    }

   /* private static void ex1() {
        // Declare ints array.
        int[] ints = {1, 2, 3};
        var numList = new ArrayList<Integer>(ints.length);

        // Enhanced for loop for each element "i" in ints array.
        // We are adding each "i" element to the numList.
        // This is how we convert ints array to an arrayList.
        for (int i : ints) {
            // We are joining each element to numList array.
            numList.add(i);
        }
        // We are calling the addNumbers function and sending the numList to the addNumbers function.
        var sum = addNumbers(numList);

        // We want to return the value of the sum of all elements in the array.
        System.out.println("The sum is " + sum);
    }

    // We are initializing the addNumbers function.
    // We can use "private" only inside this class.
    // Integer type of return value for this function.
    // We're asking the numList to come into the addNumbers function.
    private static Integer addNumbers(ArrayList<Integer> numList) {
        //We are introducing the variable called sum.
        int sum = 0;

        // We are getting the length of the arrayList by calling the for loop.
        // We are asking the size function to stay within the limit.
        for (int i = 0; i < numList.size(); i++) {
            // This is the variable "sum."
            // We are calling the get function inside the numList.
            // We are getting each value from the array and adding it to the sum.
            sum = sum + numList.get(i);
        }
        // We are returning the sum.
        return sum;
    }

    private static void ex2() {
        // We are declaring an ints array.
        int[] ints = {1, 2, 3};

        // We are declaring a new ArrayList of integers.
        var newList = new ArrayList<Integer>();

        // We are creating an ENHANCED FOR LOOP to CONVERT elements to an ArrayList.
        for (int i : ints) {
            // We are adding the elements in the array to the newList.
            newList.add(i);
        }
        // We are INITIALIZING "var r" to help with the conversion. "R" means "result."
        // The return type for "r" is float.
        // We are asking for the average of the newList.
        var r = avgNumbers(newList);
        // We are printing out the results of variable r.
        System.out.println(r);
    }

    // We are CALLING A FUNCTION WITHIN OUR FUNCTION.
    // We are initializing the avgNumbers function.
    // We are sending the arrayList inside of the avgNumbers function.
    // We are asking it to return the value of a float.
    private static Float avgNumbers(ArrayList<Integer> numList) {
        Float retVal = 0F;

        // We are initializing and giving the float the size of the numList.
        float length = numList.size();

        // We are initializing a variable called sum.
        // We are assigning the return value of the addNumbers function (from Ex. 1).
        // We are passing the numList to ArrayList.
        var sum = addNumbers(numList);
        // We are initializing the average of the numList.
        float average = sum / length;
        // We are returning the average to where it's being called.
        return average;
    }

    private static void ex3() {
        // Create an array list.
        ArrayList<Integer> numList = new ArrayList<>();
        int[] ints = {1, 2, 3};
        // We have to convert from an array to an ArrayList.
        // For each int i, loop through each value that belongs to index i.
        for (int i : ints) {
            numList.add(i);
        }
        // We are calling the function.
        // We are sending the numList to doubleNumbers.
        // We aren't asking for any values to be returned.
        doubleNumbers(numList);
    }

    // We are declaring the doubleNumbers function.
    // We are defining the type of variable that can be passed that function.
    private static void doubleNumbers(ArrayList<Integer> numList) {
        // Create a for loop through each integer.
        // We're asking the length of the arrays in numList to stay this size and increase by 1.
        for (int i = 0; i < numList.size(); i++) {
            // We are assigning calling the get function Double every number in numList.
            int timesTwo = numList.get(i);
            numList.set(i, (timesTwo * 2));
        }
        //Print out the results.
        System.out.println(numList);
    }


    private static void ex4() {
        // Create an int array list.
        var list = createList(5);
        System.out.println(list);
    }

    // Create a "createList" function.
    private static ArrayList<Integer> createList(Integer maxNumber) {
        ArrayList<Integer> numList = new ArrayList<>();
        // Do a for loop starting with element 1.
        for (int i = 1; i <= maxNumber; ++i) {
            numList.add(i);
        }
        // Return the numList.
        return numList;
    }

    //Ex5() plan:
    // Make our own function.
    // Count the numbers.
    // Identify first and last numbers in the list.
    // Loop through the numbers.

        private static ArrayList<Integer> createList (Integer maxNumber){

            //For loop through each number.
            ArrayList<Integer> numList = new ArrayList<>();
            for (int i = 1; i <= maxNumber; i++) {
                numList.add(i);
            }
            // Return the output.
            return numList;
        }

        private static void ex5 () {
            // Consider the following array:
            int[] ints = {1, 2, 3, 5, 6, 9, 11};
            ArrayList<Integer> numList = new ArrayList<>();
            for (int i = 0; i < ints.length; i++) {
                numList.add(ints[i]);
            }
            // Print out missing numbers.
            System.out.println(findMissingNumbers(numList));
        }

        private static ArrayList<Integer> findMissingNumbers (ArrayList < Integer > numList) {
            var missingNumbers = new ArrayList<Integer>();
            int firstNumber = numList.get(0);
            int lastNumber = numList.get(numList.size() - 1);
            for (int i = firstNumber; i < lastNumber; i++) {
                if (!numList.contains(i)) {
                    missingNumbers.add(i);
                }
            }
            return missingNumbers;
        }*/

        //We are declaring an ints array.
        private static void ex6 () {
            //We declare an int array.
            int[] ints = {0, 1, 1, 1, 0, 0, 1, 0, 0, 0};
            System.out.println(organizeZerosAndOnes(ints));
        }

        private static String organizeZerosAndOnes ( int[] ints){
            // We are initializing string result.
            String result = "";

            // We are initializing a left string.
            String leftZeros = "";

            // We are initializing a right string.
            String rightOnes = "";

            // We are adding a for loop because we are iterating through every element of the ints array.
            for (int i = 0; i < ints.length; i++) {
                if (ints[i] == 0) {
                    // We are CALLING the object integer to CONVERT an array element to a string element.
                    leftZeros += Integer.toString(ints[i]);
                } else {
                    rightOnes += Integer.toString(ints[i]);
                }

            }
            {
                result = leftZeros + rightOnes;
                return result;

            }
        }
    }























