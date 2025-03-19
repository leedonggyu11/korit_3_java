package ch09_classes;

import java.util.Scanner;

public class ClassAMain {
    public static void main(String[] args) {
        // ClassA를 import
        ClassA classA = new ClassA();
//      클래스명 객체명 = new 클래스명();

        // Scanner import -> 알고보니 Scanner도 class였다
        // 그리고 이전까지는 scanner가 변수라고 했지만 사실은 객체였다.
        // 정확하게는 Scanner 클래스의 인스턴스였다.
        Scanner scanner = new Scanner(System.in);

        // 객체의 속성을 참조하는 법 : 객체명.속성명
//        System.out.print("이름을 입력하세요 >>> ");
//        classA.name = scanner.nextLine();
//        System.out.println(classA.name + "입니다.");

        // 객체 생성 -> 이름 / 점수 / 번호를 입력하도록 하겠습니다.
        /*
            1. classA1이라는 객체를 생성하고
            2. scanner를 통해 이름에 여러분 이름
            3. 점수에 100점
            4. num 20250001을 입력하고

            실행 예
            이름을 입력하세요 >>> 여러분이름
            점수를 입력하세요 >>> 100
            번호를 입력하세요 >>> 20250001

            [ 실행 결과 ]
            20250001 - 이름 : 여러분이름, 점수는 100점입니다.
         */
        // 객체 생성
//        ClassA classA1 = new ClassA();  // -> ClassA와 ClassA()는 또 다릅니다 -> 추후 수업
//        System.out.print("이름을 입력하세요 >>> ");
//        classA1.name = scanner.nextLine(); // name은 String이니까
//        System.out.print("점수를 입력하세요 >>> ");
//        classA1.score = scanner.nextDouble();   // score는 double
//        System.out.print("번호를 입력하세요 >>> ");
//        classA1.num = scanner.nextInt();
//
//        System.out.println("[ 실행 결과 ]");
//        System.out.println(classA1.num + " - 이름 : " + classA1.name + ", 점수는 " + (int)classA1.score + "점입니다.");

        // 이상까지의 코드는 객체의 속성에 값을 대입하고, 이를 출력하는 방법

        // method를 호출
        ClassA classA2 = new ClassA();
        classA2.name = "김이";
        classA2.callName();
        ClassA classA3 = new ClassA();
        classA3.name = "이삼";
        classA3.callName();
    }
}
