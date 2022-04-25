package com.xpanxion.assignments.groupd;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class student17 {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
        ex5();
        ex6();
        ex7();
//        ex8();
//        ex9();
//        ex10();
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
        int[] arr = {1, 2, 3, 5, 6, 9, 11};
        int N = arr.length;
        findMissingNumbers(arr, N);

    }
    private static void findMissingNumbers(int arr[], int N){
        var list = new ArrayList<>();
        int diff = arr[0] - 0;
        for (int i = 0; i < N; i++){
            if(arr[i] - i != diff)
                while (diff < arr[i] - i){
                    list.add(i + diff);
                    diff++;
                }
        }
        System.out.println("The missing numbems are: " + list);
    }
    private static void ex6(){
        System.out.println("Ex. 6");
        int[] ints = {0,1,1,1,0,0,1,0,0,1,0,0,0};
        int n = ints.length;
        sortNum(ints, n);
        print(ints, n);
    }
    private static void sortNum(int arr[], int n){
        int count = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == 0)
                count++;
        }
        for(int i = 0; i < count; i++)
            arr[i] = 0;
        for(int i = count; i < n; i++)
            arr[i] = 1;
    }
    static void print(int arr[], int n) {
        System.out.print("Array after segregation is: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
    private static void ex7(){
        System.out.println("");
        System.out.println("Ex. 7");
        randomNumber();
    }

    private static void randomNumber(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        Random r = new Random();
        System.out.println("Random Number is: " + list.get(r.nextInt(list.size())));
    }
    private static void ex8(){
        System.out.println("Ex. 8");
    }
    private static void ex9(){
        System.out.println("Ex. 9");
    }
    private static void ex10(){
        System.out.println("Ex. 10");
    }


}
