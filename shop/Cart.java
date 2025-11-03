package shop;

import java.util.List;

public class Cart {
    private int cartId;
    private List<Product> products;
    private double totalSum;

    public Cart() {}

    public Cart(int cartId, List<Product> products, double totalSum) {
        this.cartId = cartId;
        this.products = products;
        this.totalSum = totalSum;
    }

    public void addProduct(Product product) {}
    public void removeProduct(Product product) {}
    public void calculateTotal() {}

    @Override
    public String toString() {
        return "Cart{" +
                "cartId=" + cartId +
                ", totalSum=" + totalSum +
                ", products=" + products +
                '}';
    }
}

