package ch15_objects;

public class ObjectTest {
    // 필드 선언
    private String name;
    private String address;

    // 기본 생성자, 매개변수 생성자(AllArgsConstructor)를 생성하시오.
    public ObjectTest() {}

    public ObjectTest(String name, String address) {
        this.name = name;
        this.address = address;
    }
    // getter / setter를 생성하시오.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // displayInfo()를 call1형식으로 정의하시오.
    // 실행 예
    // 이름 : 안근수
    // 주소 : 부산광역시 연제구
    public void displayInfo1() {
        System.out.println("이름 : " + name);
        System.out.println("주소 : " + address);
    }

    public String displayInfo2() {
        return "이름 : " + name + "\n주소 : " + address;
    }

    @Override
    public String toString() {
        return "이름 : " + name + "\n주소 : " + address;
    }
}