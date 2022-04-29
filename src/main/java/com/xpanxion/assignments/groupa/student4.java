package com.xpanxion.assignments.groupa;

import java.util.ArrayList;

public class student4 {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
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
        var newList = new ArrayList<Float>(); // convert the array into a Arraylist
        for (float i : ints) {  // for each float inside the array ints do the following
            newList.add(i);
        }

        var result = avgNumbers(newList);
        System.out.println("the average of the Array is: " + result);

    }
    private static void doubleNumber(ArrayList<Integer> numList){
        var retveal = 0;
        var doubleNum = new ArrayList<Integer>();
        for (int i : numList){  // for each integer(i) in this numlist do the following
             retveal = i *2; // the variable retveal is equal to the integer (i) in the numlist multiply by 2
             doubleNum.add(retveal);
        }
        System.out.println(doubleNum);


    }
    private static void ex3() {
        int[] ints = {1, 2, 3, 4};
        var newList = new ArrayList<Integer>();
        for (int i : ints) { //for each integer inside ints do the following
            newList.add(i); // add integer i inside the Arraylist newlist
        }
        doubleNumber(newList);
    }
    private static void ex4(){
        int listMax = 5;
        createList(listMax);
    }

    private static void createList(Integer maxNumber){
        var recreateList = new ArrayList<Integer>(); // /we have an Arraylist which is variable called recreatelist
        for(int i = 0; i<=maxNumber;i++){
            recreateList.add(i);

        }
        System.out.println("Max number is: " + recreateList);
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
    for (int i : numlist){ // for each integer (i) in the numlist check if :
        if (i == 0)        // if the inger is equal to zero
            left += "0";  // print string 0
        else              // if it is not equal to zero then
                right += "1";

    }
    both = left + right;
    return both;


}


}



