package ch12_classes.ex06.repository;

import ch12_classes.ex06.commonVariables.CommonVariables;
import ch12_classes.ex06.dto.BoardDTO;

import java.util.ArrayList;
import java.util.List;

public class BoardRepository {
    List<BoardDTO> boardDTOList = new ArrayList<>();

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
    public List<BoardDTO> boardList() {
        for (int i = 0; i < boardDTOList.size(); i++) {
        }
        return boardDTOList;
    }
    public List<BoardDTO> ListOpen(Long boardId) {
        for (int i = 0; i < boardDTOList.size(); i++) {
            int hits = boardDTOList.get(i).getBoardHits();
            if (boardId.equals(boardDTOList.get(i).getId())) {
                hits++;
                boardDTOList.get(i).setBoardHits(hits);
                return boardDTOList;
            }
        }
        return boardDTOList;
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
        for (int j = 0; j < boardDTOList.size(); j++) {
            if (writer.equals(boardDTOList.get(j).getBoardWriter()))
                if (id.equals(boardDTOList.get(j).getId())) {
                    boardDTOList.get(j).setBoardTitle(editTitle);
                    boardDTOList.get(j).setBoardContents(editContents);
                    result = true;
                }
        }
        return result;
    }
    public void Remove(String writer) {
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (writer.equals(boardDTOList.get(i).getBoardWriter())) {
                boardDTOList.remove(i);
            }
        }
    }
    public List<BoardDTO> boardSearchCheck(String search) {
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (boardDTOList.get(i).getBoardTitle().contains(search)) {
                return boardDTOList;
            }
        }
        return boardDTOList;
    }
}
