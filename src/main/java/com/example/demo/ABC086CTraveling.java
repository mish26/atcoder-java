package com.example.demo;

import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ABC086CTraveling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // n回分、sc.nextInt()で取得する
        int elementCount = n * 3;
        Integer[] integers = new Integer[elementCount];
        IntStream.range(0, elementCount).forEach(i -> integers[i] = sc.nextInt());

        // t(時間情報)を持つ1次元の配列に、2次元の配列を代入する(key_value?)
        // ２重ループし、その中で総当りで2次元配列
        // 旅行できない時？
        // 2次元配列の要素の合計がtより大きい時
        // 逆にいうと、t( >= 2次元配列の要素の合計)のときは必ず旅行できる。
        // なぜなら、要素のマイナスへの移動が可能だから
        // t(時間情報)が要素が偶数か奇数かで変わってくる

        for (int i = 0; i < elementCount; i++) {
            if (i % 3 == 0) {
                int time = integers[i];
                int elementSum = integers[i+1] + integers[i+2];
                if (time < elementSum) {

                    System.out.println("No");
                    return;
                }
            }
        }

        System.out.println("Yes");
    }
}
