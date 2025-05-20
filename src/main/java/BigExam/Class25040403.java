package BigExam;

abstract class Fish3 {
    abstract void swim();
}

class GoldFish3 extends Fish3 {
    @Override
    public  void swim() {
        System.out.println("헤엄치고 있습니다.");
    }
}

public class Class25040403 {
    public static void main(String[] args) {
        GoldFish3  gf = new GoldFish3();
                gf.swim();
    }
}