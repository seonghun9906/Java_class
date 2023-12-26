package ch12_classes.ex06.repository;

import ch12_classes.ex06.dto.BoardDTO;
import ch12_classes.ex06.dto.CommentDTO;

import java.util.ArrayList;
import java.util.List;

public class CommentRepository {
    List<CommentDTO> commentDTOList = new ArrayList<>();

    public boolean boardComment(CommentDTO commentDTO) {
        return commentDTOList.add(commentDTO);
    }




    public List<CommentDTO> LookComment(Long boardId) {
        List<CommentDTO> commentDTOS = new ArrayList<>();
        for (int i = 0; i < commentDTOList.size(); i++) {
            if (boardId.equals(commentDTOList.get(i).getBoardId())) {
                commentDTOS = commentDTOList;
                return commentDTOS;
            }
        }
        return commentDTOS;
    }
}
