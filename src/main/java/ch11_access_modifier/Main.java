package ch11_access_modifier;

class AccessModifierExample {
    // 필드 선언
    public int publicVar = 10;
    protected int protectedVar = 20;
    int defaultVar = 30;
    private int privateVar = 40;

    // 메서드 선언
    public void show() {
        System.out.println("public : " + publicVar);
        System.out.println("protected : " + protectedVar);
        System.out.println("default : " + defaultVar);
        System.out.println("private : " + privateVar);
    }
}

public class Main {
    public static void main(String[] args) {
        // 객체 생성(사용할 클래스 import)
        AccessModifierExample accessModifierExample = new AccessModifierExample();
        System.out.println(accessModifierExample.publicVar);
        System.out.println(accessModifierExample.protectedVar);
        System.out.println(accessModifierExample.defaultVar);
//        System.out.println(accessModifierExample.privteVar); // 얘는 오류 발생

        accessModifierExample.show();
    }
}