package ch07_loops;
/*
    while문을 사용하여

    1 2 3 4 5 6 7 8 9 10
    11 12 13 14 15 16 17 18 19 20
    ...
    91 92 93 94 95 96 97 98 99 100

    이 출력되도록 작성하시오.
 */
public class Loop03 {
    public static void main(String[] args) {
//        int num = 1;
//
//        // 반복을 100번했습니다 num = 1 ~ num = 100
//        while(num < 101) {
//            System.out.print(num + " ");
//            if(num % 10 == 0){
//                System.out.println();
//            }
//            num++;
//        }

        int num2 = 1;
        while(num2 < 101) {
            System.out.println(num2 + " " + (num2+1) + " " + (num2+2) + " " + (num2+3) + " " + (num2+4) + " " + (num2+5) + " " + (num2+6) + " " + (num2+7) + " " + (num2+8) + " " + (num2+9));
            num2 += 10;
        }
    }
}
