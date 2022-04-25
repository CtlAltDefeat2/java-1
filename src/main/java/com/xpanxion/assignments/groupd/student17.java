package com.xpanxion.assignments.groupd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class student17 {
    public static void main(String[] args) {
        ex1();
        ex2();

    }

    private static void ex1() {
        System.out.println("Ex. 1");
        addNumbers(new ArrayList<>());
    }
    private static Integer addNumbers(ArrayList<Integer> numList) {
        // TODO: Implement this function.
        int[] arr = {1, 2, 3};
        int sum = IntStream.of(arr).sum();
        System.out.println("The sum of the Array is: " + sum);
        return 0;
    }
    private static void ex2() {
        System.out.println("Ex. 2");
        avgNumbers(new ArrayList<>());
    }
    private static Float avgNumbers(ArrayList<Integer> numList) {
        // TODO: Implement this function.
        int[] arr = {1, 2, 3};
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println("The average of the Array is: " + sum / arr.length);
        return null;
    }

    private static void ex3() {
        System.out.println("Ex. 3");
    }
}
