package com.goldipl;

import com.goldipl.knights.Knight;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Dungeon {

    private String dungeonName;

    public Dungeon(String dungeonName) {
        this.dungeonName = dungeonName;
    }

    @Override
    public String toString() {
        return dungeonName;
    }

    // Map of our knights
    Map<String, Knight> knights = new HashMap<>();

    // Adding knights method
    public void createKnight(String name, int age, int gold, int wood, Quest quest) {
        knights.put(name, new Knight(name, age, gold, wood, quest));
    }

    // Load all knights
    public Collection<Knight> getAllKnights() {
        return knights.values();
    }

    public Knight getKnight(String name) {
        return knights.get(name);
    }

    public void deleteKnight(String name) {
        knights.remove(name);
    }

}