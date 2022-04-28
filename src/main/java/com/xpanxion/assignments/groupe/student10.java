package com.xpanxion.assignments.groupe;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class student10 {

    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
//      ex5();
        ex6();
        ex7();
    }

    private static void ex1() {
        int[] ints = {1, 2, 3};
        var newList = new ArrayList<Integer>();
        for (int i : ints) {
            newList.add(i);
        }
        var result = addNumbers(newList);
        System.out.println(result);
    }

    private static Integer addNumbers(ArrayList<Integer> numList) {
        Integer retVal = 0;
        for (Integer i : numList) {
            retVal = retVal + i;
        }
        return retVal;
    }


    private static void ex2() {
        int[] ints = {1, 2, 3};
        var list2 = new ArrayList<Integer>();
        for (int i = 0; i < ints.length; i++){
            list2.add(ints[i]);
        }
        var result = avgNumbers(list2);
        System.out.println(result);
    }
    private static Float avgNumbers(ArrayList<Integer> list2) {
        int sum = 0;
        float avg = 0;
        for (int i = 0; i < list2.size(); i++) {
            sum += list2.get(1);
        }
        avg = sum/list2.size();
        return avg;
    }

    private static void ex3() {
        int[] ints = {1, 2, 3};
        var list3 = new ArrayList<Integer>();
        for (int i = 0; i < ints.length; i++) {
            list3.add(ints[i]);
        }
        doubler(list3);
    }
    private static void doubler(ArrayList<Integer> list3) {
        for (int i = 0; i < list3.size(); i++) {
            list3.set(i, list3.get(i) * 2);
        }
        System.out.println(list3);
    }


    private static void ex4() {
        createList(5);
    }

    private static void createList(Integer maxNumber){
        int count = 0;
        var list4 = new ArrayList<Integer>();
        for (int i = 0; i < maxNumber; i++){
            count++;
            list4.add(count);
        }
        System.out.println(list4);
    }

//    private static void ex5() {
//       int[] ints = {1, 2, 3, 5, 6, 9, 11};
//       var missingNumbers = findMissingNumbers(ints);
//        System.out.println(findMissingNumbers(ints););
//    }
//
//    private static void findMissingNumbers(int ints[]){
//       var intList = Arrays.stream(ints).boxed().toList();
//       var missingNumbers = new ArrayList<Integer>();
//       for (int i = 1; i < ints[ints.length - 1]; i++) {
//           if (!intList.contains(i)) {
//               missingNumbers.add(i);
//           }
//       }
//       System.out.println(missingNumbers);
//
//    }



    private static void ex6() {
        int[] ints = {0,1,1,1,0,0,1,0,0,1,0,0,0};
        sorting(ints);
    }

    private static void sorting(int ints[]){
        var list6zero = new ArrayList<>();
        var list6one = new ArrayList<>();
        for (int i = 0; i < ints.length; i++){
            if (ints[i] == 0){
            list6zero.add(0);
            }

            else if (ints[i] == 1){
            list6one.add(1);
            }
        }

        var list6All = new ArrayList<>();
        list6All.addAll(list6zero);
        list6All.addAll(list6one);
        System.out.println("Here are the sorted numbers: " + list6All);
    }

    private static void ex7() {
        var list7 = new ArrayList<Integer>();
        Random rando = new Random();
        var listSize = rando.nextInt(1000);
        for (int i = 0; i < listSize; i++) {
            list7.add(i+1);
        }
        randomNumber(list7);
    }

    private static void randomNumber(ArrayList<Integer>list7){

    }
}