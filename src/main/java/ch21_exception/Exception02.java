package ch21_exception;

// 사용자 정의 예외
class LoginFailedException extends Exception {
    public LoginFailedException(String message) {
        super(message);
    }
}

public class Exception02 {
    public static void login(String id, String password) throws LoginFailedException {
        String correctId = "admin";
        String correctPassword = "1q2w3e4r";

        if(!id.equals(correctId) || !password.equals(correctId)) {
            throw new LoginFailedException("ID 또는 PW가 틀렸습니다.");
        }
    }


    public static void main(String[] args) {
        String inputId = "admin";
        String inputPassword = "qwer1234";

        try {
            login(inputId, inputPassword);
            System.out.println("로그인 성공");
        } catch (LoginFailedException e) {
            System.out.println("로그인 실패 : " + e.getMessage());
        } finally {
            System.out.println("프로그램 정상 종료");
        }
    }
}