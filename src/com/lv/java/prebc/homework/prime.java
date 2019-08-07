package com.lv.java.prebc.homework;

public class prime {
    public static void main(String[] args) {
        int number = 100;
        for (int i = 2; i < number; i++) {

            boolean flag = false;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                System.out.print(i);
                System.out.print(", ");
            }
        }

    }
}
