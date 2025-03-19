package ch04_scanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        // Scanner 클래스 import
        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("올해 년도를 입력하세요 >>> ");
////        int year = scanner.nextInt();
//        String year = scanner.nextLine();
////        System.out.println(year);
//        System.out.println("올해는 " + year + "년입니다.");
//        System.out.println("내년은 " + (year + 1) + "년입니다.");


//        System.out.print("당신의 이름을 입력하세요 >>> ");
//        String name = scanner.nextLine();
//
//        System.out.println("제 이름은 " + name + "입니다.");

        /*
            String 자료형으로 변수를 선언하고 초기화 할 때
            String 변수명 = scanner.nextLine();

            int 자료형으로 변수를 선언하고 초기화 할 때
            int 변수명 = scanner.nextInt();

            double 자료형으로 변수를 선언하고 초기화 할 때
            double 변수명 = scanner.nextDouble();

            scanner를 사용할 때 여러분들은 결국 콘솔에 입력한
            데이터를 변수에 저장하게 되는데,
            그 자료형을 고려하여 작성할 필요성이 있습니다.
         */
//        System.out.print("키를 입력하세요 >>> ");
//        double height = scanner.nextDouble();
//        System.out.println(height);

        // 실행 예
        // 나이를 입력하세요 >>> 19
        // 저는 올해 19살입니다.
        // 내년에는 20살이 됩니다.

        System.out.print("나이를 입력하세요 >>> ");
        int age = scanner.nextInt();
        System.out.println("저는 올해 " + age + "살입니다.");
        System.out.println("내년에는 " + (age + 1) + "살이 됩니다.");

    }
}
