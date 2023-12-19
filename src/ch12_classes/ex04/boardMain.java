package ch12_classes.ex04;

import java.util.Scanner;

public class boardMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        boolean run = true;
        boardService boardService = new boardService();

        while(run){
            System.out.println("------------------------------------------------------------------");
            System.out.println("1. 글 작성 | 2. 글 목록 | 3. 글 조회 | 4. 글 수정 | 5. 글삭제 | 6. 검색");
            System.out.println("------------------------------------------------------------------");
            System.out.println("사용하고 싶은 메뉴의 번호를 입력해주세요");
            System.out.print("입력 > :");
            num = sc.nextInt();
            if(num == 1){
                boardService.Writing();
            }
        }
    }
}
