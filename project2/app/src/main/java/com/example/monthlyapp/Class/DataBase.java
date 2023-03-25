package com.example.monthlyapp.Class;

import java.util.ArrayList;

public class DataBase {
    private static int counter = 201;
    public static User[] users = initCounterOfUsers(counter);

    private static User[] initCounterOfUsers(int n) {
        User[] users = new User[n];
        for (int i = 0; i < n; i++) {
            users[i] = new User("Name"+(i+1), "qwerty"+(i+1));
        }
        return users;
    }

    public static void addUser(User user) {
        counter++;
        users[counter-1] = user;
    }

    public static int getCounter() {
        return counter;
    }
    public static void setCounter(int counter) {
        DataBase.counter = counter;
    }
}


