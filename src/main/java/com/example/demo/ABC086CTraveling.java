package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ABC086CTraveling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int elementCount = n * 3;

        Integer[] integers = new Integer[elementCount];
        IntStream.range(0, elementCount).forEach(i ->
                integers[i] = sc.nextInt());

        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            Integer t = integers[i];
            List<Integer> integerList =  new ArrayList<>(2);
            integerList.add(integers[i+1]);
            integerList.add(integers[i+2]);
            map.put(t, integerList);
            i += 2;
         }


        // t(時間情報)を持つ1次元の配列に、2次元の配列を代入する(key_value?)
        // ２重ループし、その中で総当りで2次元配列
        // 旅行できない時？
        // 2次元配列の要素の合計がtより大きい時
        // 逆にいうと、t( >= 2次元配列の要素の合計)のときは必ず旅行できる。
        // なぜなら、要素のマイナスへの移動が可能だから
        // t(時間情報)が要素が偶数か奇数かで変わってくる
        // 5 1 1
        // 10 1 1

        // tの値をどこかに保存して上げる必要がある
        // 前回のtの値が偶数か奇数かどうか、xとyの合計値が偶数か奇数かどうかを持っておく
        // 前回の偶数かどうか奇数かどうかを持っておいて、奇数偶数が一致するかどうか比較する。ただし、t1が偶数で、t2が奇数の場合、xとyの奇数偶数も反転する
        // 次のt-前回のt と次回のxとyの合計値-前回のxとyの合計値を比較する
        // t2 - t1 < (x2 + y2) - (x1 + y1)

        int tmpTime = 0;
        int tmpSumXY = 0;
        Map<Boolean,Boolean> tmpBooleanMap = new HashMap<>();
        boolean tmpTimeIsEnv = false;
        boolean tmpSumXYIsEnv = false;

        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + " : " + entry.getValue());
            int time = entry.getKey();
            int sumXY = entry.getValue().stream().mapToInt(s -> s).sum();
            boolean timeIsEnv = (time % 2 == 0);
            boolean sumXYIsEnv = (sumXY % 2 == 0);

            if (time < sumXY) {
                System.out.println("No");
                return;
            }

            // 時間と移動距離の比較
            // 2
            // 3 1 0
            // 6 3 2
            // No
            // 物理的に移動できない
            if (time - tmpTime < sumXY - tmpSumXY) {
                System.out.println("No");
                return;
            }

            // 偶数、奇数の比較
            // 2
            // 5 1 1
            // 10 2 0
            // No
            // 距離的にはたどり着けるが、偶奇の都合で移動できない
            if ((timeIsEnv == tmpTimeIsEnv && sumXYIsEnv == tmpSumXYIsEnv) || (timeIsEnv == tmpSumXYIsEnv && sumXYIsEnv == tmpTimeIsEnv)) {

            } else {
                System.out.println("No");
                return;
            }
/*
            Map<Boolean,Boolean> booleanMap = new HashMap<>();
            booleanMap.put(timeIsEnv, sumXYIsEnv);

            if (!booleanMap.equals(tmpBooleanMap)) {
                if (!(Objects.equals(timeIsEnv,tmpSumXYIsEnv) && Objects.equals(sumXYIsEnv,tmpTimeIsEnv))) {
                    System.out.println("No");
                    return;
                }
            }*/

            // 前回の値の一時保存
            tmpTime = time;
            tmpSumXY = sumXY;

            tmpTimeIsEnv = (time % 2 == 0);
            tmpSumXYIsEnv = (sumXY % 2 == 0);
//            tmpBooleanMap.put(tmpTimeIsEnv, tmpSumXYIsEnv);
        }

        System.out.println("Yes");
    }
}
