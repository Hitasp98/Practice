package com.company.Tamrin1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Chose {


    static public void switchs() {
        Scanner scanner = new Scanner(System.in);
        int a;
        Player player = new Player();
        try {
            while (true) {

                System.out.println("1-play");
                System.out.println("2-exit");
                a = scanner.nextInt();
                switch (a) {
                    case 1:
                        player.creatTable();
                        break;
                    case 2:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Again!");
                }
            }
        } catch (InputMismatchException e) {


            System.out.println("Again!" + e);
            switchs();
        }

    }
}
