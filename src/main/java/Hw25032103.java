// 난생처음 자바프로그래밍
// p90 코드 2-11
// 값을 입력받는 Scanner 클래스

import java.util.Scanner; // 자바의 유틸인 스캐너를 사용하기 위해 임포트

public class Hw25032103 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // 스캐너 s를 쓰겠다? 라는 의미인듯 13번째줄이랑 16번째줄 s가 반드시 동일필요

        double num; //(기존 int에서 double 타입으로 교체 실수 사용을 위해)
        System.out.print("실수를 입력하세요 : ");
        num = s.nextDouble();
        System.out.println("사용자가 입력한 값 ==> " + num);

        String str; // str은 스트링 타입이다 문자열
        System.out.print("문자열을 입력하세요 : ");
        str = s.next(); // 스트링 타입으로 문자열을 입력받는다
        System.out.println("사용자가 입력한 값 ==> " + str);

        s.close(); // 스캐너 끄기? 생략가능함
    }
}