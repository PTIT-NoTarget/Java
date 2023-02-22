/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proptit.tuan2;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author DangHan
 */
public class Manager {
    private ArrayList <Vehicle> vehicles = new ArrayList<>();

    public void AddNewVehicle(){
        Vehicle vehicle = new Vehicle();
        Scanner sc = new Scanner(System.in);
        System.out.println("Chon loai xe: ");
        System.out.println("1. Xe tai");
        System.out.println("2. Xe may");
        System.out.println("3. Xe hoi");
        System.out.print("Nhap lua chon: ");
        int choose = Integer.parseInt(sc.nextLine());
        String ID = "XXX00";
        System.out.print("Hang san xuat: ");
        String Manufacturer = sc.nextLine();
        System.out.print("Nam san xuat: ");
        int YearofManufacture = Integer.parseInt(sc.nextLine());
        System.out.print("Gia: ");
        double Price = Double.parseDouble(sc.nextLine());
        System.out.print("Mau: ");
        String Color = sc.nextLine();
        switch (choose){
            case 1:
                System.out.print("Tai trong: ");
                int TruckLoading = Integer.parseInt(sc.nextLine());
                vehicle = new Truck(ID, Manufacturer, YearofManufacture, Price, Color, TruckLoading);
                break;
            case 2:
                System.out.print("Cong suat: ");
                int Power = Integer.parseInt(sc.nextLine());
                vehicle = new Motobike(ID, Manufacturer, YearofManufacture, Price, Color, Power);
                break;
            case 3:
                System.out.print("Loai dong co: ");
                String TypeofEngine = sc.nextLine();
                System.out.print("So cho ngoi: ");
                int Seat = Integer.parseInt(sc.nextLine());
                vehicle = new Car(ID, Manufacturer, YearofManufacture, Price, Color, TypeofEngine, Seat);
                break;
            default:
                System.out.println("Nhap sai");
                return;
        }
        vehicles.add(vehicle);
    }

    public void Display(){
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.toString());
        }
    }
}
