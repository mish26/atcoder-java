package com.example.demo;

import java.util.Arrays;
import java.util.Scanner;

public class ABC083BSomeSums {
    /**
     * 1  以上 N 以下の整数のうち、10 進法での各桁の和が A 以上 B 以下であるものの総和を求めてください。
     * 10 1 2
     * 1,2,10
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        // n番目までの数字をループする
        int sum = 0;
        for (int i = 1; i <= n; i++){
            String[] strNums = String.valueOf(i).split("");
            int digitSum = Arrays.stream(strNums).mapToInt(Integer::parseInt).sum();
            if (a <= digitSum && digitSum <= b) {
                sum += i;
            }
        }
        System.out.println(sum);

    }
}
