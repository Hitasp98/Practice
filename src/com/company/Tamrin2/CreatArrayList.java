package com.company.Tamrin2;

import java.util.ArrayList;
import java.util.Random;

public class CreatArrayList {
    public ArrayList number = new ArrayList();
    int r;

    public void fild() {
        Random rand = new Random();
        for (int i = 0; i < 14; i++) {
            r = rand.nextInt(10);
            number.add(r);
        }
        System.out.println(number);
        Pairregularly pg = new Pairregularly(number);
pg.checked();
    }

}
