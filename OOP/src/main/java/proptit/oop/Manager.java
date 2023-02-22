/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proptit.oop;

/**
 *
 * @author DangHan
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
    private ArrayList<GiangVien> DanhSachGiangVien = new ArrayList<>();
    public void NhapGiangVien(){
        GiangVien gv = new GiangVien();
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Giang vien co huu");
        System.out.println("2. Giang vien thinh giang");
        System.out.print("Nhap lua chon: ");
        int chon = sc.nextInt(); sc.nextLine();
        System.out.println("Nhap thong tin giang vien");
        System.out.print("Ten Giang Vien :");
        String TenGV = sc.nextLine();
        System.out.print("Email :");
        String Email = sc.nextLine();
        System.out.println("Hoc Ham :");
        System.out.println("1. Không");
        System.out.println("2. Giao su");
        System.out.println("3. Pho giao su");
        System.out.print("Nhap lua chon: ");
        int chon2 = sc.nextInt(); sc.nextLine();
        String HocHam = new String();
        float HeSoLuong = 0.f;
        switch(chon2){
            case 1 -> HocHam = "Khong";
            case 2 -> {
                HocHam = "Giao su";
                HeSoLuong += 0.2f;
            }
            case 3 -> {
                HocHam = "Pho giao su";
                HeSoLuong += 0.1f;
            }
            default -> {
                System.out.println("Nhap sai");
                return;
            }
        }

        System.out.println("Hoc vi :");
        System.out.println("1. Dai hoc");
        System.out.println("2. Thac si");
        System.out.println("3. Tien si");
        System.out.print("Nhap lua chon: ");
        int chon1 = sc.nextInt(); sc.nextLine();
        String HocVi = new String();
        switch(chon1){
            case 1 -> {
                HocVi = "Dai hoc";
                HeSoLuong += 1.f;
            }
            case 2 -> {
                HocVi = "Thac si";
                HeSoLuong += 1.1f;
            }
            case 3 -> {
                HocVi = "Tien si";
                HeSoLuong += 1.2f;
            }
            default -> {
                System.out.println("Nhap sai");
                return;
            }
        }

        System.out.print("Dia Chi :");
        String DiaChi = sc.nextLine();
        System.out.print("So Dien Thoai :");
        String SDT = sc.nextLine();
        System.out.print("So Gio Lam Viec :");
        int SoGioLamViec = sc.nextInt(); sc.nextLine();
        switch(chon){
            case 1:
                System.out.print("Luong Cung :");
                float LuongCung = sc.nextFloat(); sc.nextLine();
                int SoGioQuyDinh = 40;
                gv = new GiangVienCoHuu(TenGV, Email, HocHam, HocVi, DiaChi, SDT, SoGioLamViec, HeSoLuong, LuongCung, SoGioQuyDinh);
                break;
            case 2:
                System.out.print("Dia Chi Co Quan :");
                String DiaChiCoQuan = sc.nextLine();
                System.out.print("So Dien Thoai Co Quan :");
                String SDTCoQuan = sc.nextLine();
                gv = new GiangVienThinhGiang(TenGV, Email, HocHam, HocVi, DiaChi, SDT, SoGioLamViec, HeSoLuong, DiaChiCoQuan, SDTCoQuan);
                break;
            default:
                System.out.println("Nhap sai");
                return;
        }
        DanhSachGiangVien.add(gv);
    }

    public void XuatGiangVien(){
        System.out.println("Danh sach giang vien");
        for (GiangVien gv : DanhSachGiangVien) {
            System.out.println(gv.toString());
        }
        System.out.println("Tong so giang vien: " + DanhSachGiangVien.size());
    }

    public void XoaGiangVien(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma giang vien can xoa: ");
        String MaGV = sc.nextLine();
        for (GiangVien gv : DanhSachGiangVien) {
            if(gv.getMaGV().equals(MaGV)){
                DanhSachGiangVien.remove(gv);
                System.out.println("Xoa thanh cong");
                return;
            }
        }
        System.out.println("Khong tim thay giang vien");
    }

    public void XuatGiangVienCoHuu(){
        System.out.println("Danh sach giang vien co huu");
        int SoLuong = 0;
        for (GiangVien gv : DanhSachGiangVien) {
            if(gv instanceof GiangVienCoHuu){
                System.out.println(gv.toString());
                SoLuong++;
            }
        }
        System.out.println("Tong so giang vien co huu: " + SoLuong);
    }

    public void XuatGiangVienThinhGiang(){
        System.out.println("Danh sach giang vien thinh giang");
        int SoLuong = 0;
        for (GiangVien gv : DanhSachGiangVien) {
            if(gv instanceof GiangVienThinhGiang){
                System.out.println(gv.toString());
                SoLuong++;
            }
        }
        System.out.println("Tong so giang vien thinh giang: " + SoLuong);
    }

    public void TinhLuongGiangVien(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma giang vien can tinh luong: ");
        String MaGV = sc.nextLine();
        for (GiangVien gv : DanhSachGiangVien) {
            if(gv.getMaGV().equals(MaGV)){
                System.out.println("Luong cua giang vien " + gv.getTenGV() + " la: " + (int)gv.TinhLuong());
                return;
            }
        }
        System.out.println("Khong tim thay giang vien");
    }
}
