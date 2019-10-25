package com.company;

public class Deck  {

    public

    Deck() {cards = makeDeck();}
    Card getNextCardOBJ(){
        if (position >= numCards) { return new Card("j",0); }
        else { return cards[position++]; }
    }
    void shuffleCards(){
        position = 0;


    }

    private
    int position = 0;
    int numCards = 52;
    Card[] cards;

    private Card[] makeDeck() {
        Card[] newCards = new Card[numCards];
        int p = 0;
        String cSuite = "J";
        for (int y = 1 ; y <= 4; y++){

            switch (y) {
                case 1:
                    cSuite = "S" ;
                    break;
                case 2:
                    cSuite = "H";
                    break;
                case 3:
                    cSuite = "K";
                    break;
                case 4 :
                    cSuite = "D";
                    break;
            }
        for (int i = 1 ; i <= 13 ; i++){

            newCards[p++] = new Card(cSuite, i);
        }}
            return newCards;
    }

}
