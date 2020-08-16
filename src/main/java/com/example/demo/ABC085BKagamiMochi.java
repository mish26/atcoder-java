package com.example.demo;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ABC085BKagamiMochi {
    public static void main(String[] args) {
        // n個の数値の配列が得られる
        // 配列を照準にsortする
        // ループしてincrementする。
        // ただし、ループのn回目とn-1回目の数値が一致していたらincrementしない。鏡餅を重ねない。

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // n回分、sc.nextInt()で取得する
        Integer[] integers = new Integer[n];
        IntStream.range(0, n).forEach(i -> integers[i] = sc.nextInt());

        Arrays.sort(integers);

        int stepCount = 0;
        Integer tmpDiameter = 0;
        for (int i = 0; i <= n-1; i++) {
            if (Objects.equals(i,0)) {
                stepCount++;
                tmpDiameter = integers[i];
                continue;
            }

            if (Objects.equals(tmpDiameter, integers[i])){
                continue;
            }
            tmpDiameter = integers[i];
            stepCount++;
        }

        System.out.println(stepCount);
    }
}

