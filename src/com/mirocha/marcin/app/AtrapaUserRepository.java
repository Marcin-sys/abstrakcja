package com.mirocha.marcin.app;

public class AtrapaUserRepository implements IUserRepository{
    @Override
    public String[] getAllUsers() {
        return new String[0];
    }

    @Override
    public String getUserById(int id) {
        return null;
    }

    @Override
    public void addUser(String user) {

    }

    @Override
    public void updateUser(String user) {

    }
}
