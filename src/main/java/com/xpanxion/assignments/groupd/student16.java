package com.xpanxion.assignments.groupd;

import java.io.PrintStream;
import java.sql.Array;
import java.util.ArrayList;


public class student16 {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3};
        ArrayList arrayList = new ArrayList( );
        for (int i = 0; i < ints.length; i++) {
        arrayList.add(ints [i]);

        }
        System.out.println(average(arrayList));
    }
    private static Integer addNumbers(ArrayList<Integer> numList)  {
        int sum =0;
        for (int i = 0; i < numList.size(); i++) {
            sum += numList.get(i);
        }
        return sum;
    }
//EX 2
    private static void ex2() {
        int[] ints = {1, 2, 3};
        ArrayList aL = new ArrayList( );
        for (float i = average(aL); i < ints.length; i++) {


        }
        System.out.println(average(aL));
    }
    private static Float average(ArrayList<Integer> numList)  {
        float avg =0;
        int sum = 0;
        for (int i = 0; i < numList.size(); i++) {
            sum += numList.get(i);
        }
        avg = sum / numList.size();
        return avg;
    }

    private static void ex3() {
        System.out.println("Ex. 3");
    }
}
