package com.goldipl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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

    @Test
    public void darineroKnightTest() {
        Quest obtain2000gold = new Quest("Obtain 2000 gold");
        Quest obtain2000wood = new Quest("Obtain 2000 wood");
        Knight knight = new Knight("Darinero", 41, 3000, 4000, obtain2000gold);
        knight.setAge(50);
        knight.setQuest(obtain2000wood);
        knight.setExtraGold(10000);
        knight.setExtraWood(5000);
        Knight knightExcept = new Knight("Darinero", 50, 13000, 9000, obtain2000wood);
        assertEquals(knight.toString(), knightExcept.toString());
    }

    @Test
    public void quarioKnightTest() {
        Quest obtain2000wood = new Quest("Obtain 2000 wood");
        Knight knight = new Knight("Quario", 35, 2500, 4000, obtain2000wood);
        knight.setAge(40);
        knight.setExtraGold(10000);
        knight.setExtraWood(5000);
        Knight knightExcept = new Knight("Quario", 40, 12500, 9000, obtain2000wood);
        assertEquals(knight.toString(), knightExcept.toString());
        assertTrue(knight.toString().equals(knightExcept.toString()));
        assertEquals(knight.getAge(),40);
        assertEquals(knight.getQuest(), obtain2000wood);
    }

}
