package com.example.demo;

import java.util.Scanner;

public class ABC049CDaydream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        // 入力された文字列のチェック
        // 入力された文字列を、dreamer、eraserで消していく。
        // もし、dreamer、eraserで消せなかったら、dream,eraseで消す。
        // もし消し残りがあった場合、NOと出力する
        // すべての入力文字列が消せた場合、YESと出力する
        // erが曲者
        // dreameraseeraser
        // dreamerasererasedreameraseeraser

        while (true) {
             if(s.startsWith("dreameraser")) {
                 s = s.replaceFirst("dreameraser", "");
             } else if (s.startsWith("dreamerase")) {
                 s = s.replaceFirst("dreamerase", "");
             } else if (s.startsWith("eraser")) {
                 s = s.replaceFirst("eraser", "");
             } else if (s.startsWith("dreamer")) {
                 s = s.replaceFirst("dreamer", "");
             } else if (s.startsWith("erase")) {
                 s = s.replaceFirst("erase", "");
             } else if (s.startsWith("dream")) {
                 s = s.replaceFirst("dream", "");
             } else {
                 break;
             }
        }

        if (s.length() == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
