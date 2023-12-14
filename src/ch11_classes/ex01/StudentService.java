package ch11_classes.ex01;

public class StudentService {
    //기능들을 처리해주는 용도 (ServiceClass)
    StudetnRepository studetnRepository = new StudetnRepository();
    /**
     * method name : method1
     * parameter : x
     * return : x
     */
    public void method1(){
        System.out.println("StudentService.method1");
        studetnRepository.method1();
    }
    public void method2(){
        System.out.println("StudentService.method2");
        String str1 = "집에 가고 싶다";
        studetnRepository.method2(str1);
    }
    public void method3(){
        System.out.println("StudentService.method3");
    }
}
