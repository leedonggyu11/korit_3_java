package ch10_setter_getter.univ_student;

public class UnivStudentMain {
    public static void main(String[] args) {
        //객체생성
        UnivStudent student1 = new UnivStudent();
        UnivStudent student2 = new UnivStudent();
        UnivStudent student3 = new UnivStudent();
        UnivStudent student4 = new UnivStudent();
        UnivStudent student5 = new UnivStudent();


                student1.setName("김일");
                student1.setGrade(1);
                student1.setscore(3.3);

                student2.setName("김이");
                student2.setGrade(3);
                student2.setscore(-30);
                student2.setscore(2.7);

                student3.setName("김삼");
                student3.setGrade(5);
                student3.setGrade(2);
                student3.setscore(2.7);

                student4.setName("김사");
                student4.setGrade(4);
                student4.setscore(3.8);

                student5.setName("김오");
                student5.setGrade();
                student5.setscore();

    }
}
