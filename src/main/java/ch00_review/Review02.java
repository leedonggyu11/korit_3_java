package ch00_review;

public class Review02 {
    public static void main(String[] args) {
        /*
            연산자
            1) 대입 연산자 =
            2) 복합 대입 연산자
                +=
                -=
                *=
                /=
         */

        double height = 0; // 세로
        double width = 0;   // 가로
        double area = 0;    // 넓이

        // 1. 이상의 변수에 세로 30.3 / 가로 124.37인
        // 사각형의 넓이를 구하시오.
        // 2. 동일한 가로 세로의 삼각형의 넓이를 구하시오
        // 실행 예
        // 가로 124.37, 세로 30.3인 삼각형의 넓이는 ...이고
        // 사각형의 넓이는 ...입니다.

        width = 124.37;
        height = 30.3;
        area = height * width;  // 결과적으로 사각형의 넓이만 구했고
        System.out.println("가로 " + width + ", 세로 " + height + "인 삼각형의 넓이는 " + (area/2) + "이고");
        System.out.println("사각형의 넓이는 " + area + "입니다.");
        // 이상의 코드에서 볼 수 있듯이 삼각형의 넓이는 사각형넓이/2로 처리했습니다.
    }
}