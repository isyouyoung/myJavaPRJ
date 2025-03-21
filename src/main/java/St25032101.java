// 2025-03-21 금
// 스프링부트 프레임워크 수업

public class St25032101 {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;

        int c = a + b;

        System.out.println(c);

        System.out.println(a + "+" + b + "=" + c);

        System.out.println(a + "+" + b + "=" + a + b);
        // a + b 라서 300 나와야한다고 생각하지만 중간에 문자열이 섞여 있어서 100200으로 나옴

        System.out.println(a + "+" + b + "=" + (a + b));
        // 이렇게 괄호안에 숫자만있는걸로 하나 다시 묶어주니 제대로 300이 나옴
        // 수학이랑 똑같이 괄호안부터 계산하기 때문

        // 즉 더하기가 있어도 그 괄호안에 문자열이 있으면 그냥 붙여서나온다...!
    }
}