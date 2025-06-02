package StudyClass.Class250508;

public class St25052201 {
    static int para2_method(int v1, int v2) {
        int result;
        result = v1 + v2;
        return result;
    }

    // 이거 실행하는 방법???
    public int para2_method2(int v1, int v2, int v3) {
        int result;
        result = v1 + v2 + v3;
        return result;
    }

    public static void main(String[] args) {
        int hap;
        hap = para2_method(10, 20);
        System.out.println("매개변수 2개 메서드 호출 결과 ==> " + hap);

        St25052201 a = new St25052201();
        int hap2 = a.para2_method2(10,20,30);
        System.out.println("뇨호호 " + hap2);
    }
}
