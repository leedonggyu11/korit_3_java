package ch00_review;
/*
    method - 순차적으로 실행되는 여러 코드들을 하나의 이름으로 묶어둔 것
        유형을 저희는 call1() ~ call4() 매개변수 유무 / return 유무로
        분할해서 학습했었습니다.

    형식 :
        (접근지정자) 리턴타입 메서드명(매개변수1, 매개변수2) {
            메서드에 순서대로 들어갈 코드들
        }
    정의 예시 :
        public void writeSchedule(String date, String content) {
            System.out.println(date + "일의 스케줄은 다음과 같습니다.");
            System.out.println(content);
        }
    호출 예시 :
        같은 클래스 내에 정의된 메서드라면(즉, 지금 상황이라면)

        writeSchedule("20250321", "메서드/오버로딩/클래스 복습");
 */
public class Review05 {
    // 메서드 정의 영역

    // call2() 유형으로 정의
    public void writeSchedule(String date1, String content) {
        System.out.println(date1 + "일의 스케줄은 다음과 같습니다.");
        System.out.println(content);
    }
    // overloading의 예시
    public void writeSchedule(int date2, String content) {
        System.out.println(date2 + "일의 스케줄은 다음과 같습니다.");
        System.out.println(content);
    }
    // call2() 유형으로 작성할건데, int 숫자 하나를 매개변수로 받아가지고, 그 숫자 7의 배수인지 아닌지를 확인하는 메서드
    void dividedBySeven(int randomNumber) {
        // randomNumber를 호출 단계에서 임의의 숫자로 받을텐데, 걔가 7로 나누어지는지 확인하는 메서드를 작성하시오.
//        if(randomNumber % 7 == 0) {
//            System.out.println(randomNumber + "는 7의 약수입니다.");
//        } else {
//            System.out.println(randomNumber + "는 7의 약수가 아닙니다.");
//        }

        // 지역변수
        String answer = "";
        if (randomNumber % 7 == 0) {
            answer = "는 7의 약수입니다.";
        } else {
            answer = "는 7의 약수가 아닙니다.";
        }
        System.out.println(randomNumber + answer);
    }
    /*
        매개변수로 한계값을 받아서 메서드를 호출 했을 때 1부터 한계값까지 출력하는 메서드를
        작성하시오.
        호출 방식 :
        review05.printLimitNumber(100);
        실행 예
        1 2 3 4 5 6 7 8 9 10 11 ... 100
     */
    void printLimitNumber(int limitNum) {
        // 로직이 필요하겠죠.
        for (int i = 0 ; i < limitNum ; i++) {
            System.out.print((i+1) + " ");
        }
    }
    // 이상의 메서드를 참조하여 한계값을 매개변수로 받아 짝수만 출력하는 메서드를 정의하시오.
    /*
        호출 방식
        review05.printEvenNumber(50);
        실행 예
        2 4 6 8 10 ... 48 50
     */
    void printEvenNumber(int limitNum) {
        for (int i = 0 ; i < limitNum ; i+=2) {
            // 짝수만 가지고 올 수 있게끔 하는 조건문
            int addedI = i+1;
            if(addedI % 2 == 0) {
                System.out.print(addedI + " ");
            }
        }
    }

    /*
        이제 매개변수를 두 개 받을겁니다.
        첫번째 매개변수에는 한계값 / 두 번째 매개변수로는 나누는 값
        호출 방식 :
        review05.printSpecificNums(50, 4);
        실행 예
        4 8 12 ... 40 44

        review05.printSpecificNums(20, 3);
        3 6 9 18
     */

    void printSpecificNums(int limitNum, int dividingNum) {
        for (int i = 1 ; i < limitNum + 1 ; i++) {
            // 특정한 숫자로 나누었을 때 나머지가 0인 숫자만 출력하는 조건문 작성
            if(i % dividingNum == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Review05 review05 = new Review05();
        // 메서드 호출 영역
//        review05.writeSchedule("20250321", "메서드/오버로딩/클래스 복습");
//        review05.writeSchedule(20250321, "메서드/오버로딩/클래스 복습");
//
//        // 과제 메서드 호출
//        review05.dividedBySeven(454789);

        review05.printLimitNumber(100);
        System.out.println();
        review05.printEvenNumber(50);
        System.out.println();
        review05.printSpecificNums(30, 3);
    }
}