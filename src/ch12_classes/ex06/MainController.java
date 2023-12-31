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
                System.out.println(CommonVariables.longinEmail + "님 환영 합니다!! ");
                if (CommonVariables.longinEmail != null) {
                    boolean run1 = true;
                    while (run1) {
                        System.out.println("======= 게시판 ========");
                        System.out.println("--------------------------------------------------------------------------------------");
                        System.out.println("1. 글작성 | 2. 글목록 | 3. 글조회 | 4. 글수정 | 5. 글삭제 | 6. 검색 | 99.sample | 0.메인메뉴");
                        System.out.println("--------------------------------------------------------------------------------------");
                        System.out.print("선택 > ");
                        num = sc.nextInt();

                        if (num == 1) {
                            boardService.boardWriting();
                        } else if (num == 2) {
                            boardService.boardList();
                        } else if (num == 3) {
                            boardService.WritingOpen();
                        } else if (num == 4) {
                            boardService.WritingEdit();
                        } else if (num == 5) {
                            boardService.boardRemove();
                        } else if (num == 6) {
                            boardService.boardSearch();
                        } else if (num == 99) {
                            boardService.boardSample();
                        } else if (num == 0) {
                            System.out.println("메인메뉴로 돌아갑니다.");
                            run1 = false;
                        }else {
                            System.out.println("메뉴 안의 숫자를 입력해 주세요.");
                        }
                    }
                } else {
                    System.out.println("로그인 해주세요.");
                }
            } else if (num == 0) {
                run = false;
            }else{
                System.out.println("메뉴 안의 숫자를 입력해주세요.");
            }
        }
    }
}


