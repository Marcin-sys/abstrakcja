package com.mirocha.marcin.app;

import com.mirocha.marcin.app.nowa.ImplementacjaKlasyAbstrakcyjnej;
import com.mirocha.marcin.app.nowa.KlasaAbstrakcyjna;

public class Main {

    final int a=5;

    public static void main(String[] args) {
        IUserRepository userRepository = new UserRepository();  //TODO null
        userRepository.addUser("admin");
        String[] users = userRepository.getAllUsers();
        String user = userRepository.getUserById(1);
        System.out.println(user);


        KlasaAbstrakcyjna klasaAbstrakcyjna = new ImplementacjaKlasyAbstrakcyjnej();

    }
}
