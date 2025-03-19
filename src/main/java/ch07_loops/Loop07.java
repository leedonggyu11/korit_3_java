package ch07_loops;
/*
    2중 for문
    for(int i = 0 ; i < 10 ; i++) {
        반복실행문1-a
        for(int j = 0 ; i < 5 ; j++) {
            반복실행문2
        }
        반복실행문1-b
        for(int k = 0 ; k < 20 ; k++) {
            반복실행문3
        }
        반복실행문1-c
    }

    *
    **
    ***
    ****
    *****
 */
public class Loop07 {
    public static void main(String[] args) {
        for(int i = 0 ; i < 6 ; i++) {
            for(int j = 0 ; j < i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        /*
            별 찍기를 통한 for문 구조 학습
                            i = 0, j = 0이면 개행이 일어나야 함(실행문2는 실행 x)
             *              i = 1일 때 j = 0일 때는 * / j = 1 일때는 개행
             **             i = 2일 때, j = 0, 1이면 * / j = 2면 개행
             ***
             ****
             *****
         */

        // 100 부터 0까지 역순으로 출력하는 for문을 작성하시오(2중for문 아닙니다)
//        System.out.println();
//        for( int i = 100 ; i > -1 ; i--){
//            System.out.println(i);
//        }

        /*
            *****
            ****
            ***
            **
            *

            i 를 감소 시켰다면 j 가 증가 /
            i를 증가시켰다면 j가 감소했을 것 같은데 이미 구현하신 분은 반대로도 작성하시기
            바랍니다.
         */
        // # 1
        for ( int i= 5 ; i > 0 ; i-- ) {
            for(int j = 0 ; j < i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // # 2
        for( int i = 0 ; i < 5 ; i++ ) {
            for(int j = 5 ; j-i > 0 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}


