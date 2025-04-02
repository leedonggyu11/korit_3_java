package ch13_abstraction.abstract_class;

public class Main {
    public static void main(String[] args) {
        // 추상 클래스는 객체 생성을 할 수 없다
        Factory factory1 = new Factory("가전 제품 공장") {
            @Override
            public void produce(String model) {
                System.out.println(this.getName() + "에서 [ " + model + " ]을 생산합니다.");
            }

            @Override
            public void manage() {
                System.out.println("가전 제품 공장을 관리합니다.");
            }
        };      // 얘는 좀 특이하게 {};로 마무리되는데 메서드를 정의한게 아니라 객체 생성한거라서 그렇습니다.

        factory1.displayInfo();
        factory1.produce("백색 가전 냉장고");
        // 이상의 개념은 익명 클래스라는건데 Java17(혹은 11)에서 처음 도입되었습니다.
        // 재사용하지 않고 한 번만 쓰고 치울 예정이라면(즉 이 Main클래스에서만 쓸거라면), 사용하기 좋습니다.

        // 이제 그 추상 클래스의 객체 말고, 상속 받은 PhoneFactory의 객체 생성 하겠습니다.
        PhoneFactory phoneFactory1 = new PhoneFactory("애플 스마트폰 공장");

        // 부모 클래스에서 선언한 추상 클래스를 자식 클래스에서 구현부 작성한거 확인
        phoneFactory1.produce("아이폰17");
        phoneFactory1.manage();

        phoneFactory1.setName("삼성 스마트폰 공장");    // Factory에서 override 안한 메서드를 호출함
        phoneFactory1.displayInfo();                    // 얘도

        // 즉 오버라이딩은 '재정의'를 전제로 부모 클래스와 자식 클래스의 메서드가
        // 서로 다른 방식으로 굴러갈 경우에만 이루어지면 되고,
        // 부모 클래스의 메서드를 완전히 동일하게 자식 클래스에서 사용할 경우에는
        // 굳이 alt + ins를 통해서 override methods를 할 필요가 없습니다.


        /*
         4. Main.java로 이동해서
        tabletFactory1 객체를 생성하고, 애플 태블릿 공장 이라고 이름 붙일 것.
    5. 이름을 구글 태블릿 공장이라고 수정할 것 -> 그리고 getter를 활용
        현재 공장은 구글 태블릿 공장으로 변경되었습니다. 라고 콘솔에 출력될 수 있도록 작성하시오.

    6. 객체명.produce("구글 태블릿")을 호출하시오.
    7. 객체명.manage()를 호출하시오.
    8. 객체명.upgrade("구글 태블릿 10인치 2세대")를 호출하시오.
         */

        // 4.
        TabletFactory tabletFactory1 = new TabletFactory("애플 태블릿 공장");
        // 5.
        tabletFactory1.setName("구글 태블릿 공장");
        System.out.println("현재 공장은 " + tabletFactory1.getName() + "으로 변경되었습니다.");
        // 6.
        tabletFactory1.produce("구글 태블릿");
        // 7.
        tabletFactory1.manage();
        // 8.
        tabletFactory1.upgrade("구글 태블릿 10인치 2세대");
    }
}