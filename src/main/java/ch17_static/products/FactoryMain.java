
package ch17_static.products;

public class FactoryMain {
    public static void main(String[] args) {
        Factory factory1 = new Factory("1공장");
        Factory factory2 = new Factory("2공장");
        Factory factory3 = new Factory("3공장");
        Factory factory4 = new Factory("4공장");

        SmartPhone smartPhone1 = factory1.produceSmartPhone();
        // 이상의 코드에서 .produceSmartPhone()의 리턴 타입이 SmartPhone의 객체였습니다.
        System.out.println(smartPhone1);
        SmartPhone smartPhone2 = factory1.produceSmartPhone();
        System.out.println(smartPhone2);
        SmartPhone smartPhone3 = factory3.produceSmartPhone();
        SmartPhone smartPhone4 = factory4.produceSmartPhone();
        System.out.println(smartPhone3);
        System.out.println(smartPhone4);

        /*
            이상의 코드들을 실행시켰을 때 알 수 있는 점으로는
            어느 공장 객체에서 메서드를 실행시켰든지 간에
            createSerialNumber() 메서드를 호출한 결과가 일원화되어
            시리얼넘버가 부여된다는 점입니다.
         */

    }
}
