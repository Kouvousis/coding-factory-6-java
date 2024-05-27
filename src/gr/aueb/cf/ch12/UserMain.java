package gr.aueb.cf.ch12;

import gr.aueb.cf.ch12.model.User;

public class UserMain {

    public static void main(String[] args) {
        User jim = new User(1, "Dimitris", "Kouvousis", "Dexous", "1234", true);

        System.out.println("User id: " + jim.getId());
        System.out.println("User Firstname: " + jim.getFirstname());
        System.out.println("User Lastname: " + jim.getLastname());
        System.out.println("Username: " + jim.getUsername());
        System.out.println("Password: " + jim.getPassword());
        System.out.println("User active: " + jim.isActive());
    }
}
