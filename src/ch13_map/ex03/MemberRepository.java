package ch13_map.ex03;

import java.util.HashMap;
import java.util.Map;

public class MemberRepository {
    Map<Long, MemberDTO> memberDTOMap = new HashMap<>();

    public boolean emailCheck(String memberEmail) {
        boolean result = false;
        for (Long i : memberDTOMap.keySet()) {
            if (memberEmail.equals(memberDTOMap.get(i).getMemberEmail())) {
            result = true;
            }
        }
        return result;
    }

    public boolean save(MemberDTO memberDTO) {
        MemberDTO memberDTO1 = memberDTOMap.put(memberDTO.getId(), memberDTO);
        if (memberDTO1 == null) {
            return true;
        } else {
            return false;
        }
    }


    public MemberDTO Login(String email, String pw) {
        MemberDTO memberDTO = null;
        for (Long i : memberDTOMap.keySet()) {
            if (email.equals(memberDTOMap.get(i).getMemberEmail()) && pw.equals(memberDTOMap.get(i).getMemberPassword())) {
                memberDTO = memberDTOMap.get(i);

            }
        }
        return memberDTO;
    }

    public Map<Long, MemberDTO> memberfind() {
        return memberDTOMap;
    }

    public boolean memberUpdateCheck(String membernum) {
        boolean result = false;
        for (Long i : memberDTOMap.keySet()) {
            if (membernum.equals(memberDTOMap.get(i).getMemberMobile())) {
                result = true;
            }
        }
        return result;
    }

    public boolean memberUpdate(String memberEmail, String memberPassword, String memberName, String memberNumber) {
        boolean result = true;
        for (Long i : memberfind().keySet()) {
            memberDTOMap.get(i).setMemberEmail(memberEmail);
            memberDTOMap.get(i).setMemberPassword(memberPassword);
            memberDTOMap.get(i).setMemberName(memberName);
            memberDTOMap.get(i).setMemberMobile(memberNumber);

        }
        return result;
    }

    public boolean cancel(String memEmail, String memPw) {
        boolean result = false;
        for (Long i : memberDTOMap.keySet()) {
            if (memEmail.equals(memberDTOMap.get(i).getMemberEmail()) && memPw.equals(memberDTOMap.get(i).getMemberPassword())) {
                memberDTOMap.remove(i);
                result = true;
            }
        }
        return result;
    }

    public void memInfo(String loginEmail) {
        for (Long i : memberDTOMap.keySet()) {
            if (loginEmail.equals(memberDTOMap.get(i).getMemberEmail())) {
                System.out.println(memberDTOMap.get(i));
            }
        }
    }
}




