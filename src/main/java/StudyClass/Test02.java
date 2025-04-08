package StudyClass;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {

        // 입력받은 값이 홀수인지? = 짝수인지 구분하기
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if (a % 2 == 0) {
            System.out.println("짝수지롱");
        } else {
            System.out.println("홀수지롱");
        }

        sc.close();

    }
}
