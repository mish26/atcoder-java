package com.example.demo;

import java.util.Scanner;

public class ABC087BCoins {
    /**
     * あなたは、500 円玉を A 枚、100 円玉を B 枚、50 円玉を C 枚持っています。
     * これらの硬貨の中から何枚かを選び、合計金額をちょうど X 円にする方法は何通りありますか。
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a500Count = sc.nextInt();
        int b100Count = sc.nextInt();
        int c50Count = sc.nextInt();
        int xSum = sc.nextInt();

        // 全探索で合計する
        int pattermMatchCount = 0;
        for (int i = 0; i <= a500Count; i++){

            for (int j = 0; j <= b100Count; j++){

                for (int k = 0; k <= c50Count; k++){
                    int total = i * 500 + j * 100 + 50 * k;
                    if (total == xSum) {
                        pattermMatchCount++;
                    }

                }

            }

        }
        System.out.println(pattermMatchCount);
    }
}
