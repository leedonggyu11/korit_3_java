package ch07_loops;

import java.util.Scanner;

/*
    Scanner를 응용한 별찍기

    몇 줄의 별을 생성하시겠습니까? >>> 3
    *
    **
    ***

    다 하신 분은

    ***
    **
    *
 */
public class Loop08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = 0;
        System.out.print("몇 줄의 별을 생성하시겠습니까? >>> ");
        row = scanner.nextInt();

        for ( int i = 0 ; i < row; i++ ) {
            for( int j = 0 ; j < i + 1 ; j++ ) {
                System.out.print("🎈");
            }
            System.out.println();
        }
        /*
            기본적으로 개행이 이루어지는 부분과 별이 찍히는 부분 때문에
            2중 for문은 전제되어야 한다는 점. -> 첫 번째 고려 사항

            추가된 사항인 row 변수와 관련된 부분이 개행의 한계값과 관련이
            있다는 점을 파악하는 게 -> 두 번째 고려 사항
         */

        for( int i = 0 ; i < row ; i++ ) {
            for(int j = row ; j-i > 0 ; j--) {
                System.out.print("🎆");
            }
            System.out.println();
        }


    }
}
