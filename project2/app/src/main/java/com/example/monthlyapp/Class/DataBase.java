package com.example.monthlyapp.Class;

import java.util.ArrayList;

public class DataBase {
    private static int counter = 10;
    public static User[] users = initCounterOfUsers(counter);

    private static User[] initCounterOfUsers(int n) {
        User[] users = new User[n];
        for (int i = 0; i < n; i++) {
            users[i] = new User("Name"+i, "qwerty"+i);
        }
        return users;
    }

    void addUser(User user) {
        counter++;
        users[counter-1] = user;
    }
}
