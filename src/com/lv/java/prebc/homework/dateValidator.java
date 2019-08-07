package com.lv.java.prebc.homework;

import java.util.Scanner;

public class dateValidator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input number of date: ");
        int date = sc.nextInt();
        //parbaude uz datumu 1-31
        while ((date < 1) || date > 31) {
            System.out.println("Not number of date");
            System.out.print("Try again. Input number of date: ");
            date = sc.nextInt();
        }
        System.out.print("Input number of month: ");
        int month = sc.nextInt();

        //parbaude uz menesi 1-12
        while ((month < 1) || month > 12) {
            System.out.println("Not number of month");
            System.out.print("Try again. Input number of month: ");
            month = sc.nextInt();
        }
        sc.close();
        System.out.println(date);
        System.out.println(month);

        //parbaude vai datums atbilst menesim
        String message = "Not valid date for this month.";
        if ((month == 2) && (date > 28)) {
            System.out.println(message);
        }
        if ((month == 4 || month == 6 || month == 9 || month == 11) && (date > 30)) {
            System.out.println(message);
        }

        String monthInString = "";
        switch (month) {
            case 1:
                monthInString = "January";
                break;
            case 2:
                monthInString = "February";
                break;
            case 3:
                monthInString = "March";
                break;
            case 4:
                monthInString = "April";
                break;
            case 5:
                monthInString = "May";
                break;
            case 6:
                monthInString = "June";
                break;
            case 7:
                monthInString = "July";
                break;
            case 8:
                monthInString = "August";
                break;
            case 9:
                monthInString = "September";
                break;
            case 10:
                monthInString = "October";
                break;
            case 11:
                monthInString = "November";
                break;
            case 12:
                monthInString = "December";
                break;
            default:
                break;
        }
        System.out.println(date + ". " + monthInString);


    }
}
