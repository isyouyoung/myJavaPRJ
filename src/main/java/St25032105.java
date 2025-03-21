import java.util.Scanner;

public class St25032105 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n1, n2, res;
        double res1;
        n1 = s.nextInt();
        n2 = s.nextInt();

        res1 = (double) n1 + n2;
        System.out.println(n1 + "+" + n2 + "=" + res1);
        res1 = (double) n1 - n2;
        System.out.println(n1 + "-" + n2 + "=" + res1);
        res1 = (double) n1 * n2;
        System.out.println(n1 + "*" + n2 + "=" + res1);
        res1 = (double) n1 / n2;
        System.out.println(n1 + "/" + n2 + "=" + res1);
        res1 = (double) n1 % n2;
        System.out.println(res1);

        s.close();
        //잔디심기 잘되는지 확인
    }
}
