package BigExam;

abstract class Fish {
    public abstract void swim();
}

class GoldFish extends Fish {
    @Override
    public void swim() {
        System.out.println("헤엄치고 있습니다");
    }
}

public class Class25040401 {
    public static void main(String[] args) {
        GoldFish gold = new GoldFish();
        gold.swim();
    }
}


