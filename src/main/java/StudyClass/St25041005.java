package StudyClass;

class Rabbitit05 {
    String shape;
    int xPos;
    int yPos;

    void setPosition(int x, int y) {
        xPos = x;
        yPos = y;

        System.out.println("Rebbit setPosition(" + x + ", " + y +")");
    }

    void rabbitNoise(){
        System.out.println("Rabbit Screams");
    }
}

public class St25041005 {
    public static void main(String[] args) {
        Rabbitit05 rabbit1 = new Rabbitit05();
        Rabbitit05 rabbit2 = new Rabbitit05();
        Rabbitit05 rabbit3 = new Rabbitit05();

        rabbit1.shape = "원";
        rabbit2.shape = "삼각형";
        rabbit3.shape = "토끼";

        rabbit1.setPosition(100, 100);
        rabbit2.setPosition(-100, 100);
        rabbit3.setPosition(0, -100);

        rabbit2.rabbitNoise();
    }
}
