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
        System.out.println(addNumbers(arrayList));
    }
    private static Integer addNumbers(ArrayList<Integer> numList)  {
        int sum =0;
        for (int i = 0; i < numList.size(); i++) {
            sum += numList.get(i);
        }
        return sum;
    }

    private static void ex2() {
        System.out.println("Ex. 2");
    }

    private static void ex3() {
        System.out.println("Ex. 3");
    }
}
