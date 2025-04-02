package ch21_exception;

public class Exception01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            int result = a / b;
            System.out.println("결과 : " + result);
        } catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("프로그램 정상 종료");
        }

        // 배열 인덱스 예외
        int[] numbers = {1,2,3};

        try {
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("인덱스 범위를 벗어남 : " + e.getMessage());
        } finally {
            System.out.println("프로그램 정상 종료");
        }




    }
}