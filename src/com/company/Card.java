package com.company;


import java.io.Console;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//　　ビンゴカード
public class Card {

    private List<List<Integer>> bingoCard = new ArrayList<> ();
//    Player player = new Player ();
    private List<Integer> tissueBox = new ArrayList<> ();


    //    プレーヤーにカードが配られる
    public Card() {

        for(int i = 1; i < 100; i++){
            tissueBox.add (i);
        }

//        System.out.print (tissueBox);

        Collections.shuffle (tissueBox);

//        Integer s = 0;
//        for(int i = 1; i < 10; i++) {
//            if (tissueBox.get (s++) == i) {
//
//                i += " ";
//
//
//            }
//        }

        int c = 0;
        for(int b = 0; b < 5; b++) {
            List<Integer> row = new ArrayList<> ();
            for (int a = 0; a < 5; a++) {

                row.add (tissueBox.get (c++));
            }

            bingoCard.add (row);
        }
        print ();

    }

    public void print (){
        System.out.println ();


        for(List<Integer> bingo: bingoCard){


            for(Integer d :bingo) {

                String jyunya = String.valueOf (d);

//                if(d == 1){
//                    jyunya += " ";
//                }



                if(d == null) {
                    jyunya = "  ";
                } else if(d < 10){
                    jyunya = d + " ";

                }



                System.out.print ("|" + " " + jyunya + " ");



            }
            System.out.println ();
        }

        System.out.println ();
    }


//    ガラガラの番号
    public  boolean putNumber(Integer number, int playerId) {
//        System.out.println (number);

        for (List<Integer> bingo : bingoCard) {

            for (Integer d : bingo) {
                if (number == d) {

                    if(playerId == 1) {
                        System.out.println ("Player1 : 同じ数字");
                    }else if(playerId == 2){
                        System.out.println ("Player2 : 同じ数字");
                    }else {
                        System.out.println ("Player3 : 同じ数字");
                    }
                    int index = bingo.indexOf (d);
                    bingo.set (index, null);
                }
            }

        }

        //        行判定
        for (List<Integer> bingo : bingoCard) {

            int count = 0;
            for (Integer d : bingo) {

                if (d == null) {
                    count += 1;
                }
            }
            if (count == 5) {
                System.out.println ("BINGO!");
                return true;
            }
        }


//        列判定
        for(int i = 0; i < bingoCard.size (); i++) {
            int column = 0;
            for (List<Integer> bingo : bingoCard) {


                if(bingo.get (i) == null){

                    column += 1;
                }

            }
            if(column == 5){
                System.out.println ("BINGO!");
                return true;
            }

        }


//        斜め判定（左上スタート）
        int countCross = 0;
        for(int i = 0; i < bingoCard.size (); i++) {
            if (bingoCard.get (i).get (i) == null) {
                countCross += 1;
            }
            if(countCross == 5){
                System.out.println ("BINGO!");
                return true;

            }
        }


//        斜め判定（右上スタート）
        int a = 4;
        int countRight = 0;
        for(int i = 0; i < bingoCard.size (); i++) {
            if(bingoCard.get (i).get (a--) == null){
                countRight += 1;
            }

            if(countRight == 5){
                System.out.println ("BINGO!");
                return true;
            }

        }

        return false;

    }

//    ガラガラの番号があれば消される
//    ビンゴしたら終了する
}


