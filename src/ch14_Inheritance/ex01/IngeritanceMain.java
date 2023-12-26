package ch14_Inheritance.ex01;

public class IngeritanceMain {
    public static void main(String[] args) {
        ParentClass parentClass = new ParentClass();


        parentClass.setName("이름1");
        parentClass.setAge(10);
        System.out.println("parentClass = " + parentClass);
        parentClass.hello();

        ChildClass childClass = new ChildClass();
        //상속을 받았기 떄문에 자식클래스에서 get, set 메서듯 사용 가능.
        childClass.setName("자식");
        childClass.setAge(100);
        System.out.println("childClass = " + childClass);
        childClass.hello();
//
        //좌변 : 부모타임의 객체, 우변 : 자식클래스 생성자
        ParentClass parentClass1 = new ChildClass();
        parentClass1.hello();
        parentClass1 = new ParentClass();
        parentClass1.hello();
//        좌변 : 지식타입의 객체, 우변: 부모클래스 생성자
//        ChildClass childClass1 = new ParentClass();
        //childClass childClass1 = new parentClass;

    }
}
