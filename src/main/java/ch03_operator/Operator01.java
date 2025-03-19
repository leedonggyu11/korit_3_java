package ch03_operator;
/*
    package명 -> 소문자로 작성
    class명 -> 대문자로 시작하고 복수의 단어인 경우에는 다음과 같이 작성함
        ex) 한 단어 : Example01
            복수 단어 : MyExample01
    이상에서 확인할 수 있는 것은 클래스 작성법이 변수 작성법과 유사하기는 하지만,
    첫 시작이 대문자냐 아니냐의 차이가 있습니다.
    첫 문자가 대문자이면서 두 번째 단어의 첫 문자를 대문자로 작성하는 것을 -> 파스칼 케이스
    첫 문자가 소문자이면서 두 번째 단어의 첫 문자를 대문자로 작성하는 것을 -> 카멜 케이스
 */
public class Operator01 {
    public static void main(String[] args) {
        // 변수 선언 및 초기화
//        int i = 10;
//        System.out.println(i);

        // 대입 연산자 : '=' : = 오른쪽에 있는 데이터를 = 왼쪽에 있는 변수에 대입한다는 의미로
        // 변수와 데이터가 동일하다는 의미는 아닙니다.

        // a와 b가 같은 값을 지니고 있다는 의미로 표시를 할 때에는
        // a == b

//        i = i + 10;
//
//        System.out.println(i);

        /*
            복합 대입 연산자

            1) +=
            2) -=
            3) *=
            4) /=
         */
//        int num = 1;
//        System.out.println(num);
//        num += 2;                           // num = num + 2;
//        System.out.println(num);
//        num -= 1;
//        System.out.println(num);            // num = num - 1;
//        num *= 10;
//        System.out.println(num);            // num = num * 10;
//        num /= 5;
//        System.out.println(num);            // num = num / 5;

//        int j = 10;
//        System.out.println(j);
//        System.out.println(j++);        // 변수명++ : 코드를 실행시킨 후에 j에 1을 더함
//        System.out.println(j);          // 윗줄의 결과 11이 출력됨
//        System.out.println(++j);        // ++변수명 : 코드를 실행시키기 전에 j에 1을 더함
//        System.out.println(j--);        // 변수명-- : 코드를 실행시킨 후에 j에 1을 뺌
//        System.out.println(j);          // 윗줄의 결과 11이 출력됨
//        System.out.println(--j);        // 결과값 10

        /*
            일반 수식 연산자
            + : 더하기
            - : 빼기
            * : 곱하기
            / : 나누기
            % : 나머지 연산자
         */

        System.out.println("10 / 2의 나머지 : " + (10%2));
        System.out.println("10 / 3의 나머지 : " + (10%3));
        System.out.println("10 / 4의 나머지 : " + (10%4));

        System.out.println(10/2);
        System.out.println(10.0/3.0);
        System.out.println(10.0/4.0);

        int age = 10;

        System.out.println("제 나이는 " + age + "살입니다. 내년에는 " + (age + 1)  + "살이 됩니다.");
    }
}
