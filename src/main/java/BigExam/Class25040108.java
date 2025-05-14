package BigExam;

public class Class25040108 {
    public static void main(String[] args){

        String st = "*";
        String bl = " ";

        int a = 4;

        for (int i = 1; i <= a; i++) {
            System.out.print(bl.repeat(a - i));
            System.out.print(st.repeat(i * 2 - 1));
            System.out.println();
        }
    }
}
