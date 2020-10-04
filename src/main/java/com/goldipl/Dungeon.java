package com.goldipl;

public class Dungeon {

    private String dungeonName;

    public Dungeon(String dungeonName) {
        this.dungeonName = dungeonName;
    }

    @Override
    public String toString() {
        return dungeonName;
    }
}