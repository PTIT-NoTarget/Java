/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package proptit.oop;

import java.util.Scanner;

/**
 *
 * @author DangHan
 */


public class OOP {
    public static void menu(){
        System.out.println("-------------Menu-------------");
        System.out.println("1. Nhap thong tin giang vien");
        System.out.println("2. Xuat thong tin giang vien");
        System.out.println("3. Xoa giang vien");
        System.out.println("4. Xuat danh sach giang vien co huu");
        System.out.println("5. Xuat danh sach giang vien thinh giang");
        System.out.println("6.Tinh luong cho giang vien");
        System.out.println("7. Thoat");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manager ProPTIT = new Manager();
        while(true){
            menu();
            System.out.print("Nhap lua chon: ");
            int chon = sc.nextInt();
            switch(chon){
                case 1:
                    ProPTIT.NhapGiangVien();
                    break;
                case 2:
                    ProPTIT.XuatGiangVien();
                    break;
                case 3:
                    ProPTIT.XoaGiangVien();
                    break;
                case 4:
                    ProPTIT.XuatGiangVienCoHuu();
                    break;
                case 5:
                    ProPTIT.XuatGiangVienThinhGiang();
                    break;
                case 6:
                    ProPTIT.TinhLuongGiangVien();
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Nhap sai");
                    break;
            }
            
        }
    }
}
