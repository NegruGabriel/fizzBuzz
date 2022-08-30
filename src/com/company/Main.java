package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce ce numar doresti");
        int yourNumber = sc.nextInt();

        if (yourNumber % 3 == 0 && yourNumber % 5 == 0) {
            System.out.println("Fizz Buzz");
        }
        else if (yourNumber % 3 == 0) {
            System.out.println("fizz");
        }
        else if (yourNumber % 5 == 0) {
                System.out.println("Buzz");
            }
        else {
            System.out.println(yourNumber);
        }
    }
}
