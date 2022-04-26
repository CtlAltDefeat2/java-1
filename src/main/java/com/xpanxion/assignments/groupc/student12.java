package com.xpanxion.assignments.groupc;

import java.awt.image.AreaAveragingScaleFilter;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;
import java.util.Scanner;

public class student12 {



    public static void main(String[] args) {

        ex1();
        ex2();
        ex3();
        ex4();
        ex5();
        ex6();
        ex7();
//        ex8();
//        ex9();
//        ex10();


    }

    private static void ex1() {
        System.out.println("Ex. 1");
        int[] ints = {1, 2, 3};
        var list1 = new ArrayList<Integer>();
        for (int i = 0; i < ints.length; i++) {
            list1.add(ints[i]);
        }
        addNumbers(list1);
    }
    private static Integer addNumbers(ArrayList<Integer> list1) {
        //int[] ints = {1, 2, 3};
        int sum = 0;
        for (int i = 0; i < list1.size(); i++){
            sum += list1.get(i);
        }
        System.out.println("Sum of all numbers in Array: " + sum);

        return sum;
    }

    private static void ex2() {
        System.out.println("Ex. 2");
        int[] ints = {1, 2, 3};
        var list2 = new ArrayList<Integer>();
        for (int i = 0; i < ints.length; i++) {
            list2.add(ints[i]);
        }
        avgNumbers(list2);
        System.out.println("The average of the values is: " + avgNumbers(list2));
    }
    private static Float avgNumbers(ArrayList<Integer> list2) {
        // TODO: Implement this function.
        float avg = 0;
        int sum = 0;
        for (int i = 0; i < list2.size(); i++){
            sum += list2.get(i);
        }
        avg = sum/list2.size();
        //System.out.println("The Average value is: " + list2.size());
        return avg;
    }

    private static void ex3() {
        System.out.println("Ex. 3");
        int[] ints = {1, 2, 3};
        var list3 = new ArrayList<Integer>();
        for (int i = 0; i < ints.length; i++){
            list3.add(ints[i]);
        }
        doubler(list3);
    }

    private static void doubler(ArrayList<Integer> list3){
        for (int i = 0; i < list3.size(); i++) {
            list3.set(i, list3.get(i) * 2);
        }
        System.out.println(list3);
    }

    private static void ex4() {
        System.out.println("Ex. 4");
        createList(5);
    }
    private static void createList(int maxNumber){
        int count = 0;
        var list4 = new ArrayList<>();
        for (int i = 0; i < maxNumber; i++){
            count++;
            list4.add(count);
            //this could be done with i+1 as well
        }
        System.out.println(list4);
    }

    private static void ex5() {
        System.out.println("Ex. 5");
        int[] ints = {1, 2, 3, 5, 6, 9, 11};
        int intEntries = ints.length;
        findMissingNumbers(ints, intEntries);
    }

    private static void findMissingNumbers(int ints[], int intEntries){
        int difference = 1;
        var list5 = new ArrayList<>();
        for(int i = 0; i < intEntries; i++){ //for each entry
            if(ints[i] - i != 0){
                //if the difference between ints @ i and i does not equal 0
                while (difference < ints[i] - i){
                    //while the difference (1) is less than the difference
                    // between ints @ i and i system will add 1 to its value
                    //{1, 2, 3, 5, 6, 10, 11,15}
                    // while 1 < f(x1) - x1
                    //f(x0) = 1, x = 0, 1 < 1 - 0 (false)
                    //f(x1) = 2, x = 1, 1 < 2 - 1 (false)
                    //f(x2) = 3, x = 2, 1 < 3 - 2 (false)
                    //f(x3) = 5, x = 3, 1 < 5 - 3 (true)
                        //list5(x0) = 3 + 1 = 4
                        //difference = 1 + 1 = 2
                    //f(x4) = 6, x = 4, 2 < 6 - 2 (false)
                    list5.add(i + difference);
                    difference++;

                }
            }
        }
        System.out.println("The Missing numbers are: "+ list5);
    }
    private static void ex6() {
        System.out.println("Ex. 6");
        int[] ints = {0,1,1,1,0,0,1,0,0,1,0,0,0};
        sorting(ints);
    }
    private static void sorting(int[] ints ){
        int count0 = 0;
        int count1 = 0;
        var list6Zeros = new ArrayList<>();
        var list6Ones = new ArrayList<>();
        for (int i = 0; i < ints.length; i++){
            if (ints[i] == 0) {
                list6Zeros.add(0);
                count0++;
            }
            else if (ints[i] == 1){
                list6Ones.add(1);
                count1++;
            }
        }
        var list6 = new ArrayList<>();
        list6Zeros.addAll(list6Ones);
        list6.addAll(list6Zeros);
        System.out.println("These numbers sorted are: " + list6);
    }
    private static void ex7() {
        System.out.println("Ex. 7");
        var list7 = new ArrayList<>();
        Random rand = new Random();
        var listLength = rand.nextInt(80);
        //Randomly selects a list size between 1 and 80
        for (int i = 0; i < listLength; i++){
            list7.add(i + 1);
            //starts array with a value of 1 (0,1)
        }
        randomReturn(list7);
    }
    private static void randomReturn(ArrayList<Object> list7){
        Random rand = new Random();
        //sets new random function
        int index = rand.nextInt(list7.size());
        //selects the next number after a random number along list7's length
        System.out.println("Random List Length is: "+ list7.size());
        System.out.println("Random Element is: " + index);
    }
    private static void ex8() {
        System.out.println("Ex. 8");
    }private static void ex9() {
        System.out.println("Ex. 9");
    }
    private static void ex10() {
        System.out.println("Ex. 10");
    }
}



