/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proptit.tuan2;


/**
 *
 * @author DangHan
 */
public class Car extends Vehicle{
    private String TypeofEngine;
    private int NumberofSeats;

    public Car() {
    }

    public Car(String ID, String Manufacturer, int YearofManufacture, double Price, String Color, String TypeofEngine, int NumberofSeats) {
        super(ID, Manufacturer, YearofManufacture, Price, Color);
        this.TypeofEngine = TypeofEngine;
        this.NumberofSeats = NumberofSeats;
    }

    public String getTypeofEngine() {
        return TypeofEngine;
    }

    public void setTypeofEngine(String TypeofEngine) {
        this.TypeofEngine = TypeofEngine;
    }

    public int getNumberofSeats() {
        return NumberofSeats;
    }

    public void setNumberofSeats(int NumberofSeats) {
        this.NumberofSeats = NumberofSeats;
    }

    @Override
    public String toString() {
        return super.toString() + "Car{" + "TypeofEngine=" + TypeofEngine + ", NumberofSeats=" + NumberofSeats + '}';
    }
    
    
}
