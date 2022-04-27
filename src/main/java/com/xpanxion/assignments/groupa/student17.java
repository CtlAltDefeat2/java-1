package com.xpanxion.assignments.groupa;


import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.*;


public class student17 {
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
    private static void ex1() {
        System.out.println("Ex. 1");
        int[] ints = {1, 2, 3};
        var list = new ArrayList<Integer>();
        for (int i = 0; i < ints.length; i++) {
            int anInt = ints[i];
            list.add(anInt);
        }
        System.out.println("The sum of the array is: " + addNumbers(list));
    }
    private static Integer addNumbers(ArrayList<Integer> numList) {
        int sum = 0;
        for (int i = 0; i < numList.size(); i++) {
            Integer integer = numList.get(i);
            sum += integer;
        }
        return sum;
    }
    private static void ex2() {
        System.out.println("Ex. 2");
        int[] ints = {1, 2, 3};
        var list = new ArrayList<Integer>();
        for (int anInt : ints) {
            list.add(anInt);
        }
        avgNumbers(list);
        System.out.println("The average value is: " + avgNumbers(list));
    }
    private static Float avgNumbers(ArrayList<Integer> list2) {
        // TODO: Implement this function.
        float avg = 0;
        int sum = 0;
        for (Integer integer : list2) {
            sum += integer;
        }
        avg = sum/list2.size();
        return avg;
    }
    private static void ex3() {
        System.out.println("Ex. 3");
        int[] ints = {1, 2, 3};
        var list = new ArrayList<Integer>();
        for (int i = 0; i < ints.length; i++) {
            int anInt = ints[i];
            list.add(anInt);
        }
        multiply(list);
    }
    private static void multiply(ArrayList<Integer> list) {
        list.replaceAll(integer -> integer * 2);
        System.out.println("This is the doubled Array: " + list);
    }
    private static void ex4() {
        System.out.println("Ex. 4");
        createList(6);
    }
    private static void createList(Integer maxNumber){
        int count = 0;
        var list = new ArrayList<>();
        for(int i = 0; i < maxNumber; i++){
            count++;
            list.add(count);
        }
        System.out.println("Creating a list from a maxNumber: " + list);
    }
    private static void ex5(){
        System.out.println("Ex. 5");
        int[] arr = {1, 2, 3, 5, 6, 9, 11};
        int N = arr.length;
        var missingNumbers = findMissingNumbers(arr, N);
        System.out.println("This are the missing numbers: " + missingNumbers);
    }
    private static ArrayList<Object> findMissingNumbers(int[] arr, int N){
        var list = new ArrayList<>();
        int diff = arr[0];
        for (int i = 0; i < N; i++){
            if(arr[i] - i != diff)
                while (diff < arr[i] - i){
                    list.add(i + diff);
                    diff++;
                }
        }
        return list;
    }
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
    private static void ex7(){
        System.out.println("Ex. 7");
        randomNumber();
    }
    private static void randomNumber(){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        Random r = new Random();
        System.out.println("Random Number is: " + list.get(r.nextInt(list.size())));
    }
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
        //double money = total.doubleValue();
        //BigDecimal is immutable
        if (postTax.doubleValue() < 10 ){
            BigDecimal shipping = new BigDecimal(5);
            BigDecimal total = postTax.add(shipping);
            double money = total.doubleValue();
            String s = n.format(money);
            //BigDecimal cartTotal = new BigDecimal(s);
            return s;
        }
        else if (postTax.doubleValue() > 10 && postTax.doubleValue() < 20){
            BigDecimal shipping = new BigDecimal(4);
            BigDecimal total = postTax.add(shipping);
            double money = total.doubleValue();
            String s = n.format(money);
            //BigDecimal cartTotal = new BigDecimal(s);
            return s;

        }
        else{
            BigDecimal total = postTax;

            double money = total.doubleValue();
            String s = n.format(money);
            //BigDecimal cartTotal = new BigDecimal(s);
            return s;
        }
    }



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
        for (int i = 0; i < list.size(); i++) {
            Integer integer = list.get(i);
            result += integer;
        }
        return result;
    }
    private static void ex10(){
        System.out.println("Ex. 10");
        passwordCk();
    }
    private static void passwordCk(){
        Scanner input = new Scanner(System.in);
        System.out.println(
                        "1. A password must have at least ten characters.\n" +
                        "2. A password consists of only letters and digits.\n" +
                        "3. A password must contain at least two digits \n" +
                        "Input a password (You are agreeing to the above Terms and Conditions.): ");
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
