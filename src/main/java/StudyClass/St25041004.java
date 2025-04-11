package StudyClass;

public class St25041004 {
    public static void main(String[] args) {
        int hap = 0;
        for (int i = 1; i <=100 ; i++) {
            if (i%4 !=0) {
                hap = hap + i;
            }

        }
        System.out.println(hap);
    }
}