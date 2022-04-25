package com.xpanxion.assignments.groupd;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class student17 {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
        ex5();

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
        multiply();
    }
    private static void multiply() {
        int[] arr = {1, 2, 3};
        int[] result = IntStream.of(arr).map(i -> i * 2).toArray();
        System.out.println("Doubled every Int in an Array: " + Arrays.toString( result));
    }

    private static void ex4() {
        System.out.println("Ex. 4");
        createList(5);
    }
    private static void createList(Integer maxNumber){
        int input = 5;
        int count = 0;
        var list = new ArrayList<>();
        for(int i = 0; i < maxNumber; i++){
            count++;
            list.add(count);
        }
        System.out.println("Creating a list from a maxNumber: " + list);
    }
    private static void ex5(){
        System.out.println("Ex. 5");
        System.out.println("The missing numbers are: ");
        int[] arr = {1, 2, 3, 5, 6, 9, 11};
        int N = arr.length;
        findMissingNumbers(arr, N);

    }
    private static void findMissingNumbers(int arr[], int N){
        int diff = arr[0] - 0;
        for (int i = 0; i < N; i++){
            if(arr[i] - i != diff)
                while (diff < arr[i] - i){
                    System.out.print((i + diff) + ", ");
                    diff++;

                }
        }
    }
}
