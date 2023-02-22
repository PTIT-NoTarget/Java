import java.time.LocalDate;
import java.time.LocalDateTime;

public class Order {
    public static int ORDER_ID = 0;
    private String orderID;
    private String goodsID;
    private String customerID;
    private String employeeID;
    private int quantityOfGoods;
    private LocalDateTime localDateTime;

    public Order() {
    }

    public Order(String goodsID, String customerID, String employeeID, int quantityOfGoods, LocalDateTime localDateTime) {
        ORDER_ID++;
        orderID = String.format("%06d",ORDER_ID);
        this.goodsID = goodsID;
        this.customerID = customerID;
        this.employeeID = employeeID;
        this.quantityOfGoods = quantityOfGoods;
        this.localDateTime = localDateTime;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getGoodsID() {
        return goodsID;
    }

    public void setGoodsID(String goodsID) {
        this.goodsID = goodsID;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public int getQuantityOfGoods() {
        return quantityOfGoods;
    }

    public void setQuantityOfGoods(int quantityOfGoods) {
        this.quantityOfGoods = quantityOfGoods;
    }

    public LocalDateTime getLocalDate() {
        return localDateTime;
    }

    public void setLocalDate(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderID=" + orderID +
                ", goodsID='" + goodsID + '\'' +
                ", customerID='" + customerID + '\'' +
                ", employeeID='" + employeeID + '\'' +
                ", quantityOfGoods=" + quantityOfGoods +
                ", localDateTime=" + localDateTime +
                '}';
    }
}
