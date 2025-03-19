package ch07_loops;
/*
    while 반복문
    형식 :
    while(조건식) {
        반복실행문
    }

    while 뒤에 나오는 (조건식)을 봤을 때 if(조건식) 형태와 유사함을 알 수 있습니다.

    즉, while() 내에 있는 조건식이 true일 때, {} 내의 실행이 반복적으로 이루어집니다.

    그래서 주의할 점이 있는데,
    while 내부에 있는 조건식이 특정 시점에 false가 되도록 미리 지정해둘 필요가 있다는 점

    false가 되는 시점을 지정해주지 않는다면 무한히 반복실행문이 실행된다는 점에서
    무한루프(infinite loops)라는 표현을 씁니다.
 */
public class Loop01 {
    public static void main(String[] args) {
//        int i = 1;
//
//        while(i < 100) {
//            System.out.println(i);
//            i++;
//        }

        int sum = 0;
        int i = 0;
        // 1부터 10까지의 합을 구한다고 가정했을 때
        while(i < 11) {
            sum += (i);
            i++;
        }

        System.out.println(sum);

        int sum2 = 0;
        int i2 = 0;
//        1부터 100까지의 홀수만 더해보도록 하겠습니다.

        while(i2 < 101) {
            if(i2 % 2 == 1) {
                sum2 += i2;
            } // 만약에 아니라면 실행이 안될거니까 굳이 else를 쓸 필요는 없습니다.
            i2++;
        }
        System.out.println(sum2);

        int sum3 = 0;
        int i3 = 1;

        while(i3 < 101) {
            sum3 += i3;
            i3 += 2;            // i3 = i3 + 2
        }
        System.out.println(sum3);
    }
}
