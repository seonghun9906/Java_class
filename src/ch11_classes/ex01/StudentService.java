package ch11_classes.ex01;

public class StudentService {
    //기능들을 처리해주는 용도 (ServiceClass)
    StudetnRepository studetnRepository = new StudetnRepository();

    /**
     * method name : method1
     * parameter : x
     * return : x
     */
    public void method1() {
        System.out.println("StudentService.method1");
        studetnRepository.method1();
    }

    public void method2() {
        System.out.println("StudentService.method2");
        String str1 = "집에 가고 싶다";
        studetnRepository.method2(str1);
    }

    /**
     * StudentDTO 객체를 생성하고
     * Repository의 method3로 DTO 객체를 전달함.
     */

    public void method3() {
        StudentDTO studentDTO = new StudentDTO("이름", "학번", "전공", "모바일");
        boolean result = studetnRepository.method3(studentDTO);
        System.out.println(result);
        if(result){
            System.out.println(studentDTO);
            System.out.println("학생등록 성공");
        }else{
            System.out.println("학생등록 실패");
        }
        System.out.println("StudentService.method3");
    }
}
