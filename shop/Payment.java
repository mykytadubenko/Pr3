package shop;

import java.time.LocalDate;

public class Payment {
    private int paymentId;
    private String paymentType;
    private LocalDate paymentDate;
    private String status;
    private double amount;

    public Payment() {}

    public Payment(int paymentId, String paymentType, LocalDate paymentDate, String status, double amount) {
        this.paymentId = paymentId;
        this.paymentType = paymentType;
        this.paymentDate = paymentDate;
        this.status = status;
        this.amount = amount;
    }

    public void processPayment() {}
    public void confirmTransaction() {}
    public void generateReceipt() {}

    @Override
    public String toString() {
        return "Payment{" +
                "paymentId=" + paymentId +
                ", paymentType='" + paymentType + '\'' +
                ", paymentDate=" + paymentDate +
                ", status='" + status + '\'' +
                ", amount=" + amount +
                '}';
    }
}

