// 난생처음 자바프로그래밍
// p79 코드 2-9

public class Hw25032101 {
    public static void main(String[] args) {
        int number1 = 10, number2 = 20; // 인트인 넘버1/10 넘버2/20 선언
        int resAdd;
        int resSub;
        int resMul;
        double resDiv; // 인트시 0이 나옴 double 실수로 바꿔줘야 소숫점까지 나옴

        resAdd = number1 + number2;
        resSub = number1 - number2;
        resMul = number1 * number2;
        resDiv = (double) number1/ number2; // 여기도 마찬가지 여기서 int로 해버리면 0.0// 으로 나옴

        System.out.println(number1 + "+" + number2 + "=" + resAdd);
        System.out.println(number1 + "-" + number2 + "=" + resSub);
        System.out.println(number1 + "x" + number2 + "=" + resMul);
        System.out.println(number1 + "/" + number2 + "=" + resDiv);
    }
}