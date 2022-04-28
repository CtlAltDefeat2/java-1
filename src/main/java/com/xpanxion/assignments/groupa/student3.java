package com.xpanxion.assignments.groupa;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class student3 {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
    }

    private static void ex1() {
        System.out.println("Ex. 1");
        int[] arr = {1,2,3}; //has to determine size before
        int sum = 0;
        var arrayl = new ArrayList<Integer>(); // can change size
            for (int i = 0; i < arr.length ; i++) { //while i<arr.length keep doing this
                arrayl.add(arr[i]);

            }
        System.out.println("sum of numbers in array:" + addNumbers(arrayl));
        
        }

        private static Integer addNumbers(ArrayList<Integer> numList) {
            var sum = 0;
            for (int i = 0; i < numList.size() ; i++) {
                sum += numList.get(i);
            }
            // TODO: Implement this function.
            return sum;
        }

    private static void ex2() {
            System.out.println("Ex. 2");
        int[] ints = {1, 2, 3};
        int length = ints.length;
        int sum = 0;
        for (int i = 0; i <ints.length; i++) {
            sum += ints[i];
        }
        double average = sum / length;
        System.out.println("Average of the array is:" +average);
        }



    private static void ex3() {
        System.out.println("Ex. 3");
        int[] arr = {1, 2, 3};
        int sum = 0;
        var arrayl = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++){
            arrayl.add(arr[i]);
        }
        doubleNumber(arrayl);
    }
    private static void doubleNumber(ArrayList<Integer> numList){
        for (int i = 0; i < numList.size() ; i++) {
           numList.set(i, numList.get(i)*2);
        }
        System.out.println(numList);
    }
}







