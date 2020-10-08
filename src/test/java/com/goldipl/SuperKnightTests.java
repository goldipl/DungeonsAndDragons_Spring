package com.goldipl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SuperKnightTests {

    @Test
    public void amazenoruSuperKnightTest01() {
        Quest saveTheKing = new Quest("Save The King");
        SuperKnight amazenoru = new SuperKnight("Amazenoru", 25, 15000, 15000, saveTheKing, 100);
        amazenoru.setAge(40);
        amazenoru.setExtraGold(10000);
        amazenoru.setExtraWood(5000);
        Knight knightExcept = new SuperKnight("Amazenoru", 40, 25000, 20000, saveTheKing, 100);
        assertEquals(amazenoru.toString(), knightExcept.toString());
        assertTrue(amazenoru.toString().equals(knightExcept.toString()));
        assertEquals(amazenoru.getAge(),40);
        assertEquals(amazenoru.getQuest(), saveTheKing);
    }

    @Test
    public void amazenoruSuperKnightTest02() {
        Quest saveTheKing = new Quest("Save The King");
        SuperKnight amazenoru = new SuperKnight("Amazenoru", 25, 15000, 15000, saveTheKing, 100);
        amazenoru.setAge(30);
        amazenoru.setExtraGold(5000);
        amazenoru.setExtraWood(5000);
        amazenoru.setGloryPoints(200);
        Knight knightExcept = new SuperKnight("Amazenoru", 30, 20000, 20000, saveTheKing, 200);
        assertEquals(amazenoru.toString(), knightExcept.toString());
        assertTrue(amazenoru.toString().equals(knightExcept.toString()));
        assertEquals(amazenoru.getAge(),30);
        assertEquals(amazenoru.getGloryPoints(),200);
        assertEquals(amazenoru.getQuest(), saveTheKing);
    }

}
