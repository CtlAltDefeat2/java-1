package com.xpanxion.assignments.groupa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Student1 {

    public static void main(String[] args) {

        ex1();
        ex2();
        ex3();

    }

    public static void ex1() {
        System.out.println("EX. 1");
        int[] ints = {1, 2, 3};// integer array
        ArrayList<Integer> numList = (ArrayList<Integer>) Arrays.stream(ints).boxed().collect(Collectors.toList());//convert integer array to ArrayList
        System.out.println(numList);//print out numList
        addNumbers(numList);
    }
    private static Integer addNumbers(ArrayList<Integer> numList) {
        System.out.println(numList);
        Integer sum=0;//declare variable sum outside of block
        for (int i:numList) {//enhanced for loop to get sum of ArrayList
            sum+=i;
        }
        System.out.println(sum);
        // TODO: Implement this function.
        return sum;
    }
//        System.out.println("Average = "+average);
//        System.out.println(ints);

//        Scanner myKeyBoard= new Scanner(System.in);//initialize scanner outside of block
//        ArrayList<Integer> numList= new ArrayList<>();//initialize array variable outside of block
//        System.out.println("Please enter a nonzero integer to be added (enter 0 when done)");//ask initial question
//        Integer targetNum= myKeyBoard.nextInt();//get input from user
//        while (true) {
//            if (targetNum==0) {
//                System.out.println("The last number has been added");
//                break;
//            } else {
//                numList.add(targetNum);
//                System.out.println("Enter another nonzero interger to be added (enter 0 when done)");
//                targetNum=myKeyBoard.nextInt();
//            }
//        int sum=0;
//        for (int number:numList){
//            sum+=number;
//        }
//        System.out.println(sum);
//    }

    private static void ex2() {
        System.out.println("Ex. 2");
        int[] intArray={1, 2, 3};
        ArrayList<Integer> intArrayList = (ArrayList<Integer>) Arrays.stream(intArray).boxed().collect(Collectors.toList());
        avgNumbers(intArrayList);

    }
    private static Float avgNumbers(ArrayList<Integer> numList) {
        int[] intArray={1,2,3};
        float average = (float) numList.stream().mapToInt(value -> value).average().orElse(0.0);

        System.out.println("Average = " + average);
        // TODO: Implement this function.
        return average;
    }

    private static void ex3() {
        System.out.println("Ex. 3");
        doubleArrayList(new ArrayList<>());

    }
    private static void doubleArrayList(ArrayList<Integer> numList){
        List<Integer> intsArray=Arrays.asList(1,2,3);
        List<Integer> doubleNumList= intsArray.stream().map(i -> i * 2).toList();
        System.out.println("Double values of numList: "+doubleNumList);
    }


}

