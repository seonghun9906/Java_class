package ch11_classes.ex2;



import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {
    // 도서 정보를 관리하는 bookDTOList
    private static List<BookDTO> bookDTOList = new ArrayList<>();

    /**
     * 도서등록 메서드
     * name: save
     * parameter: BookDTO
     * return: boolean
     * 실행내용
     * Service로 부터 전달 받은 DTO 객체를 리스트에 저장하고 결과를 리턴
     */
    public boolean save(BookDTO bookDTO) {
        boolean save = bookDTOList.add(bookDTO);
        return save;
    }

    /**
     * 도서목록 메서드
     * name: findAll
     * parameter: x
     * return: List<BookDTO>
     * 실행내용
     * Service로 부터 호출되면 리스트를 리턴
     */
    public List<BookDTO> findAll() {
        return bookDTOList;
    }

    /**
     * 도서조회 메서드
     * name: findById
     * parameter: Long
     * return: BookDTO
     * 실행내용
     * Service로 부터 id를 전달받고 일치하는 결과를 찾아서 DTO를 리턴
     * 없으면 null 리턴
     */
    public BookDTO findById(Long id) {
        BookDTO bookDTO = null;
        for (int i = 0; i < bookDTOList.size(); i++) {
            if (id.equals(bookDTOList.get(i).getId())) {
                bookDTO = bookDTOList.get(i);
            }
        }
        return bookDTO;
    }

    /**
     * 도서조회 메서드
     * name: findByTitle
     * parameter: String
     * return: BookDTO
     * 실행내용
     * Service로 부터 도서제목을 전달받고 일치하는 결과를 찾아서 DTO를 리턴
     * 없으면 null 리턴
     */
    public List<BookDTO> findByTitle(String title) {
        List<BookDTO> bookDTOlist = new ArrayList<>();
        for (int i = 0; i < bookDTOList.size(); i++) {
            if (bookDTOList.get(i).getBookTitle().contains(title)) {
                bookDTOlist.add(bookDTOList.get(i));
            }
        }
        return bookDTOlist ;
    }
}


