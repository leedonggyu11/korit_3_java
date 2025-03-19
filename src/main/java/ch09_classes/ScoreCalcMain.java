package ch09_classes;

import java.util.Scanner;

public class ScoreCalcMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ScoreCalc scoreCalc = new ScoreCalc();

        boolean endOfCalc = false;
        double score1 = 0;
        double totalScore = 0;
        int totalSubjects = 1;
        double avgScore = 0;

        while(!endOfCalc) {
            System.out.print("점수를 입력하세요(종료하려면 -1을 입력하세요) >>> ");
            score1 = scanner.nextDouble();

            if(score1 == -1) {
                break;
            }

//            totalScore = addSubject(totalScore, score1);
            totalScore = scoreCalc.addScores(totalScore, score1);

//            avgScore = calculateAvg(totalScore, totalSubjects);
            avgScore = scoreCalc.calculateAvg(totalScore, totalSubjects);

            System.out.println("------ 점수 입력시마다 나오는 합계와 평균입니다. ------");
            System.out.println("입력한 점수의 합계 : " + totalScore);
            System.out.println("입력한 점수의 평균 : " + avgScore);

            totalSubjects++;
        }

        System.out.println("====== 점수 입력 종료 후 나오는 합계와 평균입니다. ======");
        System.out.println("입력한 점수의 합계 : " + totalScore);
        System.out.println("입력한 점수의 평균 : " + avgScore);
    }
}
