package com.xpanxion.assignments.groupe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class student23{
    public static void main(String[] args) {

        Ex1();

    }

    private static void Ex1(){
        int[] ints = {1,2,3};
        var newList = new ArrayList<Integer>();
        // TODO: convert ints to ArrayList


        var result = addNumbers(newList);
        System.out.println(result);
    }

    private static void Ex2(){


    }

    private static void Ex3(ArrayList<Integer>numList){


    }

    private static Integer addNumbers(ArrayList<Integer> numList) {
        Integer retVal = 0;
        for (Integer i : numList) {
            retVal = retVal + i;
        }
        return retVal;
    }
}

