/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proptit.tuan2;

/**
 *
 * @author DangHan
 */
public class Motobike extends Vehicle{
    private int Power;

    public Motobike() {
    }
    
    public Motobike(String ID, String Manufacturer, int YearofManufacture, double Price, String Color,int Power) {
        super(ID, Manufacturer, YearofManufacture, Price, Color);
        this.Power = Power;
    }

    public int getPower() {
        return Power;
    }

    public void setPower(int Power) {
        this.Power = Power;
    }

    @Override
    public String toString() {
        return super.toString() + "Motobike{" + "Power=" + Power + '}';
    }
    
}
