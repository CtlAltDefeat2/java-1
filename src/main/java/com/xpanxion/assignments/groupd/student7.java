package com.xpanxion.assignments.groupd;

import java.lang.reflect.Array;
import java.text.NumberFormat;
import java.util.*;

public class student7 {
    public static void main(String[] args) {
        //ex1();
       // ex2();
       // ex3();
        //ex4();
        //ex5();
        //ex6();
        //ex7();
        //ex8();
        //ex9();
         ex10();

    }

    private static void ex1() {

        int[] ints = {1, 2, 3};
        var num = new ArrayList<Integer>() ;
        for (Integer i :ints) {
            num.add(i);
        }
        System.out.println("Ex. 1");
        System.out.println(addNumbers(num));
    }
    private static Integer addNumbers(ArrayList<Integer> numList) {
        int sum = 0;
        for (int i : numList) {
            sum += i;
        }
        return sum;
    }
    private static void ex2() {// method for calling ex2 that get the average number
        int[] ints = {1, 2, 3};
        ArrayList<Integer> num = new ArrayList<Integer>() ;
        for (Integer i : ints) {
            num.add(i);
        }
        System.out.println("Ex. 2");
        System.out.println(avgNumbers(num));
    }
    private static Float avgNumbers(ArrayList<Integer> numList) {//ex2 get the average
        int sum = 0;
        float avg ;
        for (int i : numList) {
            sum += i;
        }
        avg = sum/numList.size();
        return avg;
    }
    private static void ex3() {
        int[] ints = {1, 2, 3};
        ArrayList<Integer> num = new ArrayList<Integer>() ;
        for (int i :ints) {
            num.add(i);
        }
        System.out.println("Ex. 3");
        doubleNumber(num);
        System.out.println(num);

    }
    private static void doubleNumber(ArrayList<Integer> numList) {
        for (int i = 0; i < numList.size(); i++) {
            int temp = numList.get(i);
            numList.set(i, (temp*2));
        }
    }
    private static void ex4(){
        System.out.println("Ex. 4");
        var list = createList(6);
        System.out.println(list);
    }
    //This function returns an ArrayList of Integers no greater than `maxNumber`.
    private static ArrayList<Integer> createList(Integer maxNumber){
        var arraylist = new ArrayList<Integer>();
        for(int i = 1; i <= maxNumber; i++)
            arraylist.add(i);
        return arraylist;
    }
    private static void ex5(){
        System.out.println("Ex. 5");
        int[] ints = {1, 2, 3, 5, 6, 9, 11};
        var missing_arrayL = new ArrayList<Integer>();
        for (int i = 0; i < ints.length; i++)
            missing_arrayL.add(ints[i]);
        var missingNumbers = missingNum(missing_arrayL);
        System.out.println("number of missing number: "+ missingNumbers);
    }
    private static ArrayList<Integer> missingNum(ArrayList<Integer> list){//find the missing number in a list
        var missingNum = new ArrayList<Integer>();
        int max = Collections.max(list); //get max size
        for(int i = 1; i <= max; i++){
            if(!list.contains(i))//check if list.contains is false
                missingNum.add(i);
        }
        return missingNum;
    }
    public static void ex6(){ //sort the array
        System.out.println("Ex. 6");
        int[] ints = {0,1,1,1,0,0,1,0,0,1,0,0,0};
        ArrayList<Integer> returns = new ArrayList<>(); // the arraylist
        for (int i = 0; i < ints.length; i++) { //convert an int array to an arraylist, so it can pass
            returns.add(ints[i]);
        }
        System.out.println(SortNumber(returns));
    }
    //Write a Java function that returns a
    // `String` with all the zeros on the left side and all the ones on the right side:
    public static String SortNumber(ArrayList<Integer> list){ //convert an int array to a string
        Collections.sort(list);//sort the list
        String str;
        str = list.toString();
        return  str;
    }
    private static void ex7(){
        System.out.println("Ex. 7");
        int[] ints = {1, 2, 3, 5, 6, 9, 11};
        var num = new ArrayList<Integer>();
        for (int i = 0; i < ints.length; i++){
            num.add(ints[i]);
        }
        System.out.println(rando(num));
    }
    private static Integer rando(ArrayList<Integer> arrayList){
        Random random_method = new Random();
        var rand = arrayList.get(random_method.nextInt(arrayList.size()));
        return rand;
    }
    private static void ex8(){
        float[] floats = {1.34F, 4.04F, 12.40F, 1.03F};
        var floatList = new ArrayList<Float>();
        for (int i=0; i < floats.length; i++) {//create the ArrayList
            floatList.add(floats[i]);
        }
        NumberFormat format = NumberFormat.getCurrencyInstance();
        System.out.println(format.format((shoppingTotal(floatList))));
    }
    private static Float shoppingTotal(ArrayList<Float> list){
        float sum = 0;
        for(float i: list){
            sum+=i;
        }
        sum *= 1.10;
        if(sum < 10.00)
            sum += 5;
        else if(sum > 10.00 && sum < 20.00)
            sum += 4;
        else if (sum > 20.00)
            System.out.println("free shipping");
        return sum;
    }
    public static void ex9(){
        int[] ints = {1, 4, 12, 1};
        var num = new ArrayList<Integer>();
        for(int i : ints){
            num.add(i);
        }
        System.out.println(EvenOrOdd(num));
    }
    public static String EvenOrOdd(ArrayList<Integer> list){
        int sum = addNumbers(list);
        String result;
        if (sum % 2 == 0)
            result = "Even";
        else
            result = "Odd";
       return result;
    }
    public static void ex10(){
        String pass = "Iamapassword12";
        System.out.println(PasswordCheck(pass));
    }
    //check if a password has more then two number and more then 10 characters and that there's no special characters
    public static boolean PasswordCheck(String pass){
        int char_count = 0;
        int int_count = 0;
        int special_count = 0;
        boolean flag = true;
        for (int i = 0; i < pass.length(); i++) {
            boolean num_check = Character.isDigit(pass.charAt(i));
            boolean char_check = Character.isLetter(pass.charAt(i));
            if(!num_check && !char_check) //check for special characters, need to be first argument
                special_count++;
            else if(char_check)
                char_count++;
            else if(num_check)
                int_count++;
        }
        if(char_count < 10 || (int_count < 2) ){
            System.out.println("need ten characters or 2 numbers");
            flag = false;
        }
        else if (special_count > 0) {// won't work for some reason
            System.out.println("No special characters permitted");
            flag = false;
        }
        else if (char_count >= 10 && int_count >= 2){//must be final argument
            System.out.println("Password accepted");
            flag = true;
        }
        return flag;
    }
}
