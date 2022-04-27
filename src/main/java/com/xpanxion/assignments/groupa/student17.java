package com.xpanxion.assignments.groupa;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;


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
        ex9();
//        ex10();
    }
    private static void ex1() {
        System.out.println("Ex. 1");
        int[] ints = {1, 2, 3};
        var list = new ArrayList<Integer>();
        for (int i = 0; i < ints.length; i++) {
            int anInt = ints[i];
            list.add(anInt);
        }
        System.out.println("The sum of the array is: " + addNumbers(list));
    }
    private static Integer addNumbers(ArrayList<Integer> numList) {
        int sum = 0;
        for (int i = 0; i < numList.size(); i++) {
            Integer integer = numList.get(i);
            sum += integer;
        }
        return sum;
    }
    private static void ex2() {
        System.out.println("Ex. 2");
        int[] ints = {1, 2, 3};
        var list = new ArrayList<Integer>();
        for (int anInt : ints) {
            list.add(anInt);
        }
        avgNumbers(list);
        System.out.println("The average value is: " + avgNumbers(list));
    }
    private static Float avgNumbers(ArrayList<Integer> list2) {
        // TODO: Implement this function.
        float avg = 0;
        int sum = 0;
        for (Integer integer : list2) {
            sum += integer;
        }
        avg = sum/list2.size();
        return avg;
    }
    private static void ex3() {
        System.out.println("Ex. 3");
        int[] ints = {1, 2, 3};
        var list = new ArrayList<Integer>();
        for (int i = 0; i < ints.length; i++) {
            int anInt = ints[i];
            list.add(anInt);
        }
        multiply(list);
    }
    private static void multiply(ArrayList<Integer> list) {
        list.replaceAll(integer -> integer * 2);
        System.out.println("This is the doubled Array: " + list);
    }
    private static void ex4() {
        System.out.println("Ex. 4");
        createList(6);
    }
    private static void createList(Integer maxNumber){
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
        int diff = arr[0];
        for (int i = 0; i < N; i++){
            if(arr[i] - i != diff)
                while (diff < arr[i] - i){
                    list.add(i + diff);
                    diff++;
                }
        }
        System.out.println("The missing numbers are: " + list);
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
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        Random r = new Random();
        System.out.println("Random Number is: " + list.get(r.nextInt(list.size())));
    }
    private static void ex8(){
        System.out.println("Ex. 8");
    }
    private static void ex9(){
        System.out.println("Ex. 9");
        var result = evenOrOdd();
        if (result % 2 == 0)
            System.out.println("The sum of the array is Even");
        else
            System.out.println("The sum of the array is Odd");
    }
    private static int evenOrOdd(){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        int result = 0;
        for (int i = 0; i < list.size(); i++) {
            Integer integer = list.get(i);
            result += integer;
        }
        return result;
    }
    private static void ex10(){
        System.out.println("Ex. 10");
    }


}
