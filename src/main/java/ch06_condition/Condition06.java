package ch06_condition;

import java.util.Scanner;

/*
    중첩 if(Nested if condition sentence)
        if 문 내에 if문이 연속적으로 작성될 수 있습니다.

    형식 :
    if(조건식1) {
        실행문1
        if(조건식1-a) {
            실행문1-a
        } else if(조건식1-b) {
            실행문1-b
        } else {
            실행문1-c
        }
    } else if(조건식2) {
        실행문2
        if(조건식2-a) {
            실행문2-a
        } else {
            실행문2-b
        }
    } else {
        실행문3
    }
 */
public class Condition06 {
    public static void main(String[] args) {
        /*
            사용자에게 score를 입력 받아 다음과 같은 조건을 만족시키도록 작성하시오.

            score가 0보다 작거나 100 초과라면 grade는 x
            score 90 ~ 100, grade = A
            score 80 ~ 90, grade = B
            score 70 ~ 80, grade = C
            score 60 ~ 70, grade = D
            score 0 ~ 59, grade = F

            실행 예 # 1
            점수를 입력하세요 >>> -10
            입력한 점수는 -10점이며 학점은 x학점입니다.

            실행 예 # 2
            점수를 입력하세요 >>> 92
            입력한 점수는 92점이며 학점은 A학점입니다.
         */

        // 1. Scanner import
        Scanner scanner = new Scanner(System.in);

        // 2. int score 선언(및 초기화)
        int score = 0;

        // 3. String grade 선언(및 초기화)
        String grade = "";
        // 4. Scanner를 입력 받기 위한 안내문 작성

        System.out.print("점수를 입력하세요 >>> ");
        score = scanner.nextInt();

        // 중첩 if 사용 사례
//        if (score < 0) {
//            grade = "x";
//        } else {        // 얘의 조건은 grade >= 0이 됩니다.
//            if (score > 100) {
//                grade = "x";
//            } else {        // 이 부분의 조건은 grade>=0 && grade <= 100 이 됩니다.
//                if(score > 90) {
//                    grade = "A";
//                } else if (score > 80) {
//                    grade = "B";
//                } else if (score > 70) {
//                    grade = "C";
//                } else if (score >= 60) {
//                    grade = "D";
//                } else {    // 그럼 이제 여기의 조건은 score >= 0 && score < 60
//                    grade = "F";
//                }
//            }
//        }

        // 논리 연산자를 사용한 if문

        if (score > 100 || score < 0) { // 100 초과 및 0 미만을 거르는 조건문 작성
            grade = "x";
        } else {
            if(score > 90) {
                grade = "A";
            } else if (score > 80) {
                grade = "B";
            } else if (score > 70) {
                grade = "C";
            } else if (score >= 60) {
                grade = "D";
            } else {
                grade = "F";
            }
        }
        System.out.println("점수는 " + score + "점이며, 학점은 " + grade + "등급입니다.");
    }
}
