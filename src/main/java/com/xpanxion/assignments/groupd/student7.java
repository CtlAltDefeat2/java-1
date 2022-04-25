package com.xpanxion.assignments.groupd;

import java.util.Scanner;

public class student7 {
    public static void main(String[] args) {

        ex1();
    }

    private static void ex1() { //turn a person name into all uppercase
        System.out.println("Ex. 1");
        System.out.print("Enter Name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(name.toUpperCase());


    }

    private static void ex2() {
        System.out.println("Ex. 2");
    }

    private static void ex3() {
        System.out.println("Ex. 3");
    }
}
