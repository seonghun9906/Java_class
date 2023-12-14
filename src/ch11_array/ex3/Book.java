package ch11_array.ex3;

public class Book {
    /**
     책 클래스

     필드
     책관리번호(id) - Long 타입
     책제목(bookTitle)
     저자(bookAuthor)
     가격(bookPrice)
     출판사(bookPublisher)

     필드에 대한 getter/setter

     생성자 2가지

     toString method
     */
    private Long id;
    private String bookTitle;
    private String bookAuthor;
    private String bookPrice;
    private String bookPublisher;

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

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(String bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getBookPublisher() {
        return bookPublisher;
    }

    public void setBookPublisher(String bookPublisher) {
        this.bookPublisher = bookPublisher;
    }
    //id를 1씩 증가하게 만듦(이것을 쓰게 되면 따로 id 데이터를 집어넣지 않아도됨);
    private static Long idValue = 1L;
    //기본생성자에 id를 1씩 증가하게 만듦.
    public Book(){
        this.id = idValue++;

    }
    public Book(String bookTitle, String bookAuthor, String bookPrice, String bookPublisher) {
        this.id = idValue++;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookPrice = bookPrice;
        this.bookPublisher = bookPublisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookTitle='" + bookTitle + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookPrice='" + bookPrice + '\'' +
                ", bookPublisher='" + bookPublisher + '\'' +
                '}';
    }
}
