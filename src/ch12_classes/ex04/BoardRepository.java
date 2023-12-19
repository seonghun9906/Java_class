package ch12_classes.ex04;

import java.util.ArrayList;
import java.util.List;


public class BoardRepository {
    public static List<BoardDTO> boardDTOList = new ArrayList<>();

    public boolean Writing(BoardDTO boardDTO) {
        return boardDTOList.add(boardDTO);
    }

    public List<BoardDTO> list() {
        return boardDTOList;
    }

    public boolean view(BoardDTO boardDTO) {
        boolean result = false;
        for (BoardDTO dto : boardDTOList) {
            if (dto.getId().equals(boardDTO.getId())) {
                dto.view(); // 해당 게시글의 조회수 증가
                result = true; // 조회수 증가 성공
            }
        }
        return result; // 해당 ID의 게시글이 없음
    }

    public boolean EditCheck(Long Id, String Pw) {
        boolean result = false;
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (Id.equals((boardDTOList.get(i).getId())) && Pw.equals(boardDTOList.get(i).getBoardPassword())) {
                result = true;
            }
        }
        return result;
    }

    public boolean Edit(Long id, String Title, String Contents) {
        boolean result = false;
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (id.equals(boardDTOList.get(i).getId())) {
                boardDTOList.get(i).setBoardTitle(Title);
                boardDTOList.get(i).setBoardContents(Contents);
                result = true;
            }
        }
        return result;
    }


    public boolean Del(Long id, String pw) {
        boolean result = false;
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (id.equals(boardDTOList.get(i).getId()) && pw.equals(boardDTOList.get(i).getBoardPassword())) {
                boardDTOList.remove(i);
                result = true;
            }
        }
        return result;
    }

    public List<BoardDTO> search(String title) {
        //검색결과를 담을 리스트 선언;
        List<BoardDTO> boardDTOS = new ArrayList<>();
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (boardDTOList.get(i).getBoardTitle().contains(title)) {
                boardDTOS.add(boardDTOList.get(i));
            }
        }
        return boardDTOS;
    }


}

