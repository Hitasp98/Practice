package com.company.Tamrin2;

import java.util.ArrayList;

public class Pairregularly {
    ArrayList list;

    public Pairregularly(ArrayList list) {
        this.list = list;
    }

    public void checked() {
    int first;
    int secand;
        for(int i=0;i<list.size();i+=2) {

            first= (int) list.get(i);
            secand= (int) list.get(i+1);
            if (first>secand) {

                System.out.println("delete this :"+first+">"+secand);
                list.remove(i);
                list.remove(i);
            }
        }
        System.out.println(list);

    }
}
