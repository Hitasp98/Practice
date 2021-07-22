package com.company.Tamrin;

import java.util.ArrayList;
import java.util.Scanner;

public class Play {
    Scanner scanner = new Scanner(System.in);
    static int n;
    static int m;
    static ArrayList numberOfBlock;

    public void creatTable() {
        try {

            System.out.println("Enter N:");
            n = scanner.nextInt();
            if (n < 3) {
                System.out.println("Again!");
                creatTable();
            }
            System.out.println("Enter M:");
            m = scanner.nextInt();
            if (m < 3) {
                System.out.println("Again!");
                creatTable();
            }
            int sum = m * n;
            numberOfBlock = new ArrayList(sum);
            for (int i = 0; i < sum; i++) {
                numberOfBlock.add(i);
            }
            showtable();
            setblock();
        } catch (Exception e) {
            System.out.println("Again!" + e);
            creatTable();
        }
    }

    public void showtable() {
        int ss = 0;
        for (int i = 0; i < Play.m; i++) {
            for (int j = 0; j < Play.n; j++) {
                System.out.print(numberOfBlock.get(ss) + "||");
                ss++;
            }
            System.out.println("");
        }
    }

    public void setblock() {
        int nBlock;
        int nn;
        int number;
        Chose chose = new Chose();
        while (true) {

            System.out.println("Enter Your Number Block X:");
            nBlock = scanner.nextInt();
            CheckBlock checkBlock=new CheckBlock(m,n,numberOfBlock);
            checkBlock.checked("x",nBlock);
            showtable();
            System.out.println("Enter Your Number Block Y:");
            nBlock = scanner.nextInt();
            checkBlock.checked("y",nBlock);
//            nn = n - nBlock;
//            number = nBlock + nn;
//            int x = 0;
//            for (int i = nBlock; i < numberOfBlock.size(); i += number) {
//                if (numberOfBlock.get(i).equals("y")) {
//                    System.out.println("here have charchter!!");
//                    break;
//                } else {
//                    numberOfBlock.set(i, "x");
//                    x++;
//                }
//                if (x == 4) {
//                    System.out.println("Win X");
//                    chose.switchs();
//                }
//            }
//            System.out.println("Enter Your Number Block Y:");
//            nBlock = scanner.nextInt();
//            nn = n - nBlock;
//            number = nBlock + nn;
//            int y = 0;
//            for (int i = nBlock; i < numberOfBlock.size(); i += number) {
//                if (numberOfBlock.get(i).equals("y")) {
//                    System.out.println("here have charchter!!");
//                    break;
//
//                } else {
//                    numberOfBlock.set(i, "y");
//
//                }
//            }
//
            showtable();
        }
    }
}
