package shop;

public class Admin {
    private int adminId;
    private String name;
    private String email;
    private String password;

    public Admin() {}

    public Admin(int adminId, String name, String email, String password) {
        this.adminId = adminId;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public void addProduct() {}
    public void removeProduct() {}
    public void viewOrders() {}
    public void manageUsers() {}

    @Override
    public String toString() {
        return "Admin{" +
                "adminId=" + adminId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

