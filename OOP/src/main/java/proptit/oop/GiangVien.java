/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proptit.oop;

/**
 *
 * @author DangHan
 */
public class GiangVien {
    private String MaGV;
    private String TenGV;
    private String Email;
    private String HocHam;
    private String HocVi;
    private String DiaChi;
    private String SDT;
    private int SoGioLamViec;
    private float HeSoLuong;
    GiangVien() {
        
    }
    GiangVien(String TenGV, String Email, String HocHam, String HocVi, String DiaChi, String SDT, int SoGioLamViec, float HeSoLuong) {
        this.TenGV = TenGV;
        this.Email = Email;
        this.HocHam = HocHam;
        this.HocVi = HocVi;
        this.DiaChi = DiaChi;
        this.SDT = SDT;
        this.SoGioLamViec = SoGioLamViec;
        this.HeSoLuong = HeSoLuong;
    }

    public String getMaGV() {
        return MaGV;
    }

    public void setMaGV(String MaGV) {
        this.MaGV = MaGV;
    }

    public String getTenGV() {
        return TenGV;
    }

    public void setTenGV(String TenGV) {
        this.TenGV = TenGV;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getHocHam() {
        return HocHam;
    }

    public void setHocHam(String HocHam) {
        this.HocHam = HocHam;
    }

    public String getHocVi() {
        return HocVi;
    }

    public void setHocVi(String HocVi) {
        this.HocVi = HocVi;
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

    public int getSoGioLamViec() {
        return SoGioLamViec;
    }

    public void setSoGioLamViec(int SoGioLamViec) {
        this.SoGioLamViec = SoGioLamViec;
    }

    public float getHeSoLuong() {
        return HeSoLuong;
    }

    public void setHeSoLuong(float HeSoLuong) {
        this.HeSoLuong = HeSoLuong;
    }

    public float TinhLuong() {
        return 0.0f;
    }
    
}
