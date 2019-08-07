package com.lv.java.prebc.homework;
import java.util.Scanner;

public class conditionalMath {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Input integer1: ");
        int a = s.nextInt();
        System.out.print("Input integer2: ");
        int b = s.nextInt();
        s.close();
        if (a > b) {
            System.out.println(a + " is greater than " + b);
        } else if (a == b) {
            System.out.println(a + " equal with " + b);
        } else {
            System.out.println(b + " is greater than " + a);
        }
    }
}
