package com.xpanxion.assignments.groupc;

import java.math.*;
import java.util.*;

public class student5 {
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
    public static void ex1() {
        int[] ints1 = {1, 2, 3};
        var array = new ArrayList<Integer>();
        for (int i: ints1) {
            array.add(i);
        }
        var result = addNumbers(array);
        System.out.print("Ex. 1    ");
        System.out.println(result);
    }
    public static Integer addNumbers(ArrayList<Integer> numList) {
        Integer returnValue = 0;
        for (Integer i: numList) {
            returnValue += i;
        } return returnValue;
    }
    public static void ex2() {
        int[] ints2 = {1, 2, 3};
        var array2 = new ArrayList<Integer>();
        for (int i: ints2) {
            array2.add(i);
        }
        var results2 = avgNumbers(array2);
        System.out.print("Ex. 2    ");
        System.out.println(results2);
    }
    private static Float avgNumbers(ArrayList<Integer> avgArray) {
        float avg;
        float sum = 0;
        for (int i = 0; i < avgArray.size(); i++) {
            sum += avgArray.get(i);
        }
        avg = sum / avgArray.size();
        return avg;
    }
    private static void ex3() {
        int[] ints3 = {1, 2, 3};
        var array3 = new ArrayList<Integer>();
        for (int i: ints3) {
            array3.add(i);
        }
        System.out.print("Ex. 3    ");
        System.out.println(dblNumbers(array3));
    }
    private static ArrayList<Integer> dblNumbers(ArrayList<Integer> dblArray) {
        for (int i = 0; i < dblArray.size(); i++) {
            dblArray.set(i, dblArray.get(i) * 2);
        } return dblArray;
    }
    public static void ex4() {
        System.out.print("Ex. 4    ");
        int max = 16;
        createList(max);
    }
    private static void createList(Integer maxNumber) {
        var array4 = new ArrayList<Integer>();
        for (int i = 0; i < maxNumber; i++) {
            array4.add(i + 1);
        }
        System.out.println(array4);
    }
    public static void ex5() {
        int[] ints5 = {1, 2, 3, 5, 6, 9, 11};
        int intEntities = ints5.length;
        System.out.print("Ex. 5    ");
        findMissingNumbers(ints5, intEntities);
    }
    private static void findMissingNumbers(int ints5[], int intEntities) {
        int arrayDifference = 1;
        var array5 = new ArrayList<>();
        for (int i = 0; i < intEntities; i++) {
            if (ints5[i] - i != 0) {
                while (arrayDifference < ints5[i] - i) {
                    array5.add(i + arrayDifference);
                    arrayDifference++;
                }
            }
        }
        System.out.println("The missing numbers from the array are:  " + array5);
    }
    public static void ex6() {
        int[] ints6 = {0,1,1,1,0,0,1,0,0,1,0,0,0};
        System.out.print("Ex. 6    ");
        sortArray(ints6);
    }
    public static void sortArray(int[] arrayToSort) {
        var sortedInts = Arrays.stream(arrayToSort).sorted().toArray();
        System.out.println(Arrays.toString(sortedInts));
    }
    public static void ex7() {
        int[] ints7 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        var array7 = new ArrayList<Integer>();
        for (int i: ints7) {
            array7.add(i);
        }
        System.out.print("Ex. 7    ");
        randomNumFromArray(array7);
    }
    public static void randomNumFromArray(ArrayList<Integer> arrayRand) {
        Random randNum = new Random();
        System.out.println(arrayRand.get(randNum.nextInt(arrayRand.size())));
    }
    public static void ex8() {
        var array8 = new ArrayList<Integer>();
        var randomNumber = new Random();
        var maxCartItems = 8;
        for (int i = 0; i < maxCartItems; i++) {
            Integer randomPrice = randomNumber.nextInt(1,8);
            array8.add(randomPrice);
        }
        var totalPrice = calculateFinalCart(array8);
        System.out.print("Ex. 8    " + array8 + "    " + totalPrice);
        System.out.println("    Cart Total Price  =  $ " + totalPrice.setScale(2, RoundingMode.HALF_UP));
    }
    public static BigDecimal calculateFinalCart(ArrayList<Integer> cartPrices) {
        double cartSubtotal;
        final double SALES_TAX = 1.10;
        final double SHIP_N_HAND_UNDER_10 = 5.00;
        final double SHIP_N_HAND_10_TO_20 = 4.00;
        cartSubtotal = addNumbers(cartPrices);
        var subtotal = new BigDecimal(cartSubtotal);
        var salesTax = new BigDecimal(SALES_TAX);
        var postTaxSubtotal = subtotal.multiply(salesTax);
        if (postTaxSubtotal.doubleValue() <= 10.00) {
            BigDecimal shipNHand = new BigDecimal(SHIP_N_HAND_UNDER_10);
            BigDecimal total = postTaxSubtotal.add(shipNHand);
            return total;
        } else if (postTaxSubtotal.doubleValue() > 10.00 && postTaxSubtotal.doubleValue() <= 20.00) {
            BigDecimal shipNHand = new BigDecimal(SHIP_N_HAND_10_TO_20);
            BigDecimal total = postTaxSubtotal.add(shipNHand);
            return total;
        } else if (postTaxSubtotal.doubleValue() > 20.00) {
            BigDecimal total = postTaxSubtotal;
            return total;
        } return postTaxSubtotal;
    }
    public static void ex9() {
        var array9 = new ArrayList<Integer>();
        for (int i = 0; i < 8; i++) {
            array9.add(randomNumbers());
        }
        System.out.print("Ex. 9    ");
        var result = checkArray(array9);
        System.out.print(array9);
        System.out.println("    " + result);
    }
    public static int randomNumbers() {
        Random r = new Random();
        return r.nextInt(1, 100) + 1;
    }
    public static String checkArray(ArrayList<Integer> arraySumEval) {
        var arraySum = addNumbers(arraySumEval);
        if (arraySum % 2 == 0) {
            return "ArrayList sum is Even.";
        } else if (arraySum % 2 == 1) {
            return "ArrayList sum is Odd.";
        } return "";
    }
    public static void ex10() {
        System.out.println("Ex. 10   Please enter a new password");
        var password = getUserPassword();
        if (passwordAuthenticator(password)) {
            System.out.println("Password is valid:  " + password);
        } else System.out.println("Password is not valid:  " + password);
    }
    public static String getUserPassword() {
        var scanner = new Scanner(System.in);
        System.out.println("I)    Passwords must have at least ten characters in total.");
        System.out.println("II)   Passwords must consist of only letters and digits, no spaces or special characters.");
        System.out.println("III)  Passwords must contain at least two digits");
        return scanner.nextLine();
    }
    public static boolean passwordAuthenticator(String password) {
        if (password.length() < 10) {
            return false;
        }
        int letterCount = 0;
        int numberCount = 0;
        int characterCount = 0;
        for (int i = 0; i < password.length(); i++) {
            char character = password.charAt(i);
            if (hasNumber(character)) {
                numberCount++;
                characterCount++;
            } else if (hasLetter(character)) {
                letterCount++;
                characterCount++;
            } else return false;
        } return (letterCount >= 2 && numberCount >= 2 && characterCount >= 10);
    }
    public static boolean hasNumber(char number) {
        return (number >= '0' && number <= '9');
    }
    public static boolean hasLetter(char letter) {
        letter = Character.toUpperCase(letter);
        return (letter >= 'A' && letter <= 'Z');
    }
}