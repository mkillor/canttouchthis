package com.company.killoran;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hammertime!");
        System.out.println("does this work?");

        Scanner input = new Scanner(System.in);
        System.out.println("Type your name here:");
        String name = input.nextLine();
        System.out.println("Hello" + name);
    }
}
