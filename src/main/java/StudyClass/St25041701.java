class Rabbit01 {

    String shape = "";
    
    Rabbit01() {
        System.out.println("난 자바가 기본으로 만들어주는 생성자");
    }

    Rabbit01(String value) {
        this.shape = value;
    }
}

public class St25041701 {

    public static void main(String[] args) {
        Rabbit01 rabbit01 = new Rabbit01();

        Rabbit01 rabbit02 = new Rabbit01("원");
        Rabbit01 rabbit03 = new Rabbit01("삼각형");

        System.out.println("토끼 1 : " + rabbit01.shape);
        System.out.println("토끼 2 : " + rabbit02.shape);
        System.out.println("토끼 3 : " + rabbit03.shape);
    }
}