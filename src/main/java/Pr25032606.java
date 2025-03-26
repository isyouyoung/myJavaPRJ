import java.util.Scanner;

public class Pr25032606 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("정수 a 를 입력하세요 : ");
        int a = s.nextInt();

        System.out.print("정수 b 를 입력하세요 : ");
        int b = s.nextInt();

        double result = (double) a / b;

        System.out.printf("%d / %d = %.1f", a, b, result);

        s.close();
    }
}