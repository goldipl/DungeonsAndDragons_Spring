package com.goldipl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KnightTests {

    @Test
    public void martinezKnightTest() {
        Quest quest = new Quest("Save The King");
        Knight knight = new Knight("Martinez", 30, 2000, 2000, quest);
        knight.setAge(32);
        Knight knightExcept = new Knight("Martinez", 32, 2000, 2000, quest);
        assertEquals(knight.toString(), knightExcept.toString());
    }

    @Test
    public void martinezKnightSetExtraGoldTest() {
        Quest quest = new Quest("Save The King");
        Knight knight = new Knight("Martinez", 30, 2000, 2000, quest);
        knight.setExtraGold(1000);
        Knight knightExcept = new Knight("Martinez", 30, 3000, 2000, quest);
        assertEquals(knight.toString(), knightExcept.toString());
    }

    @Test
    public void martinezKnightSetExtraWoodTest() {
        Quest quest = new Quest("Save The King");
        Knight knight = new Knight("Martinez", 30, 2000, 2000, quest);
        knight.setExtraWood(1400);
        Knight knightExcept = new Knight("Martinez", 30, 2000, 3400, quest);
        assertEquals(knight.toString(), knightExcept.toString());
    }

    @Test
    public void martinezKnightSetExtraGoldANdWoodTest() {
        Quest quest = new Quest("Save The King");
        Knight knight = new Knight("Martinez", 30, 2000, 2000, quest);
        knight.setExtraGold(1200);
        knight.setExtraWood(1400);
        Knight knightExcept = new Knight("Martinez", 30, 3200, 3400, quest);
        assertEquals(knight.toString(), knightExcept.toString());
    }
}
