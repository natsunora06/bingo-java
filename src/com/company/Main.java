package com.company;

import java.util.Scanner;

public class Main {

//    司会者
    public static void main(String[] args) {

//        ビンゴカードが配る

        System.out.println ();
        System.out.print ("Player1");
        Player player = new Player ();

        System.out.print ("Player2");
        Player playerTwo = new Player ();

        System.out.print ("Player3");
        Player playerThree = new Player ();



//        PlayerTwo playerTwo = new PlayerTwo ();
        Garagara garagara = new Garagara ();

//        garagara.getNumber ();

        Scanner keyboard = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("Enter command (quit to exit):");
            String input = keyboard.nextLine();

            if(input != null) {

                if ("quit".equals(input)) {
                    System.out.println("Exit programm");
                    exit = true;
                } else if ("x".equals(input)) {
                }
                //        司会の人がガラガラを回す
                Integer getGaragara = garagara.getNumber ();




                    boolean judge = player.putNumber (getGaragara,1);
                    boolean judge2 = playerTwo.putNumber (getGaragara,2);
                    boolean judge3 = playerThree.putNumber (getGaragara,3);



//                System.out.println (playerTwo.card.putNumber (null) + "Player2");

                System.out.println ();

                System.out.print ("Player1");
                player.printCard ();


                System.out.print ("Player2");
                playerTwo.printCard ();

                System.out.print ("Player3");
                playerThree.printCard ();





                if(judge == true){
                    System.out.println ("Winner Player1");
                    break;
                } else if (judge2 == true){

                    System.out.println ("Winner Player2");
                    break;
                }else if (judge3 == true){

                    System.out.println ("Winner Player3");
                    break;
                }
            }
        }
        keyboard.close();

//        司会の人が出た番号を伝える


//        ビンゴする人が出た番号を消す


//        ビンゴする人はビンゴしたら伝える



    }
}
