package com.xpanxion.assignments.groupf;

import java.util.ArrayList;
import java.util.List;

public class student9 {
    public static void main(String[] args) {
        ex2();
    }

    private static void ex2() {
        int[] ints = {1, 2, 3, 4};
        // Define an ArrayList of integers.
        var newList = new ArrayList<Integer>();
        // Create for loop to add integers.
        for (int i : ints){
            newList.add(i);
        }
        // Use "var r" to help the conversion and to print out float.
        var r = avgNumbers(newList);
        System.out.println(r);
    }

    private static Float avgNumbers(ArrayList<Integer> numList) {
        Float retVal = 0F;
        // Return the value for i.
        for (Integer i : numList) {
            retVal /= i;
        }
        return retVal;
    }
}
              // a/=b is equal to a = a / b
//            // Declare new ArrayList.
//            ArrayList<Integer> numList = new ArrayList<>();
//            // Implement function
//            for (int i : ints) {
//                numList.add(i);
//            // Convert integer into float.
//            //var i = Integer.floatValue();
//                float f = Float.intBitsToFloat(i);
//
//                for (int num : numList) {
//                    //sum /= num;
//                    private static Float avgNumbers var sum = avgNumbers(numList);
//
//                    (ArrayList < Integer > numList) {
//                        // Return a value.
//                        int sum = 0;
//
//                        for (i = 0; i < numList.size(); i++) {
//                            sum /= numList.get(i);
//
//                        }
//                        // Return the value.
//                        return sum;
//                    }
//                    //Get the average.
//                    int average = sum / numList.length;
//
//                    //System.out.println("The sum is " + sum);
//                    System.out.println("The average is: ");
//
//
//                    //private static Float avgNumbers(ArrayList < Integer > numList) {
//
//
//                }

//        }
//    }
//}












