package com.xpanxion.assignments.groupb;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class student24 {
    public static void main(String[] args) {

        ex1();
        ex2();
        ex3();
        ex4();
        ex5();
        ex6();
        ex7();
        ex8();
        ex9();
        ex10();

    }

    //EXERCISE NUMBER 1
    private static void ex1() {
        int[] ints = {1, 2, 3};
        var numList = new ArrayList<Integer>();
        for (int i : ints) {
            numList.add(i);
        }
        var sum = addNumbers(numList);
        System.out.println("The sum is " + sum);
    }

    private static Integer addNumbers(ArrayList<Integer> numList) {
        int sum = 0;
        for (int i = 0; i < numList.size(); i++) {
            sum += numList.get(i);
        }
        return sum;
    }

    //EXERCISE NUMBER 2
    private static void ex2() {
        int[] ints = {1, 2, 3};
        var numList = new ArrayList<Integer>();
        for (int i : ints) {
            numList.add(i);
        }
        var average = average(numList);
        System.out.println("The average is " + average);
    }

    private static Float average(ArrayList<Integer> numList) {
        float average = 0;
        int sum = 0;
        for (int i = 0; i < numList.size(); i++) {
            sum += numList.get(i);
        }
        average = sum / numList.size();
        return average;
    }

    //EXERCISE NUMBER 3
    private static void ex3() {
        int[] ints = {1, 2, 3};
        var numList = new ArrayList<Integer>();
        for (int i : ints) {
            numList.add(i);
        }
        multiple(numList);
    }

    private static void multiple(ArrayList<Integer> numList) {
        for (int i = 0; i < numList.size(); i++) {
            int multiply = numList.get(i) * 2;
            numList.set(i, multiply);
        }
        System.out.println("Doubles are " + numList);
    }

    //EXERCISE NUMBER 4
    private static void ex4() {

        createList(5);
    }

    private static void createList(Integer maxNumber) {
        var list = new ArrayList<Integer>();
        for (int i = 1; i <= maxNumber; i++) {
            list.add(i);
        }
        System.out.println("List of integer until maxNumber are " + list);
    }

    //EXERCISE NUMBER 5
    private static void ex5() {
        int[] ints = {1, 2, 3, 5, 6, 9, 11};
        findMissingNumber(ints);
    }

    public static void findMissingNumber(int[] ints) {
        var intList = new ArrayList<Integer>();
        for (int i : ints) {
            intList.add(i);
        }
        var missingNumber = new ArrayList<Integer>();
        for (int i = 1; i < ints[ints.length - 1]; i++) {
            if (!intList.contains(i)) {
                missingNumber.add(i);
            }
        }
        System.out.println(missingNumber);
    }

    //EXERCISE NUMBER 6

    private static void ex6() {
        int[] ints = {0, 1, 1, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0};
        list(ints);
    }

    private static void list(int[] ints) {
        var leftSide = new ArrayList<>();
        var rightSide = new ArrayList<>();
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == 0) {
                leftSide.add(0);
            } else if (ints[i] == 1) {
                rightSide.add(1);
            }
        }
        var sort = new ArrayList<>();
        sort.addAll(leftSide);
        sort.addAll(rightSide);
        System.out.println("LIST IS " + sort);
    }

    //EXERCISE NUMBER 7
    private static void ex7() {
        randomNumber();
    }

    private static void randomNumber() {
        var arrayList = new ArrayList<Integer>();
        arrayList.add(12);
        arrayList.add(14);
        arrayList.add(45);
        arrayList.add(99);
        arrayList.add(11);
        arrayList.add(2);
        Random random = new Random();
        var randomNumber = arrayList.get(random.nextInt(arrayList.size()));
        System.out.println("Random Number " + randomNumber);
    }

    //EXERCISE NUMBER 8
    private static void ex8() {
        float[] Float = {1.00F, 3.50F, 14.00F};
        var list = new ArrayList<Float>();
        for (int i = 0; i < Float.length; i++) {
            list.add(Float[i]);
        }
        var total = shoppingTotal(list);
        System.out.println("Total cost after tax is: " + total);
    }

    private static float shoppingTotal(ArrayList<Float> list) {
        float sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i);
        }
        sum = (sum * 1.10F);
        if (sum < 10.00) {
            sum = sum + 5.00F;
            System.out.println("$ 5.00 for shipping and handling fees is included.");
        } else if (sum > 10.00F && sum < 20.00F) {
            sum = sum + 4.00F;
            System.out.println("$4.00 for shipping and handling fees is included.");
        } else {
            System.out.println("Free Shipping");
        }
        return sum;
    }

    //EXERCISE NUMBER 9
    private static void ex9() {
        evenOrOdd();
    }

    private static void evenOrOdd() {
        int[] ints = {1, 2, 3, 4, 7, 78, 100};
        int result = ints.length;

        if (result % 2 == 0) {
            System.out.println("Array is even");
        } else {
            System.out.println("Array is odd");
        }
    }
    //EXERCISE NUMBER 10

    private static void ex10() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Password must have at least ten characters \n" +
                "2. Password consists of only letters and digits \n" +
                "3. Password must contain at least two digits");
        System.out.println("Please enter the password");
        var password = scanner.next();
        //passwordCheck(password);
        if (passwordCheck(password) == true) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid Password");
        }
    }

    private static boolean passwordCheck(String password) {
        boolean isValid = true;
        if (password.length() < 10) {
            isValid = false;
            System.out.println("Password must be more than 10 characters length");
        }
        if (password.contains(".") || password.contains("@") || password.contains("/") || password.contains("!")) {
            isValid = false;
            System.out.println("Password must not contain special characters");
        }
       int  digitCount = countDigits(password);
        if (digitCount <= 2) {
            isValid = false;
            System.out.println("Password must have more than 2 digits");
        }
        return isValid;
    }

    private static int countDigits(String password) {
        int digitCount = 0;
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) >= 48 && password.charAt(i) <= 57) {
                digitCount++;
            }
        }
        return digitCount;
    }
}

