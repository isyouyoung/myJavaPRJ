package StudyClass;

import java.util.Scanner;

public class Code509 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int select;

        System.out.print("1~3중에 선택하세요 : ");
        select = s.nextInt();

        switch(select) {
            case 1:
                System.out.println("1을 선택하였습니다.");
//                break;
            case 2:
                System.out.println("2을 선택하였습니다.");
//                break;
            case 3:
                System.out.println("3을 선택하였습니다.");
//                break;
            default:
                System.out.println("이상한 것을 선택했습니다.");
        }

        s.close();
    }
}

// select 에는 case에 적어둔 1 2 3만 들어갈수 있음!
