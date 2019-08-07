package com.lv.java.prebc.homework;
import java.util.Scanner;

public class greetings {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String name = name(s);
        int age = age(s);
        s.close();

        System.out.println("Hello, my name is " + name + ". I am " + age + " years old.");
    }
    private static String name (Scanner s){
        System.out.print("Your name: ");
        return s.next();
    }
    private static int age (Scanner s){
        System.out.print("Your age: ");
        return s.nextInt();
    }

}
