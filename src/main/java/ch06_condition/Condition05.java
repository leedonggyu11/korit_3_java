package ch06_condition;

import java.util.Scanner;

/*
    과제 :

    윤년 계산기 작성

    윤년(leap year)은 특정 조건을 만족하는 년을 의미합니다.

    윤년을 판단하는 규칙은
    1. 연도가 4로 나누어 떨어지는 해는 윤년에 해당할 수도 있음
    2. 그러나 100으로 나누어 떨어지는 해는 윤년이 아님
    3. 근데 400으로 나누어 떨어지는 해는 윤년임.

    예를 들어
    2020년은 4로 나누어 떨어지므로 윤년입니다.(100으로는 나누어떨어지지 않습니다)
    1900년은 100으로 나누어 떨어지기 때문에 윤년이 아닙니다.
    2000년은 100으로 나누어 떨어지기는 하는데 400으로도 나누어 떨어져서 윤년입니다.

 */
public class Condition05 {
    public static void main(String[] args) {

        // 1. Scanner class import
        Scanner scanner = new Scanner(System.in);

        System.out.print("년도를 입력하세요 >>> ");
        int year = scanner.nextInt();
        // 1. 조건이 널널한것으로부터 촘촘한 것으로 배치해야 함. -> 순서대로 실행되기 때문에
        // 2. 지시 사항에 해당되지 않는 년도는 전부 윤년이 아님 -> else로 처리할 부분
        // 3. Condtiion03에서 작성한 것처럼 실행문을 전부 sout으로 쓸 필요 없이
        //  축약이 가능함.


//        if(year % 400 == 0) {
//            System.out.println("윤년입니다.");
//        } else if (year % 100 == 0) {
//            System.out.println("윤년이 아닙니다.");
//        } else if (year % 4 == 0) {
//            System.out.println("윤년입니다.");
//        } else {
//            System.out.println("윤년이 아닙니다.");
//        }

        String leapYear = "";

        if(year % 400 == 0) {
            leapYear = "윤년입니다.";
        } else if (year % 100 == 0) {
            leapYear = "윤년이 아닙니다.";
        } else if (year % 4 == 0) {
            leapYear = "윤년입니다.";
        } else {
            leapYear = "윤년이 아닙니다.";
        }
        System.out.println(year + "년은 " + leapYear);

    }
}
