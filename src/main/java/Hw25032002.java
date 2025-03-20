// 난생처음 자바프로그래밍
// p76 코드 2-7

public class Hw25032002 {
    public static void main(String[] args) {
        int num1, num2, result;
        //num1 num2를 int(정수형으로) 선언

        num1 = 100;
        num2 = 50;
        //선언한 num1 num2에 각각 숫자 대입

        result = num1 + num2; // result 결과 변수를 선언 => num1 + num2 의 값이므로 150 예정
        System.out.println(num1 + "+" + num2 + "=" + result); // result는 150이므로
        // 예상되는 결과는 100 + 50 = 150

        result = num1 - num2;
        System.out.println(num1 + "-" + num2 + "=" + result);
        // 예상되는 결과는 100 - 50 = 50

        result = num1 * num2;
        System.out.println(num1 + "*" + num2 + "=" + result);
        // 예상되는 결과는 100 * 50 = 5000

        result = num1 / num2;
        System.out.println(num1 + "/" + num2 + "=" + result);
        // 예상되는 결과는 100 / 50 = 2
    }
}
