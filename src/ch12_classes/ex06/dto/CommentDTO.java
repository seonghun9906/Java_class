package ch12_classes.ex06.dto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CommentDTO {
    public Long id;
    public String boardId;
    public String commentWriter;
    public String commentContents;
    public String createdAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBoardId() {
        return boardId;
    }

    public void setBoardId(String boardId) {
        this.boardId = boardId;
    }

    public String getCommentWriter() {
        return commentWriter;
    }

    public void setCommentWriter(String commentWriter) {
        this.commentWriter = commentWriter;
    }

    public String getCommentContents() {
        return commentContents;
    }

    public void setCommentContents(String commentContents) {
        this.commentContents = commentContents;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
    public static Long idValue = 1L;
    public CommentDTO(String boardId, String commentWriter, String commentContents, String createtdAt) {
        this.id = idValue++;
        this.boardId = boardId;
        this.commentWriter = commentWriter;
        this.commentContents = commentContents;
        this.createdAt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    @Override
    public String toString() {
        return "CommentDTO{" +
                "id=" + id +
                ", boardId='" + boardId + '\'' +
                ", commentWriter='" + commentWriter + '\'' +
                ", commentContents='" + commentContents + '\'' +
                ", createdAt='" + createdAt + '\'' +
                '}';
    }
}
