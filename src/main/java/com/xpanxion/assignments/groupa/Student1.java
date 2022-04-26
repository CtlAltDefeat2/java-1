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
        ArrayList<Integer> numList = (ArrayList<Integer>) Arrays.stream(ints).boxed().collect(Collectors.toList());//convert integer array to ArrayList using stream
        var result=addNumbers(numList);//call addNumbers to get result
        System.out.println("The sum of the ArrayList is: "+result);
    }
    private static Integer addNumbers(ArrayList<Integer> numList) {
        Integer sum=0;//declare variable sum outside of following for loop block
        for (int i:numList) {//enhanced for loop to get sum of ArrayList
            sum+=i;
        }
        return sum;
    }

    public static void ex2() {
        System.out.println("Ex. 2");
        int[] intArray={1, 2, 3};//declare the int array outside of function
        ArrayList<Integer> intArrayList = (ArrayList<Integer>) Arrays.stream(intArray).boxed().collect(Collectors.toList());//convert the intArray to intArrayList using stream
        var resultAvg=avgNumbers(intArrayList);//call avgNumbers to get resultAvg
        System.out.println("The Average is: "+resultAvg);

    }
    private static Float avgNumbers(ArrayList<Integer> numList) {
        float average = (float) numList.stream().mapToInt(value -> value).average().orElse(0.0);//convert get average of previously declared numList using stream
        return average;
    }

    public static void ex3() {
        System.out.println("Ex. 3");
        doubleArrayList(new ArrayList<>());
    }
    private static void doubleArrayList(ArrayList<Integer> numList){
        List<Integer> intsArray=Arrays.asList(1,2,3);
        List<Integer> doubleNumList= intsArray.stream().map(i -> i * 2).toList();
        System.out.println("Double values of numList: "+doubleNumList);
    }
    public static void ex4(){
        System.out.println("Ex. 4");

    }
    private static void createList(Integer maxNumber){

    }



}

