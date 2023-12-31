package ch12_classes.ex02;

import java.util.List;
import java.util.Scanner;

public class BookService {
    Scanner sc =new Scanner(System.in);
    BookRepository bookRepository = new BookRepository();

    /**
     * 도서등록 메서드
     * name: save
     * parameter: x
     * return: x
     * 실행내용
     *      스캐너로 도서명, 저자, 가격, 출판사정보를 입력받고
     *      BookDTO 객체에 담아서 Repository로 전달하여 저장이 되도록 함
     *      등록 여부를 출력한다.(등록성공 or 등록실패)
     */
    public void save(){
        System.out.println("등록할 도서 정보를 입력해주세요.");
        System.out.print("도서명 입력 : ");
        String booktitle = sc.next();
        System.out.print("저자 : ");
        String bookauthor = sc.next();
        System.out.print("가격 : ");
        String bookprice = sc.next();
        System.out.print("출판사 정보 : ");
        String bookpublisher = sc.next();

        BookDTO bookDTO = new BookDTO(booktitle,bookauthor,bookprice,bookpublisher);
        boolean save = bookRepository.save(bookDTO);
        if(save){
            System.out.println(bookDTO);
            System.out.println("등록 성공");
        }else {
            System.out.println("등록 실패");
        }
    }

    /**
     * 도서목록 메서드
     * name: findAll
     * parameter: x
     * return: x
     * 실행내용
     *      Repository로 부터 목록을 리턴 받아서 목록에 있는 모든 정보를 출력
     */
    public void findALl(){
        List<BookDTO> bookDTOList = bookRepository.findAll();
        for(BookDTO bookDTO : bookDTOList){
            System.out.println(bookDTO);
        }
    }

    /**
     * 도서조회 메서드
     * name: findById
     * parameter: x
     * return: x
     * 실행내용
     *      id를 입력받고 Repository로 부터 id에 해당 하는 도서 정보를 출력
     *      없으면 없다고 출력
     */
    public void findById(){
        System.out.println("조회할 Id : ");
        Long id = sc.nextLong();
        BookDTO bookDTO = bookRepository.findById(id);
        if (bookDTO != null){
            System.out.println(bookDTO);
        }else {
            System.out.println("요청하신 정보 없음.");
        }
    }
    /**
     * 도서조회 메서드
     * name: findByTitle
     * parameter: x
     * return: x
     * 실행내용
     *      도서제목을 입력받고 Repository로 부터 해당 하는 도서 정보를 출력(제목이 정확히 일치하는 것만)
     *      없으면 없다고 출력
     */
    public void findByTitle () {
        String title = sc.next();
        List<BookDTO> bookDTO = bookRepository.findByTitle(title);
        if (bookDTO != null) {
            System.out.println(bookDTO);
        } else {
            System.out.println("요청하신 도서 번호는 도서 정보가 입력되어 있지 않습니다.");
        }
    }
    public void search() {
        System.out.println("검색어 : ");
        String bookTitle = sc.next();
        List<BookDTO> bookDTOList = bookRepository.search(bookTitle);
        if(bookDTOList.size()>0){
            for(BookDTO bookDTO : bookDTOList){
                System.out.println(bookDTO);
            }

        } else{
            //bookDTOList.size() == 0;
            System.out.println("검색 결과가 없습니다!");
            }
    }

    public void update() {
        // 수정할 id를 입력받음
        // 해당 id 도서가 있다면 수정할 가격을 입력받고 수정 처리
        // 없으면 없다고 출력
        System.out.print("수정할 Id : ");
        Long id = sc.nextLong();
        BookDTO bookDTO = bookRepository.findById(id);
        if (bookDTO != null){
            System.out.print("수정할 가격 : ");
            String bookPrice = sc.next();
            boolean updateResult = bookRepository.update(id, bookPrice);
            if(updateResult){
                System.out.println("수정 성공");
            }else {
                System.out.println("수정 실패");
            }
        }else {
            System.out.println("요청하신 정보 없음.");
        }
    }

    public void delete() {
        System.out.print("삭제할 Id : ");
        Long id = sc.nextLong();
      boolean result = bookRepository.delete(id);
      if(result){
          System.out.println("삭제 성공");
      }else{
          System.out.println("삭제 실패");
      }
    }

    public void Writing() {
    }
}
