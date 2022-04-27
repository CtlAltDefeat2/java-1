package com.xpanxion.assignments.groupa;

import org.apache.log4j.helpers.SyslogQuietWriter;

import javax.swing.text.html.HTMLDocument;
import java.util.*;
import java.util.random.RandomGenerator;
import java.util.stream.Collectors;

public class Student1 {

    public static void main(String[] args) {

//        ex1();
//        ex2();
//        ex3();
//        ex4();
//        ex6();
        ex7();

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
        float average = (float) numList.stream().mapToInt(value -> value).average().orElse(0.0);//convert get average of previously declared numList using stream; stream provides the arrayStream, map will collect each element from the stream as integers which I then take the average of, orElse returns the value(or else returns the other, which is 0.0
        return average;
    }

    public static void ex3() {//intsArray.stream() provides the stream, map collects each element from the stream and doubles its value, and then collect the data in an array using toArray method
        System.out.println("Ex. 3");
        doubleArrayList(new ArrayList<>());
    }
    private static void doubleArrayList(ArrayList<Integer> numList){
        List<Integer> intsArray=Arrays.asList(1,2,3);
        List<Integer> doubleNumList= intsArray.stream().map(i -> i * 2).toList();
        System.out.println("Double values of numList: "+doubleNumList);
//        var numList = new ArrayList<Integer>();
//        numList.add(1);
//        numList.add(2);
//        numList.add(3);
//        doubleArrayList(numList);
//        System.out.println(numList);
//    }
//    private static void doubleArrayList(ArrayList<Integer> numList){
//
//        numList.get(0); // getter
//        numList.set(0, 5150); // updater
//
//        for (Integer i : numList) {
//            System.out.println(i);
//        }
//
    }
    public static void ex4(){
        Scanner myKeyBoard=new Scanner(System.in);
        System.out.println("Ex. 4");
        System.out.println("Enter the maximum value of integers in the array?");
        var maxNumber=myKeyBoard.nextInt();
        createList(maxNumber);
    }
    private static void createList(Integer maxNumber){
        Scanner myKeyBoard=new Scanner(System.in);
        System.out.println("Enter the capacity of the array");
        var arrayCapacity=myKeyBoard.nextInt();
        Random randNum=new Random();
        randNum.setSeed(System.currentTimeMillis());
        List myArray=new ArrayList<>(arrayCapacity);
        for (int i = 0; i < arrayCapacity; i++) {
            Integer randArray= randNum.nextInt(0,maxNumber+1);
            myArray.add(randArray);
        }
        System.out.println(myArray);
    }
    private static void ex5(){

    }
    private static void ex6(){
        System.out.println("Ex. 6");
        int[] ints = {0,1,1,1,0,0,1,0,0,1,0,0,0};
        Arrays.sort(ints);
        System.out.println(Arrays.toString(ints));
    }
    private static void ex7(){
        System.out.println("Ex. 7");
        Scanner myKeyBoard=new Scanner(System.in);
        var myArrayList=new ArrayList<Integer>();
        int i=0;
//        Random randNum=new Random();
//        randNum.setSeed(System.currentTimeMillis());
        System.out.println("Enter the capacity of the array");
        var arrayCapcity=myKeyBoard.nextInt();
        while (i<arrayCapcity){
            System.out.println("Enter an integer for the array");
            myArrayList.add(myKeyBoard.nextInt());
            i++;
        }
//        int myIndex= randNum.nextInt(myArrayList.size());
        System.out.println(myArrayList.toString());
        pickRandomElement(myArrayList);
//        System.out.println("Random selection from the array is: "+myArrayList.get(myIndex));
    }
    private static void pickRandomElement(ArrayList<Integer> myArrayList){
        Random randNum=new Random();
        randNum.setSeed(System.currentTimeMillis());
        int myIndex= randNum.nextInt(myArrayList.size());
        System.out.println("Random selection from the array is: "+myArrayList.get(myIndex));

    }



}

