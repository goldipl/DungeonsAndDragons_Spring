package com.goldipl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DuelTests {

    @Test
    public void duelMvsDTest1() {
        Quest saveTheKing = new Quest("Save The King");
        Quest obtain2000gold = new Quest("Obtain 2000 gold");
        Knight martinez = new Knight("Martinez", 30, 2000,2000, saveTheKing);
        Knight darinero = new Knight("Darinero", 41, 3000, 4000, obtain2000gold);
        Duel mvsd = new Duel(martinez, darinero);
        //First player is a Loser = Martinez
        //Second player is a Winner = Darinero
        mvsd.loseGold(10000);
        mvsd.winGold(50000);
        Knight martinezLoser = new Knight("Martinez", 30, 0,2000, saveTheKing);
        Knight darineroWiner = new Knight("Darinero", 41, 53000, 4000, obtain2000gold);
        assertFalse(martinez.toString().equals(darinero.toString()));
        assertTrue(martinez.toString().equals(martinezLoser.toString()));
        assertTrue(darinero.toString().equals(darineroWiner.toString()));
    }

    @Test
    public void duelMvsDTest2() {
        Quest saveTheKing = new Quest("Save The King");
        Quest obtain2000gold = new Quest("Obtain 2000 gold");
        Knight martinez = new Knight("Martinez", 30, 2000,2000, saveTheKing);
        Knight darinero = new Knight("Darinero", 41, 3000, 4000, obtain2000gold);
        Duel mvsd = new Duel(martinez, darinero);
        //First player is a Loser = Martinez
        //Second player is a Winner = Darinero
        mvsd.loseGold(2000);
        mvsd.winGold(10000);
        Knight martinezLoser = new Knight("Martinez", 30, 0,2000, saveTheKing);
        Knight darineroWiner = new Knight("Darinero", 41, 13000, 4000, obtain2000gold);
        assertFalse(martinez.toString().equals(darinero.toString()));
        assertFalse(martinez.toString().equals(martinezLoser.toString()));
        assertTrue(darinero.toString().equals(darineroWiner.toString()));
    }

    @Test
    public void duelMvsDTest3() {
        Quest saveTheKing = new Quest("Save The King");
        Quest obtain2000gold = new Quest("Obtain 2000 gold");
        Knight martinez = new Knight("Martinez", 30, 2000,2000, saveTheKing);
        Knight darinero = new Knight("Darinero", 41, 3000, 4000, obtain2000gold);
        Duel mvsd = new Duel(martinez, darinero);
        //First player is a Loser = Martinez
        //Second player is a Winner = Darinero
        mvsd.loseGold(500);
        mvsd.winGold(7000);
        Knight martinezLoser = new Knight("Martinez", 30, 1500,2000, saveTheKing);
        Knight darineroWiner = new Knight("Darinero", 41, 10000, 4000, obtain2000gold);
        assertFalse(martinez.toString().equals(darinero.toString()));
        assertFalse(martinez.toString().equals(martinezLoser.toString()));
        assertTrue(darinero.toString().equals(darineroWiner.toString()));
    }

}
