package ch10_class.ex5;

public class BookMain {
    public static void main(String[] args) {
        // 책 정보는 시중에 있는 실제 책으로 해봅시다.
        Book book1 = new Book();
        // 기본생성자로 객체 만들고 필드값 채우기
        book1.bookTitle = "여덟단어";
        book1.bookAuthor = "박웅현";
        book1.bookPublisher = "북하우스";
        book1.isbn  = "9788956056531";
        book1.bookPrice = 14900;
        System.out.println(book1.bookTitle + " "+ book1.bookAuthor + " " + book1.bookPublisher + " "+ book1.isbn + " " + book1.bookPrice+"원");
        // 매개변수 2개 있는 생성자로 객체 만들고 필드값 채우기
        Book book2 = new Book("엄마를 부탁해", "신경숙" );
        book2.bookPublisher = "123456";
        book2.bookPrice = 17000;
        book2.isbn = "123456789";
        //(필드에 채워지지 않은 것은 따로 채워야함)//
        System.out.println(book2.bookTitle + " "+ book2.bookAuthor);
        // 모든 매개변수 있는 생성자로 객체 만들고 필드값 채우기
        Book book3 = new Book("자전거 도둑", "박완서", "다림", "9788937842993 ", 15000);
        System.out.println(book3.bookTitle + " " + book3.bookAuthor + " "+ book3.bookPublisher + " " + book3.isbn + " " + book3.bookPrice+"원");
    }
}
