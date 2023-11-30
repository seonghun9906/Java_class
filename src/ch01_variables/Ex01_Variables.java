package ch01_variables;

public class Ex01_Variables {

	public static void main(String[] args) {
		// 본인의 이름(name), 나이(age), 키(height), 주소(address), 
		// 전화번호(mobile)를 입력할 수 있는 변수를 각각 선언해봅시다.
		String name = "지성훈";
		int age = 25;
		double height = 176.5 ;
		String address = "인천광역시 계양구 아나지로 213번길 22";
		String mobile = "010-7919-3622";
		
		//String; / X 타입만 주면 안됨
		
		System.out.println(name +" / "+ age +" / " + height +
				" / "+ address +" / "+ mobile);
	
		System.out.println("저의 이름은 : " + name + " 입니다.");
	}

}
