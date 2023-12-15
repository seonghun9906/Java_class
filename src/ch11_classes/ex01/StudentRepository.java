package ch11_classes.ex01;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    //    모든 학생정보를 관리하는 저장소 역할의 리스트
    // 저장, 수정, 삭제 동의 처리는 Repository에서만 이루어지도록 하기 위해 private
    // 값을 계쏙 유지하기 위해 static
    private static List<StudentDTO> studentDTOList = new ArrayList<>();

    //Service에서 받은것을 return 또는 Arraylist에 담기.
    public void method1() {
        System.out.println("StudetnRepository.method1");
    }

    /**
     * method name : method2
     * parameter : String
     * return : X
     * 실행내용 : 전달받은 매개변수 값 출력
     */

    public void method2(String str1) {
        System.out.println(str1);
    }

    /**
     * method name : method3
     * parameter : StudentDTO
     * return : boolean
     * 실행내용 : 전달받은 DTO 객체를 List에 저장하고 결과를 리턴
     */
    public boolean method3(StudentDTO studentDTO) {
        boolean result = studentDTOList.add(studentDTO);
        return result;
    }

    /**
     * retun type : List
     *
     * @return
     */
    public List<StudentDTO> method4() {
        return studentDTOList;
    }

    /**
     * @param id
     * @return StudentDto
     * @name method5
     */
    public StudentDTO method5(Long id) {
        // id와 일치하는 데이터가 있으면 해당 DTO 객체를 리턴하고
        // 없으면 null을 리턴함.
        StudentDTO studentDTO = null;
        for (int i = 0; i < studentDTOList.size(); i++) {
            if (id.equals(studentDTOList.get(i).getId())) {
                studentDTO = studentDTOList.get(i);
            }
        }
        return studentDTO;
    }
}

