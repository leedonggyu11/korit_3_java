package ch11_access_modifier;

import java.util.Scanner;

public class BankAccessModifierMain {
    public static void main(String[] args) {
        // 테스트용 객체 생성
//        Bank bank1 = new Bank(1234567, "안근수",
//                10000, 1234);
//        Scanner scanner = new Scanner(System.in);
//
//        int pin = 0;
//
//
//
//        bank1.showInfo();
//        bank1.deposit(1000, 3214);  // 입금하는데 비밀번호 틀리면
//        System.out.println(bank1.getBalance()); // 입금되지 않았는지 확인
//        bank1.deposit(-10, 1234); // 입금하는데 음수값
//        System.out.println(bank1.getBalance()); // 입금되지 않았는지 확인
//        bank1.deposit(2000, 1234);
//        System.out.print("비밀번호를 입력하세요 >>> ");
//        pin = scanner.nextInt();
//        bank1.deposit(3000, pin);
        // pin에 만약에 비밀번호를 맞게 혹은 틀리게 하는 방식으로 테스트 가능
        /*
계좌 번호 : 123456
계좌 소유자 : 홍길동
현재 잔액 : 100000원                 (십만원)

계좌 번호 : 987654
계좌 소유자 : 신사임당
현재 잔액 : 500000원                 (오십만원)

50000원이 입금되었습니다. 현재 잔액 : 150000원            # account1에 대한 입금(오만원 입금)
잔액이 부족하여 출금할 수 없습니다.                        # account1에서 200000원 출금 시도 실패 사례(이십만원 출금 실패사례)
100000원이 출금되었습니다. 현재 잔액 : 50000원            # account1에 대한 출금 (십만원 출금 성공)

100000원이 출금되었습니다. 현재 잔액 : 400000원           # account2에 대한 출금(십만원 출금)
200000원이 입금되었습니다. 현재 잔액 : 600000원           # account2에 대한 입금(이십만원 입금)

최종 계좌 정보
계좌 소유자 : 홍길동
계좌 번호 : 123456
현재 잔액 : 50000원                 (오만원)

계좌 소유자 : 신사임당
계좌 번호 : 987654
현재 잔액 : 600000원                 (육십만원)
         */

        // 객체 2 개 선언 및 초기화
        Bank account1 = new Bank(123456, "홍길동"
                , 100000, 1234);
        Bank account2 = new Bank(987654, "신사임당"
                , 500000, 1234);

        account1.showInfo();
        System.out.println();
        account2.showInfo();
        System.out.println();
        account1.deposit(50000, 1234);
        // 출금 실패 파트
        account1.withdraw(200000, 1234);
        account1.withdraw(100000, 1234);

        // account2에 해당하는 부분
        account2.withdraw(100000, 1234);
        account2.deposit(200000, 1234);
        System.out.println();
        account1.showInfo();
        account2.showInfo();
    }
}