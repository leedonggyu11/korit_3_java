package org.example;

import java.util.Scanner;

/*
    이하의 코드에 필요한 로직을 작성하고,
    BmiCalcMain에 적용하여 -> 여기에 객체도 생성해야하고,
                         -> getBmi라는 메서드도 호출
    동일한 결과값이 나오도록 작성하시오.

    이 클래스에 getBmiResult 메서드를 call1()으로 정의하여
    bmiCalc.getBmiResult(); 를 호출 했을 때
    실행 예
    키(cm)를 입력하세요 >>> 172
    몸무게(kg)를 입력하세요 >>> 70
    당신의 BMI 지수는 23.6659310이며 과체중입니다.

    가 출력되도록 하시오.
 */
public class BmiCalc {
    public double getBmi(double height, double weight) {
        double bmi = 0; // 지역 변수
        height = height * 0.01;
        bmi = weight / (height*height);

        return bmi;
    }

    public String getResult(double bmi) {
        String status = "";

        if(bmi < 18.5) {
            status = "저체중";
        } else if (bmi < 23) {
            status = "정상 체중";
        } else if (bmi < 25) {
            status = "과체중";
        } else {
            status = "비만";
        }

        return status;
    }

    public void getBmiResult() {
        Scanner scanner = new Scanner(System.in);

        double height = 0;
        double weight = 0;
        String status = "";

        double bmi = 0;
        System.out.print("키(cm)를 입력하세요 >>> ");
        height = scanner.nextDouble();
        height = height / 100;
        System.out.print("몸무게(kg)를 입력하세요 >>> ");
        weight = scanner.nextDouble();
        bmi = weight / (height*height);
        System.out.println(bmi);

        if(bmi < 18.5) {
            status = "저체중";
        } else if (bmi < 23) {
            status = "정상 체중";
        } else if (bmi < 25) {
            status = "과체중";
        } else {
            status = "비만";
        }

        System.out.println("당신의 BMI 지수는 " + bmi + "이고, " + status + "입니다.");
    }
}