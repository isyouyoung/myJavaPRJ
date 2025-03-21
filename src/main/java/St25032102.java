public class St25032102 {
    public static void main(String[] args) {
        int num1, num2, result;
        num1 = 100;
        num2 = 50;

        result = num1 + num2;
        System.out.println(num1 + "+" + num2 + "=" +result);
        // +랑 = 문자열이 들어가 있으므로 100+50= 까지나오고 result = 150이므로 150이 나옴

        result = num1 - num2;
        System.out.println(num1 + "-" + num2 + "=" +result);
        // 똑같이 문자열이 들어가있으므로 100-50= 까지 출력되고 
        // 새로운 변수로 선언한 result인 50이 나옴

        result = num1 * num2;
        System.out.println(num1 + "*" + num2 + "=" +result);
        // 역시 100*50까지 출력 새롭게 선언한 result 값인 5000 출력

        result = num1 / num2;
        System.out.println(num1 + "/" + num2 + "=" +result);
        // 이역시 똑같음
        
        // 커밋 및 푸쉬 오류중
    }
}
