package ch12_classes.ex06.repository;

import ch12_classes.ex06.commonVariables.CommonVariables;
import ch12_classes.ex06.dto.BoardDTO;
import ch12_classes.ex06.dto.CommentDTO;
import ch12_classes.ex06.dto.MemberDTO;

import java.util.ArrayList;
import java.util.List;

public class BoardRepository {
    List<BoardDTO> boardDTOList = new ArrayList<>();
    List<MemberDTO> memberDTOList = new ArrayList<>();
    List<CommentDTO> commentDTOList = new ArrayList<>();

    public boolean boardWriting(BoardDTO boardDTO) {
        return boardDTOList.add(boardDTO);
    }

    public boolean LoginCheck(String longinEmail) {
        boolean result = false;
        if (CommonVariables.longinEmail != null && CommonVariables.longinEmail.equals(longinEmail)) {
            result = true;
        }
        return result;
    }

    public void boardList() {
        System.out.println(" id " + "    " + " 제목 " + "    " + " 조회수 " + "    " + " 작성 시간 ");
        for (int i = 0; i < boardDTOList.size(); i++) {
            System.out.println("  " + boardDTOList.get(i).getId() + "       " + boardDTOList.get(i).getBoardTitle() + "        " + boardDTOList.get(i).getBoardHits() + "       " + boardDTOList.get(i).getCratedAt());
        }

    }


    public boolean ListOpen(String boardTitle) {
        boolean result = false;
        for (int i = 0; i < boardDTOList.size(); i++) {
            int hits = boardDTOList.get(i).getBoardHits();
            if (boardTitle.equals(boardDTOList.get(i).getBoardTitle())) {
                System.out.println("글 제목 :  " + boardDTOList.get(i).getBoardTitle());
                System.out.println("글 내용 : " + boardDTOList.get(i).getBoardContents());
                result = true;
                hits++;
                boardDTOList.get(i).setBoardHits(hits);
            }
        }
        return result;
    }


    public boolean idCheck(Long edit) {
        boolean result = false;
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (edit.equals(boardDTOList.get(i).getId())) {
                result = true;
            }

        }
        return result;
    }


    public boolean boardEdit(String writer, Long id, String editTitle, String editContents) {
        boolean result = false;
        for (int j = 0; j < memberDTOList.size(); j++) {
                if (id.equals(boardDTOList.get(j).getId())) {
                    boardDTOList.get(j).setBoardTitle(editTitle);
                    boardDTOList.get(j).setBoardContents(editContents);
                    result = true;
                }
        }
        return result;
    }


}