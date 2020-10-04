package com.goldipl;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

// CommandLineRunner - interfejs, ktorego metoda run zostanie
// wywolana po zakonczeniu przez Springa swojej konfiguracji

@Component
public class Main implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {

        Knight martinez = new Knight("Martinez", 30);
        Knight darinero = new Knight("Darinero", 41);
        Knight quario = new Knight("Quario", 35);

        System.out.println(martinez);
        System.out.println(darinero);
        System.out.println(quario);
    }
}
