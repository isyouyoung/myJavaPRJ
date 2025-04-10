package BaekJoon;

import java.util.Scanner;


public class BJ5523 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int round = sc.nextInt();
        int atotal = 0;
        int btotal = 0;

        for (int i = 0; i < round; i++) {

            int apoint = sc.nextInt();
            int bpoint = sc.nextInt();
            if (apoint > bpoint) {
                atotal+=1;
            } else if (bpoint > apoint) {
                btotal += 1;
            } else {
            }
        }

        System.out.print(atotal + " " + btotal);

    }
}
// 2025-04-08 2학년 선배님들 특강 문제4
