package com.xpanxion.assignments.groupd;

import javax.swing.*;
import java.io.PrintStream;
import java.sql.Array;
import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.DoubleSummaryStatistics;
import java.util.Random;


public class student16 {
    public static void main(String[] args) {
        //ex1();
        //ex2();
        //ex3();
        //ex4();
        //ex5();
        //ex6();
        //ex7();
        //ex8();
        //ex9();
        ex10();
        //Notice all exercises are called,
        //this links all 9 exercises together
    }
    private static void ex1() {
        int[] ints = {1, 2, 3};
        //always use the "new" function to call a
        //new function like an array, loops, and scanners
        var newList = new ArrayList<Integer>( ); // capital I
        //for loop changed the array into an integer
        //Use length to calculate the size of the array {1,2,3} it,
        //guarantees everything in the data set is used
        for (int i = 0; i < ints.length; i++) {
            // note we used i++ postfix operator, which gets back
            // the prior operation but the operation is still performed
            newList.add(ints[i]);
        }
        System.out.println(addNumbers(newList));
    }
    private static Integer addNumbers(ArrayList<Integer> numList) {
        int sum = 0;
        //need another for loop to define the return
        for (int i = 0; i < numList.size( ); i++) {
            sum += numList.get(i);
        }
        return sum;
    }
    //EX 2 Begins here
    private static void ex2() {
        int[] ints = {1, 2, 3};
        //new array needed
        ArrayList arrayList = new ArrayList();
        //change from array to int using for loop
        for (int i = 0; i < ints.length; i++) {
            arrayList.add(ints[i]);
        }
        System.out.println(average(arrayList));
    }
    private static Float average(ArrayList<Integer> numList) {
        float avg = 0;
        //floats are for decimals an average can have a decimal
        int sum = 0;
        for (int i = 0; i < numList.size( ); i++) {
            sum += numList.get(i);
        }
        avg = sum / numList.size( );
        return avg;
    }
    //EX3 starts here
    private static void ex3() {
        //Doubles is basically multiplying everything in the dataset by 2
        int[] ints = {1, 2, 3}; // you need to call the ints again
        ArrayList<Integer> num = new ArrayList<Integer>( );
        //remember to open a new array and every other function
        for (int i = 0; i < ints.length; i++) {
            num.add(ints[i]);
        }
        timesTwo(num);
    }
    //changed Doubles to timesTwo because the word double is a primitive variable
    private static void timesTwo(ArrayList<Integer> numList) {
        //calls the double and int variable
        double d = 0;
        int sum = 0;
        //for loop required to get the return
        for (int i = 0; i < numList.size( ); i++) {
            int temp = numList.get(i);
            numList.set(i, (temp * 2));
        }
        System.out.println(numList);
    }
    private static void ex4() {
        var list = createList(4);
        System.out.println(list);
    }
    //EX4
    // This function returns an ArrayList of integers no greater than the 'max number'
    private static ArrayList<Integer> createList(int maxNumber) {
        //Always remember Arrays start at 0
        ArrayList<Integer> arrayList = new ArrayList<>( );
        //maxNumber is the name of my integer
        //3 parts of a for loop
        //part 1 int i = 1
        //part 2 i <= maxNumber
        //part 3 i++
        for (int i = 1; i <= maxNumber; i++) {
            arrayList.add(i);
        }
        return arrayList;
    }
    //Ex5 starts here.
    //Write a function that returns the number of missing numbers from this array.
    private static void ex5() {
        int[] ints = {1, 2, 3, 4, 5, 7, 8, 9, 11, 12};
        var num = new ArrayList<Integer>( );
        for (int i = 0; i < ints.length; i++) {
            num.add(ints[i]);
        }
        System.out.println(missingNumbers(num));
    }
    private static ArrayList<Integer> missingNumbers(ArrayList<Integer> numList) {
        ArrayList<Integer> arraylist = new ArrayList<>( );
        //needed to use the missing numbers with new ArrayList
        var missingNumbers = new ArrayList<Integer>( );
        //by using collections.max(numList) gives proper int method
        int max = Collections.max(numList);
        //need a for loop that goes the length of the ints
        for (int i = 1; i <= max; i++) {
            // remember ! means not in number list, then missingNumbers will add i
            // which in turn lists the missing numbers
            if (!numList.contains(i)) {
                missingNumbers.add(i);
            }
        }
        return (missingNumbers);
    }
    //ex6 starts here
    private static void ex6() {
        int[] ints = {0, 1, 1, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0};
        ArrayList<Integer> numList = new ArrayList<>( );

        for (int i : ints) {
            numList.add(i);
        }
        System.out.println(SortOrder(numList));
    }
    private static String SortOrder(ArrayList<Integer> numList) {
        String str;
        Collections.sort(numList);
        str = numList.toString( );
        return str; //return null as you are working on new method
    }
    // ex7 starts here
    //Write a Java function that returns a random number from `ArrayList` of type `Integer`.
    private static void ex7() {
        int[] ints = {1, 2, 3, 4, 5, 7, 8, 9, 11, 12};
        ArrayList<Integer> randomNumber = new ArrayList<>( );
        for (int i : ints) {
            randomNumber.add(i);
        }
        int randint = 0;
        Random random = new Random( );
        randint = random.nextInt(randomNumber.size( ));
        System.out.println(randint);
        //ex8 starts here
    }
    //EX8 starts here.
    //Write a function that calculates the total cost of a shopping cart.  The items
    //in the shopping cart are contained in an `ArrayList` of type `float`.

    //The total cost is calculated by the following:
           // - Sum the cost of all the items in the `ArrayList`
          //  - Apply 10% sales tax
    //- Apply shipping and handling fees:
           // - Add $5.00 for orders under $10.00
          //  - Add $4.00 for orders > $10.00 and < $20.00
          //  - Free shipping and handling for orders > $20.00
    private static void ex8 () {
        // "t-shirt = 10.00, pair of jeans 20.00, baseball cap 15.00"
        float[] floats = {10, 15, 20};
        var floatList = new ArrayList<Float>();
        for (int i = 0; i <floats.length; i++){
            floatList.add(floats[i]);
        }
        NumberFormat format = NumberFormat.getCurrencyInstance();
        System.out.println(format.format((shoppingTotal(floatList))));
    }
    private static Float shoppingTotal(ArrayList<Float>list) {
        float sum = 0;
        for (float i : list) {
            sum += i;
        }
        sum *= 1.10;
        if(sum < 10.00)
            sum+=5;
        else if(sum > 20.00)
            System.out.println("free shipping");
        return sum;
    }
    //EX 9 starts here.
    //Write a function that returns a `String` if an `ArrayList` of type `Integer` is even or odd.
    private static void ex9 () {
        int[] ints = {1, 2, 3, 4, 5, 6};
        var num = new ArrayList<Integer>();
        for(int i : ints){
            num.add(i);
        }
        System.out.println(EvenOrOdd(num));
    }
    public static String EvenOrOdd(ArrayList<Integer> list){
        int sum = addNumbers(list);
        String result;
        if (sum % 2 == 0) // anything dividable by 2 must be even
            result = "Even";
        else
            result = "Odd";
        return result;
    }
    //Ex10 starts here.
    //Write a Java function to determine if a password is valid using the following validation rules:
    //- A password must have at least ten characters
    //- A password consists of only letters and digits
    //- A password must contain at least two digits
    //the function returns a `Boolean` `true` if the password is valid, otherwise `false`.
    private static  void ex10 () {
        String pass = "MikeRuless1984";

        System.out.println(passwordCheck(pass));
    }
    private static boolean passwordCheck(String pass){
        int char_count = 0;
        int int_count = 0;
        int special_count = 0;
        boolean error = false;
        for (int i = 0; i < pass.length(); i++){
            boolean num_check = Character.isDigit(pass.charAt(i));
            boolean char_check = Character.isLetter(pass.charAt(i));
            if(!num_check && !char_check)
                special_count++;
            else if (char_check)
                    char_count++;
            else if (num_check)
                    int_count++;
        }
        if (special_count > 0){
            System.out.println("No Special Characters Allowed");
            error = false;
        }
        else if (char_count < 10 || int_count < 2){
            System.out.println("need to characters or 2 numbers");
            error = false;
        }
        else if (char_count >= 10 && int_count >= 2){
            System.out.println("Password Approved!" );
           error = true;
        }
        return error;
    }

}
