package com.lv.java.prebc.homework;

import java.util.Random;
import java.util.Scanner;

public class guessNumber {
    public static void main(String[] args) {

        Random rnd = new Random();
        int randomInt = rnd.nextInt(10) + 1;
//        System.out.println(randomInt);

        Scanner sc = new Scanner(System.in);
        System.out.println(" Random number between 1 and 10 is: ");
        int guessInt = sc.nextInt();
        while (guessInt != randomInt) {
            System.out.println("Wrong! Try again: ");
            guessInt = sc.nextInt();
        }

        System.out.println("Correct! Ramdom number is: " + randomInt);

    }
}
