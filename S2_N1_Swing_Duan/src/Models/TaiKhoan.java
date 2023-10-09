package Models;

import java.util.ArrayList;

public class TaiKhoan {

    String UserName;
    String PassWord;
    String role;
    String IDNhanVien;


    public TaiKhoan() {
    }

    public TaiKhoan(String UserName, String PassWord, String role, String IDNhanVien) {
        this.UserName = UserName;
        this.PassWord = PassWord;
        this.role = role;
        this.IDNhanVien = IDNhanVien;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPassWord() {
        return PassWord;
    }

    public void setPassWord(String PassWord) {
        this.PassWord = PassWord;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getIDNhanVien() {
        return IDNhanVien;
    }

    public void setIDNhanVien(String IDNhanVien) {
        this.IDNhanVien = IDNhanVien;
    }

}
