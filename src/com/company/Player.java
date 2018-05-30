package com.company;

import java.util.ArrayList;
import java.util.List;

//　　ビンゴをする人
public class Player {

    //    ビンゴカードが配られる
    Card card = new Card ();

    public void printCard(){
        card.print ();



    }

//    Integer getCardsNumber = card.getCardNumber ();


    public boolean putNumber(int number,int playerId){

        boolean masaru = card.putNumber (number,playerId);

        return masaru;

    }


//    ガラガラの番号がビンゴカードの中にあったら消す
//    ビンゴしたらビンゴと伝える

}
