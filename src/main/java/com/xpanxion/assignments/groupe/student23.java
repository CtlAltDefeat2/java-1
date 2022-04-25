package com.xpanxion.assignments.groupe;

import java.util.ArrayList;

public class student23Java1Intro {
    public static void main(String[] args) {
        Ex1();
        Ex2();
    }

    private static void Ex1(){
        int[] ints = {1,2,3};
       ArrayList<Integer> sumofcharacters = ;

        for(int i = 0; i < ints.length; i++) {
            sumofcharacters = sumofcharacters + ints[i];
        }
        System.out.println(sumofcharacters);
    }

    private static void Ex2(){
        int[] ints = {1,2,3};
        var sumofcharacters = 0;

        for(int i = 0; i < ints.length; i++) {
            sumofcharacters = sumofcharacters + ints[i];
        }
        System.out.println(sumofcharacters/ints.length);

    }

    private static void Ex3(ArrayList<Integer> numList){
        ArrayList<Integer> newNumList = new ArrayList<Integer>();
        Integer i;
        for ( i =0; i < numList.size(); i++ )
            newNumList.get(i) = numList.get(i) * 2;
        System.out.println(newNumList);

    }

}
}

