package ch12_inheritance.book;
/*
    부모 클래스 : Book
    자식 클래스 : EBook
    실행 클래스 : BookMain

    지시 사항
    1. private title / author
    2. 생성자는 AllArgsConstructor
    3. setter / getter

    EBook 클래스에서
    EBook 클래스는 Book을 상속 받아야 합니다.
    자식 필드로 private double fileSize / String format
    displayInfo() 메서드를 call1() 타입으로 정의합니다.
    예시
    제목 : 뭐시기
    저자 : 누구누구
    파일 크기 : 어쩌고저쩌고 MB
    파일 형식 : PDF / EPUB ...

    BookMain으로 넘어가서
    Book 클래스의 인스턴스를 생성합니다.
    제목이랑 저자 출력합니다(Getter 이용)
    실행 예
    이 책의 제목은 자바의 정석입니다.
    이 책의 저자는 남궁성입니다.

    EBook 클래스의 인스턴스를 생성합니다.
    스프링 입문 / 이강준 / 5.2 / EPUB
    그 다음 setter 이용하여 파일 형식을 PDF로 변환
    그 다음 getter 이용해서
    이 전자책의 포맷은 PDF입니다. 를 출력할 것

    eBook1.displayInfo()를 실행하여 전체 정보를 출력할 것
 */
public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}