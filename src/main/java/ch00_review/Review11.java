package ch00_review;
/*
    User 클래스를 수정하여 password 필드를 외부에서 볼 수 없도록
    변경하고, 대신 안전하게 값을 얻을 수 있는 메서드를 User 클래스에
    구현하시오.

    user1에 이름은 "user1"
    password는 qwer1234로 만들 수 있도록 메서드를 구현하시오.

    이후 Review11 클래스에서 password를 콘솔에 출력할 수 있도록
    코드를 작성하시오.
 */
class User {
    public String name;
    private String password;

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}

public class Review11 {
    public static void main(String[] args) {
        // 객체 생성
        User user1 = new User();
        // name 필드와 password 필드에 각각 다른 방법으로 데이터를 대입해야 함
        // public / private이라는 접근 지정자 차이 때문에 생겨남.
        // 1. name 필드에 값 대입 : public이라서 직접 접근이 가능
        user1.name = "user1";
        System.out.println(user1.name);

        // 2. password 필드에 값 대입 : private 이기 때문에 메서드로 우회해야함.(setter)
        user1.setPassword("qwer1234");
        // 그렇다고 하더라도 마찬가지로 입력한 password를 콘솔에서 확인 불가능 (getter)
        System.out.println(user1.getPassword());
    }
}