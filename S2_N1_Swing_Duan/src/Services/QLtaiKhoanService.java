/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import Models.TaiKhoan;
import java.util.ArrayList;

/**
 *
 * @author ledun
 */
public interface QLtaiKhoanService {

    public TaiKhoan selectByID(String Id);

    public void Xoa(String userName);

    public void DoiPass(TaiKhoan tk);

    public void UpDate(TaiKhoan tk);

    public ArrayList<TaiKhoan> selectAll();

    public TaiKhoan DangKiTaiKhoan(TaiKhoan tk);

    public TaiKhoan ThemTaiKhoan(TaiKhoan tk);
}
