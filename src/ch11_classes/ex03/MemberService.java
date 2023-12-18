package ch11_classes.ex03;

import java.util.List;
import java.util.Scanner;

public class MemberService {
    private static String loginEmail = null;
    MemberRepository memberRepository = new MemberRepository();
    Scanner sc = new Scanner(System.in);

    public void save() {
        System.out.println("회원 가입할 정보를 입력하세요.");
        System.out.print("이메일 입력 > ");
        String memberEmail = sc.next();
        boolean result = memberRepository.emailCheck(memberEmail);
        if (result) {
            //reuslt는 true 이므로 이것이 실행되고 Repository에서 false 나오면 사용가능한 eamil이라고 하고 비밀번호 입력으로 넘어감
            System.out.println("중복된 이메일입니다.");
            System.out.println("이메일이 중복되어 다른 이메일을 입력해주세요.");
            save();
        } else {
            System.out.println("사용 가능한 email 입니다.");
            System.out.print("비밀번호 입력 > ");
            String memberPassword = sc.next();
            System.out.print("회원 이름 입력 > ");
            String memberName = sc.next();
            System.out.print("회원 전화번호 입력 > ");
            String memberMobile = sc.next();


            MemberDTO memberDTO = new MemberDTO(memberEmail, memberPassword, memberName, memberMobile);
            boolean save = memberRepository.save(memberDTO);
            if (save) {
                System.out.println(memberDTO);
                System.out.println("회원가입 성공");
            } else {
                System.out.println("회원가입 실패");
            }
        }

    }


    public void login() {
        if(loginEmail == null) {
            System.out.println("로그인 할 Email와 PW를 입력하세요");
            System.out.print("ID > ");
            String email = sc.next();
            System.out.print("PW > ");
            String Pw = sc.next();

            MemberDTO memberDTO = memberRepository.Login(email, Pw);
            if (memberDTO != null) {
                System.out.println("환영합니다. " + memberDTO.getMemberName() + " 님 로그인 되었습니다.");
                loginEmail = email;
            } else {
                System.out.println("로그인 실패");
            }
        }else {
            System.out.println("로그인이 되어있는 상태입니다 로그아웃을 하신 후 재 로그인 해주시길 바랍니다.");
        }
    }

    public void memberFind() {
        List<MemberDTO> memberDTOList = memberRepository.memberfind();
        for (MemberDTO memberDTO : memberDTOList) {
            System.out.println(memberDTO);
        }
    }


    public void memberUpdate() {
        if (loginEmail != null) {
            System.out.print("본인확인 회원 전화번호 입력 > ");
            String membernum = sc.next();
            boolean memberDTO = memberRepository.memberUpdateCheck(membernum);
            if (memberDTO) {
                System.out.print("수정할 Email > ");
                String memberEmail = sc.next();
                System.out.print("수정할 Pw > ");
                String memberPassword = sc.next();
                System.out.print("수정할 name > ");
                String memberName = sc.next();
                System.out.print("수정할 Mobile > ");
                String memberNumber = sc.next();
                boolean updateresult = memberRepository.memberUpdate(memberEmail, memberPassword, memberName, memberNumber);
                if (updateresult) {
                    System.out.println("수정 성공");
                } else {
                    System.out.println("수정 실패");
                }
            } else {
                System.out.println("요청하신 정보가 존재하지 않습니다.");
            }
        } else {
            System.out.println("로그인 해주시길 바랍니다.");
        }
    }

    public void cancle() {
        if (loginEmail != null) {
            System.out.println("회원 확인을 위해 이메일과 비밀번호를 입력해 주세요.");
            System.out.print("회원 이메일 > ");
            String memEmail = sc.next();
            if (loginEmail.equals(memEmail)) {
                System.out.print("회원 Pw > ");
                String memPw = sc.next();
                boolean bool = memberRepository.cancel(memEmail, memPw);
                if (bool) {
                    System.out.println("회원이 탈퇴되었습니다.");
                } else {
                    System.out.println("회원 탈퇴를 실패하였습니다.");
                }
            } else {
                System.out.println("로그인된 회원정보랑 다릅니다.");
            }
        } else {
            System.out.println("로그인 해주시길 바랍니다.");
        }
    }

    public void logout() {
        if (loginEmail != null) {
            loginEmail = null;
            System.out.println("로그아웃 되었습니다.");
        }else {
            System.out.println("로그인 해주시길 바랍니다.");
        }
    }


    public void memInfo() {
        if (loginEmail != null) {
            memberRepository.memInfo(loginEmail);
        } else {
            System.out.println("로그인 해주시길 바랍니다.");
        }
    }

}




