package ch12_arrays;
/*
    1. calcSum / calcAvg 메서드를 완성하고, main 단계의 메서드 호출 부분을 수정해서
    실행 예
    총합 : 몇점
    평균 : 몇점
 */
public class Array06 {

    // 총합을 구하는 메서드
    private int calcSum(int[] scores) {
        int sum = 0;    // 지역변수
        for(int i = 0 ; i < scores.length ; i++) {
            sum += scores[i];
        }

        return sum;
    }

    // 평균을 구하는 메서드
    private double calcAvg(int[] scores) {
//        int sum = 0;
        double avg = 0;
        int sum = calcSum(scores);
//        for(int i = 0 ; i < scores.length ; i++) {
//            sum += scores[i];
//        } 보니까 이 부분이 calcSum과 반복 -> 그리고 이 연산의 결과가 sum
//        sum = calcSum(scores);
        avg = (double) sum / scores.length;
        System.out.println("총합 : " + sum);
        return avg;
    }

    // 등급 인원수를 구하는 메서드 -> 얘는 call3()
    private void countGrade(int[] scores) {
        int[] grades = {0, 0, 0, 0, 0};
        for(int i = 0 ; i < scores.length ; i++) {
            if(scores[i] > 89) {
                grades[0]++;
            } else if (scores[i] > 79) {
                grades[1]++;
            } else if (scores[i] > 69) {
                grades[2]++;
            } else if (scores[i] > 59) {
                grades[3]++;
            } else {
                grades[4]++;
            }
        }

        System.out.println("A 학점 인원 수 : " + grades[0]);
        System.out.println("B 학점 인원 수 : " + grades[1]);
        System.out.println("C 학점 인원 수 : " + grades[2]);
        System.out.println("D 학점 인원 수 : " + grades[3]);
        System.out.println("F 학점 인원 수 : " + grades[4]);
    }

    //
    public void printTotalInfo(int[] scores) {
        //얘만 실행시키면 합계도 나오고 평균도 나오고, A-F 인원수도 다 나왔으면 좋겠어요
//        System.out.println("총합 : " + calcSum(scores));
        double avgScore = calcAvg(scores);
        /*
            왜 이따위로 작성했는지 변명 :
            calcAvg는 내부에 calcSum을 호출합니다.
            그렇기 때문에 calcAvg내부에 sout(sum)을 작성해두면
            calcAvg를 호출했을 때 sout(sum)도 같이 나올 수 있다는 점을 위해서
            교육상 작성해뒀을 뿐이지
            평균을 구하는 메서드가 합을 출력하게 된다면 가독성 자체는 해치게 됩니다.

            이런 방법도 있다는 것을 보여드리기 위해서 기록만 남겨두고
            쓰지 맙시다.
         */
        System.out.println("평균 : " + avgScore);
        countGrade(scores);
    }


    public static void main(String[] args) {
        Array06 array06 = new Array06();
        int[] scores = { 100, 97, 55, 24, 49, 60, 20, 77, 89 };

//        int total = array06.calcSum(scores);
//        System.out.println("총합 : " + total);
//        double avgScore = array06.calcAvg(scores);
//        System.out.println("평균 : " + avgScore);
//        array06.countGrade(scores);  // A인원수 ... F인원수를 구하는 메서드 호출

        array06.printTotalInfo(scores);
    }
}