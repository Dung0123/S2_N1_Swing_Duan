/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Dbexecute.Xhelp;
import Models.TaiKhoan;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class QLtaiKhoan implements QLtaiKhoanService {

    @Override
    public ArrayList<TaiKhoan> selectAll() {
        try {
            ArrayList<TaiKhoan> lstTaiKhoan = new ArrayList<>();
            ResultSet rs = Xhelp.excuteQuery("Select UserName,Password,QuyenHan from TaiKhoan");
            while (rs.next()) {
                lstTaiKhoan.add(new TaiKhoan(rs.getString(1), rs.getString(2), rs.getString(3), null));
            }
            return lstTaiKhoan;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }

    }

    @Override
    public TaiKhoan selectByID(String userName) {
        try {
            ResultSet rs = Xhelp.excuteQuery("Select UserName,Password,QuyenHan from TaiKhoan Where UserName=?", userName);
            if (rs.next());
            return new TaiKhoan(rs.getString(1), rs.getString(2), rs.getString(3), null);
        } catch (SQLException ex) {

            return null;
        }
    }

    public static void main(String[] args) {
        var ql = new QLtaiKhoan();
        System.out.println(ql.selectAll());
        System.out.println(ql.selectByID("TKQL1"));
    }

    @Override
    public TaiKhoan DangKiTaiKhoan(TaiKhoan tk) {
        Integer kq = Xhelp.excuteUpdate("Insert into TaiKhoan(UserName, password,QuyenHan)"
                + " values (?,?)", tk.getUserName(), tk.getPassWord());
        JOptionPane.showMessageDialog(null, kq == 1 ? "Đăng kí Khẩu thành công" : "Đăng kí Khẩu Thất Bại");

        return tk;
    }

    @Override
    public void DoiPass(TaiKhoan tk) {
        System.out.println(tk.getUserName());
        System.out.println(tk.getPassWord());
        Integer kq = Xhelp.excuteUpdate("UPDATE TaiKhoan SET Password = ? WHERE UserName = ?", tk.getPassWord(), tk.getUserName());
        JOptionPane.showMessageDialog(null, kq == 1 ? "Đổi mật Khẩu thành công" : "Đổi mật Khẩu Thất Bại");

    }

    @Override
    public TaiKhoan ThemTaiKhoan(TaiKhoan tk) {
        Integer kq = Xhelp.excuteUpdate("Insert into TaiKhoan(UserName, password,QuyenHan)"
                + " values (?,?,?)", tk.getUserName(), tk.getPassWord(), tk.getRole());
        JOptionPane.showMessageDialog(null, kq == 1 ? "Thêm tài khoản Khẩu thành công" : "Thêm tài khoản Khẩu Thất Bại");

        return tk;
    }

    @Override
    public void UpDate(TaiKhoan tk) {
        System.out.println(tk.getUserName());
        System.out.println(tk.getPassWord());
        Integer kq = Xhelp.excuteUpdate("UPDATE TaiKhoan SET Password = ?,QuyenHan =?  WHERE UserName = ?", tk.getPassWord(), tk.getRole(), tk.getUserName());
        JOptionPane.showMessageDialog(null, kq == 1 ? "Đổi mật Khẩu thành công" : "Đổi mật Khẩu Thất Bại");
    }

    @Override
    public void Xoa(String userName) {
        Integer kq = Xhelp.excuteUpdate("DELETe FROm TaiKhoan where userName = ?", userName);
        JOptionPane.showMessageDialog(null, kq == 1 ? "Xóa thành công" : "Xóa Khẩu Thất Bại");
    }
}
