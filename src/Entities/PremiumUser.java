package Entities;

public class PremiumUser extends User{

    private double price;

    public PremiumUser(String name, String country, int age, double price) {
        super(name, country, age);
        this.price=price;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Price: "+price);
    }
}
