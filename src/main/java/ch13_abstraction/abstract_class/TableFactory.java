
package ch13_abstraction.abstract_class;
/*
    지시 사항
    1. Factory 클래스를 상속 받을 것
    2. 그렇게 되면 시뻘건 것들 뜨는데(두 번 뜰겁니다), 그 오류들을 처리할 것.
        1) implement methods... PhoneFactory를 참조하여 sout을 작성할 것
        2) Factory 객체 생성 방식에 맞는 생성자 만들라고하는건 딸깍딸깍하시면 됩니다.

    3. TabletFactory의 고유 method인 upgrade(String model) 메서드를 call2() 유형으로
        작성하고 객체명.upgrade("아이패드 프로 13인치 8세대")로 호출하면
        아이패드 프로 13인치 8세대로 업그레이드 합니다. 라고 콘솔에 출력될 수 있도록
        작성하시오.

    4. Main.java로 이동해서
        tabletFactory1 객체를 생성하고, 애플 태블릿 공장 이라고 이름 붙일 것.
    5. 이름을 구글 태블릿 공장이라고 수정할 것 -> 그리고 getter를 활용
        현재 공장은 구글 태블릿 공장으로 변경되었습니다. 라고 콘솔에 출력될 수 있도록 작성하시오.

    6. 객체명.produce("구글 태블릿")을 호출하시오.
    7. 객체명.manage()를 호출하시오.
    8. 객체명.upgrade("구글 태블릿 10인치 2세대")를 호출하시오.
 */
public class TabletFactory extends Factory {

    public TabletFactory(String name) {
        super(name);
    }

    @Override
    public void produce(String model) {
        System.out.println("[ " + model + " ] 모델 태블릿을 생산합니다.");
    }

    @Override
    public void manage() {
        System.out.println("태블릿 공장을 관리합니다.");
    }

    // 고유 메서드 정의
    public void upgrade(String model) {
        System.out.println(model + "로 업그레이드합니다.");
    }
}
