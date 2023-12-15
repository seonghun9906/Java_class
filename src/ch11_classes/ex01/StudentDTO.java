package ch11_classes.ex01;

public class StudentDTO {
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

    public StudentDTO() {

    }

    private static Long idValue = 1L;

    public StudentDTO(String studentName, String studentNumber, String studentMajor, String studentMobile) {
        this.id = idValue++;
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


