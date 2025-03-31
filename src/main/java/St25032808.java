public class St25032808 {
    public static void main(String[] args) {
        String str = "난생처음 자바";
        int len;

        len = str.length();

        System.out.println("문자열 : " + str);
        System.out.println("문자열 길이 : " + len);
    }
}

// p165 코드 4-10
// 교재에는 문자열의 길이가 8이라고 나와있지만 실제로는 7임
// 난생처음 4 + 띄어쓰기 1 + 자바 2 = 7
