package ch10_class.ex7;

import java.util.Scanner;

public class CalculatorMain {
    /**
    * 실행하면 반복문으로 메뉴를 출력
    * 1.덧셈 2.뺄셈 3.곱셈 4.나눗셈
    * 각 번호를 선택하면 Calculator 클래스에 있는 해당 메서드 호출
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        Calculator calculator = new Calculator();
        int num1 = 0;
        int num2 = 0;

        while(run) {
            System.out.println("1.덧셈 | 2.뺼셈 | 3.곱셈 | 4.나눗셈 | 5.종료");
            int number = sc.nextInt();

            if(number == 1){
                System.out.println("두가지 정수를 입력하세요.");
                num1 = sc.nextInt();
                num2 = sc.nextInt();
                calculator.sum(num1,num2); // calculator.sum = 호출 (num1, num2) = 전달
            }else if(number == 2){
                System.out.println("두가지 정수를 입력하세요.");
                num1 = sc.nextInt();
                num2 = sc.nextInt();
                 calculator.sub(num1,num2);
            }else if(number == 3){
                System.out.println("두가지 정수를 입력하세요.");
                num1 = sc.nextInt();
                num2 = sc.nextInt();
                System.out.println(calculator.mul(num1,num2));
            }else if(number == 4){
                System.out.println("두가지 정수를 입력하세요.");
                System.out.println(calculator.div());
            }else{
                run = false;
            }
        }
    }
}
