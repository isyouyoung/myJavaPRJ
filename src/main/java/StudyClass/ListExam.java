package StudyClass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExam {


    public static void main(String[] args) {

        List<String> list = new ArrayList<>(); // ArrayList 구현 방식으로 메모리에 올리기
        // 뒤에 new ArrayList를 LinkedList로 바꾸어도 오류 안남!!!!!!!!!!!!!!

        // List 객체에 데이터 추가하기
        list.add("이협건");
        list.add("정대현");
        list.add("이아민");
        list.add("박준영");
        list.add("김영광");
        list.add("최준영");
        list.add("지용스");
        list.add("주우스");
        list.add("정훈스");

        // List 저장된 데이터 수
        int listSize = list.size();


        System.out.println("저장된 데이터 수 : " + listSize);

        System.out.println("1세대 반복문");

        for (int i = 0; i < listSize; i++) {
            System.out.println("이름 " +list.get(i));

        }

        System.out.println("2세대 반복문");

        for (String name : list) {
            System.out.println("이름 : " + name);

        }

        System.out.println("3세대 반복문");
        list.forEach(name -> System.out.println("name : " + name));


        System.out.println("4세대 반복문");

        list.parallelStream().forEach(name -> System.out.println("name : " + name));

        System.out.println("1.5세대 반복문");

        Iterator<String>it = list.iterator();

        while (it.hasNext()) {
            String name = it.next();
            System.out.println("이름 : " + name);
        }
    }
}
