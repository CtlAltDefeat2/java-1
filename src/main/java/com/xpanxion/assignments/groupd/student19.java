package com.xpanxion.assignments.groupd;
import javax.swing.*;
import java.sql.Array;
import java.util.*;
import java.util.random.RandomGenerator;
public class student19 {

    public static void main(String[] args) {
        //ex1();
        //ex2();
        // ex3();
        //ex4();
        //ex5();
        //ex6();
        ex7();
    }


    private static void ex1() {
        int[] ints = {1, 2, 3};
        var numList = new ArrayList<Integer>();

        for (int i : ints) {
            numList.add(i);
        }
        System.out.println(addNumbers(numList));
    }


    private static Integer addNumbers(ArrayList<Integer> numList) {
        int retval = 0;

        for (int i : numList) {
            retval += i;
        }

        return retval;
    }


    private static void ex2() {
        int[] ints = {1, 2, 3};
        ArrayList<Integer> numList = new ArrayList<Integer>();

        for (int i : ints) {
            numList.add(i);
        }

        System.out.println(avgNumbers(numList));
    }

    private static Float avgNumbers(ArrayList<Integer> numList) {

        float f = 0;
        int sum = 0;

        for (int i : numList) {
            sum += i;
        }

        f = sum / numList.size();
        return f;
    }

    private static void ex3() {
        int[] ints = {1, 2, 3};
        ArrayList<Integer> numList = new ArrayList<Integer>();

        for (int i : ints) {
            numList.add(i);
        }

        System.out.println(doubles(numList));

    }

    private static ArrayList<Integer> doubles(ArrayList<Integer> numList) {
        var doubleList = new ArrayList<Integer>();

        for (int i : numList) {
            doubleList.add(i * 2);
        }

        return doubleList;
    }

    private static void ex4() {

        System.out.println(maxArray(4));
    }

    private static ArrayList<Integer> maxArray(int maxValue) {
        var maxList = new ArrayList<Integer>();
        for (int i = 1; i <= maxValue; i++) {
            maxList.add(i);
        }
        return maxList;
    }

    private static void ex5() {
        int[] ints = {1, 2, 3, 5, 6, 9, 11};
        ArrayList<Integer> numList = new ArrayList<Integer>();

        for (int i : ints) {
            numList.add(i);
        }
        System.out.println(missingNumbers(numList));
    }

    private static ArrayList<Integer> missingNumbers(ArrayList<Integer> numList) {
        var missNum = new ArrayList<Integer>();
        int max = Collections.max(numList);

        for (int i = 1; i <= max; i++) {

            if (!numList.contains(i)) {
                missNum.add(i);
            }
        }
        return missNum;
    }

    private static void ex6() {
        int[] ints = {0, 1, 1, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0};
        ArrayList<Integer> numList = new ArrayList<Integer>();
        for (int i : ints) {
            numList.add(i);
        }
        System.out.println(SortOrder(numList));
    }

    private static String SortOrder(ArrayList<Integer> numList) {
        var SortOrder = new ArrayList<Integer>();
        String str;
        Collections.sort(numList);
        str = numList.toString();
        return str;
    }

    private static void ex7() {
        //  Write a Java function that retuns a random number from `ArrayList` of type `Integer`.
        int[] ints = {35,40,100, 200};
        ArrayList<Integer> numList = new ArrayList<Integer>();
        for (int i : ints) {
            numList.add(i);
        }
        System.out.println(randomNumber(numList));
    }

    private static int randomNumber(ArrayList<Integer> numList) {
        Random random = new Random();

        return numList.get(random.nextInt(numList.size()));
    }
}






