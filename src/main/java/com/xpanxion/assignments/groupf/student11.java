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
        //ex5();
        ex6();
    }

    private static void ex1() {
        //declare ints array
        int[] ints = {1, 2, 3};
        var numList = new ArrayList<Integer>(ints.length);
        //enhanced for loop. for each i in ints array, we are adding each i element to the numList.
        //this is how we convert ints array to an arrayList.
        for (int i : ints) {
            //we are joining each element to numList array.
            numList.add(i);
        }
        //calling the add numbers function. sending the numList to the addNumbers function.
        var sum = addNumbers(numList);
        //we want to return the value to the sum of all the elements in the array.
        System.out.println("The sum is" + sum);
    }


    //initializing the addNumbers function. private = we can use function only inside this class.
    //integer type of return value for this function. asking the numList to come in addNumbers function.
    private static Integer addNumbers(ArrayList<Integer> numList) {
        //introducing variable called sum
        int sum = 0;
        //we are getting the length of the arrayList by calling the size function and for loop to stay within the limit.
        for (int i = 0; i < numList.size(); i++) {
            //variable sum. calling the "get" function inside the numlist because we are getting each value from the array and adding it to the sum.
            sum += numList.get(i);
        }
        return sum;
    }


    private static void ex2() {
        ArrayList<Integer> numList = new ArrayList<>(); //declare new array list
        int[] ints = {1, 2, 3, 4};
        //var newList = new ArrayList<Integer>();
        //for each i in ints. we are converting ints to array list.
        for (int i : ints) {
            //adding every integer in the array to the numList
            numList.add(i);
        }
        // initializing variable r. r = result. return type is float. Taking the average of the numList.
        var r = avgNumbers(numList);
        //printing out the result.
        System.out.println(r);

    }

    //function withing our function. initializing aveNumber function. sending the arraylist inside the aveNumber function and returning the value as a float.
    private static Float avgNumbers(ArrayList<Integer> numList) {
        //initializing a variable called sum and assigning the return value of the addNumbers function from ex 1 by passing the numList to arrayList.
        var sum = addNumbers(numList);
        //initializing giving the size of the numList.
        float Length = numList.size();
//initializing giving the average of the numList.
        float average = sum / Length;
//returning the average value back to where its being called
        return average;
    }


    private static void ex3() {
        ArrayList<Integer> numList = new ArrayList<>(); //declare new array list
        //convert int to integer. defining an array of integers.the index is 0, 1, 2 the value is 1, 2, 3.
        int[] ints = {1, 2, 3};
        //add the number to the numList
        for (int i : ints) {
            // adding each value that belongs in index i
            numList.add(i);
        }
        //calling the function doubleNumbers. asking numList to go to the doubleNumbers function
        doubleNumbers(numList);
    }

    //defining the type of variable that can go through that function. doubleNumbers function. void means we dont have a return value from that function.
    private static void doubleNumbers(ArrayList<Integer> numList) {
//starting at index 0 and incrementing by 1. stay within the limit. size of the array should be less than 3. shouldn't go up to 3.
        for (int i = 0; i < numList.size(); i++) {
//initializing a new variable called temp and getting a value that belongs to the index i and assigning that value to temp. we are multiplying the value by 2.
            int temp = numList.get(i) * 2;
//temp=temperary value. copying the values in ints array into temp variable. setting the new value to the original value where the index is pointing to. basically locking in the new values.
            numList.set(i, temp);
        }
        System.out.println(numList); //print list
    }

    private static void ex4() {
        //declaring a variable called list. we are assigning a return value from the create list function.
        var list = createList(5);
        System.out.println(list);
    }

    //the definition of the create list function. was given to us in the question.
    private static ArrayList<Integer> createList(Integer maxNumber) {
//we are defining an arrayList called numList
        ArrayList<Integer> numList = new ArrayList<Integer>();
        //we are looping through the maxNumber is the arrayList.starts at 1
        for (int i = 1; i <= maxNumber; ++i) {
            numList.add(i);
        }
        return numList;
    }

    private static <Integers> void ex5() {
        int[] ints = {1, 2, 3, 5, 6, 9, 11};
        ArrayList<Integer> numList = new ArrayList<>();
        //
        for (int i = 0; i < ints.length; i++) {
            numList.add(ints[i]);
        }
        System.out.println(findMissingNumbers(numList));
    }

    //the type of variable that you pass through this function. left side ArrayList is the type of return value we will get.
    private static ArrayList<Integer> findMissingNumbers(ArrayList<Integer> numList) {
        //defining missing numbers as new arrayList.
        var missingNumbers = new ArrayList<Integer>();
        // identify first number and last number
        int firstNumber = numList.get(0);
        //going 1 below the max number
        int lastNumber = numList.get(numList.size() - 1);
        for (int i = firstNumber; i < lastNumber; i++) {
            //!=not if the number list contains that i value in the numList ignore it
            if (!numList.contains(i)) {
                //if the numList doesnt contain i value then add it to the missing numbers value
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

    private static String organizeZerosAndOnes(int[] ints) {
        //initializing string result
        String result = "";
        //initializing left string
        String leftZeros = "";
        //initializing right string
        String rightOnes = "";
        //for loop because we are iterating through every element of ints array
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == 0) {
                //we are calling the object integer to convert an array element to string element.
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








