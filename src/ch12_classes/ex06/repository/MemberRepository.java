package ch12_classes.ex06.repository;

import ch12_classes.ex06.dto.MemberDTO;

import java.util.ArrayList;
import java.util.List;

public class MemberRepository {
    List<MemberDTO> memberDTOList = new ArrayList<>();

    public boolean memberEmailCheck(String memEmail) {
        boolean result = true;
        for (MemberDTO memberDTO : memberDTOList) {
            if (memEmail.equals(memberDTO.getMemberEmail())) {
                result = false;
                break;
            }
        }
        return result;
    }

    public boolean Signup(MemberDTO memberDTO) {
        return memberDTOList.add(memberDTO);
    }

    public MemberDTO Login(String memEmail, String memPw) {
        for (MemberDTO memberDTO : memberDTOList) {
            if (memEmail.equals(memberDTO.getMemberEmail()) && memPw.equals(memberDTO.getMemberPassword())) {
                return memberDTO;
            }
        }return null;
    }

    public boolean memList() {
        boolean result = false;
        for (MemberDTO memberDTO : memberDTOList) {
            System.out.println(memberDTO);
            result = true;
        }
        return result;
    }


    public boolean memSet(Long memId, String memEmail, String memPw, String memName, String memMobile) {
        boolean result = false;
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (memId.equals(memberDTOList.get(i).getId())) {
                memberDTOList.get(i).setMemberEmail(memEmail);
                memberDTOList.get(i).setMemberPassword(memPw);
                memberDTOList.get(i).setMemberName(memName);
                memberDTOList.get(i).setMemberMobile(memMobile);
            }
            result = true;
        }
        return result;
    }


    public boolean memberIDCheck(Long memId) {
        boolean result = false;
        for (MemberDTO memberDTO : memberDTOList) {
            if (memId.equals(memberDTO.getId())) {
                result = true;
                break;
            }
        }
        return result;
    }

    public void memOut(Long memId) {
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (memId.equals(memberDTOList.get(i).getId())) {
                memberDTOList.remove(i);
            }
        }
    }


}

