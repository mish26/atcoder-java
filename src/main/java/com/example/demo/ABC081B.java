package com.example.demo;

import java.util.Scanner;
import java.util.stream.IntStream;

public class ABC081B {

    /**
     * すぬけ君は，黒板に書かれている整数がすべて偶数であるとき，次の操作を行うことができます．
     *
     * 黒板に書かれている整数すべてを，
     * 2 で割ったものに置き換える．
     * すぬけ君は最大で何回操作を行うことができるかを求めてください．
     *
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // n回分、sc.nextInt()で取得する
        int[] intArray = new int[n];
        IntStream.range(0, n).forEach(i -> intArray[i] = sc.nextInt());

        // 取得した数値を一つずつ2で割る。
        // n回分2で割り切れるか確認する。割り切れたらインクリメントする。
        // その際割った値を別の配列に詰めておく。→同じ配列に詰め直しで良かった
        // 割り切れなかったら止める
        int allDivideCount = 0;

        while (true) {

            int arrayDivideCount = 0;
            // int配列を一個ずつ2で割り切れるか確認して、2で割った値に置き換える
            for (int value : intArray) {
                if (value % 2 == 0) {
                    intArray[arrayDivideCount] = value / 2;
                    arrayDivideCount++;
                }
            }

            if (arrayDivideCount == n) {
                allDivideCount++;
            } else {
                break;
            }
        }
        System.out.println(allDivideCount);

    }
}
