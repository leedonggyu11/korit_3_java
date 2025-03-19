package ch06_condition;
/*
    if - else if - else문

    형식 :
    if(조건식1) {
        실행문1
    } else if(조건식2) {
        실행문2
    } else if(조건식3) {
        실행문3
    } else {
        실행문4
    }
 */
import java.util.Scanner;

public class Condition04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int point = 0;
        final int VIP_POINT = 80;
        final int GOLD_POINT = 60;
        final int SILVER_POINT = 40;
        final int BRONZE_POINT = 20;
        String rating = "";
        System.out.print("회원 포인트를 입력하세요 >>> ");
        point = scanner.nextInt();

        if(point > VIP_POINT) {
            rating = "VIP";
        } else if (point > GOLD_POINT) {
            rating = "GOLD";
        } else if (point > SILVER_POINT) {
            rating = "SILVER";
        } else if (point > BRONZE_POINT) {
            rating = "BRONZE";
        } else {
            rating = "일반";
        }

        System.out.println("당신의 등급 : " + rating);
    }
}
