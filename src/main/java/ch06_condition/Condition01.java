package ch06_condition;

import java.util.Scanner;

/*
    조건문
    1. if문 : if 다음에 있는 () 내의 조건식이 true일 때 {} 내의 실행문이 실행됨. false면 실행 x

    형식 :
    if(조건식) {       조건식 : true / false로 결론이 날 수 있는 식 또는 문장
        실행문
    }
 */
public class Condition01 {
    public static void main(String[] args) {
        int num = 10;

        if(num > 0) {       // 조건식 : num > 0 : num이라는 변수가 0 초과라면 -> true
            System.out.println("num은 양수입니다.");  // 그러면 {} 내의 실행문이 실행됨
        }

        Scanner scanner = new Scanner(System.in);
        int num2 = scanner.nextInt();

        if (num2 > 0) {
            System.out.println("num2는 양수입니다.");
        }
    }
}
