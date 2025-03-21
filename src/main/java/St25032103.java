import java.util.Scanner;
// 가져옵니다 자바폴더안에 유틸볼더안에 스캐너를

public class St25032103 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //S로 시작해서 클래스 s 는 변수명이고
        // new는 클래스에 다 붙임 유일하게 String만 예외!! <= 많이쓰여서
        // System.in 은 입력값

        int num;

        num = s.nextInt();
        System.out.println("사용자가 입력한 값 ==> " +num);
        // 여기 System도 대문자라서 클래스고
        // 램에 올려야하는대 자바에서 올리는방법이 두가지임
        // static 방법과 new 방법 등 곧 배울예정

        s.close();
    }
}
