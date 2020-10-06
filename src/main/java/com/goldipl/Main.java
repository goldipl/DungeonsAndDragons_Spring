package com.goldipl;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

// CommandLineRunner - interfejs, ktorego metoda run zostanie
// wywolana po zakonczeniu przez Springa swojej konfiguracji

@Component
public class Main implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {

        Dungeon crystalDungeon = new Dungeon("Crystal Dungeon");

        Quest saveTheKing = new Quest("Save The King");
        Quest obtain2000gold = new Quest("Obtain 2000 gold");
        Quest obtain2000wood = new Quest("Obtain 2000 wood");

        Knight martinez = new Knight("Martinez", 30, 2000,2000, saveTheKing);
        Knight darinero = new Knight("Darinero", 41, 3000, 4000, obtain2000gold);
        Knight quario = new Knight("Quario", 35, 2500, 4000, obtain2000wood);

        Duel mvsd = new Duel(martinez,darinero);


        System.out.println(martinez);
        System.out.println(darinero);
        System.out.println(quario);
        System.out.println("---------------------------------------------------------");
        System.out.println(martinez + " entered [" + crystalDungeon + "]");
        System.out.println("---------------------------------------------------------");
        System.out.println("---> Adding extra gold (2000) and extra wood (1500) for Martinez <---");

        martinez.setExtraGold(2000);
        martinez.setExtraWood(1500);

        System.out.println(martinez);

        System.out.println(mvsd);
        System.out.println("---------------------------------------------------------");
        mvsd.loseGold(10000);
        mvsd.winGold(10000);
        System.out.println(mvsd);

    }
}
