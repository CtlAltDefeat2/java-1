package com.xpanxion.assignments.groupd;

public class student19 {
    public static void main(String[] args) {
        //ex1();
        ex2();
        //System.out.println("Hello My name is Raji Mallina");
    }

    private static void ex1() {
        String str = "Raji Mallina";
        //Converting above input string to
        //Uppercase letters to UpperCase method
        String strup = str.toUpperCase();
        //print uppercased string
        System.out.println(strup);

    } {
        System.out.println("Ex. 1");
}

    private static void ex2() {
        String str = "Raji1 Mallina";
        int count = 0, upper = 0, lower = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                upper++;
            else if (ch >= 'a' && ch <= 'z')
                lower++;

        }
        System.out.println("Lower case letters : " + lower);
        System.out.println("Upper case letters : " + upper);



        System.out.println("Ex. 2");
    }

    private static void ex3() {
        System.out.println("Ex. 3");
    }
}
