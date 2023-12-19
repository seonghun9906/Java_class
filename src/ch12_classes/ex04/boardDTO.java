package ch12_classes.ex04;

public class boardDTO {
    private Long id;
    private String boardTitle;
    private String boardWriter;
    private String boardContents;
    private String boardPassword;

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

    public String getBoardPassword() {
        return boardPassword;
    }

    public void setBoardPassword(String boardPassword) {
        this.boardPassword = boardPassword;
    }

    public boardDTO() {

    }

    public static Long idValue = 1L;

    public boardDTO(String boardTitle, String boardWriter, String boardContents, String boardPassword) {
        this.id = idValue++;
        this.boardTitle = boardTitle;
        this.boardWriter = boardWriter;
        this.boardContents = boardContents;
        this.boardPassword = boardPassword;
    }
    @Override
    public String toString() {
        return "boardDTO{" +
                "id=" + id +
                ", Title='" + boardTitle + '\'' +
                ", Writer='" + boardWriter + '\'' +
                ", ontents='" + boardContents + '\'' +
                ", Password='" + boardPassword + '\'' +
                '}';
    }
}
