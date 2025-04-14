package StudyClass;

public class Hs25041201 {
    public static void main(String[] args){
        int ohap = 0;
        int chilhap = 0;

        for (int i = 5; i <= 200; i+=5) {
            if (i>=100) {
             ohap = i + ohap;
            }
        }

        for (int j = 7; j <= 200; j+=7) {
            if (j>=100) {
                chilhap = j + chilhap;
            }
        }

        System.out.println(ohap +chilhap);
    }
}
