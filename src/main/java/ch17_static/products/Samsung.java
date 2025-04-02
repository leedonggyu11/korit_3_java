package ch17_static.products;

import lombok.Getter;

/*
    방금 작성한 ProductView와 Chrome에서의 레퍼런스를 참조하여
    Samsung 클래스를 싱글톤 패턴을로 작성하시오.
 */
public class Samsung {
    // 정적 변수
    private static Samsung instance;
    // 멤버 변수
    @Getter     // getCompany() 메서드만 만들겠다는 뜻이죠.
    private String company;
    private int serialNumber;

    private Samsung() {
        company = getClass().getSimpleName();
        serialNumber = 20250000;
    }

    public static Samsung getInstance() {
        if(instance == null) {
            instance = new Samsung();
        }
        return instance;
    }

    public String createSeiralNumber(String model) {
        return model + "_" + ++serialNumber;
    }
}