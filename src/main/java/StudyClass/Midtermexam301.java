package StudyClass;

public class Midtermexam301 {
    public static void main(String[] args) {

        int a = 0;

        for (int i = 100; i <= 300; i++) {
            if (i % 5 ==0 || i % 7 ==0) {
                a += i;
            }
        }

        System.out.println(a);

    }
}

// public class Exam06 {
//    public static void main(String[] args) {
//        int sum = 0; // 조건에 맞는 숫자들의 합을 저장할 변수 sum을 0으로 초기화함
//
//        for (int i = 100; i <= 300; i++) { // i를 100부터 300까지 하나씩 증가시키며 반복함
//            if (i % 5 == 0 || i % 7 == 0) { // i가 5의 배수이거나 7의 배수인지 검사함
//                sum += i; // 조건에 맞는 i를 sum에 누적하여 더함
//            }
//        }
//
//        System.out.println("5 또는 7의 배수의 합: " + sum); // 최종적으로 구해진 합을 출력함
//    }
//}