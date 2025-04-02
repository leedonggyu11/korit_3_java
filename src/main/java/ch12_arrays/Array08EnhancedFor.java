package ch12_arrays;
/*
    향상된 for문(Enhanced For Loop)

    일반 for문과의 차이점 :
        일반 for문의 경우 인덱스 넘버(주소지)를 명확하게 알고 있어야
        하지만 일일이 element의 숫자를 세는 것이 번거롭기 때문에
        arr01.length와 같은 방식으로 int 값을 추출해서 대입했습니다.

        그런데 잘 생각해보면 for (int i = 0 ; ...)할 때의 int i는
        for문 내부에서 선언됩니다.

        이를 응용하여 배열 내의 element를 변수에 대입해버리는 방식으로
        index 넘버(주소지)의 사용 없이 적용할 수 있는 for 반복문이 있는데,
        이를 향상된 for문이라고 합니다.

    제약 :
        읽기만 되고, 쓰기가 안됩니다.(1부터 100까지 추출하는건 되는데, 1부터 100까지
            입력은 불가능)

    형식 :
    for( 자료형 변수명 : 반복가능객체(배열) ) {
        반복실행문
    }
 */
public class Array08EnhancedFor {
    public static void main(String[] args) {
        int[] numbers = new int[200];

        // 1부터 200까지 대입하시오.
        for (int i = 0 ; i < numbers.length ; i++) {
            numbers[i] = (i+1);
        }

        // 일반 for문 형태로 1 2 3 4 5 6 7 ... 200 출력하시오
        for (int i = 0 ; i < numbers.length ; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        // 향상된 for문으로 작성
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        String[] names = { "강수림", "기준성", "김미진", "김준식",
                "문성진", "심민호", "양지은", "유지현", "윤현지", "이동규",
                "이예성", "이정화", "전용남", "채수원", "한영진"};

        System.out.println();
        // 향상된 for문으로 String[] 배열 읽어오기
        for(String name : names) {
            System.out.print(name + " ");
        }
    }
}