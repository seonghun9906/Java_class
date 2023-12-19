package ch12_classes.ex04;

import java.util.Scanner;

public class BoardMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        boolean run = true;
        BoardService boardService = new BoardService();

        while (run) {
            System.out.println("------------------------------------------------------------------");
            System.out.println("1. 글 작성 | 2. 글 목록 | 3. 글 조회 | 4. 글 수정 | 5. 글삭제 | 6. 검색 | 7.테스트 데이터");
            System.out.println("------------------------------------------------------------------");
            System.out.println("사용하고 싶은 메뉴의 번호를 입력해주세요");
            System.out.print("입력 > ");
            num = sc.nextInt();
            if (num == 1) {
                boardService.Writing();
            } else if (num == 2) {
                boardService.list();
            } else if (num == 3) {
                boardService.view();
            } else if (num == 4) {
                boardService.Edit();
            } else if (num == 5) {
                boardService.Del();
            } else if (num == 6) {
                boardService.search();
            } else if (num == 0) {
                run = false;
            } else if (num == 7) {
                boardService.testData();
            }
        }
    }
}
