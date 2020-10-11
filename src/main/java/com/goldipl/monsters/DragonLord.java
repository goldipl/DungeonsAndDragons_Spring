package com.goldipl.monsters;

public class DragonLord extends Dragon {

    private int extraPower;

    public DragonLord(String name, int lvl, int hp, int extraPower) {
        super(name, lvl, hp);
    }

    public int getExtraPower() {
        return extraPower;
    }

    public void setExtraPower(int extraPower) {
        this.extraPower = extraPower;
    }

    @Override
    public String toString() {
        return "DragonLord [" +
                "name = " + name + " | " +
                "lvl = " + lvl + " | " +
                "hp = " + hp +
                "]";
    }
}
