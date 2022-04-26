package com.xpanxion.assignments.groupf;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class student11 {
    public static void main(String[] args) {

        ex1();
        ex2();
    }
    private static void ex1() {
    int[] ints = {1, 2, 3};
    var numList = new ArrayList<Integer>(ints.length);
    for(int i : ints) {
        numList.add(i);
    }
    var sum = addNumbers(numList);
        System.out.println("The sum is" + sum );
    }
private static Integer addNumbers(ArrayList<Integer> numList) {
    int sum = 0;
    for (int i = 0; i < numList.size(); i++) {
        sum +=numList.get(i);
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
        var r  = avgNumbers(numList);

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
        private static void doubleNumbers (ArrayList < Integer > numList) {

        for (int i = 0; i < numList.size(); i++) {

        int temp = numList.get(i);

        numList.set(i, (temp * 2));
            }
            System.out.println(numList); //print list
    }}



