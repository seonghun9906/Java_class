package ch11_classes.ex03;

import ch11_array.ex3.Book;
import ch11_classes.ex2.BookDTO;

import java.util.ArrayList;
import java.util.List;

public class MemberRepository {
    private static List<MemberDTO> memberDTOList = new ArrayList<>();

    public boolean save(MemberDTO memberDTO) {
        return memberDTOList.add(memberDTO);
    }

    public MemberDTO Login(String memberEmail, String memberPassword) {
        MemberDTO memberDTO = null;
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (memberEmail.equals(memberDTOList.get(i).getMemberEmail()) && memberPassword.equals(memberDTOList.get(i).getMemberPassword())) {
                memberDTO = memberDTOList.get(i);
            }

        }
        return memberDTO;

    }

    public List<MemberDTO> memberfind() {
        return memberDTOList;
        }

    public boolean memberUpdateCheck(String memberNumber) {
    boolean result = false;
        for (int i = 0; i <memberDTOList.size() ; i++) {
            if(memberNumber.equals(memberDTOList.get(i).getMemberMobile())){
                result = true;
            }

        }return result;
    }


    public boolean memberUpdate(String memberEmail, String memberPassword, String memberName, String memberNumber) {
    boolean result = true;
        for (int i = 0; i <memberDTOList.size() ; i++) {
            memberDTOList.get(i).setMemberEmail(memberEmail);
            memberDTOList.get(i).setMemberPassword(memberPassword);
            memberDTOList.get(i).setMemberName(memberName);
            memberDTOList.get(i).setMemberMobile(memberNumber);

    } return result;
        }


    public boolean cancel(String memEmail ,String memPw) {
        boolean result = false;
        for (int i = 0; i <memberDTOList.size() ; i++) {
            if(memEmail.equals(memberDTOList.get(i).getMemberEmail()) && memPw.equals(memberDTOList.get(i).getMemberPassword())){
                memberDTOList.remove(i);
                result = true;
            }

        }return result;
    }


    public boolean emailCheck(String memberEmail) {
        boolean result = false;
        for (int i = 0; i <memberDTOList.size() ; i++) {
            if(memberEmail.equals(memberDTOList.get(i).getMemberEmail())){
                System.out.println("중복된 이메일입니다.");
                result = true;
            }
        }return result;
    }
}


