package shop;

import java.util.List;
import java.time.LocalDate;

public class Order {
    private int orderId;
    private int userId;
    private List<Product> products;
    private LocalDate orderDate;
    private String status;
    private double totalAmount;

    public Order() {}

    public Order(int orderId, int userId, List<Product> products, LocalDate orderDate, String status, double totalAmount) {
        this.orderId = orderId;
        this.userId = userId;
        this.products = products;
        this.orderDate = orderDate;
        this.status = status;
        this.totalAmount = totalAmount;
    }

    public void createOrder() {}
    public void trackStatus() {}
    public void notifyUser() {}

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", userId=" + userId +
                ", orderDate=" + orderDate +
                ", status='" + status + '\'' +
                ", totalAmount=" + totalAmount +
                '}';
    }
}

