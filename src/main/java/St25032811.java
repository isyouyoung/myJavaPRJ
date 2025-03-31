public class St25032811 {
    public static void main(String[] args) {

        String str = "   한글    ancd   efgh   ";
        String cutStr = "";

        cutStr = str.trim();

        System.out.println("기존 문자열 ==> [" + str + "]");
        System.out.println("앞뒤 공백 제거 ==> [" + cutStr + "]");
    }
}
// 맨 앞과 맨뒤 공백만 제거하고 가운대에 있는 공백 제거가 아님
// 4-13
