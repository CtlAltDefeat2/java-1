package com.xpanxion.assignments.groupa;
import org.w3c.dom.ls.LSOutput;
import java.math.BigDecimal;
import java.util.*;
import java.util.stream.IntStream;
import java.text.NumberFormat;
import static java.lang.Math.round;
import java.util.ArrayList;

import static com.xpanxion.assignments.groupa.student20.main;

public class student20 {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
        ex5();
        ex6();
        ex7();
        ex8();
        ex9();
        ex10();

    }
//EX 1
    private static void ex1() {
        System.out.println("Ex. 1");
        addNumbers(new ArrayList<>());
    }
    private static Integer addNumbers(ArrayList<Integer> numList) {
        int[] ints = {1, 2, 3};
        int sum = 0;
        var list1 = new ArrayList<Integer>();
        for (int i = 0; i < ints.length; i++) {
            list1.add(ints[i]);
            sum += list1.get(i);
        }
        System.out.println("Sum of all numbers in Array: " + sum);
        return null;
    }

//EX 2
    private static void ex2() {
        System.out.println("Ex. 2");
        avgNumbers(new ArrayList<>());
    }

    private static Float avgNumbers(ArrayList<Integer> numList) {
        // TODO: Implement this function.
        int[] ints = {1, 2, 3};
        float avg = 0;
        int sum = 0;
        var list = (new ArrayList<Integer>());
        for (int i = 0; i < ints.length; i++){
            list.add(ints[i]);
            sum += list.get(i);
        }
        avg =sum/ints.length;

        return null;
    }
    //EX 3
    private static void ex3() {
        System.out.println("Ex. 3");
        int[] ints = {1, 2, 3};
        var list = new ArrayList<Integer>();
        for (int i = 0; i < ints.length; i++){
            list.add(ints[i]);

        }
        multiply(list);
    }
    private static void multiply(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(1) *2);
        }
        System.out.println("This is the doubled Array: " + list);
    }

    // EX4
    private static void ex4() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the max numbers you'd like in an array: ");
        var maxNumber = scanner.nextLine();

        var result = createList(Integer.valueOf(maxNumber));
        System.out.println(result);

    }
    private static ArrayList<Integer> createList(Integer maxNumber) {
        var numList = new ArrayList<Integer>(maxNumber);
        for (int i = 0; i < maxNumber; i++) {
            numList.add(i + 1);
        }
        return numList;
    }

    //EX 5
    private static void ex5(){
        System.out.println("Ex. 5");
        int[] arr = {1, 2, 3, 5, 6, 9, 11};
        int N = arr.length;
        var missingNumbers = findMissingNumbers(arr, N);
        System.out.println("This are the missing numbers: " + missingNumbers);
    }
    private static ArrayList<Integer> findMissingNumbers(int[] arr, int N) {
        var list = new ArrayList<Integer>();
        int diff = arr[0];
        for (int i = 0; i < N; i++) {
            if (arr[i] - i != diff)
                while (diff < arr[i] - i) {
                    list.add(i + diff);
                    diff++;
                }
        }
        return list;
    }
//EX6
        private static void ex6(){
            System.out.println("Ex. 6");
            int[] ints = {0,1,1,1,0,0,1,0,0,1,0,0,0};
            sort(ints);
        }
        private static int sort(int[] ints){
            int arr[] = new int[0];
            Arrays.sort(ints);
            System.out.println("The sorted array is: " + Arrays.toString(ints));
            return 0;
        }
        //EX 7
        private static void ex7(){
            System.out.println("Ex. 7");
            randomNumber();
        }
        private static void randomNumber(){
            ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
            Random r = new Random();
            System.out.println("Random Number is: " + list.get(r.nextInt(list.size())));

        }
        //EX 8
    private static void ex8(){
        System.out.println("Ex. 8");
        var list = new ArrayList<Integer>();
        Random num = new Random();
        var listLength = 10;
        for (int i =0; i < listLength; i++){
            Integer a = num.nextInt(100);
            list.add(a);
        }
        var result = totalCost(list);
        System.out.println("The shopping cart: " + list);
        System.out.println("Shopping Cart total: " + result);
    }
    private static String totalCost(ArrayList<Integer> list){
        double preTax = 0;
        preTax = addNumbers(list);
        BigDecimal cart = new BigDecimal(preTax);
        BigDecimal tax = new BigDecimal(1.1);
        BigDecimal postTax = cart.multiply(tax);
        NumberFormat n = NumberFormat.getCurrencyInstance(Locale.US);
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

    //EX 9
    private static void ex9(){
        System.out.println("Ex. 9");
        var result = evenOrOdd();
        if (result % 2 == 0)
            System.out.println("The sum of the array is Even");
        else
            System.out.println("The sum of the array is Odd");
    }
    private static int evenOrOdd(){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        int result = 0;
        for (Integer integer : list) {
            result += integer;
        }
        return result;
    }
    //Ex 10
    private static void ex10(){
        System.out.println("Ex. 10");
        passwordCk();
    }
    private static void passwordCk(){
        Scanner input = new Scanner(System.in);
        System.out.println("""
                        1. A password must have at least ten characters.
                        2. A password consists of only letters and digits.
                        3. A password must contain at least two digits\s
                        Input a password: \s""");
        String string = input.nextLine();
        if (isValid(string)){
            System.out.println("Password is valid: " + string);
        }
        else
            System.out.println("Not a valid password: " + string);
    }
    public static boolean isValid(String password){
        if (password.length() < 10) return false;
        int charCount = 0;
        int numCount = 0;
        for (int i = 0; i < password.length(); i++){
            char charactor = password.charAt(i);
            if(hasNum(charactor)) numCount++;
            else if (hasLetter(charactor)) charCount++;
            else return false;
        }
        return (charCount >= 2 && numCount >= 2);
    }
    public static boolean hasLetter(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }
    public static boolean hasNum(char ch) {
        return (ch >= '0' && ch <= '9');
    }

}











