package Special;

class Rabbit3 {
    private  String shape;
    private int xPos;
    private int yPos;

    public void setShape(String shape) {
        this.shape = shape;
    }

    public  String getShape() {
        return this.shape;
    }

    public  void setPosition(int x, int y) {
        this.xPos = x;
        this.yPos = y;
    }

    public int getX() {
        return this.xPos;
    }

    public int getY() {
        return this.yPos;
    }
}

public class SC0303 {
    public static void main(String[] args) {
        Rabbit3 rabbit = new Rabbit3();
        rabbit.setShape("흰토끼");
        rabbit.setPosition(100, 100);

        System.out.printf("토끼의 모양은 [%s]입니다.\n", rabbit.getShape());
        System.out.printf("토끼의 위치는 (%d,%d)입니다.\n", rabbit.getX(), rabbit.getY());
    }
}