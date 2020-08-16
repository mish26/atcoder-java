package com.example.demo;

import java.util.Objects;
import java.util.Scanner;

public class ABC085COtoshidama {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y = sc.nextInt();
        // 1000 * i + 5000 * j + 10000 * k = y
        // i + j + k = n
        // 連立方程式を解くと、
        // 4000j + 9000k = y - 1000n

        if (10000 * n < y) {
            System.out.println(-1 + " " + -1 + " " + -1);
            return;
        }

        int result = y - 1000 * n;

        for (int j = 0; j <= n; j++) {
            for (int k = 0; k <= n; k++) {
                if (Objects.equals(4000 * j + 9000 * k, result)) {
                    int i = n - j - k;
                    if (i < 0) {
                        continue;
                    }
                    System.out.println(k + " " + j + " " + i);
                    return;
                }

            }
        }
        System.out.println(-1 + " " + -1 + " " + -1);
    }
}
