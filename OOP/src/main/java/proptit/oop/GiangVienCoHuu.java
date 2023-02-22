/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proptit.oop;

/**
 *
 * @author DangHan
 */
public class GiangVienCoHuu extends GiangVien {
    public static int MaGVCoHuu = 0;
    private float LuongCung;
    private int SoGioQuyDinh;

    GiangVienCoHuu() {

    }

    GiangVienCoHuu(String TenGV, String Email, String HocHam, String HocVi, String DiaChi,String SDT, int SoGioLamViec, float HeSoLuong, float LuongCung, int SoGioQuyDinh) {
        super(TenGV, Email, HocHam, HocVi, DiaChi, SDT, SoGioLamViec, HeSoLuong);
        MaGVCoHuu++;
        super.setMaGV("CH" + String.format("%03d", MaGVCoHuu));
        this.LuongCung = LuongCung;
        this.SoGioQuyDinh = SoGioQuyDinh;
    }

    public float getLuongCung() {
        return LuongCung;
    }

    public void setLuongCung(float LuongCung) {
        this.LuongCung = LuongCung;
    }

    public float getSoGioQuyDinh() {
        return SoGioQuyDinh;
    }

    public void setSoGioQuyDinh(int SoGioQuyDinh) {
        this.SoGioQuyDinh = SoGioQuyDinh;
    }

    @Override
    public float TinhLuong() {
        return (LuongCung + (super.getSoGioLamViec() - SoGioQuyDinh) * 50000) * super.getHeSoLuong();
    }

    @Override
    public String toString() {
        return "GiangVienCoHuu{" + "MaGV=" + getMaGV() + ", TenGV=" + getTenGV() + ", Email=" + getEmail() + ", HocHam=" + getHocHam() + ", HocVi=" + getHocVi() + ", DiaChi=" + getDiaChi() + ", SDT=" + getSDT() + ", LuongCung=" + (int)LuongCung + ", SoGioQuyDinh=" + SoGioQuyDinh + '}';
    }
}
