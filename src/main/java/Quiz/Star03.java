package Quiz;

import java.util.Scanner;

public class Star03 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String a = "*";
        String b = "*";

        System.out.print("최대 별의 갯수 : ");
        int c = s.nextInt();

        for (int i = 1; i <= c; i++) {
            System.out.println(a);
            if (a.length() < c) {
                a = a + b;
            }
        }

        for (int i = c-1; i <= c; i--){
            System.out.println(a.substring(0, i));
        }
    }
}
