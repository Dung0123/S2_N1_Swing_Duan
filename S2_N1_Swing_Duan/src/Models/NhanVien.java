/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.ArrayList;

/**
 *
 * @author ledun
 */
public class NhanVien {

    String ID;
    String TenNhanVien;
    String MaNhanVien;
    String Hoten;
    String GioiTinh;
    String DiaChi;
    String SDT;
    String IDCV;
    String IDCuaHang;

    public NhanVien() {
    }

    private ArrayList<NhanVien> list = new ArrayList<>();

//    private ArrayList<NhanVien> listNhanVien() {
//        list.add(new NhanVien("ID123", "dung", "NV1", "Nam", "Hà Nội", "012345678", "ID1", "ID123"));
//        list.add(new NhanVien("ID123", "tho", "NV2", "Nữ", "Hà Nội", "012345678", "ID2", "ID123"));
//        list.add(new NhanVien("ID123", "toan", "NV3", "Nam", "Hà Nội", "012345678", "ID3", "ID123"));
//        list.add(new NhanVien("ID123", "theanh", "NV4", "Nam", "Hà Nội", "012345678", "ID4", "ID123"));
//        list.add(new NhanVien("ID123", "quang", "NV5", "Nam", "Hà Nội", "012345678", "ID5", "ID123"));
//        return list;
//    }

    public NhanVien(String ID, String TenNhanVien, String MaNhanVien, String GioiTinh, String DiaChi, String SDT, String IDCV, String IDCuaHang) {
        this.ID = ID;
        this.TenNhanVien = TenNhanVien;
        this.MaNhanVien = MaNhanVien;

        this.GioiTinh = GioiTinh;
        this.DiaChi = DiaChi;
        this.SDT = SDT;
        this.IDCV = IDCV;
        this.IDCuaHang = IDCuaHang;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTenNhanVien() {
        return TenNhanVien;
    }

    public void setTenNhanVien(String TenNhanVien) {
        this.TenNhanVien = TenNhanVien;
    }

    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getIDCV() {
        return IDCV;
    }

    public void setIDCV(String IDCV) {
        this.IDCV = IDCV;
    }

    public String getIDCuaHang() {
        return IDCuaHang;
    }

    public void setIDCuaHang(String IDCuaHang) {
        this.IDCuaHang = IDCuaHang;
    }

}
