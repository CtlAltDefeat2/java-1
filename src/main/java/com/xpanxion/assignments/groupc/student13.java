package com.xpanxion.assignments.groupc;

import java.net.Inet4Address;
import java.text.NumberFormat;
import java.util.*;

//4-25-22 - 4-29-22 Java Intro Assignment

public class student13 {
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

    // Ex. 1
    private static void ex1() {
        int[] ints = {1, 2, 3};
        var numList = new ArrayList<Integer>();

        for (int i = 0; i < ints.length; i++) {
            numList.add(ints[i]);
        }
        System.out.println("Ex. 1");
        var result = addNumbers(numList);
        System.out.println("Sum of the array: " + result);
    }

    private static Integer addNumbers(ArrayList<Integer> numList) {
        int sum = 0;

        for (int i = 0; i < numList.size(); i++) {
            sum = sum + numList.get(i);
        }
        return sum;
    }

    // Ex. 2
    private static void ex2() {
        int[] ints = {1, 2, 3};
        var numList = new ArrayList<Integer>();

        for (int i = 0; i < ints.length; i++) {
            numList.add(ints[i]);
        }
        System.out.println("Ex. 2");
        var result = avgNumbers(numList);
        System.out.println("Average of the array: " + result);
    }

    private static Float avgNumbers(ArrayList<Integer> numList) {
        int sum = 0;

        for (int i = 0; i < numList.size(); i++) {
            sum = sum + numList.get(i);
        }
        var avgArray = (float) sum / numList.size();
        return avgArray;
    }

    // Ex. 3
    private static void ex3() {
        int[] ints = {1, 2, 3};
        var numList = new ArrayList<Integer>();

        for (int i = 0; i < ints.length; i++) {
            numList.add(ints[i]);
        }
        System.out.println("Ex. 3");
        doubleArray(numList);
    }

    private static void doubleArray(ArrayList<Integer> numList) {
        for (int i = 0; i < numList.size(); i++) {
            numList.set(i, 2 * numList.get(i));
        }
        System.out.println("Double array list: " + numList);
    }

    // Ex. 4
    private static void ex4() {
        System.out.println("Ex. 4");
        System.out.print("Enter value to create list: ");
        Scanner sc = new Scanner(System.in);
        var maxNum = sc.nextInt();

        createList(maxNum);
    }

    private static void createList(Integer maxNum) {
        ArrayList<Integer> newList = new ArrayList<Integer>();
        for (int i = 0; i < maxNum; i++) {
            newList.add(i + 1);
        }
        System.out.println(newList);
    }

    // Ex. 5
    private static void ex5() {
        int[] ints = {1, 2, 3, 5, 6, 9, 11};
        System.out.println("Ex. 5");
        var missingNumbers = findMissingNumbers(ints);
        System.out.println("The array of missing numbers: " + missingNumbers);
    }

    private static ArrayList findMissingNumbers(int[] ints) {
        var numList = new ArrayList<Integer>();
        var numList2 = new ArrayList<Integer>();

        for (int i = 0; i < ints.length; i++) {
            numList.add(ints[i]);
        }

        for (int i = 0; i < numList.get(ints.length - 1); i++) {
            numList2.add(i + 1);
        }
        numList2.removeAll(numList);

        return numList2;
    }

    // Ex. 6
    private static void ex6() {
        int[] ints = {0, 1, 1, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0};
        System.out.println("Ex. 6");
        var numList = new ArrayList<Integer>();

        for (int i = 0; i < ints.length; i++) {
            numList.add(ints[i]);
        }
        System.out.println("The sorted array is: ");
        sortArray(numList);
    }

    private static void sortArray(ArrayList<Integer> numList) {
        Collections.sort(numList);
        System.out.println(numList);
    }

    // Ex. 7
    private static void ex7() {
        int[] ints = {20, 46, 14, 156, 54, 79, 6, 48, 31};
        var numList = new ArrayList<Integer>();

        for (int i = 0; i < ints.length; i++) {
            numList.add(ints[i]);
        }
        System.out.println("Ex. 7");
        System.out.println("Random element from array: ");
        randomNumber(numList);
    }

    private static void randomNumber(ArrayList<Integer> numList) {
        Random randNum = new Random();
        System.out.println(numList.get(randNum.nextInt(numList.size())));
    }

    // Ex. 8
    private static void ex8() {
        float[] ints = {3F, 4F, 5F};
        var numList = new ArrayList<Float>();
        System.out.println("Ex. 8");
        System.out.println("Shopping cart total: ");
        for (int i = 0; i < ints.length; i++) {
            numList.add(ints[i]);
        }
        shoppingCartTotal(numList);
    }

    private static void shoppingCartTotal(ArrayList<Float> numList) {
        float sum = 0;
        Locale locale = new Locale("en", "US");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
        for (int i = 0; i < numList.size(); i++) {
            sum = sum + numList.get(i);
        }
        float sumSalesTax = sum + (sum * .1F);
        if (sumSalesTax < 10F) {
            float shipSum = sumSalesTax + 5F;
            System.out.println(currencyFormatter.format(shipSum));
        } else if (sumSalesTax > 10F && sumSalesTax < 20F) {
            float shipSum = sumSalesTax + 4F;
            System.out.println(currencyFormatter.format(shipSum));
        } else {
            float shipSum = sumSalesTax;
            System.out.println(currencyFormatter.format(shipSum));
        }
    }

    // Ex. 9
    private static void ex9() {
        int[] ints = {12, 4, 5, 23, 90, 65, 26, 76, 17};
        var myArray = new ArrayList<Integer>();
        for (int i= 0; i < ints.length; i++) {
            myArray.add(ints[i]);
        }
        System.out.println("Ex. 9");
        var result = checkArray(myArray);
        System.out.println("Sum of array is either odd or even: " + result);
    }

    private static String checkArray(ArrayList<Integer> myArray) {
        int count = 0;
        int sum = 0;
        String evenOddNum = new String();
        for (int i = 0; i < myArray.size(); i++) {
            sum = sum + myArray.get(i);
            count = count + 1;
        }
        if (sum % 2 == 0) {
            evenOddNum = "even";
        } else {
            evenOddNum = "odd";
        }
        return evenOddNum;
    }

    // Ex. 10
    private static void ex10() {
        System.out.println("Ex. 10");
        System.out.println("Enter Password: ");
        Scanner sc = new Scanner(System.in);
        String password = sc.next();
        var result = passwordValidator(password);
        System.out.println(result);
    }

    private static Boolean passwordValidator(String password) {
        int passWordCountLimit = 10;

        if (password.length() < passWordCountLimit) {
            return false;
        }
        int letterCt = 0;
        int numberCt = 0;
        int characterCt = 0;
        for (int i = 0; i < password.length(); i++) {
            char character = password.charAt(i);
            if (hasNumber(character)) {
                numberCt++;
                characterCt++;
            } else if (hasLetter(character)) {
                letterCt++;
                characterCt++;
            } else return false;
        } return (letterCt >= 2 && numberCt >= 2 && characterCt >= 10);
    }
    public static boolean hasNumber(char number) {
        return (number >= '0' && number <= '9');
    }
    public static boolean hasLetter(char letter) {
        letter = Character.toUpperCase(letter);
        return (letter >= 'A' && letter <= 'Z');
    }
}
