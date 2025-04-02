package ch15_objects.teacher;

public class TeacherMain {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("안근수", "코리아아이티");
        Teacher teacher2 = new Teacher("안근수", "코리아아이티");

        boolean result1 = teacher1.equals(teacher2);
        System.out.println(result1); // true
        boolean result2 = teacher1 == teacher2;
        System.out.println(result2); // false


    }
}