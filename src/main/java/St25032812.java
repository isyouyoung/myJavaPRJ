public class St25032812 {
    
    public static void main(String[] args) {
        
        String str = "     한글   ABCD       efgh         ";
        String cutStr = "";
        String reStr = ""; // 공백 제거를 위해 replaceAll 실행 결과 저장되는 변수
        boolean res;
        
        cutStr = str.trim();
        reStr = str.replaceAll(" ", "");
        res = str.isEmpty(); // 문자열에 값이 존재하는지 체크
        boolean res2 = str.length() == 0;
        // 기존에는 이걸로 길이가 0이면 없는걸로 길이가 1이상이면
        // 무언가 내용이 있는걸로 판단하였고
        // 요즘은 isEmpty();를 활용하기도 함!

        System.out.println(cutStr);
        System.out.println(reStr);
        System.out.println(res);
        System.out.println(res2);
    }
}
