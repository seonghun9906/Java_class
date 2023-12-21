package ch12_classes.ex06.Service;

import java.util.Scanner;

public class BoardService {
    Scanner sc = new Scanner(System.in);
    public void boardMenu() {
        boolean run = true;
        while (run) {
            System.out.println("======= 게시판 ========");
            System.out.println("--------------------------------------------------------------------------------------");
            System.out.println("1. 글작성 | 2. 글목록 | 3. 글조회 | 4. 글수정 | 5. 글삭제 | 6. 검색 | 99.sample | 0.메인메뉴");
            System.out.println("--------------------------------------------------------------------------------------");
        int num = sc.nextInt();

        if(num == 0){
            run = false;
        }
        }
    }

}
