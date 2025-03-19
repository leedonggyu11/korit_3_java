package ch09_classes;

public class CarMain {
    public static void main(String[] args) {
        // 객체 생성 * 2
        // 클래스명 객체명 = new 클래스명();
        Car myCar = new Car();
        Car yourCar = new Car();

        // myCar / yourCar에 각각 값 대입
        // 객체명.속성명 = 대입할_데이터_값;
        myCar.color = "빨강";
        myCar.speed = 160;

        yourCar.color = "노랑";
        yourCar.speed = 180;

        // 지시사항에 있던 메서드들을 호출
        // 객체명.메서드명();
        myCar.drive();
        yourCar.brake();
        myCar.displayInfo();
        yourCar.displayInfo();
    }
}
