package com.xpanxion.assignments.groupd;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class student19 {

    public static void main(String[] args) {

        //ex1();
        ex2();

    }

    private static void ex1(){
        int[] ints = {1, 2, 3};
        ArrayList<Integer> num = new ArrayList<Integer> ();

        for( int i = 0; i < ints.length; i++) {
            num.add(ints[i]);
        }
        System.out.println(addNumbers(num));
    }


    private static Integer addNumbers(ArrayList<Integer> numList) {
        // TODO: Implement this function.
        int sum = 0;
        for( int i = 0; i < numList.size(); i++ ){
            sum += numList.get(i);
        }
        return (sum);
    }


        private static void ex2() {
            int[] ints = {1, 2, 3};
            ArrayList<Integer> num = new ArrayList<Integer>();

            for (int i = 0; i < ints.length; i++) {
                num.add(ints[i]);
            }
            System.out.println(avgNumbers(num));
        }
        private static Float avgNumbers(ArrayList<Integer> numList){
            // TODO: Implement this function.
            float f = 0;
            int sum = 0;
            for(int i=0; i< numList.size();i++) {
                sum += numList.get(i);
            }
           f = sum / numList.size();
            return f;


        }







    private static void ex3() {


        System.out.println("Ex. 3");
    }
}
