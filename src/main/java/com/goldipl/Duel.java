package com.goldipl;

public class Duel {

    private Knight duelOpponentFirst;
    private Knight duelOpponentSecond;

    public Duel(Knight duelOpponentFirst, Knight duelOpponentSecond) {
        this.duelOpponentFirst = duelOpponentFirst;
        this.duelOpponentSecond = duelOpponentSecond;
    }

    @Override
    public String toString() {
        return "Duel [" + duelOpponentFirst + " --- vs. --- " + duelOpponentSecond + "]";
    }
}
