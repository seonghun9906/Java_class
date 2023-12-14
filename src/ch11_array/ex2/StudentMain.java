package ch11_array.ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        // Student 클래스 객체를 담기 위한 List
        // StudentList
        List<Student> studentList = new ArrayList<>();
        // studentList.add(12); //x
//        String studentName = "학생1";
//        studentList.add(student); //x
        // Student 객체
        Student student1 = new Student(1L,"학생1", "20231111", "현대무용", "010-1111-1111");
        Student student2 = new Student(2L,"학생2", "20232222", "실용무용", "010-2222-2222");
        // studentList 추가
        studentList.add(student1);
        studentList.add(student2);

        System.out.println("student1.get(0) = " + studentList.get(0));
        System.out.println("student.get(1) = " + studentList.get(1));
        
        Student a = studentList.get(0);
        System.out.println("a = " + a);
        System.out.println(a.getStudentName());

        //1번 인덱스에 담긴 객체의 학과만 출력을 한다면.
        System.out.println(studentList.get(1).getStudentMajor());

        // 반복문
        for (int i = 0; i < studentList.size() ; i++) {
            System.out.println(studentList.get(i));
            //학생의 이름만 따로 출력
            System.out.println(studentList.get(i).getStudentName());

        }

        //for each
        for(Student stu : studentList){
            System.out.println("stu = " + stu);
            //이름만 따로 출력
            System.out.println(stu.getStudentName());
        }



            }
        }





