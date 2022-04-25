package com.xpanxion.assignments.groupd;

import java.io.PrintStream;
import java.sql.Array;
import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;


public class student16 {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
    }
    private static void ex1(){
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
//EX 2 Begins here
    private static void ex2() {
        int[] ints = {1, 2, 3};
        ArrayList arrayList = new ArrayList( );
        for (int i = 0; i < ints.length; i++) {
            arrayList.add(ints [i]);

        }
        System.out.println(average(arrayList));
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
//EX3 starts here
    private static void ex3() {
        int [] ints = {1,2,3};
        ArrayList<Integer> num = new ArrayList<Integer>();
            for (int i = 0; i < ints.length;i++){
                num.add(ints[i]);
        }
            Doubles(num);
    }
    private static void Doubles (ArrayList<Integer> numList) {
        double d = 0;
        int sum = 0;
        for(int i = 0; i < numList.size(); i++) {
            int temp = numList.get(i);
            numList.set(i,(temp*2));
        }
        System.out.println(numList);
    }
}
