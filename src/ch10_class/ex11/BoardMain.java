package ch10_class.ex11;

import java.util.Scanner;
public class BoardMain {
    /**
     * 메뉴
     * 1. 글작성(매개변수 있는 생성자이용)
     *      글작성 정보는 스캐너로 받음. 글번호도 같이 입력함.
     * 2. 글조회
     *      글번호를 입력 받고 Board 클래스의 findById로 글번호를 넘긴다.
     * 3. 종료
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int selectNo = 0;
        Board board = new Board();


        while (run) {
            System.out.println("--------------------------------------------------------------");
            System.out.println("1.글작성 | 2.글조회 | 3.종료");
            System.out.println("--------------------------------------------------------------");
            System.out.print("선택> ");
            selectNo = scanner.nextInt();
            if (selectNo == 1) {
                System.out.println("글 제목 입력");
                board.setBoardTitle(scanner.next());
                System.out.println("작성자 입력");
                board.setBoardWriter(scanner.next());
                System.out.println("글 입력");
                board.setBoardContents(scanner.next());
                System.out.println("글 저장번호 입력");
                board.setId(scanner.nextLong());
                System.out.println("글 저장번호 확인");

                System.out.println("글제목 : " + board.getBoardTitle());
                System.out.println("작성자 : " + board.getBoardWriter());
                System.out.println("글 입력 : " + board.getBoardContents());
                System.out.println("글 저장번호 : " + board.getId());
            } else if (selectNo == 2) {
                System.out.println("글 조회를 위해 저장했던 번호 입력");
                System.out.println("번호 입력 > ");
                board.findById(scanner.nextLong());


            } else if (selectNo == 3) {
                run = false;
            }
        }
    }
}
