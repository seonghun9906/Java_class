package ch08_string;

import java.util.Scanner;

public class Ex02_StringEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = "";
        boolean run = true;

        System.out.println("메시지를 입력하세요");
        System.out.println("프로그램을 종료하려면 '종료'를 입력하세요. ");
        while(run) {
            System.out.print(">");
            word = sc.nextLine();
            System.out.println(word);
            if(word.equals("종료")){
                run = false;
            }
        }
    }
}
// final String ANSWER = "종료";
// final 키워드를 붙인 변수는 변수값을 바꿀 수 없음.

