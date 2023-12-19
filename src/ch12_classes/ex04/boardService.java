package ch12_classes.ex04;

import ch12_classes.ex02.BookDTO;

import java.util.Scanner;

public class boardService {
    Scanner sc = new Scanner(System.in);
    boardRepository boardRepository = new boardRepository();
    public void Writing() {
        System.out.print("제목 > ");
        String bordTitle = sc.next();
        System.out.print("작성자 > ");
        String boardWriter = sc.next();
        System.out.print("내용 > ");
        String boardContents = sc.next();
        System.out.print("해당 글 비밀번호 > ");
        String boardPass = sc.next();

        boardDTO boardDTO = new boardDTO(bordTitle, boardWriter, boardContents, boardPass);
        boolean writing = boardRepository.Writing(boardDTO);
        if (writing){
            System.out.println(boardDTO);
            System.out.println("글 작성이 완료되었습니다.");
        }else{
            System.out.println("글 작성중 오류가 발생하였습니다.");
        }

    }
}
