package com.xpanxion.assignments.groupa;

import java.util.ArrayList;

public class student4 {
    public static void main(String[] args) {
       // ex1();
       // ex2();
     //   ex3();
    //    ex4();
        ex6();


    }

    private static Integer addNumbers(ArrayList<Integer> numList) { // 1,2,3,4
        Integer retval = 0;
        for (Integer i : numList) { // For each Integer "i" in this numList, I'm going to do the following...
            retval = retval + i; // = is an assignment operator.
        }
        return retval;
    }

    private static void ex1() {
        int[] ints = {1, 2, 3, 4};
        var newList = new ArrayList<Integer>();
        for (int i : ints) { //for each integer inside ints
            newList.add(i);
        }
        var result = addNumbers(newList);
        System.out.println("the sum of the Array is: " + result);
    }

    private static float avgNumbers(ArrayList<Float> numList) { // 1,2,3,4
        float retveal = 0;
        float average = 0;
        for (float i : numList) { // For each float "i" in this numList, I'm going to do the following...
            retveal = retveal + i;// = is an assignment operator.
            average = retveal / numList.size();
        }
        return average;
    }

    private static void ex2() {
        int[] ints = {1, 2, 3, 4};
        var newList = new ArrayList<Float>();
        for (float i : ints) {
            newList.add(i);
        }

        var result = avgNumbers(newList);
        System.out.println("the average of the Array is: " + result);

    }
    private static void doubleNumber(ArrayList<Integer> numList){
        var retveal = 0;
        var Doublenum = new ArrayList<Integer>();
        for (int i : numList){
             retveal = i *2;
             Doublenum.add(retveal);
        }
        System.out.println(Doublenum);


    }
    private static void ex3() {
        int[] ints = {1, 2, 3, 4};
        var newList = new ArrayList<Integer>();
        for (int i : ints) { //for each integer inside ints
            newList.add(i);
        }
        doubleNumber(newList);
    }
    private static void ex4(){
        int listMax = 5;
        createList(listMax);
    }

    private static void createList(Integer maxNumber){
        var Createlist = new ArrayList<Integer>();
        for(int i = 0; i<=maxNumber;i++){
            Createlist.add(i);

        }
        System.out.println("Max number is: " + Createlist);
}



private static void ex6(){
    int[] ints = {0,1,1,1,0,0,1,0,0,1,0,0,0};
    var newList = new ArrayList<Integer>();
    for (int i : ints) { //for each integer inside ints
        newList.add(i);
    }
    System.out.println(zeroleftoneright(newList));
}

private static String zeroleftoneright(ArrayList<Integer>numlist){
        String left = "";
        String right = "";
        String both = "";
    for (int i : numlist){
        if (i == 0)
            left += "0";
        else
                right += "1";

    }
    both = left + right;
    return both;


}
}



