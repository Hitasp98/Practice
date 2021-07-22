package com.company.Tamrin1;

public class Win {


    public void showMessage(String character){
            if(character.equals("x")){
                System.out.println("Hamed!Wins");
            }else if(character.equals("y")){
                System.out.println("Amir!Wins");

            }else {
                System.out.println("Nobody!Wins the game ,try again...");

            }
    }
}
