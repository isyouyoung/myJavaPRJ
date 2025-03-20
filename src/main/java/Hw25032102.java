// 난생처음 자바프로그래밍
// p88 코드 2-10
// 값을 입력받는 Scanner 클래스

import java.util.Scanner; // 자바의 유틸인 스캐너를 사용하기 위해 임포트

public class Hw25032102 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // 스캐너 s를 쓰겠다? 라는 의미인듯 13번째줄이랑 16번째줄 s가 반드시 동일필요

        int num;

        System.out.println("정수를 입력하세요 :");

        num = s.nextInt();
        System.out.println("사용자가 입력한 값 ==> " + num);

        s.close(); // 스캐너 끄기? 생략가능함
    }
}