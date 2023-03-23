package com.csi.controller;

public class ArithmaticApplication {

    public static void main(String[] args) {

        System.out.println("\n Addition result: " + add(5, 6) + "\n Substraction result : " + sub(10, 5) + "\n Multiplication result : " + mul(4, 2) + "\n Division Result: " + div(10, 2));
    }

    public static int add(int n1, int n2) {

        return n1 + n2;
    }

    public static int sub(int n1, int n2) {

        return n1 - n2;
    }

    public static int mul(int n1, int n2) {

        return n1 * n2;
    }

    public static int div(int n1, int n2) {

        return n1 / n2;
    }
}
