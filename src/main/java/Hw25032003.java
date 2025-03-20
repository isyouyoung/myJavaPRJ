// 난생처음 자바프로그래밍
// p78 코드 2-8

public class Hw25032003 {
    public static void main(String[] args) {
        String str1 = "난생처음";
        String str2 = "자바";

        System.out.print(str1); // 난생처음출력
        System.out.println(str2);// 자바가 붙어서 나옴 이유는 println 에서 ln이 없으면 붙여서 나오기 때문

        String result = str1 + str2;// 난생처음 + 자바 를 result에 넣었음

        System.out.println(result); // result 출력
    }
}
