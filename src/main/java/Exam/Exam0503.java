package Exam; // 이 파일이 Exam 폴더(패키지)에 있다는 뜻이에요

import java.util.ArrayList; // 숫자를 여러 개 저장할 수 있는 ArrayList를 가져와요
import java.util.List;       // List는 숫자 목록을 만들기 위한 인터페이스(설계도)예요

public class Exam0503 { // 클래스 이름이에요. 이 파일의 이름과 같아야 해요!
    public static void main(String[] args) {
        // 정수형 숫자들을 저장할 수 있는 리스트 a를 만들어요
        List<Integer> a = new ArrayList<>();

        // 1부터 5까지 숫자를 리스트에 하나씩 저장해요
        for (int i = 1; i <= 5; i++) {
            a.add(i);// 리스트에 숫자 추가 (1, 2, 3, 4, 5)
        }

        // 🌟 출력 방법 1 : 2세대 for문 (향상된 for문)
        // 리스트 안에 있는 숫자를 하나씩 꺼내서 i에 넣고 출력해요
        for (int i : a) {
            System.out.print(i + ", "); // 숫자를 한 줄로 출력 (공백으로 구분)
        }

        System.out.println(); // 줄바꿈 한 번 해요 (다음 줄로 내려가기)

        // 🌟 출력 방법 2 : 3세대 for문 (람다식 forEach)
        // 리스트에 들어있는 각 숫자를 li라고 부르면서 출력해요
        a.forEach(li -> System.out.print(li + ", ")); // 람다식을 이용한 출력 방식이에요
    }
}
