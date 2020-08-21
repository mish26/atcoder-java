package com.example.demo;

import java.util.Scanner;

public class ABC086CTraveling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int tmpT = 0;
        int tmpSumXY = 0;

        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int sumXY = x + y;
            if (t < sumXY) {
                System.out.println("No");
                return;
            }

            // 時間と移動距離の比較
            // 2
            // 3 1 0
            // 6 3 2
            // No
            // 物理的に移動できない
            // 2
            // 4 2 2
            // 6 0 0
            // 絶対値で計算しないと、位置的に旅行できないはずなのに、条件分岐が通らなくなってしまう。
      //      if (t - tmpT < sumXY - tmpSumXY) {
            if (t - tmpT < Math.abs(sumXY - tmpSumXY)) {

                System.out.println("No");
                return;
            }

            // 偶数、奇数の比較
            // 2
            // 5 1 1
            // 10 2 0
            // No
            // 距離的にはたどり着けるが、偶奇の都合で移動できない
            if (!((t % 2 == sumXY % 2))) {
                System.out.println("No");
                return;
            }

            tmpT = t;
            tmpSumXY = sumXY;

         }

        System.out.println("Yes");
    }
}
