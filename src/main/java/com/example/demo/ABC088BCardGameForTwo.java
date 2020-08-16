package com.example.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ABC088BCardGameForTwo {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // n回分、sc.nextInt()で取得する
        Integer[] integers = new Integer[n];
        IntStream.range(0, n).forEach(i -> integers[i] = sc.nextInt());

        Arrays.sort(integers, Collections.reverseOrder());
        // 与えられた数列を降順にsortする
        // sortしたものを大きい順に取得していく
        // 取得順番は、aliceとbob
        // aliceは奇数番目、bobは偶数番目 ループのincrementでif文で分岐する
        // aliceとbobがそれぞれ獲得したものを合計し、alice合計 - bob合計を出力する

        int i = 0;
        int bobSum = 0;
        int aliceSum = 0;
        for (Integer integer : integers) {
            i++;
            if (i % 2 == 0) {
                bobSum += integer;
            } else {
                aliceSum += integer;
            }
        }
        System.out.println(aliceSum - bobSum);

    }
}
