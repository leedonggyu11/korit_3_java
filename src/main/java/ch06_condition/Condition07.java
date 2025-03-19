package ch06_condition;

import java.util.Scanner;

/*
    switch문

    형식 :
    switch(변수명)
        case 조건1:
            실행문1
            break;
        case 조건2:
            실행문2
            break;
        case 조건3:
            실행문3
            break;
        case 조건4:
            실행문4
            break;
        default:
            실행문5
 */
public class Condition07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        String selected = null;

        System.out.println(" [ 선택 프로그램 ]");
//        System.out.println("a. 메뉴1");
//        System.out.println("b. 메뉴2");
//        System.out.println("c. 메뉴3");
//        System.out.println("d. 메뉴4");
//        System.out.println("e. 메뉴5");
        System.out.println("1. 메뉴1");
        System.out.println("2. 메뉴2");
        System.out.println("3. 메뉴3");
        System.out.println("4. 메뉴4");
        System.out.println("5. 메뉴5");

        System.out.print("메뉴를 선택하세요 >>> ");
//        selected = scanner.nextLine();
        int selected2 = scanner.nextInt();

        switch (selected2) {
            case 1:
                System.out.println("메뉴1을 선택하셨습니다.");
                break;
            case 2:
                System.out.println("메뉴2을 선택하셨습니다.");
                break;
            case 3:
                System.out.println("메뉴3을 선택하셨습니다.");
                break;
            case 4:
                System.out.println("메뉴4을 선택하셨습니다.");
                break;
            case 5:
                System.out.println("메뉴5을 선택하셨습니다.");
                break;
            default:
                System.out.println("잘못 입력하셨습니다.");
        }



//        if (selected.equals("a")) {
//            System.out.println("메뉴1을 선택하셨습니다.");
//        } else if (selected.equals("b")) {
//            System.out.println("메뉴2을 선택하셨습니다.");
//        }     -> 이렇게 쓰는건 가독성을 너무 해친다.

//        switch (selected) {
//            case "a":
//                System.out.println("메뉴1을 선택하셨습니다.");
//                break;
//            case "b":
//                System.out.println("메뉴2를 선택하셨습니다.");
//                break;
//            case "c":
//                System.out.println("메뉴3를 선택하셨습니다.");
//                break;
//            case "d":
//                System.out.println("메뉴4를 선택하셨습니다.");
//                break;
//            case "e":
//                System.out.println("메뉴5를 선택하셨습니다.");
//                break;
//            default:
//                System.out.println("잘못 선택하셨습니다.");
//        }
    }
}
