package com.company;

public class Card {
    
    public
    Card(String x, int y){suite = x; num = y;}
    int getNum(){ return num;}
    String getSuite(){return suite;}
    String getCard(){String c = suite + num;
        return c;}
    boolean sameCard(Card x){
        boolean sameSuite = false;
        if (x.suite == suite){
            if (x.num == num){return true;}
            else return false;
        }
        else return false;
    }
    private
    String suite;
    int num;

}
