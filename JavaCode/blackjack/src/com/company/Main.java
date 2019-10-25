package com.company;

public class Main {

    public static void main(String[] args) {
	DeckShoe x = new DeckShoe(2);
	Card c = new Card("j", 0);
	for (int i = 0 ; i < 52; i++){
	    c = x.getNextCardOBJ();
	    System.out.println(c.getCard());

    }
    }
}
