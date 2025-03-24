package ch00_review;
/*
    목표 : 객체지향 설계 및 접근 지정자 이해를 바탕으로
    다양한 접근 수준의 필드와 메서드를 갖는 캐릭터 클래스를 정의하고,
    이를 Review13Summary 클래스에서 기능을 테스트합니다.

    클레스 설계
    1. 필드
    name -> 캐릭터 이름(공개 가능) - 전사
    health -> 체력 -> 읽기만 허용 - 100
    power -> 공격력 -> 같은 패키지만 -> 200
    skill -> 스킬이름(자식클래스만) -> 난무
    exp -> 경험치(외부에서 완전 차단) -> 30

    2. 메서드
    getHealth() -> 체력값을 반환하는 getter -> public
    attack() -> 공격 동작시 "name이 power로 공격!" 출력 -> public
    heal() -> 체력을 10회복하고, 현재 체력 출력
package ch00_review;
/*
    목표 : 객체지향 설계 및 접근 지정자 이해를 바탕으로
    다양한 접근 수준의 필드와 메서드를 갖는 캐릭터 클래스를 정의하고,
    이를 Review13Summary 클래스에서 기능을 테스트합니다.

    클래스 설계
    1. 필드
    name -> 캐릭터 이름(공개 가능) - 전사
    health -> 체력 -> 읽기만 허용 - 100
    power -> 공격력 -> 같은 패키지만 -> 200
    skill -> 스킬이름(자식클래스만) -> 난무
    exp -> 경험치(외부에서 완전차단) -> 30

    2. 메서드
    getHealth() -> 체력값을 반환하는 getter             -> public
    attack() -> 공격 동작시
                "name이 power로 공격!"
                "name이(가) 경험치 amount을(를) 얻었습니다." -> 두 줄 출력되게.
    heal() -> 체력을 10 회복하고, 현재 체력 출력
                "체력이 10 회복되었습니다. 현재 체력 : health"
    gainExp(int amount) -> call2()유형인데 경험치를 증가시키는 메서드(내부 전용)
        실행 예
        name이(가) 경험치 amount을(를) 얻었습니다.

    3. Review13Summary 클래스에
        Character character1 = new Character("전사", 25, "난무");로 생성

    4. 실행 예
        캐릭터 이름 : 전사
        체력 : 100
        전사이(가) 25의 힘으로 공격합니다!
        전사이(가) 경험치 10을(를) 얻었습니다!
        전사의 체력이 회복되었습니다! 현재 체력 : 110

 */
class Character {
    // 필드 선언 -> 접근 지정자는 가이드를 보고 알아서 집어넣으세요
    String name;
    int health;
    int power;
    String skill;
    int exp;

    // 생성자
    public Character(String name, int power, String skill) {
        this.name = name;
        this.power = power;
        this.skill = skill;
        this.health = 100;      // 초기체력(매개변수에 없다는 점에 주목)
        this.exp = 0;
    }

    // getHealth()

    // attack()

    // heal()

    // gainExp()
}

public class Review13Summary {
    public static void main(String[] args) {
        Character character1 = new Character("전사", 25, "난무");

        character1.attack();

    }
}