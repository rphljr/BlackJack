package com.company;

import java.util.Random;

public class DeckShoe {
    public DeckShoe(int x) {
        numOfDecks = x;
        numOfCards = x * 52;
        decks = new Deck[x];
        cards = new int[numOfCards];
        for (int i = 0; i < x; i++) {
            decks[i] = new Deck();
        }
        shuffleDecks();
    }


    void shuffleDecks() {
        position = 0;
        for (int i = 0; i < decks.length; i++) {
            decks[i].shuffleCards();
        }
        int[] num = new int[numOfDecks];
        int x =0;
        for (int i = 0; i < cards.length; i++) {
            boolean run = true;
            while (run) {
                x = getRandomNumberInts(0,numOfDecks-1);
                num[x]++;
                for (int y =0; y < num.length; y++){
                    if (num[y]< 52){run = true; break;}
                    else {run = false;  }}
                if (num[x] < 52) {
                    cards[i] = x;
                    run = false;
                }
            }
        }
    }

    Card getNextCardOBJ() {
        if (position >= numOfCards) {
            this.shuffleDecks();
            return new Card("x", 0);
        } else {
            return decks[cards[position++]].getNextCardOBJ();
        }
    }

    private
    int position = 0;
    int numOfDecks;
    int numOfCards;
    Deck[] decks;
    int[] cards;


    public static int getRandomNumberInts(int min, int max) {
        Random random = new Random();
        return random.ints(min, (max + 1)).findFirst().getAsInt();
    }
}