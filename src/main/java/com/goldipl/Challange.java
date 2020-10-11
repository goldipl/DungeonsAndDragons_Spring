package com.goldipl;

import org.springframework.scheduling.annotation.Scheduled;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Challange {

    private List<String> challangeDescriptions;
    Random random = new Random();

    public Challange() {
        this.challangeDescriptions = new ArrayList<>();

        challangeDescriptions.add("Defeat Diablos");
        challangeDescriptions.add("Defeat Meferon");
        challangeDescriptions.add("Defeat Axbex");
        challangeDescriptions.add("Defeat Anderielli");
        challangeDescriptions.add("Obtain a golden mask");
        challangeDescriptions.add("Obtain a crystal scythe");

    }

    public List<String> getList() {
        return challangeDescriptions;
    }

//    public List<String> getRandomChallangeDescriptions() {
//        return Collections.singletonList(challangeDescriptions.get(random.nextInt(challangeDescriptions.size())));
//    }

    public String getRandomChallangeDescriptions() {
        return challangeDescriptions.get(random.nextInt(challangeDescriptions.size()));
    }
}
