package ch02_operator;

public class Ex05_IncreaseDevreaseOperator {

    public static void main(String[] args) {
//		증감연산자
        int num1 = 10, num2 = 0, num3 = 0;
        System.out.println("num1 : " + num1 + " num2 : " + num2 + " num3 : " + num3);
        num2 = ++num1;
        System.out.println("num1 : " + num1 + " num2 : " + num2 + " num3 : " + num3);
        num2 = ++num1; // num1 12 num2 12 num3 0
        num3 = num1++; // num1 = 13 num2= 12 num3= 12
        System.out.println("num1 : " + num1 + " num2 : " + num2 + " num3 : " + num3);

        int result1 = num1++ + ++num2; // num1 = 13 + num2 = 13 으로 변경;
        System.out.println("num1 : " + num1 + " num2 : " + num2 + " num3 : " + num3);
        System.out.println(result1);

//		result1 = 26?  num1 = 14 num2 = 13 num3 = 12

        int result2 = num2++ + ++num3;  // num2 = 13 num3 = 13 26
        System.out.println("num1 : " + num1 + " num2 : " + num2 + " num3 : " + num3);
        System.out.println(result2);

//		num1 = 14 num2 = 14 num3 = 13 result2 = 26

    }
}
