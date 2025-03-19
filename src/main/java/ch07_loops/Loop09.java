package ch07_loops;
/*
        *
       **
      ***
     ****
    *****

    공백의 갯수를 책임 지는 반복문 -> 개행시마다 공백의 개수가 줄어드니까
    별의 개수가 줄어드는 반복문을 참조

    별의 갯수를 책임 지는 반복문 -> 개행시마다 별의 개수가 늘어나니까
    맨 처음에 배웠던 반복문을 참조
 */
public class Loop09 {
    public static void main(String[] args) {
        // # 1
        // 개행 관련 for문
        for (int i = 0 ; i < 6 ; i++) {
            // 공백 관련 for문
            for (int j = 5 ; j > i ; j--) {
                System.out.print(" ");
            }
            // 별 찍기 관련 for문
            for (int k = 0 ; k < i ; k++) {
                System.out.print("*");
            }
            // 개행 실행문
            System.out.println();
        }

        // # 2
        // 개행 관련 for문
        for (int i = 0 ; i < 6 ; i++) {
            // 공백 관련 for문 -> 여기를 j++ 형태로 작성하는 예시입니다.
            for (int j = 0 ; j < 6-i ; j++) {
                System.out.print(" ");
            }
            // 별 찍기 관련 for문
            for (int k = 0 ; k < i ; k++) {
                System.out.print("*");
            }
            // 개행 실행문
            System.out.println();
        }

            // maybeags





    }
}
