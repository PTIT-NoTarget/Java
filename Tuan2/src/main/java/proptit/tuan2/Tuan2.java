/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package proptit.tuan2;

import java.util.Scanner;

/**
 *
 * @author DangHan
 */
public class Tuan2 {
    public static void Menu(){
        System.out.println("------------Menu------------");
        System.out.println("1. Nhap thong tin xe co");
        System.out.println("2. Xuat thong tin xe co");
        System.out.println("3. Thoat");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manager proptit = new Manager();
        Menu();
        int choose = Integer.parseInt(sc.nextLine());
        while(choose != 3){
            switch(choose){
                case 1:
                    proptit.AddNewVehicle();
                    break;
                case 2:
                    proptit.Display();
                    break;
                default:
                    System.out.println("Nhap sai, moi nhap lai");
                    break;
            }
            Menu();
            choose = sc.nextInt();
        }
    }
}
