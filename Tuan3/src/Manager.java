import java.io.*;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Manager {
    private String CheckFile(Pattern pattern, BufferedReader bufferedReader) throws IOException {
        String line = "", last_line="";
        while((line = bufferedReader.readLine()) != null){
            last_line = line;
        }
        Matcher matcher = pattern.matcher(last_line);
        String id = "0";
        if(matcher.find()){
            id = matcher.group(1);
        }
        return id;
    }
    private void SetGOODS_ID() throws IOException {
        Pattern pattern = Pattern.compile("ID=([0-9]+)");
        BufferedReader bufferedReader = new BufferedReader(new FileReader("MH.DAT"));
        Goods.GOODS_ID = Integer.parseInt(CheckFile(pattern,bufferedReader));
        bufferedReader.close();
    }
    private void SetCUSTOMER_ID() throws IOException {
        Pattern pattern = Pattern.compile("ID=([0-9]+)");
        BufferedReader bufferedReader = new BufferedReader(new FileReader("KH.DAT"));;
        Customer.CUSTOMER_ID = Integer.parseInt(CheckFile(pattern,bufferedReader));
        bufferedReader.close();
    }

    private void SetORDER_ID() throws IOException {
        Pattern pattern = Pattern.compile("orderID=([0-9]+)");
        BufferedReader bufferedReader = new BufferedReader(new FileReader("DH.DAT"));
        Order.ORDER_ID = Integer.parseInt(CheckFile(pattern,bufferedReader));
        bufferedReader.close();
    }

    public Manager() throws IOException {
        SetGOODS_ID();
        SetCUSTOMER_ID();
        SetORDER_ID();
    }
    public void AddNewGoods() throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("MH.DAT", true));
        System.out.print("Nhap vao ten hang hoa: ");
        String name = sc.nextLine();
        System.out.println("Lua chon nhom hang :");
        System.out.println("1.Thoi trang");
        System.out.println("2.Gia dung");
        System.out.println("3.Tieu dung");
        System.out.println("4.Dien may");
        System.out.print("Lua chon cua ban: ");
        int type = Integer.parseInt(sc.nextLine());
        String group = "";
        switch (type) {
            case 1 -> group = "Thoi trang";
            case 2 -> group = "Gia dung";
            case 3 -> group = "Tieu dung";
            case 4 -> group = "Dien may";
            default -> {
                System.out.println("Wrong!");
                return;
            }
        }
        System.out.print("Nhap gia ban: ");
        double price = Double.parseDouble(sc.nextLine());
        Goods good = new Goods(name,price,group);
        bufferedWriter.write(good.toString());
        bufferedWriter.newLine();
        bufferedWriter.close();
    }

    public void ShowAllGoods() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("MH.DAT"));
        String line;
        System.out.println("Danh sach mat hang: ");
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        bufferedReader.close();
    }
    private boolean CheckDuplicate(String ID) throws IOException {
        Pattern pattern = Pattern.compile("id='([A-Za-z0-9]+)'");
        BufferedReader bufferedReader = new BufferedReader(new FileReader("NV.DAT"));
        String line = "";
        while((line = bufferedReader.readLine()) != null){
            Matcher matcher = pattern.matcher(line);
            if(matcher.find()){
                String id = matcher.group(1);
                if(id.equals(ID)){
                    return true;
                }
            }
        }
        return false;
    }
    public void AddNewEmployee() throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("NV.DAT", true));
        System.out.print("Nhap ma nhan vien: ");
        String ID = sc.nextLine();
        String typeOfEmployee = "";
        switch (ID.substring(0, 2)) {
            case "FT" -> typeOfEmployee = "Full-time";
            case "PT" -> typeOfEmployee = "Part-time";
            default -> {
                System.out.println("Wrong!");
                return;
            }
        }
        if(CheckDuplicate(ID)){
            System.out.println("Ma nhan vien da ton tai!");
            return;
        }
        System.out.print("Nhap ten cua nhan vien: ");
        String name = sc.nextLine();
        System.out.print("Nhap dia chi: ");
        String address = sc.nextLine();
        System.out.print("Nhap so dien thoai: ");
        String phoneNumber = sc.nextLine();
        Employee employee = new Employee(ID,name,address,phoneNumber,typeOfEmployee);
        bufferedWriter.write(employee.toString());
        bufferedWriter.newLine();
        bufferedWriter.close();
    }

    public void ShowAllEmployee() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("NV.DAT"));
        String line;
        System.out.println("Danh sach nhan vien: ");
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        bufferedReader.close();
    }

    public void AddNewCustomer() throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("KH.DAT", true));
        System.out.print("Nhap ten cua khach hang: ");
        String name = sc.nextLine();
        System.out.print("Nhap dia chi: ");
        String address = sc.nextLine();
        System.out.print("Nhap so dien thoai: ");
        String phoneNumber = sc.nextLine();
        System.out.print("Nhap gmail: ");
        String gmail = sc.nextLine();
        Customer customer = new Customer(name,address,phoneNumber,gmail);
        bufferedWriter.write(customer.toString());
        bufferedWriter.newLine();
        bufferedWriter.close();
    }

    public void ShowAllCustomer() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("KH.DAT"));
        String line;
        System.out.println("Danh sach khach hang: ");
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        bufferedReader.close();
    }

    public void AddNewOrder() throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("DH.DAT", true));
        ShowAllGoods();
        System.out.print("Nhap ID cua mat hang: ");
        String GoodsID = sc.nextLine();
        ShowAllCustomer();
        System.out.print("Nhap ID cua khanh hang: ");
        String CustomerID = sc.nextLine();
        ShowAllEmployee();
        System.out.print("Nhap ID cua nhan vien: ");
        String EmployeeID = sc.nextLine();
        System.out.print("Nhap so luong: ");
        int QuantityOfGoods = Integer.parseInt(sc.nextLine());
        Date date = new Date();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());
        Order order = new Order(GoodsID,CustomerID,EmployeeID,QuantityOfGoods,localDateTime);
        bufferedWriter.write(order.toString());
        bufferedWriter.newLine();
        bufferedWriter.close();
    }

    public void ShowAllOrder() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("DH.DAT"));
        String line;
        System.out.println("Danh sach don hang: ");
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        bufferedReader.close();
    }

    public void SortOrderByTime() throws IOException {
        ArrayList<Map.Entry<String,LocalDateTime>> ListOrder = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader("DH.DAT"));
        String line;
        System.out.println("Danh sach don hang: ");
        Pattern pattern = Pattern.compile("(\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}\\.\\d+)");
        while ((line = bufferedReader.readLine()) != null) {
            Matcher matcher = pattern.matcher(line);
            if (matcher.find()) {
                String dateTimeString = matcher.group(1);
                LocalDateTime localDateTime = LocalDateTime.parse(dateTimeString);
                ListOrder.add(new AbstractMap.SimpleEntry<>(line,localDateTime));
            }
        }
        bufferedReader.close();
        ListOrder.sort(new Comparator<Map.Entry<String, LocalDateTime>>() {
            @Override
            public int compare(Map.Entry<String, LocalDateTime> o1, Map.Entry<String, LocalDateTime> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        for(Map.Entry<String, LocalDateTime> i : ListOrder){
            System.out.println(i.getKey());
        }
    }

    public void SortOrderByEmployeeID() throws IOException {
        ArrayList<Map.Entry<String,String>> ListOrder = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader("DH.DAT"));
        String line;
        System.out.println("Danh sach don hang: ");
        Pattern pattern = Pattern.compile("customerID='([0-9]+)'");
        while ((line = bufferedReader.readLine()) != null) {
            Matcher matcher = pattern.matcher(line);
            if (matcher.find()) {
                String EmployeeID = matcher.group(1);
                ListOrder.add(new AbstractMap.SimpleEntry<>(line,EmployeeID));
            }
        }
        bufferedReader.close();
        ListOrder.sort(new Comparator<Map.Entry<String, String>>() {
            @Override
            public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        for(Map.Entry<String, String> i : ListOrder){
            System.out.println(i.getKey());
        }
    }

    public String GetCustomerNamebyID(String ID) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("KH.DAT"));
        String line = "",correct_line = "";
        Pattern pattern = Pattern.compile("ID=([0-9]+)");
        while ((line = bufferedReader.readLine()) != null) {
            Matcher matcher = pattern.matcher(line);
            if (matcher.find()) {
                String id = matcher.group(1);
                if(Objects.equals(id, ID)){
                    correct_line = line;
                    break;
                }
            }
        }
        bufferedReader.close();
        Pattern NamePattern = Pattern.compile("fullName='(.*?)'");
        Matcher matcher = NamePattern.matcher(correct_line);
        if (matcher.find()) {
            correct_line = matcher.group(1);
        }
        return correct_line;
    }

    public void SortOrderByCustomerName() throws IOException {
        ArrayList<Map.Entry<String,Map.Entry<String,String>>> ListOrder = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader("DH.DAT"));
        String line;
        System.out.println("Danh sach don hang: ");
        Pattern pattern = Pattern.compile("customerID='([0-9]+)'");
        Pattern Order = Pattern.compile("orderID=([0-9]+)");
        while ((line = bufferedReader.readLine()) != null) {
            Matcher matcher = pattern.matcher(line);
            String id = "";
            if (matcher.find()) {
                id = matcher.group(1);
            }
            String OrderID = "";
            matcher = Order.matcher(line);
            if (matcher.find()) {
                OrderID = matcher.group(1);
            }
            ListOrder.add(new AbstractMap.SimpleEntry<>(line,new AbstractMap.SimpleEntry<>(GetCustomerNamebyID(id),OrderID)));
        }
        bufferedReader.close();
        ListOrder.sort(new Comparator<Map.Entry<String,Map.Entry<String,String>>>() {
            @Override
            public int compare(Map.Entry<String,Map.Entry<String,String>> o1, Map.Entry<String,Map.Entry<String,String>> o2) {
                if(o1.getValue().getKey().equals(o2.getValue().getKey())){
                    return o1.getValue().getValue().compareTo(o2.getValue().getValue());
                }
                return o1.getValue().getKey().compareTo(o2.getValue().getKey());
            }
        });
        for(Map.Entry<String,Map.Entry<String,String>> i : ListOrder){
            System.out.println(i.getKey());
        }
    }
    public void SortOrder() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Sap xep theo thoi gian");
        System.out.println("2. Sap xep theo ma nhan vien");
        System.out.println("3. Sap xep theo ten khanh hang");
        System.out.print("Nhap lua chon: ");
        int type = Integer.parseInt(sc.nextLine());
        switch (type) {
            case 1 -> SortOrderByTime();
            case 2 -> SortOrderByEmployeeID();
            case 3 -> SortOrderByCustomerName();
            default -> {
                System.out.println("Wrong");
                return;
            }
        }
    }

    public Double GetGoodsPricebyID(String ID) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("MH.DAT"));
        String line;
        Pattern IDpattern = Pattern.compile("ID=([0-9]+)");
        Pattern PricePattern = Pattern.compile("price=([\\d.]+)");
        double Price = 0.0;
        while ((line = bufferedReader.readLine()) != null) {
            Matcher matcher = IDpattern.matcher(line);
            if(matcher.find()){
                if(Objects.equals(matcher.group(1), ID)){
                    matcher = PricePattern.matcher(line);
                    if(matcher.find()){
                        Price = Double.parseDouble(matcher.group(1));
                    }
                }
            }
        }
        bufferedReader.close();
        return Price;
    }
    public void CalculateSalarybyEmployeeID() throws IOException {
        Scanner sc = new Scanner(System.in);
        ShowAllEmployee();
        System.out.print("Nhap ma nhan vien: ");
        String ID = sc.nextLine();
        BufferedReader bufferedReader = new BufferedReader(new FileReader("DH.DAT"));
        String line;
        Pattern id = Pattern.compile("employeeID='([A-Za-z0-9]+)'");
        Pattern quantity = Pattern.compile("quantityOfGoods=([0-9]+)");
        Pattern goods = Pattern.compile("goodsID='([0-9]+)'");
        double Salary = 0.0;
        while ((line = bufferedReader.readLine()) != null) {
            Matcher matcher = id.matcher(line);
            if(matcher.find()){
                if(Objects.equals(ID, matcher.group(1))){
                    matcher = goods.matcher(line);
                    String goodsID = "";
                    if(matcher.find()){
                        goodsID = matcher.group(1);
                    }
                    matcher = quantity.matcher(line);
                    if(matcher.find()){
                        Salary += Integer.parseInt(matcher.group(1)) * GetGoodsPricebyID(goodsID);
                    }
                }
            }
        }
        bufferedReader.close();
        switch (ID.substring(0, 2)) {
            case "FT" -> Salary *= 0.1;
            case "PT" -> Salary *= 0.05;
        }
        System.out.println("Luong cua nhan vien co ma nhan vien " + ID + " la: " + Salary);
    }
}
