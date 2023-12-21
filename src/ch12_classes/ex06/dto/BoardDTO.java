package ch12_classes.ex06.dto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BoardDTO {
    public Long id;
    public String boardTitle;
    public String boardWriter;
    public String boardContents;
    public int boardHits;
    public String cratedAt;

    public BoardDTO() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBoardTitle() {
        return boardTitle;
    }

    public void setBoardTitle(String boardTitle) {
        this.boardTitle = boardTitle;
    }

    public String getBoardWriter() {
        return boardWriter;
    }

    public void setBoardWriter(String boardWriter) {
        this.boardWriter = boardWriter;
    }

    public String getBoardContents() {
        return boardContents;
    }

    public void setBoardContents(String boardContents) {
        this.boardContents = boardContents;
    }

    public int getBoardHits() {
        return boardHits;
    }

    public void setBoardHits(int boardHits) {
        this.boardHits = boardHits;
    }

    public String getCratedAt() {
        return cratedAt;
    }

    public void setCratedAt(String cratedAt) {
        this.cratedAt = cratedAt;
    }

    public static Long idvalue = 1L;

    public BoardDTO(String boardTitle, String boardWriter, String boardContents, int boardHits, String cratedAt) {
        this.id = idvalue++;
        this.boardTitle = boardTitle;
        this.boardWriter = boardWriter;
        this.boardContents = boardContents;
        this.boardHits = boardHits;
        this.cratedAt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    @Override
    public String toString() {
        return
                id +
                        boardTitle + '\'' +
                        boardWriter + '\'' +
                        boardContents + '\'' +
                        boardHits +
                        cratedAt + '\'';

    }
}
