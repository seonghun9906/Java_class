package ch15_Interface.ex01;

public class IntMain {
    public static void main(String[] args) {
        // 인터페이스 객체 선언(x)
//        Interface1 interface1 = new Interface1();
        //구현클래스 자체를 객체로 사용할 수 있지만
        //이렇게 사용하지 않음.
        Impl1 impl1 = new Impl1();
        impl1.method1();

        //인터페이스 구현클래스 객체를 사용할 떄는
        //좌변은 인터페이스 타입의 변수 선언
        //우변은 구현클래스이 생성자를 사용
        Interface1 interface1 = new Impl1();
        interface1.method1();
        interface1 = new Impl2();
        interface1.method1();

        //좌변이 변경되지 않는 장점이 있음.
    }
}
