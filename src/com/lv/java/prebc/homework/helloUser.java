package com.lv.java.prebc.homework;

import java.util.Scanner;

public class helloUser {

    public static void main(String[] args) {

        String peopleName = input();
        int spaceIndex = peopleName.indexOf(" ");
        String name = peopleName.substring(0, spaceIndex);
        String nameOutput = name.trim();
        nameOutput = nameOutput.substring(0, 1).toUpperCase() + nameOutput.substring(1).toLowerCase();
        System.out.print("'" + nameOutput + " ");

        String surname = peopleName.substring(spaceIndex, peopleName.length());
        String surnameOutput = surname.trim();
        surnameOutput = surnameOutput.toUpperCase();
        System.out.println(surnameOutput + "'");
    }

    private static String input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your name and surname: ");
        String peopleName = sc.nextLine();
        sc.close();
        peopleName = peopleName.trim();
        return peopleName;
    }

}