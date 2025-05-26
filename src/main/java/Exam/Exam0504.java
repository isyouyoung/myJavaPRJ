package Exam;

import java.util.ArrayList;
import java.util.List;

public class Exam0504 {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        for (int i = 1; i <= 5 ; i++) {
            a.add(i);
        }

        for (int i : a) {
            System.out.print(i + ", ");
        }

        System.out.println();

        a.forEach(li -> System.out.print(li + ", "));                 // 3세대 ( li : a배열값 복사본(li 값을 따로 지정해도 원본 배열(a)에는 영향을 미치지 못함))

        System.out.println();

        System.out.print(a);                                                 // 배열에 저장된 값
    }
}
