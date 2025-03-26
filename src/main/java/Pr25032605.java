import java.util.Scanner;

public class Pr25032605 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("정수 a 입력: ");
        int a = s.nextInt();

        System.out.print("정수 b 입력: ");
        int b = s.nextInt();

        double result = (double) a / b;

        System.out.printf("%d / %d = %.1f", a, b, result);

        s.close();
    }
}