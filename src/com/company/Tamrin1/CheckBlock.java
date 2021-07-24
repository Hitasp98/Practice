package com.company.Tamrin1;

import java.util.ArrayList;


public class CheckBlock {
    int n;
    int m;
    ArrayList numberOfBlock;
    Player player = new Player();

    public CheckBlock(int n, int m, ArrayList numberOfBlock) {
        this.n = n;
        this.m = m;
        this.numberOfBlock = numberOfBlock;
    }

    public void checked(String charchter, int nBlock) {

            numberOfBlock.set(nBlock, charchter);
            int ChHR= checkHR(nBlock,charchter);
            System.out.println(ChHR);

    }
public  int checkHR(int c,String charechter){
        int sum=0;
        for(int i=c;i<numberOfBlock.size();i=i+n+1){
            if(numberOfBlock.get(i).equals(charechter)){
                sum++;
            }
            else {
                break;
            }
        }
        return sum;
}
    public  int checkLeft(int c,String charechter){
        int sum=0;
        for(int i=c;i<numberOfBlock.size();i++){

            if(numberOfBlock.get(i).equals(charechter)){
                sum++;
            }
            else {
                break;
            }
        }
        return sum;
    }
    public  int checkRight(int c,String charechter){
        int sum=0;
        for(int i=c;i>0;i--){

            if(numberOfBlock.get(i).equals(charechter)){
                sum++;
            }
            else {
                break;
            }
        }
        return sum;
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
