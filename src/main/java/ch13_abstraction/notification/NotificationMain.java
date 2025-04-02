package ch13_abstraction.notification;
/*

 */
public class NotificationMain {
    public static void main(String[] args) {
        EmailNotification emailNotification = new EmailNotification("adimin@test.com",
                "user@example.com", "가입 대기", 1);

        emailNotification.setPriority(8);                       // 불가능
        System.out.println(emailNotification.getPriority());    // 여전히 1임을 확인 가능
        emailNotification.printNotificationInfo();
        emailNotification.validateRecipient();      // 얘는 만들 때 똑바로 만들어놨기 때문에
        // 실패 사례를 확인하고 싶다면 추가적인 객체를 생성하거나 혹은 setter를 통해
        // recipient 필드를 수정하는 방법도 고려할 수 있겠습니다. -> setter를 만든다면
        // NotificationSystem에 setRecipient를 추가해야겠죠.
        emailNotification.send();
        emailNotification.updateMessage("가입 승인");      // 아까전에 formatMessage는 서브 클래스에서
        // updateMessage()를 호출했지만 부모 클래스의 것이기 때문에 곧장 사용도 가능.
    }
}