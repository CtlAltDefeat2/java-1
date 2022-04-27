package com.xpanxion.assignments.groupa;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class student21 {

    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) {

//        ex1();
//        ex2();
//        ex3();
//        ex4();
//        ex5();
//        ex6();
//        ex7();
          ex8();
    }

    private static void ex1() {
        int[] ints = {1, 2, 3, 4, 5};
        //creates new ArrayList object for Integers call numList
        var numList = new ArrayList<Integer>();
        //enhanced for loop adds all elements of the original array to the numList arraylist
        for (int number : ints) {
            numList.add(number);
        }
        //result equals the addNumbers method with the numList array as the parameter being passed in
        var result = addNumbers(numList);
        System.out.println(result);

    }


    private static void ex2() {
        int[] ints = {1, 2, 3, 4, 5};
        var numList = new ArrayList<Integer>();
        for (int number : ints) {
            numList.add(number);
        }
        var result = avgNumbers(numList);
        System.out.println("The average is " + result);
    }

    private static void ex3() {
        int[] ints = {1, 2, 3, 4, 5};
        var numList = new ArrayList<Integer>();
        for (int number : ints) {
            numList.add(number);
        }
        doubleNumbers(numList);

    }

    private static void ex4() {
        //creates an array up to the number you put in
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the maximum number for the array: ");
        int maxNumber = scanner.nextInt();
        createList(maxNumber);

    }

    private static void ex5(){
        int[] ints = {1, 2, 3, 5, 6, 9, 11};

       findMissingNumbers(ints);

    }

    private static void ex6(){
        int[] ints = {0,1,1,1,0,0,1,0,0,1,0,0,0};
//        Java will not print out primitive arrays, and for some reason I cannot arrange an arraylist. So I rearrange
//        the primitive array first and then convert it and print it after.
        reArrange(ints);
        System.out.println(convertArray(ints));
    }


    private static void ex7(){
        var list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        System.out.println(returnRandomNumber(list));
    }


    public static void ex8(){

        var shoppingCart = new ArrayList<Float>();
        shoppingCart.add(new Float(12.99));
        shoppingCart.add(new Float(1.99));
        shoppingCart.add(new Float(3.99));
        System.out.println("Your total before taxes is $" + beforeTaxesTotal(shoppingCart));

        var grossTotal = beforeTaxesTotal(shoppingCart);

        System.out.println("Total after sales tax: $" + df.format(afterSalesTax(grossTotal)));

        var afterSales = (afterSalesTax(grossTotal));

        var endTotal = shippingAndHandling(afterSales);

        System.out.println("Your total cost after taxes plus shipping and handling is $" +df.format(endTotal));




    }

    private static String convertArray(int[] ints) { // Helper functions
        ArrayList converted = new ArrayList<Integer>();
        for(int i = 0; i < ints.length; i++){
            converted.add(ints[i]);
        }

        return converted.toString();
    }

    //
    // My functions
    //

    //This function goes through the ArrayList and adds all the integers together
    private static Integer addNumbers(ArrayList<Integer> numList) {
        int total = 0;
        for (int number : numList) {
            total += number;
        }
        return total;
    }

    private static Float avgNumbers(ArrayList<Integer> numList) {
        int total = 0;


        for (int number : numList) {
            total += number;
        }
        float avg = Float.valueOf((total / numList.size()));
        return avg;
    }

    private static void doubleNumbers(ArrayList<Integer>numList){ // 1,2,3,4,5. Need to use numlist.get(i) cause if
        // we use regular i it will use the int i = 0; instead and do 0*2, 1*2, 2*2, etc. the for loop is just a COUNTER.
        for (int i=0; i<numList.size(); i++){
            numList.set(i, numList.get(i) * 2);
        }
        System.out.println(numList);
    }


    private static void createList(Integer maxNumber){
        var numList = new ArrayList<Integer>(maxNumber);
        for (int i = 0; i<maxNumber; i++){
            numList.add(i);
            numList.set(i,numList.get(i)+1);
        }
        System.out.println(numList);
    }


    public static void findMissingNumbers(int[] ints){
        var missingNumbers = new ArrayList<Integer>();
        for (int i=0; i<ints.length; i++){
            if(ints[i] != i+1){
                missingNumbers.add(i+1);
            }
        }


        System.out.println(missingNumbers);
    }

    public static int[] reArrange(int[] ints){

        Arrays.sort(ints);

        return (ints);
    }

    public static int returnRandomNumber(ArrayList<Integer>list){
        Random random = new Random();
        int rand = random.nextInt(10);
        int number = list.get(rand);
        return number;
    }

    public static Float beforeTaxesTotal(ArrayList<Float>shoppingCart){
        Float total = 0.0f;

        for (int i = 0; i < shoppingCart.size(); i++){
            total += shoppingCart.get(i);
        }



        return total;
    }

    public static Float afterSalesTax (Float grossTotal){


        Float totalAfterSales = grossTotal*1.1f;


        return totalAfterSales;
    }

    public static Float shippingAndHandling (Float afterSales){

       var finalTotal = afterSales;

        if (finalTotal<10){
            finalTotal = finalTotal+5;
        }else if (finalTotal>10 && finalTotal<20){
            finalTotal = finalTotal+4;
        }else{
            finalTotal=finalTotal;
        }
        return finalTotal;
    }

}
