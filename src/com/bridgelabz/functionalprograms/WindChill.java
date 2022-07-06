package com.bridgelabz.functionalprograms;

public class WindChill {
    public static void main(String[] args) {

        int t = Integer.parseInt(args[0]);
        System.out.println("Temperature is :"+t +" degrees Fahrenheit");

        int v = Integer.parseInt(args[1]);
        System.out.println("Wind Speed is :"+v+" miles per hour");

        if((Math.abs(t)>50) || (v>120) || (v<3)) {
            System.out.println("Formula is only valid if F (absolute value) is below 50 degrees Fahrenheit ");
            System.out.println("or V is between 3 and 120 mph!");
        }
        else{

            double w = 35.74 + (0.6215 * t) + ((0.4275 * t - 35.75) * Math.pow(v, 0.16));

            System.out.println("The Wind Chill temperature is: " + w + " degrees Fahrenheit");
        }
    }
}
