package com.bridgelabz;

import java.util.Scanner;

public class Distance {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a First Value :");
        int x = sc.nextInt();
        System.out.println("Enter a Second Value :");
        int y = sc.nextInt();
        double dist = Math.sqrt(x * x + y * y);
        System.out.println("Distance from (" + x + ", " + y + ") to (0, 0) = " + dist);
    }
}