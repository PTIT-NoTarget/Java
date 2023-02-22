/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proptit.oop;

/**
 *
 * @author DangHan
 */
public class GiangVienThinhGiang extends GiangVien {
    public static int MaGVThinhGiang = 0;
    private String DiaChiCoQuan;
    private String SDTCoQuan;

    GiangVienThinhGiang() {
        
    }

    GiangVienThinhGiang (String TenGV, String Email, String HocHam, String HocVi, String DiaChi, String SDT, int SoGioLamViec, float HeSoLuong, String DiaChiCoQuan, String SDTCoQuan) {
        super(TenGV, Email, HocHam, HocVi, DiaChi, SDT, SoGioLamViec, HeSoLuong);
        MaGVThinhGiang++;
        super.setMaGV("TG" + String.format("%03d", MaGVThinhGiang));
        this.DiaChiCoQuan = DiaChiCoQuan;
        this.SDTCoQuan = SDTCoQuan;
    }

    public String getDiaChiCoQuan() {
        return DiaChiCoQuan;
    }

    public void setDiaChiCoQuan(String DiaChiCoQuan) {
        this.DiaChiCoQuan = DiaChiCoQuan;
    }

    public String getSDTCoQuan() {
        return SDTCoQuan;
    }

    public void setSDTCoQuan(String SDTCoQuan) {
        this.SDTCoQuan = SDTCoQuan;
    }

    @Override
    public float TinhLuong() {
        return super.getSoGioLamViec() * 200000 * super.getHeSoLuong();
    }

    @Override
    public String toString() {
        return "GiangVienThinhGiang{" + "MaGV=" + getMaGV() + ", TenGV=" + getTenGV() + ", Email=" + getEmail() + ", HocHam=" + getHocHam() + ", HocVi=" + getHocVi() + ", DiaChi=" + getDiaChi() + ", SDT=" + getSDT() + ", SoGioLamViec=" + getSoGioLamViec() + ", HeSoLuong=" + getHeSoLuong() + ", DiaChiCoQuan=" + DiaChiCoQuan + ", SDTCoQuan=" + SDTCoQuan + '}';
    }

}
