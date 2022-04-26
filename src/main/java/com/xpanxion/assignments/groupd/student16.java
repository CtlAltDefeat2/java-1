package com.xpanxion.assignments.groupd;

import java.io.PrintStream;
import java.sql.Array;
import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;


public class student16 {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        //Notice all exercises are called,
        //this links all 3 exercises together
    }
    private static void ex1(){
        int[] ints = {1, 2, 3};
        //always use the "new" function to call a
        //new function like an array, loops, and scanners
        var newList = new ArrayList<Integer>(); // capital I
        //for loop changed the array into an integer
        //Use length to calculate the size of the array {1,2,3} it,
        //guarantees everything in the data set is used
        for (int i = 0; i < ints.length; i++) {
            // note we used i++ postfix operator, which gets back
            // the prior operation but the operation is still performed
            newList.add(ints [i]);

        }
        System.out.println(addNumbers(newList));
    }

    private static Integer addNumbers(ArrayList<Integer> numList)  {
        int sum =0;
        //need another for loop to define the return
        for (int i = 0; i < numList.size(); i++) {
            sum += numList.get(i);
        }
        return sum;
    }
//EX 2 Begins here
    private static void ex2() {
        int[] ints = {1, 2, 3};
        //new array needed
        ArrayList arrayList = new ArrayList( );
        //change from array to int using for loop
        for (int i = 0; i < ints.length; i++) {
            arrayList.add(ints [i]);

        }
        System.out.println(average(arrayList));
    }
    private static Float average(ArrayList<Integer> numList)  {
        float avg =0;
        //floats are for decimals an average can have a decimal
        int sum = 0;
        for (int i = 0; i < numList.size(); i++) {
            sum += numList.get(i);
        }
        avg = sum / numList.size();
        return avg;
    }
//EX3 starts here
    private static void ex3() {
        //Doubles is basically multiplying everything in the dataset by 2
        int [] ints = {1,2,3}; // you need to call the ints again
        ArrayList<Integer> num = new ArrayList<Integer>();
        //remember to open a new array and every other function
            for (int i = 0; i < ints.length;i++){
                num.add(ints[i]);
        }
            Doubles(num);
    }
    private static void Doubles (ArrayList<Integer> numList) {
       //calls the double and int variable
        double d = 0;
        int sum = 0;
        //for loop required to get the return
        for(int i = 0; i < numList.size(); i++) {
            int temp = numList.get(i);
            numList.set(i,(temp*2));
        }
        System.out.println(numList);
    }
}
