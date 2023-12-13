package ch10_class.ex9;

public class Student {
    // 필드, getter, setter, 기본생성자, 매개변수 생성자, toString
    /*
        필드
        이름(StudentName)
        학번(StudentNumber)
        학과(StudentMajor)
        전화번호(StudentMobile)
     */

    // 각 필드의 getter/setter 메서드

    private String studentName;
    private String studentNumber;
    private String studentMajor;
    private String studentMobile;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;

    }

    public String getStudentMajor() {
        return studentMajor;

    }

    public void setStudentMajor(String studentMajor) {
        this.studentMajor = studentMajor;

    }

    public String getStudentMobile() {
        return studentMobile;
    }

    public void setStudentMobile(String studentMobile) {
        this.studentMobile = studentMobile;

    }

    // 기본생성자
    public Student() {
    }

    //  모든 필드를 매개변수로 하는 생성자
    public Student(String studentName, String studentNumber, String studentMajor, String studentMobile) {
        this.studentName = studentName;
        this.studentNumber = studentNumber;
        this.studentMajor = studentMajor;
        this.studentMobile = studentMobile;
    }

    // 필드에 저장된 값을 출력하는 print() 메서드
    public void print() {
        System.out.println(getStudentName());
        System.out.println(getStudentNumber());
        System.out.println(getStudentMajor());
        System.out.println(getStudentMobile());
        System.out.println(studentName +"/" + studentNumber +"/" + studentMajor + "/"+ studentMobile);
    }

    /**
     *  method name : toString
     *  return type ' String
     *  parameter : X
     */
    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentNumber='" + studentNumber + '\'' +
                ", studentMajor='" + studentMajor + '\'' +
                ", studentMobile='" + studentMobile + '\'' +
                '}';
    }
}
