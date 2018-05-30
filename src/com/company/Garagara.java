package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//　　ガラガラ
public class Garagara {
//    ビンゴゲームで使用する番号をガラガラに入れる
//    ランダムで番号を出す
//    終わるタイミングはプレイヤーがビンゴしたときとガラガラから全部出たとき

    private List<Integer> garagara = new ArrayList<> ();

    public Garagara(){

        for(int i = 1; i < 100; i++){
            garagara.add (i);
        }

        Collections.shuffle (garagara);

    }

    int a = 0;
    public Integer getNumber (){
        int number = garagara.get (a++);
        System.out.println ("ガラガラ： '" + number);
        return number;
    }

}
