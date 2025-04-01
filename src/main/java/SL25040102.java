import java.util.Scanner;

public class SL25040102 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();

        if (a > b){
            System.out.println(">");
        }
        else if(a < b){
            System.out.println("<");
        }
        else {
            System.out.println("==");

            // 꿀팁은 sout 치면 한번에 다나옴!!
            // 특강 1번 문제 백준 https://www.acmicpc.net/problem/1330
        }
    }
}
