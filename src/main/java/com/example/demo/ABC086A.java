package com.example.demo;

import java.util.Scanner;

public class ABC086A {
    /**
     * 積が奇数なら Odd と、 偶数なら Even と出力せよ。
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if ((a * b)%2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

    }

}
