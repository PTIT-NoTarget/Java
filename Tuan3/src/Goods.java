public class Goods {
    public static int GOODS_ID = 0;
    private String id;
    private String name;
    private String group;
    private double price;
    public Goods() {
    }

    public Goods(String name, double price, String group) {
        GOODS_ID++;
        id = String.format("%04d",GOODS_ID);
        this.name = name;
        this.price = price;
        this.group = group;
    }

    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "ID=" + id +
                ", name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", price=" + price +
                '}';
    }
}
