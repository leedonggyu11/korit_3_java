package ch12_arrays;

import java.util.Arrays;
import java.util.Comparator;

/*
    여태까지 배운 Java 클래스
    String
    Scanner
    Arrays
    Integer
    Double
    Comparator
    Random
    방금 배운거
    Math

    지시 사항
    배열 이름은 numbers[]

    1. index가 10개인 빈 배열을 만들고, Math.random()을 활용하여 값을 넣을겁니다.
        : 1 이상 10 이하의 int 값으로 만들어서.

    2. 1을 끝내게 되면 numbers 배열 안에는 1 ~ 10의 element를 가지게 될겁니다(중복)
        1) 배열 전체 출력 -> Arrays를 사용하면 되겠지만
        2) 각 요소에 10씩 곱해서 한 줄에 출력 -> element별로 뽑아내서 연산
    3. 해당 배열의 합의 크기를 구할 것
        (랜덤으로 element 집어넣으니까 실행할때마다 값이 다를 예정)
    4. 짝수만 출력해서 합을 구할 것

    5. 배열을 오름 차순으로 정렬해서 출력
    6. 내림 차순으로 정렬해서 출력
 */
public class Array12 {

    public static void main(String[] args) {
        // Math 클래스를 사용한 임의의 실수 대입
//        double a = Math.random();   // 0.0초과 1.0미만의 난수 생성해서 반환
//        System.out.println(a);
        // 빈 배열 선언
        Integer[] numbers = new Integer[10];
        int sum = 0;
        int evenSum = 0;
        /*
            Math.random()의 결과값은 0.0~1.0미만이므로
            0.0 < a < 1.0           에서 10 곱해주고
            0.0 < a < 10.0          에서 1 더해줍니다.
            1.0 < a < 11.0          그럼 이렇게 되는데 이걸 int로 형변환하면되지요.
         */
        // 1 <= a <= 10 사이의 난수를 numbers에 대입하는 반복문 작성
        for( int i = 0 ; i < numbers.length ; i++ ) {
            numbers[i] = (int)(Math.random()*10) + 1;
        }
        // 배열 전체 출력
        System.out.println(Arrays.toString(numbers));
        // 각 element를 뽑아서 10 곱한 결과를 출력 -> for문 써야합니다.
        for ( int number : numbers ) {
            System.out.print((number*10) + " ");
            sum += number;
            //여기에 바로 evenSum을 구하기 위한 조건문을 작성할 수도 있겠죠.
            if(number % 2 == 0) {
                evenSum += number;
            }
        }
        System.out.println();
        System.out.println("총합 : " + sum);
        System.out.println("짝수합 : " + evenSum);

        // 오름 차순 배열
        Arrays.sort(numbers);
        System.out.println("오름 차순 배열 : " + Arrays.toString(numbers));
        // 내림 차순 배열
        Arrays.sort(numbers, Comparator.reverseOrder());
        System.out.println("내림 차순 배열 : " + Arrays.toString(numbers));
    }


}