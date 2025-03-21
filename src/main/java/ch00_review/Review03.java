package ch00_review;

import java.util.Scanner;

public class Review03 {
    public static void main(String[] args) {
        /*
            조건문
            if(조건식) {
                실행문
            }
            조건식 : true / false로 결정나는 식
            조건식이 true면 {} 내의 실행문이 실행됨.

            전체 형식 :
            if(조건식1) {
                실행문1
            } else if(조건식2) {
                실행문2
            } else if(조건식3) {
                실행문3
            } else {
                실행문4
            }

            그리고, Nested if문
            if(조건식1) {
                실행문1-1
                if(조건식1-a) {
                    실행문1-a
                } else if(조건식1-b) {
                    실행문1-b
                } else {
                    실행문1-c
                }
                실행문1-2
            } else if(조건식2) {
                실행문2
            } else {
                실행문3
            }

            7세 미만은 탑승 불가
            110cm 미만은 탑승 불가
         */
        int age = 0;
        int height = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("나이를 입력하세요 >>> ");
        age = scanner.nextInt();
        System.out.print("키를 입력하세요 >>> ");
        height = scanner.nextInt();

        // 조건문
        if (age >= 7) {
            System.out.println("규정 나이 7세 이상입니다."); // 실행문1-1
            if(height >= 110) {
                System.out.println("롤러코스터 입장이 가능합니다."); // 실행문 1-a
            } else {    // height < 110
                System.out.println("하지만 키가 딸려서 못탑니다");  // 실행문 1-b
            }
            System.out.println("감사합니다.");   // 실행문1-2
        } else {    // age > 7
            System.out.println("규정 나이 미만으로 탑승이 불가능합니다.");
        }

        // 현재 age를 기준으로 중첩 if문이 작성되어있는데, height를 기준으로 중첩 if문을 작성하시오.
        if (height >= 110) {
            System.out.println("규정 키 제한 이상입니다");
            if(age >= 7) {
                System.out.println("롤러 코스터 입장이 가능합니다.");
            } else {
                System.out.println("근데 나이가 딸려서 안됩니다.");
            }
            System.out.println("thank you");
        } else {
            System.out.println("그... 다음기회에... 안됩니다...😫");
        }

        // 다 하신 분은 논리연산자를 활용하여 다시 한 번 조건문을 작성하시오. -> && || !
        if (age >= 7 && height >= 110) {
            System.out.println("당신은 롤러코스터에 탈 자격이 있군요 빨리 오세요");
        } else {        // 앞의 두 변수 중 하나라도 충족시키지 못하면 false임. 키가 잘못됐는지
            // 나이가 잘못됐는지는 이런 방식으로는 알 수 없음
            System.out.println("그 이유는 모르겠는데 나이가 어리거나 키가 작거나인가봅니다.");
            System.out.println("롤러코스터 못탑니다.");
        }

    }
}