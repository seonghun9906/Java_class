package ch10_class.ex7;

import java.util.Scanner;

public class Calculator {
    Scanner sc = new Scanner(System.in);
    /**
     * 덧셈 메서드
     * method name = sum
     * parameter : int 타입 2개
     * return : x
     * 실행내용
     * - 매개변수로 전달 받은 2개 값의 합을 출력
     *
     * 매개 o 리턴 X
     */

    /**
     * 뺄셈 메서드
     * method name ; sub
     * parameter : int 타입 2개
     * return : X
     * 실험내용
     * - 매개변수로 전달 받은 2개의 차를 출력
     * 매개 o  리턴 o
     */

    /**
     * 곱셈 메서드
     * method name ; mul
     * parameter : int 타입 2개
     * return : int 타입
     * 실행내용
     *  - 매개변수로 전달 받은 2개의 값의 곱 결과를 리턴
     *  매개 o , 리턴 o
     */

    /**
     * 나눗셈 메서드
     * method name : div
     * parameter : 없음
     * return : int 타입
     * 실행내용
     * - 스캐너로 나눗셈에 필요한 정수 2개를 입력받음
     * - 나눗셈 결과를 리턴
     */

    public void sum(int num1, int num2) {
        int sum = (num1 + num2);
        System.out.println(sum);
    }

    public void sub(int num1, int num2) {
        int sub = (num1 - num2);
        System.out.println(sub);
    }

    public int mul(int num1, int num2) {
        int mul = (num1 * num2);
        return mul;
    }

    public int div() {
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int div = (num1 / num2);
        return div;
    }
}
