package ch00_review;
/*
    Getter / Setter

    객체명.속성명 = 속성값;의 형태로 여태까지 속성값을 대입해왔습니다.
    혹은 바꾸는 것도 가능했습니다.
    그래서 예를 들어 batteryTime에 음수를 집어넣더라도, 자료형이 int이기 때문에
    속성값을 대입하는 것이 가능합니다. 그것이 논리적으로는 불가능할지라도
    컴퓨터는 멍청하기 때문에 자료형만 맞아 떨어지면 그대로 받아들인다고 볼 수 있습니다.

    그러면 악의적으로 클래스 외부에서 데이터를 조작하는 것도 가능하다는 의미가 됩니다.
    이와 같은 잠재적인 문제를 막기 위해서
    다른 클래스에서 직접적으로 속성값을 바꾸는 것을 막고, 특정 method를 경유해야지만
    속성값을 대입할 수 있도록 처리하는 것이 Getter / Setter 및 접근 지정자의 개념입니다.

    1. Setter : 속성값을 대입(변경)하기 위한 method를 통칭합니다.
        set+속성명으로 이루어져있습니다.
        ex) setBatteryTime()
        a. call2() 유형입니다.
        b. 내부에 로직을 작성하여 필드의 논리적인 개념에 맞지 않는
            데이터를 걸러낼 수 있습니다.(배터리타임이 음수면 아예 메서드를 정지시킬 수 있음)

    지시 사항
        1. 기본생성자 / 이름을 필수로 갖는 매개변수 생성자를 정의할 것
        2. 모든 필드에 대해 Setter를 정의할 것
        3. setBatteryTime()의 구현부에 batteryTime이 10 미만이라면 method 정지시킬 것
        4. watch1에 setter를 활용하여,
            button true
            celular true
            batteryTime -10 -> 실패하고 -> 18
            title 애플워치
            로 객체를 생성하시오.

        5. showInfo()를 정의하여
            이 시계는 애플워치입니다. 배터리타임이 18이지요.
            감사합니다.
            를 출력시킬 것
 */
class SmartWatch {
    private boolean button;
    private boolean celular;
    private int batteryTime;
    private String title;
}

public class Review09 {
    public static void main(String[] args) {
        SmartWatch watch1 = new SmartWatch();

    }
}