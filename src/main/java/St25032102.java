public class St25032102 {
    public static void main(String[] args) {
        int num1, num2, result;
        num1 = 100;
        num2 = 60;

        float res, res2;

        result = num1 / num2;
        // 정수 나누기 정수 = 정수 => 답 = 1
        res = num1/ num2;
        // 정수 나누기 정수 => 1인대 => res타입 즉 실수타입으로 변경 => 1.0
        res2 = (float) num1 / num2;
        // 원래는 정수나누기 정수인대 그걸바로 실수로 바꿔서 res2 (실수에) 넣었음 => 1.666

        System.out.println(num1 + "/" + num2 + "=" +result);
        System.out.println(num1 + "/" + num2 + "=" +res);
        System.out.println(num1 + "/" + num2 + "=" +res2);
    }
}
