package ch13_map.ex02;


import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BookService {
    Scanner sc = new Scanner(System.in);
    BookRepository bookRepository = new BookRepository();

    public void save() {
        System.out.println("등록할 도서 정보를 입력해주세요.");
        System.out.print("도서명 입력 : ");
        String booktitle = sc.next();
        System.out.print("저자 : ");
        String bookauthor = sc.next();
        System.out.print("가격 : ");
        String bookprice = sc.next();
        System.out.print("출판사 정보 : ");
        String bookpublisher = sc.next();

        BookDTO bookDTO = new BookDTO(booktitle, bookauthor, bookprice, bookpublisher);
        boolean save = bookRepository.save(bookDTO);
        if (save) {
            System.out.println(bookDTO);
            System.out.println("등록 성공");
        } else {
            System.out.println("등록 실패");
        }
    }

    public void findALl() {
        Map<Long, BookDTO> bookDTOMap = bookRepository.findAll();
        for (Long i : bookDTOMap.keySet()) {
            System.out.println(bookDTOMap.get(i));
            // 도서 제목만 본다면
            System.out.println(bookDTOMap.get(i).getBookTitle());
        }
    }

    public void findById() {
        System.out.print("조회 id : ");
        Long id = sc.nextLong();
        BookDTO bookDTO = bookRepository.findbyId(id);
        if (bookDTO != null) {
            System.out.println("bookDTO = " + bookDTO);
        } else {
            System.out.println("존재하지 않습니다.");
        }
    }

    public void update() {
        // 수정할 id를 입력받음
        // 해당 id 도서가 있다면 수정할 가격을 입력받고 수정 처리
        // 없으면 없다고 출력
        System.out.print("수정할 Id : ");
        Long id = sc.nextLong();
        BookDTO bookDTO = bookRepository.findbyId(id);
        if (bookDTO != null) {
            System.out.print("수정할 가격 : ");
            String bookPrice = sc.next();
            boolean updateResult = bookRepository.update(id, bookPrice);
            if (updateResult) {
                System.out.println("수정 성공");
            } else {
                System.out.println("수정 실패");
            }
        } else {
            System.out.println("요청하신 정보 없음.");
        }
    }

    public void delete() {
        System.out.print("삭제할 Id : ");
        Long id = sc.nextLong();
        boolean result = bookRepository.delete(id);
        if (result) {
            System.out.println("삭제 성공");
        } else {
            System.out.println("삭제 실패");
        }
    }

    public void search() {
        System.out.println("검색어 : ");
        String bookTitle = sc.next();
        List<BookDTO> bookDTOList = bookRepository.search(bookTitle);
        if (bookDTOList.size() > 0) {
            for (BookDTO bookDTO : bookDTOList) {
                System.out.println(bookDTO);
            }
        } else {
            //bookDTOList.size() == 0;
            System.out.println("검색 결과가 없습니다!");
        }
    }
}
