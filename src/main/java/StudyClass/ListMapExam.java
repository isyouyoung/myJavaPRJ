package StudyClass;

import java.util.*;

public class ListMapExam {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 최종 저장되는 List 구조
        List<Map<String, String>> list = new ArrayList<>();

        // List 구조 안에 저장될 Map 객체
        Map<String, String> map = null;

        for (int i = 0; i < 3; i++) { // 3명만 입력

            System.out.print("이름 : ");
            String name = scanner.next();

            System.out.print("이메일 : ");
            String email = scanner.next();

            System.out.print("부서 : ");
            String dept = scanner.next();

            map = new HashMap<>();

            map.put("name", name);
            map.put("email", email);
            map.put("dept", dept);

            list.add(map);

            map = null;
        }

        int listSize = list.size();
        System.out.println("저장된 데이터 수 : " + listSize);
        System.out.println("1세대 반복문");

        for (int i = 0; i < listSize; i++) {
            Map<String, String> rMap = list.get(i);

            System.out.println("name : " +rMap.get("name"));
            System.out.println("email : " +rMap.get("email"));
            System.out.println("dept : " +rMap.get("dept"));
            System.out.println();

            rMap = null;
        }

    }
}
