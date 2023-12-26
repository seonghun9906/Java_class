package ch13_map.ex03;

public class MemberDTO {
    private Long id;
    private String memberEmail;
    private String memberPassword;
    private String memberName;
    private String memberMobile;
    private String memberLock = "123456789";

    public String getMemberLock() {
        return memberLock;
    }

    public void setMemberLock() {
        this.memberLock = "123456789";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }

    public String getMemberPassword() {
        return memberPassword;
    }

    public void setMemberPassword(String memberPassword) {
        this.memberPassword = memberPassword;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberMobile() {
        return memberMobile;
    }

    public void setMemberMobile(String memberMobile) {
        this.memberMobile = memberMobile;
    }

    private static Long idValue = 1L;

    public MemberDTO() {


    }

    public MemberDTO(String memberEmail, String memberPassword, String memberName, String memberMobile) {
        this.id = idValue++;
        this.memberEmail = memberEmail;
        this.memberPassword = memberPassword;
        this.memberName = memberName;
        this.memberMobile = memberMobile;
    }

    public MemberDTO(String memberLock) {
        this.memberLock = memberLock;
    }
    public String toString() {
        return "회원정보{" +
                "id=" + id +
                ", Email='" + memberEmail + '\'' +
                ", Password='" + memberPassword + '\'' +
                ", Name='" + memberName + '\'' +
                ", Mobile='" + memberMobile + '\'' +
                '}';
    }
}
