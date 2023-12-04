package ch04_if;

import java.util.Scanner;

public class Ex06_IfExample {

	public static void main(String[] args) {
		// 정수 하나를 입력받아서 3의배수인지, 5의 배수인지 또는 3과 5의 공배수인지, 아무것도 아닌지를 출력
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를입력하세요 : " );
		
		
		int num = scanner.nextInt();
		String a = "";
		
			if(num == 0) {
				a = "아무것도 아닙니다.";
			}else if(num%3 == 0 && num%5 == 0) {
				a = "3과 5의 배수입니다.";
			
			}else if (num%3 ==0) {
				a = "3의 배수입니다.";
			
			}else if (num%5 ==0) {
				a = "5의 배수입니다.";
			}
			else {
				a = "아무것도 아닙니다";
		
			}System.out.println(a);
		
		}
			
		
	
	}


