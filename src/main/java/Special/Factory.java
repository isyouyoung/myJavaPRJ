package Special;

class Car{
    String date;    //제조일자
    String color;   //색상
    int carNum; //차량번호

    Car(){

    }

    Car(String date){
        this.date=date;
    }

    Car(String date, String color){
        this.date=date;
        this.color=color;
    }



}

public class Factory {
    public static void main(String[] args) {
        Car sonata = new Car();
        sonata.color="흰색";
        sonata.date="20250415";
        System.out.printf("sonata color: %s, date: %s \n",sonata.color,sonata.date);

        Car avante= new Car("20250416");
        System.out.printf("avante color: %s, date: %s \n",avante.color,avante.date);

        Car genesis=new Car("20250417","블랙");
        System.out.printf("genesis color: %s, date: %s \n",genesis.color,genesis.date);

    }
}
