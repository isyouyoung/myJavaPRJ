package StudyClass;

import java.util.Scanner;

public class St25050802 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] numAry = new int[4];
        int hap = 0;

        for (int i = 0; i < 4 ; i++) {
            System.out.print("숫자 : ");
            numAry[i] = s.nextInt();
        }

//        hap = numAry[0] + numAry[1] + numAry[2] +numAry[3];
// 반복문으로 만들어보기
        for (int i = 0; i < numAry.length; i++) {
            hap += numAry[i];
        }
        System.out.println("합계 ==> " + hap);

        s.close();
    }
}
