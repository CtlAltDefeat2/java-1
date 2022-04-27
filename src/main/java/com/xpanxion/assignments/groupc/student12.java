package com.xpanxion.assignments.groupc;

import java.awt.image.AreaAveragingScaleFilter;
import java.math.BigDecimal;
import java.sql.Array;
import java.text.NumberFormat;
import java.util.*;

public class student12 {



    public static void main(String[] args) {

//        ex1();
//        ex2();
//        ex3();
//        ex4();
//        ex5();
//        ex6();
//        ex7();
//        ex8();
//        ex9();
        ex10();


    }

    private static void ex1() {
        System.out.println("Ex. 1");
        int[] ints = {1, 2, 3};
        var list1 = new ArrayList<Integer>();
        for (int i = 0; i < ints.length; i++) {
            list1.add(ints[i]);
        }
        var result = addNumbers(list1);
        System.out.println("Sum of all numbers in Array: " + result);
    }
    private static Integer addNumbers(ArrayList<Integer> list1) {
        int sum = 0;
        for (int i = 0; i < list1.size(); i++){
            sum += list1.get(i);
        }
        return sum;
    }

    private static void ex2() {
        System.out.println("Ex. 2");
        int[] ints = {1, 2, 3};
        var list2 = new ArrayList<Integer>();
        for (int i = 0; i < ints.length; i++) {
            list2.add(ints[i]);
        }
        avgNumbers(list2);
        System.out.println("The average of the values is: " + avgNumbers(list2));
    }
    private static Float avgNumbers(ArrayList<Integer> list2) {
        // TODO: Implement this function.
        float avg = 0;
        int sum = 0;
        for (int i = 0; i < list2.size(); i++){
            sum += list2.get(i);
        }
        avg = sum/list2.size();
        //System.out.println("The Average value is: " + list2.size());
        return avg;
    }

    private static void ex3() {
        System.out.println("Ex. 3");
        int[] ints = {1, 2, 3};
        var list3 = new ArrayList<Integer>();
        for (int i = 0; i < ints.length; i++){
            list3.add(ints[i]);
        }
        doubler(list3);
    }

    private static void doubler(ArrayList<Integer> list3){
        for (int i = 0; i < list3.size(); i++) {
            list3.set(i, list3.get(i) * 2);
        }
        System.out.println(list3);
    }

    private static void ex4() {
        System.out.println("Ex. 4");
        createList(5);
    }
    private static void createList(int maxNumber){
        int count = 0;
        var list4 = new ArrayList<>();
        for (int i = 0; i < maxNumber; i++){
            count++;
            list4.add(count);
            //this could be done with i+1 as well
        }
        System.out.println(list4);
    }

    private static void ex5() {
        System.out.println("Ex. 5");
        int[] ints = {1, 2, 3, 5, 6, 9, 11};
        int intEntries = ints.length;
        findMissingNumbers(ints, intEntries);
    }

    private static void findMissingNumbers(int ints[], int intEntries){
        int difference = 1;
        var list5 = new ArrayList<>();
        for(int i = 0; i < intEntries; i++){ //for each entry
            if(ints[i] - i != 0){
                //if the difference between ints @ i and i does not equal 0
                while (difference < ints[i] - i){
                    //while the difference (1) is less than the difference
                    // between ints @ i and i system will add 1 to its value
                    //{1, 2, 3, 5, 6, 10, 11,15}
                    // while 1 < f(x1) - x1
                    //f(x0) = 1, x = 0, 1 < 1 - 0 (false)
                    //f(x1) = 2, x = 1, 1 < 2 - 1 (false)
                    //f(x2) = 3, x = 2, 1 < 3 - 2 (false)
                    //f(x3) = 5, x = 3, 1 < 5 - 3 (true)
                        //list5(x0) = 3 + 1 = 4
                        //difference = 1 + 1 = 2
                    //f(x4) = 6, x = 4, 2 < 6 - 2 (false)
                    list5.add(i + difference);
                    difference++;

                }
            }
        }
        System.out.println("The Missing numbers are: "+ list5);
    }
    private static void ex6() {
        System.out.println("Ex. 6");
        int[] ints = {0,1,1,1,0,0,1,0,0,1,0,0,0};
        sorting(ints);
    }
    private static void sorting(int[] ints ){
        var list6Zeros = new ArrayList<>();
        var list6Ones = new ArrayList<>();
        for (int i = 0; i < ints.length; i++){
            if (ints[i] == 0) {
                list6Zeros.add(0);
            }
            else if (ints[i] == 1){
                list6Ones.add(1);
            }
        }
        var list6 = new ArrayList<>();
        list6Zeros.addAll(list6Ones);
        list6.addAll(list6Zeros);
        System.out.println("These numbers sorted are: " + list6);
    }
    private static void ex7() {
        System.out.println("Ex. 7");
        var list7 = new ArrayList<Integer>();
        Random rand = new Random();
        var listLength = rand.nextInt(80);
        //Randomly selects a list size between 1 and 80
        for (int i = 0; i < listLength; i++){
            list7.add(i + 1);
            //starts array with a value of 1 (0,1)
        }
        randomReturn(list7);
    }
    private static void randomReturn(ArrayList<Integer> list7) {
        Random rand = new Random();
        //sets new random function
        int index = rand.nextInt(list7.size());
        //selects the next number after a random number along list7's length
        System.out.println("Random List Length is: " + list7.size());
        System.out.println("Random Element is: " + index);
    }
    private static void ex8() {
        System.out.println("Ex. 8");
        var list8 = new ArrayList<Integer>();
        Random rand = new Random();
        var listLength = 10;
        for (int i = 0; i < listLength; i++){
            Integer r = rand.nextInt(100);
            list8.add(r);
        }
        var result = cashOut(list8);
        System.out.println(list8);
        System.out.println("Cart Total: " + result);
    }

    public static String cashOut(ArrayList<Integer> list8){
        double preTax = 0;
        preTax = addNumbers(list8);
        BigDecimal cart = new BigDecimal(preTax);
        BigDecimal tax = new BigDecimal(1.1);
        BigDecimal postTax = cart.multiply(tax);
        NumberFormat n = NumberFormat.getCurrencyInstance(Locale.US);
        //double money = total.doubleValue();
        //BigDecimal is immutable
        if (postTax.doubleValue() < 10 ){
            BigDecimal shipping = new BigDecimal(5);
            BigDecimal total = postTax.add(shipping);
            double money = total.doubleValue();
            String s = n.format(money);
            return s;
        }
        else if (postTax.doubleValue() > 10 && postTax.doubleValue() < 20){
            BigDecimal shipping = new BigDecimal(4);
            BigDecimal total = postTax.add(shipping);
            double money = total.doubleValue();
            String s = n.format(money);
            return s;

        }
        else{
            BigDecimal total = postTax;
            double money = total.doubleValue();
            String s = n.format(money);
            return s;
        }
    }

    private static void ex9() {
        System.out.println("Ex. 9");
        Random rand = new Random();
        var list9 = new ArrayList<Integer>();
        int listLength = rand.nextInt(10);
        for (int i = 0; i < listLength; i++){
            list9.add(i + 1);
        }
        System.out.println("Array \'list9\': " + list9);
        var result = checkArray(list9);
        System.out.println("This Array is: " + result);

    }

    private static String checkArray(ArrayList<Integer> list9){
        var num = list9.size();

        if ( num % 2 == 0){
            String odd = "Even";
            return odd;
        }
        else {
            String even = "Odd";
            return even;
        }
    }
    private static void ex10() {
        System.out.println("Ex. 10");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a new password: ");
        var password = scanner.nextLine();
        if (passVerify(password)) {
            System.out.println("Password is valid");
        }
        else {
            System.out.println("Password is not valid");
        }

    }

    private  static boolean passVerify(String password) {
        if (password.length() < 10) {
            return false;
        }
        var charCount = 0;
        var numCount = 0;
        for (int i = 0; i < password.length(); i++) {
            char charAtI = password.charAt(i);
            if (areNums(charAtI)) {
                numCount++;
            }
            else if (areLetters(charAtI)) {
                charCount++;
            }
            else return false;

        }
        return (charCount >= 2 && numCount >= 2);
        //returns if both charCount and numCount are greater than 2
    }
    private static boolean areNums(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }
    public static boolean areLetters (char ch) {
        return (ch >=  0 && ch <= 9);

    }





}




