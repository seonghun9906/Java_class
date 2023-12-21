package ch12_classes.ex06.Service;

import ch12_classes.ex03.MemberDTO;
import ch12_classes.ex06.commonVariables.CommonVariables;
import ch12_classes.ex06.dto.BoardDTO;
import ch12_classes.ex06.dto.CommentDTO;
import ch12_classes.ex06.repository.BoardRepository;
import ch12_classes.ex06.repository.MemberRepository;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BoardService {
    BoardRepository boardRepository = new BoardRepository();

    MemberDTO memberDTO = new MemberDTO();

    Scanner sc = new Scanner(System.in);
    int hits = 0;

    //boardService
    public void boardWriting() {
        System.out.println("=========== 글 작성 ==========");
        boolean LoginCheck = boardRepository.LoginCheck(CommonVariables.longinEmail);
        if (LoginCheck) {
            System.out.print("제목 > ");
            String boardTitle = sc.next();
            System.out.print("내용 > ");
            String boardDetail = sc.next();
            String Writer = memberDTO.getMemberEmail();
            String WritingAt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            BoardDTO boardDTO = new BoardDTO(boardTitle, Writer, boardDetail, hits, WritingAt);
            boolean Writing = boardRepository.boardWriting(boardDTO);
            if (Writing) {
                System.out.println("글작성 완료");
            } else {
                System.out.println("글작성 실패");
            }
        }
    }

    public void boardList() {
        boolean LoginCheck = boardRepository.LoginCheck(CommonVariables.longinEmail);
        if (LoginCheck) {
            boardRepository.boardList();
        }
    }

    public void WritingOpen() {
        boolean LoginCheck = boardRepository.LoginCheck(CommonVariables.longinEmail);
        if (LoginCheck) {
            System.out.println("조회할 글의 제목을 입력해 주세요.");
            String boardTitle = sc.next();
            boolean open = boardRepository.ListOpen(boardTitle);
            if (open) {
                System.out.println("다른것을 조회하시려면 글 조회 버튼을 입력해 주세요.");
            } else {
                System.out.println("해당하는 제목이 존재하지 않습니다.");
            }
        }
    }

    public void WritingEdit() {
        boolean LoginCheck = boardRepository.LoginCheck(CommonVariables.longinEmail);
        if (LoginCheck) {
            System.out.println("수정할 id 를 입력하세요.");
            System.out.print("수정할 id : ");
            Long edit = sc.nextLong();
            boolean idCheck = boardRepository.idCheck(edit);
            if (idCheck) {
                System.out.print("수정할 제목 : ");
                String editTitle = sc.next();
                System.out.print("수정할 내용 : ");
                String editContents = sc.next();
                boolean Edit = boardRepository.boardEdit(CommonVariables.longinEmail, edit, editTitle, editContents);
                if (Edit) {
                    System.out.println("수정 완료되었습니다.");
                } else {
                    System.out.println("작성한 계정으로만 수정 할 수 있습니다..");

                }
            }
        }else{
            System.out.println("글을 작성한 사람만 가능합니다.");
        }
        }
    }

