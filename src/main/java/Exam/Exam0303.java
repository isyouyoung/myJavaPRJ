package Exam;

import java.util.Scanner;

public class Exam0303 {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        String a, b, c, d, result;
        a = sc.next();
        b = sc.next();
//        문자열 합치기
        c = a + b;
//        소문자로 만들기
        d = c.toLowerCase();
//        d = (a + b).toLowerCase();
//        공백처리
        result = d.trim();
//        result = (a + b).toLowerCase().trim();
//        결과 값 출력
        System.out.println(result);

    }
}
