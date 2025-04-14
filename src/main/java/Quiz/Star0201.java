package Quiz;

public class Star0201 {
    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            if (i<4) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 6; j >= i ; j--) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
