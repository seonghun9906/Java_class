package ch10_class.ex10;

import java.util.Scanner;

public class MemberMain {
    public static void main(String[] args) {
        /**
         * 메뉴
         * 1. 회원가입(기본생성자이용)
         *      회원가입 정보는 스캐너로 받음.
         * 2. 로그인
         * 3. 종료
         */

        Scanner sc = new Scanner(System.in);
        boolean run = true;
        Member memberlogin = new Member();


        while (run) {
            System.out.println("메뉴");
            System.out.println("1.회원가입 |2.로그인 | 3.종료");
            int num = sc.nextInt();

            if (num == 1) {
                System.out.println("회원가입할 회원 정보를 입력해주세요.");
                System.out.print("이름 > ");
                String name = sc.next();
                System.out.print("전화번호 > ");
                String mobile = sc.next();
                System.out.print("ID > ");
                String Id = sc.next();
                System.out.print("PW > ");
                String Pw = sc.next();
                memberlogin.setMemberName(name);
                memberlogin.setMemberMobile(mobile);
                memberlogin.setMemberEmail(Id);
                memberlogin.setMemberPassword(Pw);
                System.out.println("회원가입이 완료 되었습니다.");
            } else if (num == 2) {
                System.out.println("Id와 Pw를 입력해주세요");
                System.out.print("Id > ");
                String Id = sc.next();
                System.out.print("Pw > ");
                String Pw = sc.next();
                boolean loginResult = memberlogin.MemberLogin(Id, Pw);
                if(loginResult){
                    System.out.println("로그인 성공");
                }else {
                    System.out.println("로그인 실패");
                }
            } else {
                run = false;
            }
        }
    }
}







