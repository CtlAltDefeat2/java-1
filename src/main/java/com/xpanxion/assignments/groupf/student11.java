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



    private static void ex6() {
        //ints array
        int[] ints = {0,1,1,1,0,0,1,0,0,1,0,0,0};
        //initializing string a
        String A = "";
        //initializing left string
        String Left = "";
        //initializing right string
        String Right = "";
//for loop because we are iterating through every element of ints array
        for (int i = 0; i < ints.length; i++) {
            if(ints[i] == 0) {
                //we are calling the object integer to convert an array element to string element
                Left = Left + Integer.toString(ints[i]);
            }
            else {
                Right = Right + Integer.toString(ints[i]);
            }

        }
        A = Left + Right;
        System.out.println(A);


    }
}







