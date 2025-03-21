package org.example;

import java.util.Scanner;

/*
    BMI 계산기를 작성하시오.

    1. 사용자에게 키(cm)와 몸무게(kg)를 입력 받으시오.
    2. 수학적 연산을 통해서 BMI 지수를 산출하시오.
        BMI 지수 = 몸무게(kg) / (키(m)의 제곱)
    3.  18.5 미만인 경우 저체중
        23 미만은 정상 체중
        25 미만은 과체중
        25 이상에 해당하는 조건문을 작성하고
    4. 실행 예
        키(cm)를 입력하세요. >>> 172
        몸무게(kg)를 입력하세요. >>> 70
        당신의 BMI 지수는 23.432314이며, 과체중입니다.

        와 같이 출력될 수 있도록 작성하시오.
 */
public class BmiCalcMain {
    public static void main(String[] args) {
        // 1. Scanner import
        Scanner scanner = new Scanner(System.in);

        // 2. 사용할 변수 목록 선언 및 초기화
        // 생각해볼 점 : 테스트할 때 마다 값을 입력하기 귀찮으면 어떻게 하는게 좋을까?
        double height = 0;
        double weight = 0;
        // 별개의 변수를 선언하신 분도 있습니다
//        double heightM = 0;
        String status = "";

        double bmi = 0;
        System.out.print("키(cm)를 입력하세요 >>> ");
        height = scanner.nextDouble();
        height = height / 100;
        System.out.print("몸무게(kg)를 입력하세요 >>> ");
        weight = scanner.nextDouble();
        // 이상의 데이터를 통해 bmi를 연산해야함.
        // 해당 과정에서 height는 단위가 cm이기 때문에 m로 변환해야합니다.
        bmi = weight / (height*height);
        System.out.println(bmi);

        // bmi가 산출됐으니 조건문을 작성하시면 됩니다.
        if(bmi < 18.5) {
            status = "저체중";
        } else if (bmi < 23) {
            status = "정상 체중";
        } else if (bmi < 25) {
            status = "과체중";
        } else {
            status = "비만";
        }

        System.out.println("당신의 BMI 지수는 " + bmi + "이며 " + status + "입니다.");
    }
}