package ch10_class.ex9;

public class StudentMain {
    public static void main(String[] args) {
    // 기본생성자로 Student 클래스 객체 만들고 setter를 이용하여 필드값 채우기
        Student student = new Student();
        student.setStudentName("지성훈");
        student.setStudentNumber("18510148");
        student.setStudentMajor("실용무용전공");
        student.setStudentMobile("01079193622");

    // 모든 필드를 매개변수로 하는 생성자로 Student 클래스 만들기
       Student student1 = new Student("ㅇㅇㅇ", "123456", "전공", "1015489897");

    // 각각의 객체에서 print 메서드 호출하여 필드값 출력

        student.print();
        student1.print();
    }
}
