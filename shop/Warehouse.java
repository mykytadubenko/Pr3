package shop;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    void removeProduct(Product product) { // package-private
        products.remove(product);
    }

    protected void showInventory() {
        System.out.println("Товари на складі:");
        for (Product p : products) System.out.println(" - " + p);
    }
}
