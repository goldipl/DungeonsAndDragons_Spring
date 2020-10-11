package com.goldipl;

import com.goldipl.monsters.Dragon;
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
}
