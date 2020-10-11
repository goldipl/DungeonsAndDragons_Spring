package com.goldipl.knights;

import com.goldipl.Quest;

public class Knight {

    public String name;
    public int age;
    public int gold;
    public int wood;
    public Quest quest;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public int setAge(int age) {
        this.age = age;
        return age;
    }

    public int getGold(int gold) {
        return gold;
    }

    public int setGold(int gold) {
        this.gold = gold;
        return gold;
    }

    public int getWood(int wood) {
        return wood;
    }

    public int setWood(int wood) {
        this.wood = wood;
        return wood;
    }

    public Quest getQuest() {
        return quest;
    }

    public void setQuest(Quest quest) {
        this.quest = quest;
    }

    public Knight(String name, int age, int gold, int wood, Quest quest) {
        this.name = name;
        this.age = age;
        this.quest = quest;
        this.gold = gold;
        this.wood = wood;
    }

    @Override
    public String toString() {
        return "Knight [" +
                "name = " + name + " | " +
                "age = " + age + " | " +
                "gold = " + gold + " | " +
                "wood = " + wood + " | " +
                "quest = " + quest +
                "]";
    }

    public int setExtraGold(int extraGold) {
        return gold += extraGold;
    }

    public int setExtraWood(int extraWood) {
        return wood += extraWood;
    }
}
