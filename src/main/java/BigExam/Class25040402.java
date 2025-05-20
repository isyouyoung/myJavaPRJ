package BigExam;

abstract class Fish2{
    abstract void swim();
}

class Goldfish extends Fish2{
    @Override
    public void swim() {
        System.out.println("헤엄치고 있습니다");
    }
}

public class Class25040402 {
    public static void main(String[] args) {
        Fish2 gold = new Goldfish();
        gold.swim();
    }
}

