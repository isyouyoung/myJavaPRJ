package StudyClass.Class250508;

public class St25052202 {

    // f(x) = y
    // f(x) = 2x+1
    // f(1) = 3
    // f = 함수(2x+!)    x = 입력값(1)     y = 결과 값(3)

    static int hap_para(int v1, int v2) {
        int result;
        result = v1 + v2;
        return result;
    }
              // f(함수)   (          x            )(입력값)
    static Long hap_para(int v1, int v2, Long v3) {
    // 메모리o 롱타입 메서드(함수이름) (파라미터,매개변수,인자)
        Long result;
        result = v1 + v2 + v3;
        return result;
    }

    public static void main(String[] args) {
 // 공공의  메모리O 1회용 메인 (함수실행) void가 1회용이니까 반복x
        int hap;
        hap = hap_para(10, 20);
        System.out.println("매개변수 2개 메서드 호출 결과 ==> " + hap);

        Long hap3 = hap_para(10, 20, 30L);
        System.out.println("매개변수 3개 메서드 호출 결과 ==> " + hap3);

            // y
        Long hap2 = hap_para(10, 20, 30L);
        System.out.println(hap2);
    }
}