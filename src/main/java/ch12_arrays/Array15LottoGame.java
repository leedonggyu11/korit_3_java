package ch12_arrays;

import javax.print.DocFlavor;
import java.util.Random;

/*
    1차 배열을 기준으로
    1 ~ 45까지의 임의의 숫자를 뽑아 배열에 대입

    목표는 1차 배열 내에 6개의 임의의 int값을 집어 넣는 것
    근데, 중복이 있으면 안됨

    그래서 복습을 한다고 가정하고 1 ~ 45까지의 숫자를 여섯개짜리의
    빈 배열에 집어 넣는 것 부터 시작하겠습니다

    lottoNumbers에 1 ~ 45까지의 숫자 중 6개를 뽑아 대입하는 반복문 작성
    -> 1차 배열 하나가 완성됩니다.

    그 1차 배열이 10번 반복되게끔 반복문 작성
    -> 그럼 전체적으로 2중 for문이 됩니다
 */
public class Array15LottoGame {
    public static void main(String[] args) {
        // 객체 생성
        Random random = new Random();
        // 생각해 봐야 할 점
        // Math.random()을 사용해서 1 ~ 45까지의 범위를 만들려면 어떡해야할까
        // 1 ~ 45
        // (    Math.random()*45) + 1; -> 6번 대입되겠습니다.
        // 빈 배열 선언
        int[] lottoNumbers = new int[6];

        System.out.println(Math.random());
    }
}
