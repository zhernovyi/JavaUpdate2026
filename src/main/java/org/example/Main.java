package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, QA!");

        int age = 25;
        String name = "Anna";
        System.out.println(name+" "+age);

        for (int i = 1; i <= 10; i++) {
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println(sum(scInt(), scInt()));

    }

    public static int sum(int a, int b){
        return a+b;
    }

    public static int scInt(){
        return new Scanner(System.in).nextInt();
    }
}