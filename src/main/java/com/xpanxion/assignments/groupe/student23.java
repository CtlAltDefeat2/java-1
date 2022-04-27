package com.xpanxion.assignments.groupe;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class student23 {
    public static void main(String[] args) {
//        Ex1();
//        Ex2();
//        Ex3();
//        Ex4();
//        Ex5();
//        Ex6();
//        Ex7();
        Ex8();
    }

    private static void Ex1() {
        int[] ints = {1, 2, 3, 4};
        var newList = new ArrayList<Integer>();
        for (int i : ints)
            newList.add(i);

        var result = addNumbers(newList);
        System.out.println(result);
    }

    private static void Ex2() {
        int[] ints = {1, 2, 3, 4};
        var newList = new ArrayList<Integer>();
        for (int i : ints) {
            newList.add(i);
        }
        var result = avgNumbers(newList);
        System.out.println(result);
    }

    private static void Ex3() {
        int[] ints = {10, 20, 30, 40};
        var newList = new ArrayList<Integer>();
        for (int i : ints) {
            newList.add(i);
        }
        var result = doubleArray(newList);
        System.out.println(result);
    }

    private static void Ex4(){
        Integer maxNum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value for the length of the array to be created");
        maxNum = Integer.parseInt(scanner.next());
        var r= createList(maxNum);
        System.out.println(r);
    }

    private static void Ex5(){
        var numList = new ArrayList<Integer>();
        int[] ints = {1, 2, 3, 5, 6, 9, 11};

        for(int i = 0; i < ints.length; i++){
            numList.add(ints[i]);
        }
        System.out.println("Missing numbers are : " + findMissingNumbers(numList));
    }

    private static ArrayList<Integer> findMissingNumbers(ArrayList<Integer> numList){
        var MissingNumbers = new ArrayList<Integer>();
        int lastIndex = numList.size()-1;
        int FirstNumber = numList.get(0);
        int LastNumber = numList.get(lastIndex);
        for (int j = FirstNumber; j <LastNumber; j++){
            if (!numList.contains(j)) {
                MissingNumbers.add(j);
            }
        }
        return MissingNumbers;
    }

    private static void Ex6(){
        int[] ints = {0,1,1,1,0,0,1,0,0,1,0,0,0};

        System.out.println(zeroLeftOneRight(ints));
    }
    private static String zeroLeftOneRight(int[] ints){
        String newString;
        String zeroString ="";
        String oneString = "";
        for(int i = 0; i < ints.length; i++){
            if(ints[i] == 0){
                zeroString += '0';
            }
            else{
                oneString += '1';
            }
        }
        newString = zeroString + oneString;
        return newString;
    }
    private static void Ex7(){
        var arrayList = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some numbers: ");
        while(scanner.hasNextInt()){
            int num = Integer.parseInt(scanner.next());
            if(!Character.isLetter(num)){
                arrayList.add(num);
            }
            else break;
        }
        System.out.println("The array you entered is: " + arrayList);
        System.out.println("The random number generated from the array you entered is: " + randomNumberFromArray(arrayList));
    }

    private static int randomNumberFromArray(ArrayList<Integer> arrayList) {
        Random random = new Random();
        int num = 0;
        int randomNum = random.nextInt(arrayList.size());
        num = arrayList.get(randomNum);

        return num;
    }
    private static void Ex8(){
        /* Write a function that calculates the total cost of a shopping cart. The items in the shopping cart are contained in an ArrayList of type BigDecimal.

        The total cost is calculated by the following:

        Sum the cost of all the items in the ArrayList
        Apply 10% sales tax
        Apply shipping and handling fees:
        Add $5.00 for orders under $10.00
        Add $4.00 for orders > $10.00 and < $20.00
        Free shipping and handling for orders > $20.00 */
        var shoppingCart = new ArrayList<BigDecimal>();
        System.out.println("Enter the cost of each items in here and enter 's' to end: ");
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextFloat()){
            BigDecimal num = scanner.nextBigDecimal();
            if(num.doubleValue()== 's'){
                break;
            }
            else{
                shoppingCart.add(num);
            }
        }
        System.out.println("The number of items you entered is : " + shoppingCart.size());
        System.out.println("The list of items you entered is : " + shoppingCart);
        System.out.println("The total cost of the shopping cart you entered is: " + totalCostOfCart(shoppingCart));
    }

    private static BigDecimal totalCostOfCart(ArrayList<BigDecimal> shoppingCart) {

        BigDecimal totalCost = null;
        BigDecimal Sum = null;

        for (BigDecimal i : shoppingCart) {
            Sum = Sum.add(i);
        }
        totalCost = Sum.add(Sum.multiply(BigDecimal.valueOf(0.1)));


        return totalCost;

    }


    private static Integer addNumbers(ArrayList<Integer> numList) {
        Integer retVal = 0;
        for (Integer i : numList) {
            retVal = retVal + i;
        }
        return retVal;
    }

    private static Float avgNumbers(ArrayList<Integer> numList) {
        Float Average;
        Average = Float.valueOf(addNumbers(numList)) / numList.size();
        return (Average);
    }

    private static ArrayList<Integer> doubleArray(ArrayList<Integer> numList) {
        for (int i = 0; i < numList.size(); i++) {
            numList.set(i, numList.get(i) * 2);
        }
        return numList;
    }

    private static ArrayList<Integer> createList(Integer maxNumber){
        var numList = new ArrayList<Integer>();
        for(int i = 0; i <maxNumber; i++){
            numList.add(i+1);
        }
        return numList;
    }

}

