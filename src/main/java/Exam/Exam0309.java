package Exam;

import java.util.Scanner;

public class Exam0309 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String a = s.next();
        String b = s.next();

        String result = (a+b).toLowerCase().replaceAll(" ","");
        System.out.print(result);

        s.close();
    }
}