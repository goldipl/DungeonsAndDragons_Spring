package com.goldipl.monsters;

public class DragonLord extends Dragon implements DragonLordInterface {

    private int extraPower;

    public DragonLord(String name, int lvl, int hp, int extraPower) {
        super(name, lvl, hp);
    }

    @Override
    public int getExtraPower() {
        return extraPower;
    }

    @Override
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
