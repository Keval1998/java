package com.keval_rajyaguru.javaClasses_and_objects.enumExample;


	public class Deck3 {
	    private static Card[] cards = new Card[52];
	    public Deck3() {
	        int i = 0;
	        for (Suit suit : Suit.values()) {
	            for (Rank rank : Rank.values()) {
	                cards[i++] = new Card(rank, suit);
	            }
	        }
	    }
	}

