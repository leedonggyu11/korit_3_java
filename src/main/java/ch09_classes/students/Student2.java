package ch09_classes.students;

public class Student2 {
    int studentCode;
    String name;
    double score;

    public Student2() {
        System.out.println("기본 생성자로 객체가 생성되었습니다.");
    }

    public Student2(int studentCode) {
        this.studentCode = studentCode;
        System.out.println("int 매개변수 생성자로 객체가 생성되었습니다.");
    }

    public Student2(String name) {
        this.name = name;
        System.out.println("String 매개변수 생성자로 객체가 생성되었습니다.");
    }

    public Student2(int studentCode, String name) {
        this.studentCode = studentCode;
        this.name = name;
        System.out.println("int, String 매개변수 생성자로 객체가 생성되었습니다.");
    }

    public Student2(int studentCode, String name, double score) {
        this.studentCode = studentCode;
        this.name = name;
        this.score = score;
        System.out.println("int, String, double 매개변수 생성자로 객체가 생성되었습니다.");
    }

    void showInfo() {
        System.out.println("\n" + name + " 학생의 정보입니다.\n학번 : " + studentCode);
        System.out.println("이름 : " + name + "\n점수 : " + score);
    }
}
