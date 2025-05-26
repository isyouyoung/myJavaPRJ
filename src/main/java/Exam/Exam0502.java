package Exam;

import java.util.*;

public class Exam0502 {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>(List.of(1, 2, 3, 4, 5));

        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i) + " ");
        }
        System.out.println();

        for (int n : a) {
            System.out.print(n + " ");
        }
    }
}
