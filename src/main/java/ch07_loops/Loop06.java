package ch07_loops;

import java.util.Scanner;

/*
    while문과 for문을 섞은 사례

    n을 입력 받아
    1부터 n까지의 합을 구하는 반복문을                -> for문
    반복하시겠습니까? Y/N >>> N이 나올 때까지 반복할 것 -> while문
 */
public class Loop06 {
    public static void main(String[] args) {

        // 1. Scanner import
        Scanner scanner = new Scanner(System.in);
        boolean isEnded = false;
        String answer = "";

        while(!isEnded) {
            int n = 0;
            int sum = 0;
            System.out.print("1부터 몇까지의 합을 구하시겠습니까? >>> ");
            n = scanner.nextInt();
            // 1부터 n까지의 합을 구하는 for 반복문을 작성하시오.
            for(int i = 1 ; i < n+1 ; i++) {
                sum += i;
            }
            System.out.println("합은  " + sum + " 입니다.");

            System.out.print("반복하시겠습니까? Y / N >>> ");
            scanner.nextLine();                      // 엔터키를 막아주는 배리어
            answer = scanner.nextLine();
            if(answer.equals("N")) {                // 이 코드의 잠재적 문제점은 N 이외의 모든 값은 전부 반복이 이루어진다는 점
                isEnded = true;
            }
        }

    }
}
