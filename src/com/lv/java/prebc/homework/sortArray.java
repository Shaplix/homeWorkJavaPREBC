package com.lv.java.prebc.homework;

import java.util.Random;
import java.util.Scanner;

public class sortArray {

    public static void main(String[] args) {

        System.out.print("Number between 20 and 40: ");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        while (m < 20 || m > 40) {
            System.out.print("Wrong number. Try again: ");
            m = sc.nextInt();
        }
        //System.out.println(m);
        int[] arr = new int[m];

        for (int i = 0; i < arr.length; i++) {
            Random rnd = new Random();
            arr[i] = rnd.nextInt(90) + 10;
            StringBuilder str = new StringBuilder();
            str.append(arr[i]);
            if (i<arr.length-1)
                str.append(", ");
            System.out.print(str);


        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j - 1] > arr[i]) {
                    int x = arr[j - 1] + arr[i];
                    arr[i] = arr[j - 1];
                    arr[j - 1] = x - arr[i];
                }
            }
        }
        System.out.println(" ");
        for (int i = 0; i < arr.length; i++) {
            StringBuilder str=new StringBuilder();
            str.append(arr[i]);
            if (i<arr.length-1)
                str.append(", ");
            System.out.print(str);
        }
    }
}
