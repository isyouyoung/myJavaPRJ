import java.util.Scanner;

public class Exam01 {
    public static void main(String[] args) {
        // Scanner 객체 생성 (입력 받기 위함)
        Scanner s = new Scanner(System.in);

        // 정수 a, b 입력 받기
        System.out.print("정수 a 입력: ");
        int a = s.nextInt();

        System.out.print("정수 b 입력: ");
        int b = s.nextInt();

        // 나누기 연산 (소수점 포함)
        double result = (double) a / b;

        // 결과 출력
        System.out.printf("%d / %d = %.1f", a, b, result);

        // Scanner 닫기
        s.close();
    }
}