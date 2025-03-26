import java.util.Scanner;

public class Pr25032601 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("정수 a 입력: ");
        int a = scanner.nextInt();

        System.out.print("정수 b 입력: ");
        int b = scanner.nextInt();

        double result = (double) a / b;

        System.out.printf("%d / %d = %f", a, b, result);

        scanner.close();





    }
}
