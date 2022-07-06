package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Roots (A,B,C) of Equation A(x^2) +B(x) +C  :");

        System.out.println("Enter A value:");
        int a = sc.nextInt();

        System.out.println("Enter B value:");
        int b = sc.nextInt();

        System.out.println("Enter C value:");
        int c = sc.nextInt();

        quadraticRoots(a,b,c);


    }

    private static void quadraticRoots(int a, int b, int c) {

        int delta = b*b - 4*a*c;
        double root1 = (-b + Math.sqrt(delta))/(2*a);
        double root2 = (-b - Math.sqrt(delta))/(2*a);

        System.out.println("The Quadratic roots of equation "+a+"(x^2) +"+b+"(x) +"+c+" are : " + root1 +" and "+root2);
    }
}
