package ch04_scanner;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.print("x 입력 : ");
//        int x = scanner.nextInt();
//
//        System.out.print("y 입력 : ");
//        int y = scanner.nextInt();
//
//        System.out.println("x + y = " + x + y);
//        System.out.println("x + y = " + (x + y));

        System.out.print("a 입력 : ");
        String a = scanner.nextLine();
        System.out.print("b 입력 : ");
        String b = scanner.nextLine();

        System.out.println("a + b = " + a + b);
        System.out.println("a + b = " + (a + b));
    }
}
