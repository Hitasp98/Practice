package com.company.Tamrin;

import java.util.ArrayList;


public class CheckBlock {
    int n;
    int m;
    ArrayList numberOfBlock;
    Play play = new Play();

    public CheckBlock(int n, int m, ArrayList numberOfBlock) {
        this.n = n;
        this.m = m;
        this.numberOfBlock = numberOfBlock;
    }

    public void checked(String charchter, int nBlock) {
        int nn;
        int number;
        nn = n - nBlock;

        Chose chose = new Chose();

        number = nBlock + nn;
        int x = 0;
        for (int i = nBlock; i < numberOfBlock.size(); i += number) {
            if (numberOfBlock.get(i) instanceof Integer) {
                numberOfBlock.set(i, charchter);
                x++;
                int cherckerLineBackwards = checkedHorizontalBackwards(i, charchter);
                int cherckerLineForward = checkedHorizontalForward(i, charchter);
                int oribBackwards = checkedOribBackwards(i, charchter);
                int oribForward = checkedOribForward(i, charchter);
                System.out.println(i + "  oribForward:" + oribForward + " oribBackwards:" + oribBackwards);
//                System.out.println(i + " " + cherckerLineForward + " " + cherckerLineBackwards);
                if (cherckerLineBackwards >= 3) {
                    System.out.println("Win " + charchter);
                    play.showtable();
                    chose.switchs();
                } else if (cherckerLineForward >= 3) {
                    System.out.println("Win " + charchter);
                    play.showtable();
                    chose.switchs();
                } else if (cherckerLineBackwards + cherckerLineForward >= 3) {
                    System.out.println("Win " + charchter);
                    play.showtable();
                    chose.switchs();
                }


                if (oribBackwards >= 3) {
                    System.out.println("Win " + charchter);
                    play.showtable();

                    chose.switchs();
                } else if (oribForward >= 3) {
                    System.out.println("Win " + charchter);
                    play.showtable();

                    chose.switchs();
                } else if (oribBackwards + oribForward >= 3) {
                    System.out.println("Win " + charchter);
                    play.showtable();

                    chose.switchs();
                }
            } else if (numberOfBlock.get(i).equals(charchter)) {
                x++;
                if (x >= 4) {
                    System.out.println("Win " + charchter);
                    play.showtable();

                    chose.switchs();
                }
            } else {
                System.out.println("here have charchter!!");


            }
            if (x >= 4) {
                System.out.println("Win " + charchter);
                chose.switchs();
                play.showtable();

            }

        }

    }

    public int checkedHorizontalForward(int i, String c) {
        int sum = 0;

        for (int j = i + 1; j < numberOfBlock.size(); j++) {
            if (numberOfBlock.get(j).equals(c)) {

                sum++;
//                System.out.println(numberOfBlock.get(j) + "  " + j + "  " + sum);

            } else {
                break;
            }
        }
        return sum;
    }

    public int checkedHorizontalBackwards(int i, String c) {
        int sum = 0;

        for (int j = i - 1; j >= 0; j--) {
            if (numberOfBlock.get(j).equals(c)) {
                sum++;
//                System.out.println(numberOfBlock.get(j) + "  " + j + "  " + sum);
            } else {
                break;
            }


        }
        return sum;
    }


    public int checkedOribBackwards(int i, String c) {
        int sum = 0;
        int jj = 0;
        int nn = i;
        for (int j = i; j < numberOfBlock.size(); j += n) {
            jj++;

            nn += jj + n;
            System.out.println(" Backwards nn : " + nn + "j: " + jj);

            if (nn < numberOfBlock.size()) {
                System.out.println(" Backwards numberOfBlock : " + numberOfBlock.get(nn));
                if (numberOfBlock.get(nn).equals(c)) {
                    sum++;

                } else {
                    break;
                }
            }
        }

        return sum;

    }

    public int checkedOribForward(int i, String c) {
        int sum = 0;
        int jj = 1;
        int nn = n + jj;
        for (int j = i; nn + j < numberOfBlock.size(); j += n) {

            nn = j + jj;
//

            jj++;
            if(nn<numberOfBlock.size()){

                if (numberOfBlock.get(nn).equals(c)) {
                    sum++;

                } else {
                    break;
                }

            }



        }

        return sum;

    }


}
