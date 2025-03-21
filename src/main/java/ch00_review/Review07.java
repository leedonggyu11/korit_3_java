package ch00_review;
/*
    클래스 - 설계도 / 틀 / 청사진
    클래스 내부에는 속성(필드/멤버변수/인스턴스변수) / 행위(메서드)
 */
class Developer  {
    // 필드 선언
    String name;
    boolean window;
    boolean java;
    boolean python;
    int career;
    String company;

    // 생성자 정의 -> 원래 기본 생성자는 default로 있습니다.

    // introduce 메서드를 정의
    void introduce() {
        System.out.println("안녕하세요 제 이름은 " + name + "입니다.");
        System.out.println("현재 저는 " + company + "에서 일하고 있으며, " + career + "년 경력자입니다.");
        System.out.println("window PC 소유 : " + window);
        System.out.println("Java 역량 : " + java);
        System.out.println("python 역량 : " + python);
    }
}
public class Review07 {
    // 기본 생성자로 객체 생성하고 싶다면 바로 가능

    /*

        전부 다 main 단계에 작성하시오.
        이름 여러분이름
        window PC 소유 여부 yes
        company 코리아아이티아카데미
        java 능력 소유 여부 yes
        python 능력 소유 여부 no
        career에 3

        속성에 값을 대입하려면 어떡해야할까요.
        작성하고, 콘솔창에

        안녕하세요 제 이름은 여러분이름입니다.
        현재 저는 코리아아이티아카데미에서 일하고 있으며, 3년 경력자입니다.
        window PC 소유 : true
        Java 역량 : true
        python 역량 : false
        인 상황입니다. 열심히 하겠습니다.

        를 출력하시오.
     */
    public static void main(String[] args) {
        Developer developer1 = new Developer();
        developer1.window = true;
        developer1.name = "안근수";
        developer1.career = 3;
        developer1.python = false;
        developer1.java = true;
        developer1.company = "코리아아이티아카데미";
        developer1.introduce();
        /*
        안녕하세요 제 이름은 여러분이름입니다.
        현재 저는 코리아아이티아카데미에서 일하고 있으며, 3년 경력자입니다.
        window PC 소유 : true
        Java 역량 : true
        python 역량 : false
        인 상황입니다. 열심히 하겠습니다.
         */
        String name = developer1.name;
        boolean java = developer1.java;
        boolean python = developer1.python;
        String company = developer1.company;
        boolean window = developer1.window;
        int career = developer1.career;
        System.out.println("안녕하세요 제 이름은 " + name + "입니다.");
        System.out.println("현재 저는 " + company + "에서 일하고 있으며, " + career + "년 경력자입니다.");
        System.out.println("window PC 소유 : " + window);
        System.out.println("Java 역량 : " + java);
        System.out.println("python 역량 : " + python);

        // 지금 64번 라인부터 68번 라인까지가 자기소개에 해당하는데
        // 전부 메인에 작성하니까 너무 깁니다.
        // 메서드화시켜서 그냥 메인에서는 호출만 하고 싶습니다.
        // 누가? 여러분이
        // 시작하세요
        // call1() 타입으로 정의 매개변수x returnx
        // 호출 형식 :
        // developer1.introduce();
        // 실행 예
        /*
        안녕하세요 제 이름은 안근수입니다.
        현재 저는 코리아아이티아카데미에서 일하고 있으며, 3년 경력자입니다.
        window PC 소유 : true
        Java 역량 : true
        python 역량 : false
         */
    }
}