package StudyClass;

class Rabbit02 {
    private String shape;
    private int xPos;
    private int yPos;
    public int number; // 이거 추가

    void setPosition(int x, int y) {
        xPos = x;
        yPos = y;
    }
}

public  class St25041702 {

    public static void main(String[] args) {
        Rabbit02 rabbit = new Rabbit02();
        rabbit.setPosition(100,200);

        rabbit.number = 1;
//        rabbit.xPos = 0;
    }
}