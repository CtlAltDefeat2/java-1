package com.xpanxion.assignments.groupb;

import java.util.*;

import static java.lang.Math.round;

public class student8 {
    public static void main(String[] args) {
        ex9();

    }

    // EX 1
    private static void ex1() {
        int[] ints = {1, 2, 3};

        var newList = new ArrayList<Integer>();
        for (int i = 0; i < ints.length; i++) {
            newList.add(ints[i]);
        }
        var result = addNumbers(newList);

        System.out.println(result);

    }
    private static Integer addNumbers(ArrayList<Integer> numList) {
        var sum = 0;
        for (int i = 0; i < numList.size(); i++) {
            sum = sum + numList.get(i);
        }
        return sum;
    }


    // EX 2
    private static void ex2() {
        int[] ints = {1, 2, 3};

        var numList = new ArrayList<Integer>();
        for (int i = 0; i < ints.length; i++) {
            numList.add(ints[i]);
        }

        var result = avgNumbers(numList);
        System.out.println(result);

    }

    private static Float avgNumbers(ArrayList<Integer> numList) {
        var sum = 0;
        var avg = 0;

        for (int i = 0; i < numList.size(); i++) {
            sum = sum + numList.get(i);
            avg = sum / numList.size();
        }
        return (float) avg;
    }

    // EX 3
    private static void ex3() {
        int[] ints = {1, 2, 3};
        var newList = new ArrayList<Integer>();

        for (int i = 0; i < ints.length; i++) {
            newList.add(ints[i]);
        }

        var result = doubleNumbers(newList);
        System.out.println(result);

    }

    private static ArrayList<Integer> doubleNumbers(ArrayList<Integer> numList) {
        var doubledNumbers = new ArrayList<Integer>();
        for (int i = 0; i < numList.size(); i++) {
            doubledNumbers.add(numList.get(i) * 2);
        }

        return doubledNumbers;

    }

    // EX 4
    private static void ex4() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the max numbers you'd like in an array: ");
        var maxNumber = scanner.nextLine();

        var result = createList(Integer.valueOf(maxNumber));
        System.out.println(result);

    }
    private static ArrayList<Integer> createList(Integer maxNumber) {
        var numList = new ArrayList<Integer>(maxNumber);
        for (int i = 0; i < maxNumber; i++) {
            numList.add(i + 1);
        }
        return numList;
    }

    // EX 5
    private static void ex5() {
        int[] ints = {1, 2, 3, 5, 6, 9, 11};
        var missingNumbers = findMissingNumbers(ints);
        System.out.println(missingNumbers);
    }

    private static ArrayList<Integer> findMissingNumbers(int[] ints) {
        int[] allInts = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        var missingNums = new ArrayList<Integer>();
        boolean contains = false;
        for (int i = 0; i < allInts.length; i++) {
            for (int j = 0; j < ints.length; j++) {
                if (allInts[i] == ints[j]) {
                    contains = true;
                    break;
                }
            }
            if (!contains) {
                missingNums.add(allInts[i]);
            }
            else {
                contains = false;
            }
        }
        return missingNums;
    }


    // EX 6
    private static void ex6() {

        int[] ints = {0, 1, 1, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0};
        Arrays.sort(ints);
        String sortedArray = Arrays.toString(ints);
        String[] strings = new String[ints.length];
        for (int i = 0; i < ints.length; i++) {
            strings[i] = String.valueOf(ints[i]);
        }
        String joinedArray = String.join("", strings);
        System.out.println(joinedArray);

    }

    // EX 7
    private static void ex7() {
        var list = new int[5];
        Random random = new Random();
        var array = new ArrayList<Integer>(5);
        for (int i = 0; i < list.length; i++) {
            list[i] = random.nextInt(1, 20);
            array.add(list[i]);
        }
        System.out.println(array);
        System.out.println(array.get(random.nextInt(array.size())));
    }

    //EX 8
    private static void ex8() {
        var cart = new ArrayList<Float>();
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        var totalUnderTen = 0;
        var totalSHTen = 0;
        var totalSHBetweenTenTwenty = 0;
        var totalBetweenTenTwenty = 0;
        var totalOverTwenty = 0;
        float totalRaw = 0;

        System.out.println("How many orders are under $10?: ");
        int underTen = Integer.parseInt(scanner.next());
        for (int i = 0; i < underTen; i++) {
            cart.add((random.nextFloat(1, 10)));
            totalUnderTen = underTen * 5;
            totalSHTen += 10;
        }


        System.out.println("How many orders are OVER $10 but UNDER $20?: ");
        int betweenTenTwenty = Integer.parseInt(scanner.next());
        for (int i = 0; i < betweenTenTwenty; i++) {
            cart.add((random.nextFloat(10, 20)));
            totalSHBetweenTenTwenty = betweenTenTwenty * 4;

        }

        System.out.println("How many orders are OVER $20?: ");
        int overTwenty = Integer.parseInt(scanner.next());
        for (int i = 0; i < overTwenty; i++) {
            cart.add((random.nextFloat(20, 100)));
        }

        for (float i = 0; i < cart.size(); i++) {
            totalRaw += cart.get((int) i);
        }

        var totalSH = totalSHTen + totalSHBetweenTenTwenty;
        var salesTax = .10 * totalRaw;
        var total = totalSH + salesTax + totalRaw;
        var totalRounded = Math.round(total*100.0)/100.0;
        System.out.println("Item costs: ");
        System.out.println(cart);
        System.out.println("Total Cost: $" + totalRounded);

    }


    // EX 9
    private static void ex9() {
        var ints = new ArrayList<Integer>();
        var result = checkArray(ints);
        System.out.println(ints);
        System.out.println(result);

    }

    private static String checkArray(ArrayList<Integer> ints) {
        Random random = new Random();
        var arraySize = 10;
        var sum = 0;
        for (int i = 0; i < arraySize; i ++) {
            ints.add((random.nextInt(1, 100)));
            for (int j = 0; j < ints.size(); j++) {
                sum += ints.get(i);
            }
        }
        if (sum % 2 == 0) {
            return sum + " Even";
        }
        if (sum % 2 == 1) {
            return sum + " Odd";
        }
        return null;
    }

    // EX 10
    private static void ex10() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Password: ");
        var pass = scanner.nextLine();
        Boolean valid;

        String[] password = pass.split("");
        if (!pass.matches(".*\\d.*")) {
            valid = false;
        }
        if (password.length < 10) {
            valid = false;
        }
        if (pass.matches(".*\\p{Punct}.*")) {
            valid = false;
        }
        else {
            valid = true;
        }

        if (!valid) {
            System.out.println("False");
            System.out.println("Please enter a valid password (must have at least" +
                    "10 characters, two digits, and not" +
                    "containing any non digit or letter characters.");

        }
        if (valid) {
            System.out.println("True");
            System.out.println("Your password is: " + pass);
        }

    }

}
