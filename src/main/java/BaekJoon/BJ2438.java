package BaekJoon;

import java.util.Scanner;

public class BJ2438 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// 2025-04-08 2학년 선배님들 특강 문제2
// 별짓기 문제 => 풀이 및 이해완료
// 일단 } } 괄호 때문에 질문
