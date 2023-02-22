/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proptit.tuan2;

/**
 *
 * @author DangHan
 */
public class Truck extends Vehicle{
    private int TruckLoading;

    public Truck() {
    }

    public Truck(String ID, String Manufacturer, int YearofManufacture, double Price, String Color,int TruckLoading) {
        super(ID, Manufacturer, YearofManufacture, Price, Color);
        this.TruckLoading = TruckLoading;
    }

    public int getTruckLoading() {
        return TruckLoading;
    }

    public void setTruckLoading(int TruckLoading) {
        this.TruckLoading = TruckLoading;
    }

    @Override
    public String toString() {
        return super.toString() + "Truck{" + "TruckLoading=" + TruckLoading + '}';
    }
    
}
