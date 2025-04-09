package BaekJoon;

import java.util.Scanner;

public class BJ2439 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for (int i = 0; i < a; i++) {
            for (int j = i; j < a - 1; j++) {
                System.out.print(" "); // 공백 찍기
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// 2025-04-08 2학년 선배님들 특강 문제3
// 역별찍기
