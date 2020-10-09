package com.goldipl;

public class SuperKnight extends Knight implements SuperKnightInterface {

    public int gloryPoints;

    public SuperKnight(String name, int age, int gold, int wood, Quest quest, int gloryPoints) {
        super(name, age, gold, wood, quest);
        this.gloryPoints = gloryPoints;
    }

    @Override
    public String toString() {
        return "SuperKnight [" +
                "name = " + name + " | " +
                "age = " + age + " | " +
                "gold = " + gold + " | " +
                "wood = " + wood + " | " +
                "quest = " + quest + " | " +
                "gloryPoints = " + gloryPoints +
                "]";
    }

    @Override
    public int getGloryPoints() {
        return gloryPoints;
    }

    @Override
    public void setGloryPoints(int gloryPoints) {
        this.gloryPoints = gloryPoints;
    }
}
