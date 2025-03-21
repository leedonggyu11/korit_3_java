package ch11_access_modifier;

class Person {
    private String name;

    // private이기 때문에 이 Person 클래스 외부에서는 name을
    // 참조할 수 없다 -> 우회방법이 뭐다? setter / getter다.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // setter / getter는 보니까 access modifier가 public이니까
    // 클래스 외부에서 사용할 수 있겠다.
    // 그러니까 우회를 통해서 Person 클래스의 객체의 속성값을
    // 바꿀 수 있다.
    // 귀찮은데 왜 하는가?
    // 어제 했던 것처럼 말도안되는 데이터값을 걸러내는 로직을 쓸 수 있다

    // PersonMain에서 person1 객체를 생성하는데,
    // 처음 이름을 "김일"로 입력하고,
    // 그 이름을 콘솔에 출력
    // 다시 이름을 "이일"로 입력하고,
    // 바뀐 이름을 콘솔에 출력하시오.
}

public class PersonMain {
    public static void main(String[] args) {
        // 객체 생성
        Person person1 = new Person();
        person1.setName("김일");
        System.out.println(person1.getName());
        person1.setName("이일");
        System.out.println(person1.getName());
    }
}
/*


 */