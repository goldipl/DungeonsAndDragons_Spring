package com.goldipl;

public class Knight {

    private String name;
    private int age;
    private int gold;
    private int wood;
    private Quest quest;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGold(int gold) {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getWood(int wood) {
        return wood;
    }

    public void setWood(int wood) {
        this.wood = wood;
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
