package com.goldipl.monsters;

public class Goblin {

    private String name;
    private int lvl;
    private int hp;

    public Goblin(String name, int lvl, int hp) {
        this.name = name;
        this.lvl = lvl;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "Goblin [" +
                "name = " + name + " | " +
                "lvl = " + lvl + " | " +
                "hp = " + hp +
                "]";
    }
}
