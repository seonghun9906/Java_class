package ch12_classes.ex04;

import java.util.List;
import java.util.Scanner;

public class BoardService {
    Scanner sc = new Scanner(System.in);
    BoardRepository boardRepository = new BoardRepository();


    public void Writing() {
        System.out.print("제목 > ");
        String bordTitle = sc.next();
        System.out.print("작성자 > ");
        String boardWriter = sc.next();
        System.out.print("내용 > ");
        String boardContents = sc.next();
        System.out.print("해당 글 비밀번호 > ");
        String boardPass = sc.next();

        BoardDTO boardDTO = new BoardDTO(bordTitle, boardWriter, boardContents, boardPass);
        boolean writing = boardRepository.Writing(boardDTO);
        if (writing) {
            System.out.println(boardDTO);
            System.out.println("글 작성이 완료되었습니다.");
        } else {
            System.out.println("글 작성중 오류가 발생하였습니다.");
        }

    }


    public void list() {
        List<BoardDTO> boardDTOList = boardRepository.list();
        for (BoardDTO boardDTO : boardDTOList) {
            System.out.println("id = " + boardDTO.getId() + '\'' + " Title = " + boardDTO.getBoardTitle() + '\'' + " Writer = " + boardDTO.getBoardWriter() + '\'' + " Contents = " + boardDTO.getBoardContents() + " view = " + '\'' + boardDTO.getView());

        }
    }

    public void view() {
        System.out.print("게시글 번호를 입력하세요 > ");
        List<BoardDTO> boardDTOList = boardRepository.list();
        Long id = sc.nextLong();

        boolean found = false; //// 해당 ID에 대한 게시글이 있는지 여부를 나타내는 플래그

        for (BoardDTO boardDTO : boardDTOList) {
            if (id.equals(boardDTO.getId())) {
                System.out.println(boardDTO);
                boolean view = boardRepository.view(boardDTO); //조회수 증가 메서드 호출
                if (view) {
                    System.out.println("해당 게시글 조회수는 " + boardDTO.getView() + " 입니다.");
                } else {
                    System.out.println("오류로 인해 조회수 증가에 실패하였습니다.");
                }
                found = true; // 해당 ID에 대한 게시글을 찾았음을 표시
                break; // 해당 ID를 가진 게시글을 찾았으므로 루프 종료
            }
        }
        if (!found) {
            System.out.println("저장되어있지 않은 ID 입니다.");
        }
    }


    public void Edit() {
        System.out.println("글 수정을 위해 수정하는 글의 ID와 비밀번호를 입력해주세요.");
        System.out.print("ID 입력 > ");
        Long Id = sc.nextLong();
        System.out.print("비밀번호 입력 > ");
        String Pw = sc.next();
        boolean EditCheck = boardRepository.EditCheck(Id, Pw);
        if (EditCheck) {
            System.out.println("ID와 비밀번호가 입력 되었습니다.");
            System.out.println("수정할 제목과 내용을 작성해주세요.");
            System.out.print("수정할 제목 > ");
            String EditTitle = sc.next();
            System.out.print("수정할 내용 > ");
            String EditContents = sc.next();
            boolean Edit = boardRepository.Edit(Id, EditTitle, EditContents);
            if (Edit) {
                System.out.println("수정이 성공하였습니다.");
            } else {
                System.out.println("수정이 실패하였습니다.");
            }
        } else {
            System.out.println("수정에 실패하였습니다. ID 와 비밀번호를 다시 확인해주세요..");
        }
    }


    public void Del() {
        System.out.println("글 삭제을 위해 삭제하는 글의 ID와 비밀번호를 입력해주세요.");
        System.out.print("ID 입력 > ");
        Long Id = sc.nextLong();
        System.out.print("비밀번호 입력 > ");
        String Pw = sc.next();
        boolean Del = boardRepository.Del(Id, Pw);
        if (Del) {
            System.out.println("해당 글이 삭제되었습니다.");
        } else {
            System.out.println("해당 글이 삭제 되지 않았습니다. ID 와 비밀번호를 다시 확인해주세요.");
        }
    }

    public void search() {
        System.out.println("원하시는 글의 제목을 입력해주세요.");
        System.out.print("글 제목 > ");
        String Title = sc.next();
        List<BoardDTO> boardDTOS = boardRepository.search(Title);
        if (boardDTOS.size() > 0) {
            for (BoardDTO boardDTO : boardDTOS) {
                System.out.println("글 ID = " + boardDTO.getId() + " 글 제목 = " + boardDTO.getBoardTitle() + " 글 작성자 = " + boardDTO.getBoardContents() + " 글 조회수 = " + boardDTO.getView());
            }
        } else {
            System.out.println("검색결과가 없습니다.");
        }
    }
}


