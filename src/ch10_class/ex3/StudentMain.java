package ch10_class.ex3;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        //기본생성자로 객체 선언
        Student student1 = new Student();

        //a매개변수가 있는 생성자로 객체 선언
//        Student student2 = new Student("허허허");

        Student student3 = new Student(5);

        Student student4 = new Student("", "");

        Student student5 = new Student("이름1", "전공", "모바일번호");

    }
}
