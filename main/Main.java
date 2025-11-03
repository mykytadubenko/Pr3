package main;

import shop.*;

public class Main {
    public static void main(String[] args) {
        Product laptop = new Product(1, "Ноутбук ASUS", "Електроніка", 32000, 5);
        Product mouse = new Product(2, "Миша Logitech", "Аксесуари", 800, 20);

        Warehouse warehouse = new Warehouse();
        warehouse.addProduct(laptop);
        warehouse.addProduct(mouse);
        warehouse.showInventory();

        User user = new User(1, "Микита", "mykyta@example.com");
        CustomerData data = new CustomerData("м. Одеса, вул. Свободи 12", "+380991234567");
        user.attachData(data);
        data.addBonus(150);
        user.viewProfile();
    }
}

