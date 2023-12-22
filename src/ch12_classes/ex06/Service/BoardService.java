package ch12_classes.ex06.Service;


import ch12_classes.ex06.commonVariables.CommonVariables;
import ch12_classes.ex06.dto.BoardDTO;
import ch12_classes.ex06.dto.CommentDTO;
import ch12_classes.ex06.repository.BoardRepository;
import ch12_classes.ex06.repository.CommentRepository;



import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class BoardService {
    BoardRepository boardRepository = new BoardRepository();
    CommentRepository commentRepository = new CommentRepository();

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
            List<BoardDTO> boardDTOList = boardRepository.boardList();
            if (!boardDTOList.isEmpty()) {
                System.out.println("id" + "   title" + "    writer " + "    hits ");
                for (int i = 0; i < boardDTOList.size(); i++) {
                    System.out.println(boardDTOList.get(i).getId() + "        " + boardDTOList.get(i).getBoardTitle() + "       " + boardDTOList.get(i).getBoardWriter() + "      " + boardDTOList.get(i).getBoardHits());
                }
            } else {
                System.out.println("작성된 글이 없습니다.");
            }
        }
    }

    public void WritingOpen() {
        boolean LoginCheck = boardRepository.LoginCheck(CommonVariables.longinEmail);
        if (LoginCheck) {
            System.out.print("조회할 글의 id를 입력해 주세요 > ");
            Long boardId = sc.nextLong();
            List<BoardDTO> open = boardRepository.ListOpen(boardId);
            if (!open.isEmpty()) {
                for (int i = 0; i < open.size() ; i++) {
                    if (boardId.equals(open.get(i).getId())){
                        System.out.println(open.get(i));
                    }
                }
                System.out.println("========= 댓 글 =========");
                List<CommentDTO> commentDTOS = commentRepository.LookComment(boardId);
                if (!commentDTOS.isEmpty()) {
                    for (int i = 0; i < commentDTOS.size(); i++) {
                        if(boardId.equals(commentDTOS.get(i).getBoardId())) {
                            System.out.println(commentDTOS.get(i));
                        }
                    }
                } else {
                    System.out.println("작성된 댓글이 없습니다.");
                }
                System.out.println("댓글을 작성하시려면 1번을 입력해주세요.");
                System.out.println("메인메뉴로 돌아가려면 2번을 입력해주세요.");
                System.out.print("입력 > ");
                int num = sc.nextInt();
                if (num == 1) {
                    String writer = CommonVariables.longinEmail;
                    System.out.print("댓글내용 : ");
                    String commentWrite = sc.next();
                    String commentWriteAt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
                    CommentDTO commentDTO = new CommentDTO(boardId, writer, commentWrite, commentWriteAt);
                    boolean comment = commentRepository.boardComment(commentDTO);
                    if (comment) {
                        System.out.println("댓글 작성이 완료되었습니다. ");
                    } else {
                        System.out.println("댓글작성에 실패하였습니다. ");
                    }
                } else if (num == 2) {
                    System.out.println("메인메뉴로 돌아가겠습니다.");
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
            Long editId = sc.nextLong();
            boolean idCheck = boardRepository.idCheck(editId);
            if (idCheck) {
                String writer = CommonVariables.longinEmail;
                System.out.print("수정할 제목 : ");
                String editTitle = sc.next();
                System.out.print("수정할 내용 : ");
                String editContents = sc.next();
                boolean Edit = boardRepository.boardEdit(writer, editId, editTitle, editContents);
                if (Edit) {
                    System.out.println("수정 완료되었습니다.");
                } else {
                    System.out.println("작성한 계정으로만 수정 할 수 있습니다.");

                }
            }
        } else {
            System.out.println("글을 작성한 사람만 가능합니다.");
        }
    }

    public void boardRemove() {
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
            } else {
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

            List<BoardDTO> boardDTOList = boardRepository.boardSearchCheck(search);
            if (!boardDTOList.isEmpty()) {
                for (int i = 0; i < boardDTOList.size(); i++) {
                    System.out.println("글 제목 : " + boardDTOList.get(i).getBoardTitle());
                }
            } else {
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


