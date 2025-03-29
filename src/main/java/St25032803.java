// 코드 3-10

import java.util.Scanner;

public class St25032803 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int score;

        System.out.print("필기시험 점수를 입력하세요: ");
        score = s.nextInt();
        System.out.println(score >= 70);

        s.close();
    }
}

// 비교 연산자
// == 같다 왼쪽 값과 오른쪽 값이 같으면 참
// != 왼쪽 값과 오른쪽 값이 다르면 참
// > 크다 왼쪽 값이 오른쪽 값보다 크면 참
// < 작다 왼쪽 값이 오른쪽 값보다 작으면 참
// >= 크거나 같다 왼쪽 값이 오른쪽 값보다 크거나 같으면 참
// <= 작거나 같다 왼쪽 값이 오른쪽 값보다 작거나 같으면 참

// @ 비교연산자는 반드시 결과가 존재한다 @ => 참 or 거짓

// 소문자는 기초데이터 타입 int float double long boolean => 소문자는 int a = 100;
//이렇게 하면 메모리에 올라감 (자동)

//대문자 : 일반객체 반드시 new 사용해서 메모리에 올려줘야함!!!!!!!!!