package com.xpanxion.assignments.groupe;

import javax.print.attribute.standard.PresentationDirection;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;
import java.util.random.RandomGenerator;

public class student26 {
    public static void main(String[] args) {

        ex8();

    }

    private static void ex1() {

        //Test writing in code
        int[] ints = {1, 2, 3};
        var newList = new ArrayList<Integer>();
        // TODO: convert ints to newList.

        for (int i:ints) {
            newList.add(i);
        }

        //System.out.println(newList);
        var result = addNumbers(newList);
         System.out.println(result);

    }
     private static  Integer addNumbers(ArrayList<Integer>numList) {

        //TODO:Implement this function
          Integer retval=0;

         for (Integer i :numList) {
            retval =  retval + i;
        }
         return  retval;

     }

//Example 2 Begin

    private static void ex2() {

        int[] ints = {1, 2, 3,12};
        var listnew = new ArrayList<Integer>();
        // TODO: convert ints to newList.

        for (int i:ints) {
            listnew.add(i);
        }

        var result = avgNumbers(listnew);
        System.out.println(result);


        }
        private static Float avgNumbers(ArrayList<Integer> numList) {
            // TODO: Implement this function.

            var retval = addNumbers(numList);
            return Float.valueOf(retval)/numList.toArray().length;


        }



        private static void ex3() {


            int[] list = {1, 2, 3};

            var listnew = new ArrayList<Integer>();

            for (int i : list) {
                listnew.add(i);
            }

            System.out.println(listnew);

            doublenumber(listnew);
            System.out.println("The numbers doubled are: " +listnew);

    }


    private static void doublenumber(ArrayList<Integer> numList) {



        for ( int i = 0; i < numList.size(); i ++) {

            numList.set(i, numList.get(i)*2);
        }
    }



    private static void ex4() {


        Scanner enter = new Scanner (System.in);
        System.out.print("Max value:");
        int number = enter.nextInt();

        createList(number);
        System.out.println(number);

    }



    private static void createList(Integer maxNumber) {

        var arraylist = new ArrayList<>();


        for(int i = 1; i <= maxNumber; i++) {
            arraylist.add(i);
        }

        System.out.println(arraylist);
    }

    private static void ex5() {


    }


    private static void ex6() {


    }


    private static void ex7() {

      var newList= new ArrayList<Integer>();

      newList.add(5);
      newList.add(20);
      newList.add(30);
      newList.add(11);
      newList.add(12);
      newList.add(25);



      //randomnumber(newList);
        System.out.println(randomNumber(newList));


        }

        private static Integer randomNumber (ArrayList<Integer>randnum) {


        Random rand = new Random();

            int result = randnum.get(rand.nextInt(randnum.size()));

            return result;

    }

    private static void ex8() {



        float [] list = {3.0F,2.0F, 7.0F,9.0F };
        ArrayList<Float> shopping = new ArrayList<Float>();
        for ( float i : list) {
            shopping.add(i);
        }

       shoppingcart(shopping);


    }

    private static void shoppingcart(ArrayList<Float>numlist) {

        Float listsum= 0.0F;

        for (Float i : numlist) {
            listsum = listsum + i;
        }
        System.out.println("Cost before tax: " + listsum);

        float taxwork= listsum * 10F/100F;
        float salestax = listsum + taxwork;
        System.out.println("Cost after 10% tax: " + salestax);

        // Shipping and handling
        if (listsum < 10.00F) {
            float cost = listsum +5.00F + taxwork;
            System.out.println("Total cost with shipping and handling is:  " + cost);
        }
            else if (listsum > 10.00F && listsum < 20.00F){
                float cost = listsum+ 4.00F + taxwork;
            System.out.println("Total cost with shipping and handling is: " + cost);

        }
            else if  (listsum > 20.00F) {
                float cost = listsum + taxwork;
            System.out.println("Free Shipping and handling total cost is: " + cost);
        }

    }

    private static void ex9() {

        int [] list = {1, 2, 3,};

        var newlist = new ArrayList<Integer>();

        for  (int i:list) {
            newlist.add(i);


        }


        System.out.println(newlist);
        //Indicates if sum is odd or even
        oddEven(newlist);

    }
        private static void oddEven (ArrayList<Integer>arrlist) {

        var sum = addNumbers(arrlist);


        if ( sum %2 ==0) {
            System.out.println("Even");
        }
            else {
            System.out.println("Odd");
        }



        }








}



