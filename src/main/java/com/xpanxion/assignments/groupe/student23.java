package com.xpanxion.assignments.groupe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class student23{
    public static void main(String[] args) {
//        int[] numList = new int[5];
//        Scanner scanner = new Scanner(System.in);
        Ex1();
//        Ex2();
//        System.out.println("Enter 5 numbers: " );
//        for(int i = 0; i < 5; i++) {
//            numList[i] = scanner.nextInt();
//        }
//        Ex3(numList.);
    }

    private static void Ex1(){
        int[] ints = {1,2,3};
//        var sumofcharacters = 0;
//
//        for(int i = 0; i < ints.length; i++) {
//            sumofcharacters = sumofcharacters + ints[i];
//        }

        // Convert int[] to ArrayList<Integer>



        var r = addNumbers(???);
        System.out.println(r);
    }

    private static void Ex2(){
        int[] ints = {1,2,3};
        var sumofcharacters = 0;

        for(int i = 0; i < ints.length; i++) {
            sumofcharacters = sumofcharacters + ints[i];
        }
        System.out.println(sumofcharacters/ints.length);

    }

    private static void Ex3(ArrayList<Integer>numList){
        ArrayList<Integer> newNumList = new ArrayList<Integer>();
        int num;
        //Integer i;
        for (int i : numList) {
            num = numList.get(i) *2; // gets a number from the list // = numList.get(i) * 2;
            newNumList.set(i, num); // updates the list
        }
        System.out.println(newNumList);

    }

    private static Integer addNumbers(ArrayList<Integer> numList) {
        // TODO: Implement this function.
        return 0;
    }
}

