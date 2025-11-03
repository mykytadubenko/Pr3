package shop;

public class CustomerData {
    private String address;
    private String phone;
    private int bonusPoints;

    public CustomerData(String address, String phone) {
        this.address = address;
        this.phone = phone;
        this.bonusPoints = 0;
    }

    public void addBonus(int points) {
        bonusPoints += points;
    }

    public void useBonus(int points) {
        if (bonusPoints >= points) bonusPoints -= points;
    }

    @Override
    public String toString() {
        return "Адреса: " + address + ", Телефон: " + phone + ", Бонуси: " + bonusPoints;
    }
}
