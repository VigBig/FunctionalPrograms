package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class SumOfThreeIntegersZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of Integers in the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the integers:");
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        tripletsSumZero(arr);

    }

    private static void tripletsSumZero(int[] a) {

        System.out.println("Sum of these 3 integers in the array add up to 0:");

        for(int i=0; i<(a.length-2); i++){
            for(int j=i+1; j<(a.length-1); j++){
                for(int k=j+1; k<a.length; k++){

                    if(a[i]+a[j]+a[k] == 0){
                        System.out.println("("+a[i]+","+a[j]+","+a[k]+")");
                    }

                }
            }
        }

    }
}
