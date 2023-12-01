package ch03_scanner;

import java.util.Scanner;

public class Ex02_Calculator {

	public static void main(String[] args) {
		
	//정수 2개를 각각 스캐너로 num1, num2에 입력받아서 입력받은 수의 합을 출력하세요.
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int num1 = scanner.nextInt();
		
		System.out.print("두번째 숫자를 입력하세요 : ");
		int num2 = scanner.nextInt();
//		int sum= num1 + num2;
//		System.out.println(num1 + num2);
//		System.out.println("합계: " +sum); // 식을 최대한 줄일 수 있으면 줄이는게 좋음
		
		System.out.print("문구를 입력하세요 : ");
		String num3 = scanner.next();
		
		System.out.println(num1 + "+"+ num2 +"=" + (num1+num2) + num3 );
		
		System.out.print("이름을 입력하세요 : ");
		String name = scanner.next();
		System.out.println(name);
		
		
		scanner.nextLine();
		
		System.out.print("주소를 입력하세요 : ");
		String address =  scanner.nextLine();
		System.out.println(address);
		
	}

}
