public class St25032802 {
    public static void main(String[] args) {
        int num = 20;

        num++ ; System.out.print(num+" ");
        // ++는 기존 넘 20에서 매번 1씩 더하라는 뜻 => 21
        num-- ; System.out.print(num+" ");
        // num은 21인 상황에서 --는 1씩 빼라는 뜻 => 20
        num += 3 ; System.out.print(num+" ");
        // num이 20인 상황에서 매번 +3씩 더하라는 뜻 => 23
        num -= 3 ; System.out.print(num+" ");
        // num이 23인 상황에서 매번 3씩 빼라는뜻 => 20
        num *= 3 ; System.out.print(num+" ");
        // num이 20인 상황에서 매번 3씩 곱하라는 뜻 => 60
        num /= 3 ; System.out.print(num+" ");
        // num이 60인 상황에서 매번 3으로 나누라는 뜻 => 20
        num %= 3 ; System.out.print(num+" ");
        // num이 20인 상황에서 3로 나누고 나머지의 값 => 2
    }
}
