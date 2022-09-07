package Entities;

public class User {

    private String name;
    private String country;
    private int age;


    public User(String name, String country, int age) {
        this.name = name;
        this.country = country;
        this.age = age;
    }

    public void showInfo(){
        System.out.println("User Name: "+name+"\nAge: "+age+ "\nCountry: "+country);

    }
}
