package com.goldipl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KnightTests {

    @Test
    public void martinezKnightTest() {
        Quest quest = new Quest("Save The King");
        Knight knight = new Knight("Martinez", 30, 2000,2000, quest);
        knight.setAge(32);
        Knight knightExcept = new Knight("Martinez", 32, 2000, 2000, quest);
        assertEquals(knight.toString(), knightExcept.toString());

    }
}
