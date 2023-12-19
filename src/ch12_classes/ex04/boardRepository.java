package ch12_classes.ex04;

import ch12_classes.ex02.BookDTO;

import java.util.ArrayList;
import java.util.List;

public class boardRepository {
    boardDTO boardDTO = new boardDTO();
    public static List<boardDTO> boardDTOList = new ArrayList<>();
    public boolean Writing(boardDTO boardDTO) {
       return boardDTOList.add(boardDTO);
    }
}
