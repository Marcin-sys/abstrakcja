package com.mirocha.marcin.app;

public interface IUserRepository {
    //wszystkie metody sa publiczne w intefejsie

    public final static int a = 5;  // wielkosc prymitywna w interface zawsze jest final oraz  public oraz static

    public String[] getAllUsers();

    String getUserById(int id);

    void addUser(String user);   // sygnatury metod

    void updateUser ( String user);

    default void jakasMetoda(){  //metoda domyslna  -  dziedziczy do klasy implementujacej
        System.out.println("cos robie");
    }


}
