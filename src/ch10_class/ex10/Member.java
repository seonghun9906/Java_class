package ch10_class.ex10;

import java.util.Scanner;

public class Member {
    /**
     * 회원 정보 클래스
     * 회원 정보
     * - 이메일(memberEmail)
     * - 비밀번호(memberPassword)
     * - 이름(memberName)
     * - 전화번호(memberMobile)
     * getter/setter
     * 생성자 2가지
     */

    Scanner sc = new Scanner(System.in);

    private String MemberEmail;
    private String MemberPassword;
    private String MemberName;
    private String MemberMobile;
    private String MemberLogin;

    public String getMemberEmail() {
        return MemberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        MemberEmail = memberEmail;
    }

    public String getMemberPassword() {
        return MemberPassword;
    }

    public void setMemberPassword(String memberPassword) {
        MemberPassword = memberPassword;
    }

    public String getMemberName() {
        return MemberName;
    }

    public void setMemberName(String memberName) {
        MemberName = memberName;
    }

    public String getMemberMobile() {
        return MemberMobile;
    }

    public void setMemberMobile(String memberMobile) {
        MemberMobile = memberMobile;
    }

    public String getMemberLogin() {
        return MemberLogin;
    }

    public void setMemberLogin(String memberLogin) {
        MemberLogin = memberLogin;
    }

    public Member() {
    }

    public Member(String memberEmail, String memberPassword, String memberName, String memberMobile) {
        MemberEmail = memberEmail;
        MemberPassword = memberPassword;
        MemberName = memberName;
        MemberMobile = memberMobile;
    }

    //* 로그인 처리 메서드
    //* name: memberLogin
    //* parameter: memberEmail, memberPassword
    //* return type: boolean
    //* 실행내용: 이메일, 비밀번호가 일치하면 true,
    //* 일치하지 않으면 false 리턴
    public boolean MemberLogin(String memberEmail, String memberPassword) {
        if (memberEmail.equals(this.MemberEmail) && memberPassword.equals(this.getMemberPassword())) {
                        return true;
        } else {
                        return false;
        }

    }

    @Override
    public String toString() {
        return "Member{" +
                "MemberEmail='" + MemberEmail + '\'' +
                ", MemberPassword='" + MemberPassword + '\'' +
                ", MemberName='" + MemberName + '\'' +
                ", MemberMobile='" + MemberMobile + '\'' +
                '}';
    }
}


