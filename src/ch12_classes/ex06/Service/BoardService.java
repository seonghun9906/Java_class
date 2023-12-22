package ch12_classes.ex06.Service;

import ch10_class.ex11.Board;
import ch12_classes.ex03.MemberDTO;
import ch12_classes.ex06.commonVariables.CommonVariables;
import ch12_classes.ex06.dto.BoardDTO;
import ch12_classes.ex06.dto.CommentDTO;
import ch12_classes.ex06.repository.BoardRepository;
import ch12_classes.ex06.repository.MemberRepository;
import org.w3c.dom.stylesheets.LinkStyle;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardService {
    BoardRepository boardRepository = new BoardRepository();

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
            String Writer = CommonVariables.longinEmail;
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
            System.out.println("조회할 글의 id를 입력해 주세요.");
            Long boardId = sc.nextLong();
            boolean open = boardRepository.ListOpen(boardId);
            if (open) {
                System.out.println("========= 댓 글 =========");
                boardRepository.LookComment(boardId);
                System.out.println("댓글을 작성하시려면 1번을 입력해주세요.");
                System.out.println("메인메뉴로 돌아가려면 2번을 입력해주세요.");
                System.out.print("입력 > ");
                int num = sc.nextInt();
                if(num == 1) {
                    String writer = CommonVariables.longinEmail;
                    System.out.print("댓글내용 : ");
                    String commentWrite = sc.next();
                    String commentWriteAt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
                    CommentDTO commentDTO = new CommentDTO(boardId, writer, commentWrite, commentWriteAt);
                    boolean comment = boardRepository.boardComment(commentDTO);
                        if(comment){
                            System.out.println("댓글 작성이 완료되었습니다. ");
                        }else {
                            System.out.println("댓글작성에 실패하였습니다. ");
                        }
                }else if(num == 2){

                }
            } else {
                System.out.println("해당하는 id가 존재하지 않습니다.");
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
                String writer = CommonVariables.longinEmail;
                System.out.print("수정할 제목 : ");
                String editTitle = sc.next();
                System.out.print("수정할 내용 : ");
                String editContents = sc.next();
                boolean Edit = boardRepository.boardEdit(writer, edit, editTitle, editContents);
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

    public void boardReamove() {
        boolean LoginCheck = boardRepository.LoginCheck(CommonVariables.longinEmail);
        if (LoginCheck) {
            System.out.println("삭제할 id 를 입력하세요.");
            System.out.print("삭제할 id : ");
            Long edit = sc.nextLong();
            boolean idCheck = boardRepository.idCheck(edit);
            if (idCheck) {
                String writer = CommonVariables.longinEmail;
                boardRepository.Remove(writer);
                System.out.println("삭제가 완료되었습니다.");
            }else{
                System.out.println("삭제 가능한 글이 없습니다.");
            }
        }

    }

    public void boardSearch() {
        boolean LoginCheck = boardRepository.LoginCheck(CommonVariables.longinEmail);
        if (LoginCheck) {
            System.out.println("검색 할 제목을 입력해주세요.");
            System.out.print("검색 할 id > ");
            String search = sc.next();

            boolean Search = boardRepository.boardSearchCheck(search);
                if(Search){
                    System.out.println("위와 같은 글이 검색되었습니다.");
                }else{
                    System.out.println("제목이 존재하지 않습니다.");
                }
            }
        }

    public void boardSample() {
        boolean LoginCheck = boardRepository.LoginCheck(CommonVariables.longinEmail);
        if (LoginCheck) {
            System.out.println("");
        }
    }
}


