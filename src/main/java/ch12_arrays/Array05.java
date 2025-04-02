
package ch12_arrays;
/*
    String[] scores = { "A", "B", "C", "D", "F" };
    를 선언하고 반복문을 작성해서
    scores 배열의 결과가 { "A+", "B+", "C+", "D+", "F+" }
    가 되도록 한 후,
    실행 예
    점수 : A+ B+ C+ D+ F+
    가 되도록 코드를 작성하시오.
    main에서만 쓰시면 됩니다.
 */
public class Array05 {

    public static void main(String[] args) {
//        String[] scores = { "A", "B", "C", "D", "F" };
//
//        for (int i = 0 ; i < scores.length ; i++) {
//            scores[i] += "+";
//            System.out.print(scores[i] + " ");
//        }

//        int[] scores2 = { 100, 90, 80, 70, 60, 20, 88, 52, 25, 37, 1, 0 };
//        // 총합과 평균을 계산해서 다음과 같이 출력하시오.
//        // 총점 : 뭐 몇점
//        // 평균 : 뭐 몇점(주의할 점 : double 형변환을 사용할 것)
//
//        int sum = 0;
//        double avg = 0;
//        for (int i = 0 ; i < scores2.length ; i++) {
//            sum += scores2[i];
//        }
//        System.out.println("총점 : " + sum);
//        avg = (double)sum/scores2.length;
//        System.out.println("평균 : " + avg);

        int[] scores3 = { 88, 94, 77, 100, 64, 32, 95, 82, 59 };
        int sum2 = 0;
        double avg2 = 0;
        for (int i = 0 ; i < scores3.length ; i++) {
            sum2 += scores3[i];     // 합 구하기 끝
        }
        System.out.println("총합 : " + sum2);
        avg2 = (double)sum2/scores3.length;
        System.out.println("평균 : " + avg2);

        String[] grade3 = new String[scores3.length]; // 따로내겠습니다
        // 합과 평균구하기도 할거고
        // 90 이상은 A
        // 80 이상은 B
        // 70 이상은 C
        // 60 이상은 D
        // 59 이하는 F

        //A가 몇명인지 B가 몇명인 ... F가 몇명인지도 출력해야합니다.

        // 실행 예
        /*
            총합 : 몇점
            평균 : 몇점
            A 학생 수 : 몇명
            B 학생 수 : 몇명
            C 학생 수 : 몇명
            D 학생 수 : 몇명
            F 학생 수 : 몇명
         */

        // 풀이법 # 1 -> 5개의 학점에 해당하는 변수를 선언해서 ++
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int f = 0;
        for(int i = 0 ; i < scores3.length ; i++) {
            if(scores3[i] > 89) {
                a++;
            } else if (scores3[i] > 79) {
                b++;
            } else if (scores3[i] > 69) {
                c++;
            } else if (scores3[i] > 59) {
                d++;
            } else {
                f++;
            }
        }
        System.out.println("A 학생 수 : " + a);
        System.out.println("B 학생 수 : " + b);
        System.out.println("C 학생 수 : " + c);
        System.out.println("D 학생 수 : " + d);
        System.out.println("F 학생 수 : " + f);

        // 풀이법 # 2 -> 어차피 abcdf가 다 int니까 배열로 선언하겠다
        int[] scores4 = { 0, 0, 0, 0, 0 };
        for(int i = 0 ; i < scores3.length ; i++) {
            if(scores3[i] > 89) {
                scores4[0]++;
            } else if (scores3[i] > 79) {
                scores4[1]++;
            } else if (scores3[i] > 69) {
                scores4[2]++;
            } else if (scores3[i] > 59) {
                scores4[3]++;
            } else {
                scores4[4]++;
            }
        }

        System.out.println("A 학생 수 : " + scores4[0]);
        System.out.println("B 학생 수 : " + scores4[1]);
        System.out.println("C 학생 수 : " + scores4[2]);
        System.out.println("D 학생 수 : " + scores4[3]);
        System.out.println("F 학생 수 : " + scores4[4]);
    }
}
