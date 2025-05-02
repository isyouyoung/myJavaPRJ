package Exam;

abstract class Fish{ // Fish는 추상클래스로 기본 개념만 제공
    abstract void swim(); // 추상메서드 swim으로 자식 클래스에서 구현해야 합니다
}

class GoldFish extends Fish { //자식 Fish를 상속받는 GoldFish 물고기
    @Override// swim을 오버라이딩함
    public void swim() {//swim이 호출되면 이 메세지를 출력
        System.out.println("헤엄치고 있습니다.");
    }
}


public class Exam04 { //실행 클래스 프로그램의 시작점
    public static void main(String[] args) {  //자바프로그램은 main메서드부터 실행됨
        GoldFish gold = new GoldFish(); //gold라는 이름의 객체 생성
        gold.swim();
    }
}
