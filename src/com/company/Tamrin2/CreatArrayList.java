package com.company.Tamrin2;

import java.util.ArrayList;
import java.util.Random;

public class creatArrayList {
    static ArrayList number;
    public void fild(){
        Random rand=new Random();
        for(int i=0;i<15;i++){
            number.add(rand.nextInt(20));
        }
        System.out.println(number);
    }
}
