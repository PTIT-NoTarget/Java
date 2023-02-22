public class Customer {
    public static int CUSTOMER_ID = 0;
    private String id;
    private String fullName;
    private String address;
    private String phoneNumber;
    private String gmail;

    public Customer() {
    }

    public Customer(String fullName, String address, String phoneNumber, String gmail) {
        CUSTOMER_ID++;
        id = String.format("%05d",CUSTOMER_ID);
        this.fullName = fullName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.gmail = gmail;
    }

    public String getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "ID=" + id +
                ", fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", gmail='" + gmail + '\'' +
                '}';
    }
}
