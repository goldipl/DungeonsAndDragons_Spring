package com.goldipl;

import com.goldipl.knights.Knight;
import com.goldipl.knights.SuperKnight;
import com.goldipl.monsters.Dragon;
import com.goldipl.monsters.DragonLord;
import com.goldipl.monsters.Goblin;
import com.goldipl.monsters.Witch;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

// CommandLineRunner - interfejs, ktorego metoda run zostanie
// wywolana po zakonczeniu przez Springa swojej konfiguracji

@Component
public class Main implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {

        Challange challange = new Challange();

        Dungeon crystalDungeon = new Dungeon("Crystal Dungeon");

        Quest saveTheKing = new Quest("Save The King");
        Quest obtain2000gold = new Quest("Obtain 2000 gold");
        Quest obtain2000wood = new Quest("Obtain 2000 wood");

        Knight martinez = new Knight("Martinez", 30, 2000,2000, saveTheKing);
        Knight darinero = new Knight("Darinero", 41, 3000, 4000, obtain2000gold);
        Knight quario = new Knight("Quario", 35, 2500, 4000, obtain2000wood);

        SuperKnight amazenoru = new SuperKnight("Amazenoru", 25, 15000, 15000, saveTheKing, 100);

        Duel mvsd = new Duel(martinez,darinero);


        System.out.println(martinez);
        System.out.println(darinero);
        System.out.println(quario);
        System.out.println("---------------------------------------------------------");
        System.out.println(martinez + " entered [" + crystalDungeon + "]");
        System.out.println("---------------------------------------------------------");

        System.out.println("---> Knight Martinez <---");
        System.out.println(martinez);
        System.out.println("---> Adding extra gold (2000) and extra wood (1500) for Martinez <---");
        martinez.setExtraGold(2000);
        martinez.setExtraWood(1500);
        System.out.println("---> Knight Martinez after adding extra gold (2000) and extra wood (1500) <---");
        System.out.println(martinez);

        System.out.println("---------------> Knights Dueling <---------------");
        System.out.println(mvsd);
        // First Knight Losing gold (Martinez) - Second Knight Winning Gold (Darinero)
        mvsd.loseGold(10000);
        mvsd.winGold(10000);
        System.out.println("--------------------------------------------> Knights After Duel <-------------------------------------------");
        System.out.println("---------------> First Knight Losing gold (Martinez) - Second Knight Winning Gold (Darinero) <---------------");
        System.out.println(mvsd);

        // ---------------> Adding Knights to HashMap <---------------
        crystalDungeon.createKnight("Martinez", 30, 2000,2000, saveTheKing);
        crystalDungeon.createKnight("Darinero", 41, 3000, 4000, obtain2000gold);
        crystalDungeon.createKnight("Quario", 35, 2500, 4000, obtain2000wood);

        System.out.println("---------------> Getting All Knights from HashMap <---------------");
        System.out.println(crystalDungeon.getAllKnights());

        System.out.println("---------------> Getting All Challanges from the List <---------------");
        System.out.println(challange.getList());
        System.out.println("---------------> Getting Random Challange from the List <---------------");
        System.out.println(challange.getRandomChallangeDescriptions());

        System.out.println("---------------> New SuperKnight <---------------");
        System.out.println(amazenoru);

        System.out.println("---------------> ----- MONSTERS ----- <---------------");

        Dragon dragonix = new Dragon("Dragonix", 2, 120);
        Dragon faronix = new Dragon("Faronix", 6, 200);
        Dragon dragonaxerox = new Dragon("Dragonaxerox", 12, 400);

        Goblin marcox = new Goblin("Marcox", 2, 100);
        Goblin arcox = new Goblin("Arcox", 6, 160);
        Goblin farcox = new Goblin("Farcox", 12, 340);

        Witch abrax = new Witch("Abrax", 2, 100);
        Witch kadrax = new Witch("Kadrax", 6, 160);
        Witch fadrax = new Witch("Fadrax", 12, 340);

        DragonLord redonix = new DragonLord("Redonix", 50, 1200, 400);

        System.out.println(dragonix + "\n" + faronix + "\n" + dragonaxerox + "\n" + marcox
                + "\n" + arcox + "\n" + farcox + "\n" + abrax + "\n" + kadrax + "\n" +
                fadrax + "\n" + redonix);



    }
}
