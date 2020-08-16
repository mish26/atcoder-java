package com.example.demo;

import java.util.Arrays;
import java.util.Scanner;

public class ABC081A {

    /**
     * すぬけ君は 1,2,3 の番号がついた 3 つのマスからなるマス目を持っています。
     * 各マスには 0 か 1 が書かれており、マス i には si が書かれています。
     * すぬけ君は 1 が書かれたマスにビー玉を置きます。 ビー玉が置かれるマスがいくつあるか求めてください。
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] strArray = a.split("");
        System.out.println(Arrays.stream(strArray).mapToInt(Integer::parseInt).sum());
    }
}
