package com.company.Tamrin1;

import java.util.ArrayList;
import java.util.Scanner;

public class Player {
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
        for (int i = 0; i < Player.m; i++) {
            for (int j = 0; j < Player.n; j++) {
                System.out.print(numberOfBlock.get(ss) + "||");
                ss++;
            }
            System.out.println("");
        }
    }

    public void setblock() {
        int nBlockX;
        int nBlockY;
        int nn;
        int number;
        Chose chose = new Chose();
        Player player = new Player();
        while (true) {

            System.out.println("Enter Your Number Block X:");
            nBlockX = scanner.nextInt();
            int numbersave;
            player.sendCharacter(nBlockX, "x");

            showtable();
            System.out.println("Enter Your Number Block Y:");
            nBlockY = scanner.nextInt();
            player.sendCharacter(nBlockY, "y");


            showtable();
        }
    }

    public void sendCharacter(int nBlock, String NameCahracter) {
        CheckBlock checkBlock = new CheckBlock(m, n, numberOfBlock);

        while (nBlock + n < numberOfBlock.size()) {
            if (numberOfBlock.get(nBlock + n) instanceof Integer) {
                nBlock = nBlock + n;

            } else if (numberOfBlock.get(nBlock + n) instanceof String) {
                checkBlock.checked(NameCahracter, nBlock);

                break;
            }

        }
        checkBlock.checked(NameCahracter, nBlock);

    }
}
