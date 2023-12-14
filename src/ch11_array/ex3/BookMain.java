package ch11_array.ex3;

import ch11_array.ex2.Student;

import java.rmi.StubNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class BookMain {
    // Book 객체를 담기위한 bookList 객체 선언

    // 기본생성자로 Book 객체(book1) 생성 후 bookList에 추가

    // 매개변수 생성자로 Book 객체(book2) 생성 후 bookList에 추가

    // for를 이용하여 bookList의 전체 데이터 출력

    // for each를 이용하여 bookList의 전체 데이터 출력

    // list의 0번 인덱스에 담긴 책의 가격을 50000으로 변경

    // list의 1번 인덱스에 담긴 출판사의 제목을 "안녕출판사"로 변경

    // for를 이용하여 bookList의 전체 데이터 출력

    // for each를 이용하여 bookList의 전체 데이터 출력
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();

        Book book1 = new Book();
//        book1.setId(1L);
        book1.setBookTitle("책제목");
        book1.setBookAuthor("작가");
        book1.setBookPrice("10000");
        book1.setBookPublisher("출판사");
        bookList.add(book1);

        Book book2 = new Book("책제목2", "작가2", "가격2", "출판사2");
        bookList.add(book2);

        Book book3 = new Book("ddd", "aaa", "ddd", "fff");
        bookList.add(book3);

        for (int i = 0; i < bookList.size(); i++) {
            System.out.println(bookList.get(i));

        }
        for (Book book : bookList) {
            System.out.println(book);
        }
        bookList.get(0).setBookPrice("50000");
        bookList.get(1).setBookPublisher("안녕출판사");


        for (int i = 0; i < bookList.size(); i++) {
            System.out.println(bookList.get(i));
        }
        for(Book book : bookList){
            System.out.println(book);
        }

    }
}
