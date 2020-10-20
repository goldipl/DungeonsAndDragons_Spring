package com.goldipl;

import com.goldipl.monsters.Dragon;
import com.goldipl.monsters.DragonLord;
import com.goldipl.monsters.Goblin;
import com.goldipl.monsters.Witch;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MonsterTests {

    @Test
    public void dragonixDragonTest() {
        Dragon dragonix = new Dragon("Dragonix", 2, 120);
        dragonix.setHp(190);
        dragonix.setLvl(5);
        Dragon dragonExcept = new Dragon("Dragonix", 5, 190);
        assertEquals(dragonix.toString(), dragonExcept.toString());
        assertEquals(dragonix.getHp(), 190);
        assertEquals(dragonix.getLvl(), 5);
        assertEquals(dragonix.getName(), "Dragonix");
    }

    @Test
    public void marcoxGoblinTest() {
        Goblin marcox = new Goblin("Marcox", 2, 100);
        marcox.setHp(240);
        marcox.setLvl(6);
        Goblin goblinExcept = new Goblin("Marcox", 6, 240);
        assertEquals(marcox.toString(), goblinExcept.toString());
        assertEquals(marcox.getHp(), 240);
        assertEquals(marcox.getLvl(), 6);
        assertEquals(marcox.getName(), "Marcox");
    }

    @Test
    public void fadraxWitchTest() {
        Witch fadrax = new Witch("Fadrax", 12, 340);
        fadrax.setHp(400);
        fadrax.setLvl(9);
        Witch witchExcept = new Witch("Fadrax", 9, 400);
        assertEquals(fadrax.toString(), witchExcept.toString());
        assertEquals(fadrax.getHp(), 400);
        assertEquals(fadrax.getLvl(), 9);
        assertEquals(fadrax.getName(), "Fadrax");
    }

    @Test
    public void redonixDragonLordTest() {
        DragonLord redonix = new DragonLord("Redonix", 50, 1200, 400);
        redonix.setHp(2000);
        redonix.setLvl(60);
        redonix.setExtraPower(1000);
        DragonLord dragonLordExcept = new DragonLord("Redonix", 60, 2000, 1000);
        assertEquals(redonix.toString(), dragonLordExcept.toString());
        assertEquals(redonix.getHp(), 2000);
        assertEquals(redonix.getLvl(), 60);
        assertEquals(redonix.getExtraPower(), 1000);
        assertEquals(redonix.getName(), "Redonix");
    }
}
