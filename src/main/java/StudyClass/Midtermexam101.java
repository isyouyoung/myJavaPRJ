package StudyClass;

public class Midtermexam101 {
    public static void main(String[] args) {
        int a = 4;

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a + i; j++) {
                if (j < a - i - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
