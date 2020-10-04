package com.goldipl;

public class Quest {

    private String questDescription;

    public Quest(String questDescription) {
        this.questDescription = questDescription;
    }

    @Override
    public String toString() {
        return questDescription;
    }
}
