package ch10_class.ex8;

public class Book {
    // private를 썻기 때문에 bookAuthor는 BookMain클래스가 아닌 Book 클래스에서만 사용가능.
    private String bookTitle;
    private String bookAuthor;

    // bookTitle setter
    public void setBookTitle(String bookTitle){
        this.bookTitle = bookTitle;
    }

    // bookTitle getter
    public String getBookTitle(){
        return this.bookTitle;
    }

    // bookAuthor setter
    public void setBookAuthor(String bookAuthor){
        this.bookAuthor=bookAuthor;
    }
    // bookAuthor getter
    public String getBookAuthor(){
        return this.bookAuthor;
    }
}
