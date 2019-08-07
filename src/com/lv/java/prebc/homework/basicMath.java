package com.lv.java.prebc.homework;
import java.util.Scanner;

public class basicMath {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = num1(s);
        double b = num2(s);
        s.close();
        double sum = sum(a,b);
        double sub = sub(a,b);
        double multi = multi (a, b);
        double div = div (a, b);


        //System.out.println(a);
        //System.out.println(b);
        System.out.println("Sum of " + a+ " and " + b + " is " + sum);
        System.out.println("Subtracting " + a+ " and " + b + " is " + sub);
        System.out.println("Multiplying " + a+ " and " + b + " is " + multi);
        System.out.println("Dividing " + a+ " and " + b + " is " + div);

    }
    private static int num1 (Scanner s){
        System.out.print("Input integer: ");
        return s.nextInt();
    }
    private static double num2 (Scanner s){
        System.out.print("Floating point number: ");
        return s.nextDouble();
    }

    private static double sum (int a, double b){
        double sum  = a+b;
        return sum;
    }
    private static double sub (int a, double b){
        double sub  = a-b;
        return sub;
    }
    private static double multi (int a, double b){
        double multi  = a*b;
        return multi;
    }
    private static double div (int a, double b){
        double div  = a/b;
        return div;
    }
}
