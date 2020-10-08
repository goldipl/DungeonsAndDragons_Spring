package com.goldipl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
