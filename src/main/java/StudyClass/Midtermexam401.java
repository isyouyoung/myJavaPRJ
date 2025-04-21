package StudyClass;

abstract class Fish {
    public abstract void swim();
}

class GoldFish extends Fish {
    @Override
    public void swim() {
        System.out.println("헤엄치고 있습니다");
    }
}

public class Midtermexam401 {
    public static void main(String[] args) {
        Fish gold = new GoldFish();
        gold.swim();
    }
}