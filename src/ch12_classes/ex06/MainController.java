package ch12_classes.ex06;

import ch12_classes.ex06.Service.MemberService;

import java.util.Scanner;

import ch12_classes.ex06.Service.*;
import ch12_classes.ex06.commonVariables.CommonVariables;

public class MainController {
    public static void main(String[] args) {
        boolean run = true;
        Scanner sc = new Scanner(System.in);
        MemberService memberService = new MemberService();
        BoardService boardService = new BoardService();
        CommonVariables commonVariables = new CommonVariables();


        while (run) {
            System.out.println("======= 회원관리 =======");
            System.out.println("-----------------------------------------------------------------------------------------------");
            System.out.println("1.회원가입 | 2. 로그인 | 3. 회원목록 | 4. 회원수정 | 5. 회원탈퇴 | 6. 로그아웃 | 7. 게시판메뉴 | 0. 종료");
            System.out.println("-----------------------------------------------------------------------------------------------");
            System.out.print("선택 > ");
            int num = sc.nextInt();

            if (num == 1) {
                memberService.SignUp();
            } else if (num == 2) {
                memberService.Login();
            } else if (num == 3) {
                memberService.MemList();
            } else if (num == 4) {
                memberService.MemSet();
            } else if (num == 5) {
                memberService.MemOut();
            } else if (num == 6) {
                memberService.LogOut();
            } else if (num == 7) {
                //CommonVariables.longinEmail 을 변수로 담으면 클래스에 저장이 안됨.
                if (CommonVariables.longinEmail != null) {
                    boardService.boardMenu();
                }
            }
        }

    }
}

