package com.mirocha.marcin.app;

public class UserRepository implements IUserRepository{
//implementacja - nadawanie dzialania - pisanie kodu  - cos nieposiada kodu ktory cos robi i ty ten kod piszesz
    // extends dziedziczenie

    @Override  //przeslanianie  - nadpisanie
    public String[] getAllUsers() {
        String[] tab = {"janusz", "wiesiek"};
        return tab;
    }

    @Override
    public String getUserById(int id) {
        return "wiesiek";
    }

    @Override
    public void addUser(String user) {
        System.out.println(":user dodany ");
    }

    @Override
    public void updateUser(String user) {

    }

}
