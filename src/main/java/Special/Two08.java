package Special;

import java.util.Scanner;

public class Two08 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int T = s.nextInt();


        for (int i = 0; i < T; i++) {
            int a = s.nextInt();
            int b = s.nextInt();
            int result = (a+b);
            System.out.println(result);
        }

    }
}
