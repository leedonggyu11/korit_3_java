package ch16_bean.persons;

public class Person {
    // 필드 선언
    // 접근 지정자와 자료형 사이에 final 명시하는 경우

    // name에 final 선언하면 빨간줄 뜨는데
    // 여태까지 해결 방법 -> NAME으로 고치고 거기에 = "데이터";
    // 넣어줘서 초기화를 꼭 시켜왔습니다.

    // 지금 시도한 방법
    // final이 이 붙은 필드를 필수적으로 포함하는 매개변수를 생성

    private final String name;
    private int age;

    // 필수적인 필드를 포함한 RequiredArgsConstructor를 생성
    public Person(String name) {
        this.name = name;
    }

    // AllArgsConstructor 생성

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    // getter / setter 정의

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // toString() 오버라이드 받아서 default 형태로 둘 것

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}