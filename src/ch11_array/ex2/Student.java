package ch11_array.ex2;

public class Student {
    /**
     * 필드
     *  관리번호(id)
     *  이름(StudentName)
     *  학번(StudentNumber)
     *  학과(StudentMajor)
     *  전화번호(StudentMobile)
     *
     *  getter / setter
     *
     *  셍성자 2가지
     *
     *  toString
     */

    private Long id;
    private String StudentName;
    private String StudentNumber;
    private String StudentMajor;
    private String StudentMobile;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public String getStudentNumber() {
        return StudentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        StudentNumber = studentNumber;
    }

    public String getStudentMajor() {
        return StudentMajor;
    }

    public void setStudentMajor(String studentMajor) {
        StudentMajor = studentMajor;
    }

    public String getStudentMobile() {
        return StudentMobile;
    }

    public void setStudentMobile(String studentMobile) {
        StudentMobile = studentMobile;
    }

    public Student(){

    }

    public Student(Long id, String studentName, String studentNumber, String studentMajor, String studentMobile) {
        this.id = id;
        StudentName = studentName;
        StudentNumber = studentNumber;
        StudentMajor = studentMajor;
        StudentMobile = studentMobile;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", StudentName='" + StudentName + '\'' +
                ", StudentNumber='" + StudentNumber + '\'' +
                ", StudentMajor='" + StudentMajor + '\'' +
                ", StudentMobile='" + StudentMobile + '\'' +
                '}';
    }
}
