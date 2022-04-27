package com.xpanxion.assignments.groupb;

import org.w3c.dom.ls.LSOutput;

import java.math.BigDecimal;
import java.util.*;

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

    // EX 5 - NOT DONE
    private static void ex5() {
        int[] ints = {1, 2, 3, 5, 6, 9, 11};
        var missingNumbers = new ArrayList<Integer>(11);

        for (int i = 0; i < (ints.length); i++) {
            int next = ints[i] + 1;
            int current = ints[i];
            if (next != current) {
                missingNumbers.add(next);
            }
            //System.out.println(ints[i] + 1);
        }
        System.out.println(missingNumbers);
        //System.out.println(ints[i]);


       //System.out.println(missingNumbers);
       //System.out.println(ints.length - 1);
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

    //EX 8 - NOT DONE
    private static void ex8() {
        var cart = new ArrayList<BigDecimal>();
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        var totalUnderTen = 0;
        var totalTen = 0;
        var salesTax = .10;
        var totalSHBetweenTenTwenty = 0;
        var totalBetweenTenTwenty = 0;
        var totalOverTwenty = 0;
        var cartRawCost = 0;
        var total = 0;

        System.out.println("How many orders are under $10?: ");
        int underTen = Integer.parseInt(scanner.next());
        for (int i = 0; i < underTen; i++) {
            cart.add(BigDecimal.valueOf(random.nextInt(1, 10)));
            totalUnderTen = underTen * 5;
            totalTen += 10;
        }


        System.out.println("How many orders are OVER $10 but UNDER $20?: ");
        int betweenTenTwenty = Integer.parseInt(scanner.next());
        for (int i = 0; i < betweenTenTwenty; i++) {
            cart.add(BigDecimal.valueOf(random.nextInt(10, 20)));
            totalSHBetweenTenTwenty = betweenTenTwenty * 4;

        }

        System.out.println("How many orders are OVER $20?: ");
        int overTwenty = Integer.parseInt(scanner.next());
        for (int i = 0; i < overTwenty; i++) {
            cart.add(BigDecimal.valueOf(random.nextInt(20, 100)));
        }


//        var totalCostBeforeTax = totalUnderTen + totalSHBetweenTenTwenty;
//        var totalCostShipAndHandleAfterTax = totalCostBeforeTax * salesTax;
        System.out.println(cart);
//        System.out.println("Total Cost: $" + totalCost);

    }


    private static void ex9() {

    }

}
