package shop;

public class User {
    private int id;
    private String name;
    private String email;
    private CustomerData customerData;

    public User(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public String getName() { return name; }
    public String getEmail() { return email; }

    public void attachData(CustomerData data) {
        this.customerData = data;
    }

    public void updateEmail(String newEmail) {
        this.email = newEmail;
    }

    public void viewProfile() {
        System.out.println(toString());
        if (customerData != null) System.out.println(customerData);
    }

    @Override
    public String toString() {
        return "User{id=" + id + ", name='" + name + "', email='" + email + "'}";
    }
}
