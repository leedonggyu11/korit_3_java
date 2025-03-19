package ch10_setter_getter;

public class Person {
    private String name;
    private int age;

    // 기본 생성자, 매개변수가 하나인 생성자 두 개
    // 매개변수가 두 개인 생성자 하나 총 네 개를 정의하시오.
    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(int age) {
        if (age < 0 || age > 200) {
            System.out.println("불가능한 나이 입력입니다.");
            return;     // method내에 return; 하면 메서드 그대로 종료
        }
        System.out.println("나이가 입력되었습니다.");
        System.out.println("변경 전 나이 : " + this.age);
        this.age = age;
        System.out.println("변경 후 나이 : " + age);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Setter의 명칭 : set+필드명으로 짓는 편
    // 구조 : call2() 유형으로 정의됨.

    public void setName(String name) {
        // 이름의 글자 수가 4 초과라면 입력이 불가능 하게끔 로직을 추가하시오.
        // "불가능한 이름 입력입니다"라고 출력되도록하고,
        // 이름을 바꾸는데 성공했다면
        // 변경 전 이름 :
        // 변경 후 이름 :
        // 이 출력되도록 하시오. 여기서 name.length()를 응용해야 합니다.
        // 그리고 이거 다 끝나셨으면 person1.setName("레오나르도디카프리오")라고
        // 입력하고, 불가능한 이름 입력입니다.를 출력시키시오.
        // 그리고 person1.setName()에 여러분 이름을 입력하여
        // 변경 전 이름 : 안근수
        // 변경 후 이름 : 여러분이름 이 나올 수 있도록 작성하시오.

        // 이거 다 하면 getAge() 메서드도 정의하시오.
        if(name.length() > 4) {
            System.out.println("불가능한 이름 입력입니다.");
            return;
        }
        System.out.println("변경 전 이름 : " + this.name);
        this.name = name;
        System.out.println("변경 후 이름 : " + this.name);

    }

    // setAge를 정의하고 PersonMain으로 가서 나이 38을 대입하시오.
    public void setAge(int age) {
        // 0 미만, 200초과의 값이 입력됐을 경우 "불가능한 나이 입력입니다"
        // 라고 출력하고, 값을 바꾸지 않도록 작성할 예정
        if (age < 0 || age > 200) {
            System.out.println("불가능한 나이 입력입니다.");
            return;     // method내에 return; 하면 메서드 그대로 종료
        }
        System.out.println("나이가 입력되었습니다.");
        System.out.println("변경 전 나이 : " + this.age);
        this.age = age;
        System.out.println("변경 후 나이 : " + age);
    }

    // Getter 명칭 : get + 필드명으로 짓는 편
    // 구조 : call3() -> 매개변수 없음 / return 있음
    // 데이터의 조회만 하면 되기 때문에 매개 변수가 요구되지 않음.
    // 필드와 동일한 자료형의 return 값이 요구됨. -> void 아님.
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}