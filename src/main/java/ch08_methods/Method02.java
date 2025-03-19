package ch08_methods;

import java.util.Scanner;

/*
    별찍기 관련한거 메서드로 구현할 예정입니다.
 */
public class Method02 {
    // call4 유형이 될 예정
    public static String getStar(int rows, int select) {    // rows와 rowOfStars는 서로 다른 개념
        // 사용할 지역 변수 선언
        String result = "";

        // select에 따라서 서로 다른 결과값이 나오도록 조건문을 작성할 예정입니다(1. 이면 왼쪽으로 치우친 증가하는 별)
        if(select == 1) {
            for (int i = 0 ; i < rows + 1 ; i++) {
                //별 찍히는 부분
                for (int j = 0 ; j < i ; j++ ) {
                    result += "✨";
                }
                //개행 부분
                result += "\n";
            }
        } else if(select == 2) {
            for(int i = 0 ; i < rows ; i++) {
                // 공백이 찍히는 for문
                for(int j = 0 ;  j < rows -(i + 1) ; j++) {
                    result += "  ";
                }
                // 별이 찍히는 for문
                for(int k = 0 ; k < i + 1 ; k++ ) {
                    result += "✨";
                }
                // 개행
                result += "\n";
            }
        } else if(select == 3) {
            // 왼쪽으로 감소하는 별 찍기
            for( int i = 0 ; i < rows ; i++ ) {
                for(int j = rows ; j-i > 0 ; j--) {
                    result += "✨";
                }
                result += "\n";
            }
        } else if(select == 4) {
            // 오른쪽으로 감소하는 별 찍기
            /*
                *****
                 ****
                  ***
                   **
                    *
             */
            for (int i = 0 ; i < rows ; i++) {
                // 공백이 늘어나야 함. -> select == 1에서 작성한 방식 참조 가능
                for(int j = 0 ; j < i + 1 ; j++ ) {
                    result += "  ";
                }
                // 별의 개수가 찍히는데, 줄어들어야 함 -> select == 3에서 작성한 방식을 참조
                for(int j = rows ; j - i > 0 ; j--) {
                    result += "✨";
                }
                result += "\n";
            }
        } else {
            result = "잘못 입력하셨습니다. 프로그램을 종료합니다.";
        }
        return result;
    }

    public static void main(String[] args) {
        // select == 4에 해당하는 for문 작성해보고 되면 복사 붙여넣기 하시면 됩니다.
        // 전체 줄 수 책임지는 for문

//        for (int i = 0 ; i < 5 ; i++) {
//            // 공백이 늘어나야 함. -> select == 1에서 작성한 방식 참조 가능
//            for(int j = 0 ; j < i + 1 ; j++ ) {
//                System.out.print("  ");
//            }
//            // 별의 개수가 찍히는데, 줄어들어야 함 -> select == 3에서 작성한 방식을 참조
//            for(int j = 5 ; j - i > 0 ; j--) {
//                System.out.print("✨");
//            }
//            System.out.println();
//        }





        // Scanner를 import
        Scanner scanner = new Scanner(System.in);
        // 사용할 변수 목록 선언 및 초기화
        int rowOfStars = 0;
        int choice = 0;
        String starResult = "";

        System.out.print("몇 줄 짜리 별을 생성할까요? >>> ");
        rowOfStars = scanner.nextInt();

        System.out.println("1. 왼쪽으로 치우친 증가하는 별");
        System.out.println("2. 오른쪽으로 치우친 증가하는 별");
        System.out.println("3. 왼쪽으로 치우친 감소하는 별");
        System.out.println("4. 오른쪽으로 치우친 감소하는 별");
        System.out.print("메뉴를 선택하세요 >>> ");
        choice = scanner.nextInt();

        starResult = getStar(rowOfStars, choice);
        System.out.println(starResult);
    }
}
