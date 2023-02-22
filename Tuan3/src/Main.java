import java.awt.*;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void Menu(){
        System.out.println("-------------Menu-------------");
        System.out.println("1. Them mat hang moi");
        System.out.println("2. In ra tat ca mat hang");
        System.out.println("3. Them nhan vien moi");
        System.out.println("4. In ra tat ca nhan vien");
        System.out.println("5. Them khach hang moi");
        System.out.println("6. In ra tat ca khanh hang");
        System.out.println("7. Them don hang moi");
        System.out.println("8. In ra tat ca don hang");
        System.out.println("9. Sap xep don hang");
        System.out.println("10. Tinh luong nhan vien (theo ma nhan vien)");
        System.out.println("0. Thoat");
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Manager proptit = new Manager();
        while(true){
            Menu();
            System.out.print("Nhap lua chon cua ban: ");
            int type = Integer.parseInt(sc.nextLine());
            switch (type) {
                case 1 -> proptit.AddNewGoods();
                case 2 -> proptit.ShowAllGoods();
                case 3 -> proptit.AddNewEmployee();
                case 4 -> proptit.ShowAllEmployee();
                case 5 -> proptit.AddNewCustomer();
                case 6 -> proptit.ShowAllCustomer();
                case 7 -> proptit.AddNewOrder();
                case 8 -> proptit.ShowAllOrder();
                case 9 -> proptit.SortOrder();
                case 10 -> proptit.CalculateSalarybyEmployeeID();
                case 0 -> {
                    return;
                }
                default -> System.out.println("Nhap sai! Moi ban nhap lai!");
            }
        }
    }
}