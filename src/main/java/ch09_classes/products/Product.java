package ch09_classes.products;

public class Product {

    int productNum;
    String productName;

    // 생성자 정의 부분
    Product() {};

    Product(int productNum) {
        this.productNum = productNum;
    }

    Product(String productName) {
        this.productName = productName;
    }

    Product(int productNum, String productName) {
        this.productNum = productNum;
        this.productName = productName;
    }

    // showInfo() 정의 부분
    void showInfo() {
        System.out.println("시리얼 넘버 : " + productNum);
        System.out.println("제품 타이틀 : " + productName);
    }
}
