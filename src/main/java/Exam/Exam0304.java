package Exam;

import java.util.Scanner;

public class Exam0304 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String a, b, c, d, result;

        a = s.next();
        b = s.next();

        c = a + b;
        d = c.toLowerCase();
        result = d.replaceAll(" ","");

        System.out.print(result);
    }
}
