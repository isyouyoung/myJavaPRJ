package Exam;

import java.util.ArrayList;
import java.util.List;

public class Exam0501 {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            a.add(i);
        }
        //2세대
        for (int i : a) {
            System.out.print(i + " ");
        }

        System.out.println();

        //3세대
        a.forEach(li -> System.out.print(li + " "));


    }
}
