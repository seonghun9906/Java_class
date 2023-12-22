package ch12_classes.ex06.Service;

import ch12_classes.ex06.commonVariables.CommonVariables;
import ch12_classes.ex06.dto.MemberDTO;
import ch12_classes.ex06.repository.MemberRepository;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class MemberService {
    MemberRepository memberRepository = new MemberRepository();
    Scanner sc = new Scanner(System.in);

    public void SignUp() {
        boolean run = true;
        if (CommonVariables.longinEmail == null) {
            System.out.println("회원가입 메뉴");
            while (run) {
                System.out.print("이메일 : ");
                String memEmail = sc.next();
                boolean memberEmailCheck = memberRepository.memberEmailCheck(memEmail);
                if (memberEmailCheck) {
                    System.out.println("사용 가능한 이메일입니다.");
                    System.out.print("비밀번호 : ");
                    String memPw = sc.next();
                    System.out.print("이름 : ");
                    String memName = sc.next();
                    System.out.print("전화번호 : ");
                    String memMobile = sc.next();
                    String signUpAt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
                    MemberDTO memberDTO = new MemberDTO(memEmail, memPw, memName, memMobile, signUpAt);
                    boolean signUp = memberRepository.Signup(memberDTO);
                    if (signUp) {
                        System.out.println("회원가입 성공");
                        break;
                    } else {
                        System.out.println("회원가입 실패");
                    }
                } else {
                    System.out.println("중복된 이메일입니다. 다른 이메일을 적어주세요.");
                }
            }
        } else {
            System.out.println("로그아웃 해주세요.");
        }
    }

    public void Login() {

        System.out.println("로그인을 위해 이메일과 비밀번호를 입력해 주세요.");
        System.out.print("Email : ");
        String memEmail = sc.next();
        System.out.print("PW : ");
        String memPw = sc.next();

        MemberDTO Login = memberRepository.Login(memEmail, memPw);
        if (Login != null) {
            System.out.println("로그인 되었습니다.");
            CommonVariables.longinEmail = Login.getMemberEmail();
        } else {
            System.out.println("로그인에 실패하였습니다.");
        }
    }

    public void MemList() {
        if (CommonVariables.longinEmail != null) {
            System.out.println("회원 목록입니다.");
            List<MemberDTO> memList = memberRepository.memList();
            if (!memList.isEmpty()) {
                for (int i = 0; i < memList.size(); i++) {
                    System.out.println(memList.get(i));
                }
            } else {
                System.out.println("오류로 인해서 회원목록 공개가 안됩니다.");
            }
        } else {
            System.out.println("로그인 해주세요.");
        }
    }

    public void MemSet() {
        if (CommonVariables.longinEmail != null) {
            System.out.println("회원을 정보 수정합니다.");
            memberRepository.memList();
            System.out.println("수정하실 회원 id를 입력해주세요");
            Long memId = sc.nextLong();
            boolean NumIdCheck = memberRepository.memberIDCheck(memId);
            if (NumIdCheck) {
                System.out.println("수정할 이메일을 입력해주세요.");
                String MemEmail = sc.next();
                System.out.println("수정할 비밀번호를 입력해주세요.");
                String memPw = sc.next();
                System.out.println("수정할 이름을 입력해주세요.");
                String memName = sc.next();
                System.out.println("수정할 번호를 입력해주세요.");
                String memMobile = sc.next();
                boolean MemSet = memberRepository.memSet(memId, MemEmail, memPw, memName, memMobile);
                if (MemSet) {
                    System.out.println("회원 수정이 완료 되었습니다.");
                } else {
                    System.out.println("회원 수정에 실패 하였습니다.");
                }
            } else {
                System.out.println("존재하지 않은 Eamil 입니다.");
            }
        } else {
            System.out.println("로그인 해주세요.");
        }
    }

    public void MemOut() {
        if (CommonVariables.longinEmail != null) {
            System.out.println("회원 탈퇴할 id를 입력해주세요");
            Long memId = sc.nextLong();
            boolean memOut = memberRepository.memberIDCheck(memId);
            if (memOut) {
                memberRepository.memOut(memId);
                System.out.println("회원이 탈퇴되었습니다.");
            } else {
                System.out.println("회원탈퇴에 실패 하였습니다.");
            }
        } else {
            System.out.println("로그인 해주세요.");
        }
    }

    public void LogOut() {
        if (CommonVariables.longinEmail != null) {
            CommonVariables.longinEmail = null;
            System.out.println("로그아웃 되었습니다.");
        } else {
            System.out.println("오류로 인해 로그아웃이 되지 않았습니다.");
        }
    }
}

