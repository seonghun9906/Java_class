package ch11_classes.ex03;

import java.util.Scanner;

public class Member {
    public static void main(String[] args) {
        boolean run = true;
        Scanner sc = new Scanner(System.in);
        int selectNum = 0;
        MemberService memberService = new MemberService();

        while (run) {
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("1.회원가입 | 2.로그인 | 3. 회원 목록 출력 | 4. 회원 정보 수정 | 5.회원 탈퇴 | 6. 로그아웃 | 7.이메일 중복체크 | 8. 로그인 된 회원 정보 출력 | 9.관리자 접근" );
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
            System.out.print("사용하고싶은 서비스 번호를 입력해 주세요 > ");
            selectNum = sc.nextInt();

            if (selectNum == 1) {
                memberService.save();
            } else if (selectNum == 2) {
                memberService.login();
            } else if (selectNum == 3) {
                memberService.memberFind();
            } else if (selectNum == 4) {
                memberService.memberUpdate();
            } else if (selectNum == 5) {
                memberService.cancle();
            } else if (selectNum == 6) {
                memberService.logout();
            } else if (selectNum == 7) {
                memberService.save();
            } else if (selectNum == 8) {
                memberService.memInfo();
            } else if(selectNum == 0){
                run = false;
            }else{
                System.out.println("메뉴 내에서 입력해주세요");
            }
        }
    }
}
