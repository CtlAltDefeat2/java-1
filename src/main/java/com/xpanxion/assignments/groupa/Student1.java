package com.xpanxion.assignments.groupa;

import org.apache.log4j.helpers.SyslogQuietWriter;

import javax.swing.text.html.HTMLDocument;
import java.lang.reflect.Array;
import java.text.NumberFormat;
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
//        ex7();
//        ex8();
//        ex9();
        ex10();


    }

    public static void ex1() {
        System.out.println("EX. 1");
        int[] ints = {1, 2, 3};
        ArrayList<Integer> numList = (ArrayList<Integer>) Arrays.stream(ints).boxed().collect(Collectors.toList());//Array.stream provides the elements of ints as a stream, boxed returns a stream with each element as an integer, and collect puts the elements from the stream into an ArrayList
        var result=addNumbers(numList);
        System.out.println("The sum of the ArrayList is: "+result);
    }
    private static Integer addNumbers(ArrayList<Integer> numList) {
        Integer sum=0;
        for (int i:numList) {
            sum+=i;
        }
        return sum;
    }

    public static void ex2() {
        System.out.println("Ex. 2");
        int[] intArray={1, 2, 3,4,5,6};
        ArrayList<Integer> numList = (ArrayList<Integer>) Arrays.stream(intArray).boxed().collect(Collectors.toList());//intArray provides the stream of elements with Arrays.stream, boxed returns a stream with each element as an integer, and collect puts the stream into an ArrayList
        var resultAvg=avgNumbers(numList);
        System.out.println("The Average is: "+resultAvg);

    }
    private static Float avgNumbers(ArrayList<Integer> numList) {
//        float average = (float) numList.stream().mapToInt(value -> value).average().orElse(0.0);//numList provides the stream, map will collect each element from the stream as integers which I then take the average of, orElse either returns the value of the average or 0.0 if there is no average
//        return average;
        float sum=0;
        for (float i : numList) {
            sum+=i;
            System.out.println(sum);
        }
        float average=sum/numList.size();
        return average;
    }

    public static void ex3() {
        System.out.println("Ex. 3");
//        doubleArrayList(new ArrayList<>());
        var numList = new ArrayList<Integer>();                 //create an ArrayList called numList and add elements to it
        numList.add(1);
        numList.add(2);
        numList.add(3);
        doubleArrayList(numList);                               //call method doubleArrayList using numList
    }
//    private static void doubleArrayList(ArrayList<Integer> numList){
//        List<Integer> intsArray=Arrays.asList(1,2,3);
//        List<Integer> doubleNumList= intsArray.stream().map(i -> i * 2).toList();//intsArray.stream() provides the stream, map collects each element from the stream and doubles its value, and then collect the data in an unmodifiable List using the toList method
//        System.out.println("Double values of numList: "+doubleNumList);
//    }
    private static void doubleArrayList(ArrayList<Integer> numList){
        var intsArray=new ArrayList<Integer>();                 //create new ArrayList to hold new elements
        for (Integer integer : numList) {
            intsArray.add(integer * 2);                   //iterate through numList multiplying each element by 2 and adding it to intsArrayList
        }
            System.out.println(intsArray.toString());           //print intsArrayList here to show the new ArrayList since i don't return anything
    }
    public static void ex4(){
        Scanner myKeyBoard=new Scanner(System.in);
        System.out.println("Ex. 4");
        System.out.println("Enter the maximum value of integers in the array?");//user specifies array capacity
        var maxNumber=myKeyBoard.nextInt();
        createList(maxNumber);                                                  //call createList
    }
    private static void createList(Integer maxNumber){
        Scanner myKeyBoard=new Scanner(System.in);
        System.out.println("Enter the capacity of the array");
        var arrayCapacity=myKeyBoard.nextInt();
        myKeyBoard.close();
        Random randNum=new Random();                                            //initialize random method
        randNum.setSeed(System.currentTimeMillis());
        List myArray=new ArrayList<>(arrayCapacity);
        for (int i = 0; i < arrayCapacity; i++) {
            Integer randArray= randNum.nextInt(0,maxNumber+1);
            myArray.add(randArray);                                             //generate random numbers and add them to the array
        }
        System.out.println(myArray);                                            //print out array to ensure that it worked
    }
    private static void ex5(){

    }
    private static void ex6(){
        System.out.println("Ex. 6");
        int[] ints = {0,1,1,1,0,0,1,0,0,1,0,0,0};
        Arrays.sort(ints);                              //default of the sort method is to list the elements in ascending order
        System.out.println(Arrays.toString(ints));
    }
    private static void ex7(){
        System.out.println("Ex. 7");
        Scanner myKeyBoard=new Scanner(System.in);
        var myArrayList=new ArrayList<Integer>();
        int i=0;
        System.out.println("Enter the capacity of the array");
        var arrayCapcity=myKeyBoard.nextInt();
        while (i<arrayCapcity){
            System.out.println("Enter an integer for the array");
            myArrayList.add(myKeyBoard.nextInt());
            i++;
        }
        myKeyBoard.close();
        var randomElement=pickRandomElement(myArrayList);
        System.out.println(myArrayList.toString());
        System.out.println("Random selection from the array is: "+randomElement);
    }
    private static Integer pickRandomElement(ArrayList<Integer> myArrayList){
        Random randNum=new Random();
        randNum.setSeed(System.currentTimeMillis());
        int myIndex= randNum.nextInt(myArrayList.size());       //generate random number between 0 and array capacity
        return myArrayList.get(myIndex);                        //get the element at the index position indicated by the random number and return it
    }
    private static void ex8(){
        System.out.println("Ex. 8");
        Scanner myKeyBoard=new Scanner(System.in);
        ArrayList<Double> priceList=new ArrayList<Double>();
        System.out.println("How many items are in your cart?");
        var arrayCapacity=myKeyBoard.nextDouble();
        int i=0;
        while (i<arrayCapacity){
            System.out.println("Enter the price of the item");
            priceList.add((double) myKeyBoard.nextDouble());
            i++;
        }
        myKeyBoard.close();
        double totalCost=costOfShopping(priceList);
        NumberFormat defaultFormat=NumberFormat.getCurrencyInstance();              //May need to set locale if this doesn't work
        System.out.println("Your total cost is: "+defaultFormat.format(totalCost));
    }
    private static Double costOfShopping(ArrayList<Double>priceList) {
        double sum = 0;
        for (Double i : priceList) {
            sum += i;
        }
        Double afterTaxSum = sum * 1.1;                                             //determining shipping and handling
        if (afterTaxSum < 10) {
            afterTaxSum += 5;
        } else if (afterTaxSum < 20) {
            afterTaxSum += 4;
        }
        return afterTaxSum;
    }
    private static void ex9(){
        ArrayList<Integer> numList=new ArrayList<Integer>();
        Scanner myKeyBoard=new Scanner(System.in);
        System.out.println("How many numbers are in the array?");
        int arrayCapacity= myKeyBoard.nextInt();
        int i=0;
        while (i<arrayCapacity){
            System.out.println("Enter a number to add to the array");
            numList.add(myKeyBoard.nextInt());
            i++;
        }
        var result=evenOrOddChecker(numList);
        myKeyBoard.close();
        if (result == true) {
            System.out.println("The array is even");
        }else System.out.println("The array is odd");

    }
    private static boolean evenOrOddChecker(ArrayList<Integer> numList){
        int sum=0;
        for (Integer i:numList) {
            sum+=i;
        }
        if ((sum % 2) == 0){
            return true;
        }else return false;
    }
    private static void ex10(){

    }
}

