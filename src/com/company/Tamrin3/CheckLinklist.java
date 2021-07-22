package com.company.Tamrin3;

import org.w3c.dom.Node;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class CheckLinklist {
    static LinkedList list = new LinkedList();

    public static void main(String[] args) {
        Random rand = new Random();
        int r;
        for (int i = 0; i < 14; i++) {
            r = rand.nextInt(10);
            list.add(r);
        }
        CheckLinklist linklist=new CheckLinklist();
        linklist.chose();
    }

    public void chose() {
        int s;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1-check\n 2-add\n 3-delete\n4-search");
        s = scanner.nextInt();
        System.out.println(list);
        switch (s) {
            case 1:
                if (list.equals(null)) {
                    System.out.println("null");
                } else {
                    System.out.println("full");

                }
                break;
            case 2:
                System.out.println("Enter number:");
                int newnumber = scanner.nextInt();
                list.add(newnumber);
                System.out.println(list);

                break;
            case 3:
                System.out.println("Enter number:");
                int deletenumber = scanner.nextInt();
                list.remove(deletenumber);
                System.out.println(list);

                break;
            case 4:
                System.out.println("Enter number:");
                int searchnumber = scanner.nextInt();
               System.out.println(list.indexOf(searchnumber));
                System.out.println(list);
                break;
            default:
                break;
        }
    }
}
