/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proptit.tuan2;

/**
 *
 * @author DangHan
 */
public class Vehicle {
    private String ID;
    private String Manufacturer;
    private int YearofManufacture;
    private double Price;
    private String Color;

    public Vehicle() {
    }

    public Vehicle(String ID, String Manufacturer, int YearofManufacture, double Price, String Color) {
        this.ID = ID;
        this.Manufacturer = Manufacturer;
        this.YearofManufacture = YearofManufacture;
        this.Price = Price;
        this.Color = Color;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String Manufacturer) {
        this.Manufacturer = Manufacturer;
    }

    public int getYearofManufacture() {
        return YearofManufacture;
    }

    public void setYearofManufacture(int YearofManufacture) {
        this.YearofManufacture = YearofManufacture;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "ID=" + ID + ", Manufacturer=" + Manufacturer + ", YearofManufacture=" + YearofManufacture + ", Price=" + Price + ", Color=" + Color + '}';
    }
}
