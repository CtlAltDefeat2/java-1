package com.xpanxion.assignments.groupb;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class student24 {
    public static void main(String[] args) {
        ArrayList<Integer> sum = new ArrayList<>();
        System.out.println("The sum of all the numbers is " + addNumbers(sum));
        ArrayList<Integer> average = new ArrayList<>();
        System.out.println("The average of all the numbers is " + avgNumbers(average));
    }

    //Exercise NUMBER 1
    private static Integer addNumbers(ArrayList<Integer>numList) {

        int[] ints = {1,2,3};
        int sum =0;
        numList = new ArrayList<Integer>(ints.length);
        for(int i: ints){
            numList.add(i);
        }
        for(int i=0; i<ints.length; i++){
            sum +=ints[i];
        }
        return sum;
    }
    //EXERCISE NUMBER 2
    private static Float avgNumbers(ArrayList<Integer> numList) {
        int[] ints = {1,2,3};
        float average =0.0F;
        float total=0;
        numList = new ArrayList<>(ints.length);
        for(int i:ints){
            numList.add(i);
        }
        for(int i=0; i< ints.length; i++){
            total +=ints[i];
        }
        average = total/ ints.length;
        return average;
    }
}
