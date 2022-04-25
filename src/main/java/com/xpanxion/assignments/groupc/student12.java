package com.xpanxion.assignments.groupc;

import java.awt.image.AreaAveragingScaleFilter;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class student12 {



    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
        ex5();
        ex6();


    }

    private static void ex1() {
        System.out.println("Ex. 1");
        addNumbers(new ArrayList<>());
    }
    private static Integer addNumbers(ArrayList<Integer> numList) {
        int[] ints = {1, 2, 3};
        int sum = 0;
        var list1 = new ArrayList<Integer>();
        for (int i = 0; i < ints.length; i++){
            list1.add(ints[i]);
            sum += list1.get(i);
        }
        System.out.println("Sum of all numbers in Array: " + sum);

        return 0;
    }

    private static void ex2() {
        System.out.println("Ex. 2");
        avgNumbers(new ArrayList<>());
    }
    private static Float avgNumbers(ArrayList<Integer> numList) {
        // TODO: Implement this function.
        int[] ints = {1, 2, 3};
        float avg = 0;
        int sum = 0;
        var list2 = new ArrayList<Integer>();
        for (int i = 0; i < ints.length; i++){
            list2.add(ints[i]);
            sum += list2.get(i);
        }
        avg = sum/ints.length;
        System.out.println("The Average value is: " + avg);

        return avg;
    }

    private static void ex3() {
        System.out.println("Ex. 3");
        doubler(new ArrayList<>());
    }

    private static void doubler(ArrayList<Integer> numList){
        int[] ints = {1, 2, 3};
        var doubledNums = new ArrayList<Integer>();
        //var doubled = 2;
        var list3 = new ArrayList<Integer>();
        for (int i = 0; i < ints.length; i++) {
            doubledNums.add(ints[i] * 2);

        }
        System.out.println(doubledNums);
    }
    private static void ex4() {
        System.out.println("Ex. 4");
        createList(5);

    }

    private static void createList(int maxNumber){
        int input = 5;
        int count = 0;
        var list4 = new ArrayList<>();


        for (int i = 0; i < maxNumber; i++){
            count++;
            list4.add(count);

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
}



