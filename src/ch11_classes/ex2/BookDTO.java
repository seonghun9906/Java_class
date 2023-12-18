package ch11_classes.ex2;

public class BookDTO {
    //DTO는 데이터를 전달하는 느낌

    /**
     도서 클래스

     필드
     도서관리번호(id) - Long 타입
     도서명(bookTitle)
     저자(bookAuthor)
     가격(bookPrice)
     출판사(bookPublisher)

     필드에 대한 getter/setter

     생성자 2가지
     도서 등록은 매개변수 있는 생성자로만 할 수 있음.(id는 자동으로 하나씩 증가)

     toString method
     */
    private Long id;
    private String bookTitle;
    private String bookauthor;
    private String bookPrice;
    private String bookpublisher;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookauthor() {
        return bookauthor;
    }

    public void setBookauthor(String bookauthor) {
        this.bookauthor = bookauthor;
    }

    public String getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(String bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getBookpublisher() {
        return bookpublisher;
    }

    public void setBookpublisher(String bookpublisher) {
        this.bookpublisher = bookpublisher;
    }

    private  static Long idValue = 1L;
    //static 값을 유지할 수 있도록 도와주는것.
    public BookDTO(){

    }
    public BookDTO(String bookTitle, String bookauthor, String bookPrice, String bookpublisher) {
        this.id = idValue++;
        this.bookTitle = bookTitle;
        this.bookauthor = bookauthor;
        this.bookPrice = bookPrice;
        this.bookpublisher = bookpublisher;
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "id=" + id +
                ", bookTitle='" + bookTitle + '\'' +
                ", bookauthor='" + bookauthor + '\'' +
                ", bookPrice='" + bookPrice + '\'' +
                ", bookpublisher='" + bookpublisher + '\'' +
                '}';
    }
}

