package ch04_if;

import java.util.Scanner;

public class Ex08_IfExample {

	public static void main(String[] args) {
		// 서로 다른 정수 3개를 입력받아서 가장 큰 정수 출력하기
//		(같은 숫자는 입력하지 않는다고 가정)
		// 입력 예
//		첫번쨰 숫자:
//		두번쨰 숫자:
//		세번째 숫자:
//		
//		출력 예
//		가장 큰 숫자는 00 입니다.
		Scanner scanner = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;

		System.out.print("첫번째 숫자 : ");
		num1 = scanner.nextInt();
		System.out.print("두번째 숫자 : ");
		num2 = scanner.nextInt();
		System.out.print("세번째 숫자 : ");
		num3 = scanner.nextInt();

		String a = "";

		if (num1 > num2 && num1 > num3) {
			a = "가장 큰 숫자는 " + num1 + "입니다.";
		} else if (num2 > num3 && num2 > num1) {
			a = "가장 큰 숫자는 " + num2 + "입니다.";
		} else {
			a = "가장 큰 숫자는 " + num3 + "입니다.";
		}
		System.out.println(a);

	}

}
