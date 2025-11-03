package shop;

public class Product {
    private int id;
    private String name;
    private String category;
    private double price;
    private int stock;

    Product(int id, String name, String category, double price, int stock) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getStock() { return stock; }

    protected void restock(int amount) {
        this.stock += amount;
    }

    void reduceStock(int amount) {
        if (stock >= amount) this.stock -= amount;
    }

    @Override
    public String toString() {
        return name + " (" + category + ") — " + price + "₴, залишок: " + stock;
    }
}
