package com.company.Tamrin1;

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
        Win win = new Win();
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
                if (cherckerLineBackwards >= 3) {
                    win.showMessage(charchter);
                    play.showtable();
                    chose.switchs();
                } else if (cherckerLineForward >= 3) {
                    win.showMessage(charchter);
                    play.showtable();
                    chose.switchs();
                } else if (cherckerLineBackwards + cherckerLineForward >= 3) {
                    win.showMessage(charchter);
                    play.showtable();
                    chose.switchs();
                }


                if (oribBackwards >= 3) {
                    win.showMessage(charchter);
                    play.showtable();

                    chose.switchs();
                } else if (oribForward >= 3) {
                    win.showMessage(charchter);
                    play.showtable();
                    chose.switchs();
                } else if (oribBackwards + oribForward >= 3) {
                    win.showMessage(charchter);
                    play.showtable();
                    chose.switchs();
                }
            } else if (numberOfBlock.get(i).equals(charchter)) {
                int j = i;
                while (true) {
                    if (j < 0) {
                        break;
                    } else if (numberOfBlock.get(j).equals(charchter) || !numberOfBlock.equals(charchter)) {
                        j = j - n;
                    } else {
                        numberOfBlock.set(j, charchter);
                        int checkedVertical = checkedVerticalForward(j, charchter);
                        if (checkedVertical >= 4) {
                            win.showMessage(charchter);
                            play.showtable();
                            chose.switchs();
                        }
                        break;
                    }

                }

                if (x >= 4) {
                    win.showMessage(charchter);
                    play.showtable();
                    chose.switchs();
                }
            } else {
//                int j = i;
//                while (true) {
//                    if (j < 0) {
//                        break;
//                    } else if (numberOfBlock.get(j).equals(charchter) | numberOfBlock.equals("x")) {
//                        j = j - n;
//                    } else {
//                        numberOfBlock.set(j, charchter);
//                        int checkedVertical = checkedVerticalForward(j, charchter);
//                        if (checkedVertical >= 4) {
//                            win.showMessage(charchter);
//                            play.showtable();
//                            chose.switchs();
//                        }
//                        break;
//                    }
//
//                }
                System.out.println("not" + i + " numberOfBlock  " + numberOfBlock.get(i));
            }


        }
        if (x >= 4) {
            win.showMessage(charchter);
            chose.switchs();
            play.showtable();
        }
    }

    public int checkedVerticalForward(int i, String c) {
        int sum = 0;
        for (int j = i; j < numberOfBlock.size(); j += n) {
            if (numberOfBlock.get(j).equals(c)) {
                sum++;
                System.out.println(sum);
            } else {
                break;
            }
        }
        return sum;
    }

    public int checkedHorizontalForward(int i, String c) {
        int sum = 0;

        for (int j = i + 1; j < numberOfBlock.size(); j++) {
            if (numberOfBlock.get(j).equals(c)) {

                sum++;

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
//            System.out.println(" Backwards nn : " + nn + "j: " + jj);

            if (nn < numberOfBlock.size()) {
//                System.out.println(" Backwards numberOfBlock : " + numberOfBlock.get(nn));
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
            if (nn < numberOfBlock.size()) {

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
