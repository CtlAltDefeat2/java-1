package com.xpanxion.assignments.groupa;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.stream.*;
public class student3 {
    public static void main(String[] args) {
        ex1();
        ex2();
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
        {
        }
    }
}


