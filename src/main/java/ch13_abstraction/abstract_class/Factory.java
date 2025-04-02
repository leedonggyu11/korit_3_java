package ch13_abstraction.abstract_class;

public abstract class Factory {
    private String name;

    public Factory(String name) {
        this.name = name;
    }

    // 메서드 정의
    public abstract void produce(String model);
    public abstract void manage();
    // 아까 팝업 뜨는거 확인해보니까 method body라는 부분이 저희가 말하는
    // 구현부에 해당하고, 코드로는 {}라는 사실을 확인할 수 있었습니다.
    /*
        근데 abstract가 접근 지정자와 리턴 타입 사이에 명시가 되면,
        클래스도 동일하게 접근 지정자와 class 사이에 abstract가
        있어야만 합니다.

        왜?
        추상 메서드가 하나라도 있으면 추상 클래스가 돼야 하니까.
     */

    // 그렇다고 해서 일반 메서드를 못쓰는게 아니기 때문에

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 우리가 직접 타이핑하는 일반 메서드
    public void displayInfo() {
        System.out.println("공장의 정보를 출력합니다.\n공장 이름 : " + name);
    }
}