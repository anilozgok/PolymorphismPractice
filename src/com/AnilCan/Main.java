package com.AnilCan;

import Entities.NormalUser;
import Entities.PremiumUser;
import Entities.User;

public class Main {

    public static void showUserInfo(User user){
        user.showInfo();
    }

    public static void main(String[] args) {
        User user =new User("user","Turkey",21);
        User premiumUser=new PremiumUser("premiumUser","Turkey",21,250);
        User normalUser=new NormalUser("normalUser", "Turkey", 21);

        showUserInfo(user);;
        showUserInfo(premiumUser);
        showUserInfo(normalUser);
    }
}
