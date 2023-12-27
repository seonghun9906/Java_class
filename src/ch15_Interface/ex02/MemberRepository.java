package ch15_Interface.ex02;

public interface MemberRepository {
    boolean save(MemberDTO memberDTO);

    MemberDTO login(String memberEmail, String MemberPassword);

    boolean update(String loginEmail, String mobile);

    boolean delete(String loginEmail);

    boolean emailCheck(String memberEmail);

    Object findAll();
}
