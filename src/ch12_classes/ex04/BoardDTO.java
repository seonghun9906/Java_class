package ch12_classes.ex04;

public class BoardDTO {
    private Long id;
    private String boardTitle;
    private String boardWriter;
    private String boardContents;
    private String boardPassword;
    private int view;

    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = view;
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

    public String getBoardPassword() {
        return boardPassword;
    }

    public void setBoardPassword(String boardPassword) {
        this.boardPassword = boardPassword;
    }

    public BoardDTO() {

    }

    public void view(){
        this.view++;
    }
    public static Long idValue = 1L;

    public BoardDTO(String boardTitle, String boardWriter, String boardContents, String boardPassword) {
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
                ", contents='" + boardContents + '\'' +
                ", Password='" + boardPassword + '\'' +
                '}';
    }
}
