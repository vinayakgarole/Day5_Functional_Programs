package com.bridgelabz;

import java.util.Scanner;

public class WindChill {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a First Value: ");
        int t = sc.nextInt();
        System.out.println("Enter a Second Value :");
        int v = sc.nextInt();

        double windChillTemp = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
        System.out.println(windChillTemp);
    }
}