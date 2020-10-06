package com.goldipl;

public class Duel {

    private Knight duelOpponentFirst;
    private Knight duelOpponentSecond;
    private Knight winner;
    private Knight loser;

    public Duel(Knight duelOpponentFirst, Knight duelOpponentSecond) {
        this.duelOpponentFirst = this.loser = duelOpponentFirst;
        this.duelOpponentSecond = this.winner = duelOpponentSecond;
    }

    public int loseGold (int i) {
        return loser.getGold(loser.setExtraGold(-i));
    }

    public int winGold (int i) {
        return winner.getGold(winner.setExtraGold(i));
    }

    @Override
    public String toString() {
        return "Duel [" + duelOpponentFirst + " --- vs. --- " + duelOpponentSecond + "]";
    }
}
