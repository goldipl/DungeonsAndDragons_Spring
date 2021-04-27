package com.goldipl;

import com.goldipl.knights.Knight;

public class Duel {

    private Knight duelOpponentFirst;
    private Knight duelOpponentSecond;
    private Knight winner;
    private Knight loser;

    public Duel(Knight duelOpponentFirst, Knight duelOpponentSecond) {
        this.duelOpponentFirst = this.loser = duelOpponentFirst;
        this.duelOpponentSecond = this.winner = duelOpponentSecond;
    }

    // If the loser has gold < 0 after reducing gold
    // then application returns gold = 0

    public int loseGold (int i) {
        if (loser.getGold(loser.setExtraGold(-i)) < 0) {
            return loser.getGold(loser.setGold(0));
        } else {
            return loser.getGold(loser.setExtraGold(-i));
        }
    }

    public int winGold (int i) {
        return winner.getGold(winner.setExtraGold(i));
    }

    @Override
    public String toString() {
        return "Duel [" + duelOpponentFirst + " --- vs. --- " + duelOpponentSecond + "]";
    }
}
