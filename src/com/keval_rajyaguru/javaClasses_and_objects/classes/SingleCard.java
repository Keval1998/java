package com.keval_rajyaguru.javaClasses_and_objects.classes;

public class SingleCard {
	
	String type=null;
	String card=null;
	public SingleCard(String type,String card)
	{
		if(checkType(type)) {System.out.println("type "+type+" ok");}
		if(checkCard(card)) {System.out.println("card "+card+" ok");}
		assert checkType(type);
		this.type=type;
		assert checkCard(card);
		this.card=card;
	}
	
	public static int typeValue(String type)
	{
		System.out.println("Type to value for "+type);
		switch(type.toLowerCase())
		{
		case "diamond": return 1;
		case "spade": return 2;
		case "club": return 3;
		case "heart": return 4;
		default :System.out.println("getting choice is not from:\ndiamond\nspade\nclub\nheart"); return 0;
		}
	}
	
	public static int cardValue(String card)
	{
		System.out.println("Card to value for "+card);
		switch(card.toLowerCase())
		{
		case "ace":return 1;
		case "deuce":return 2;
		case "three":return 3;
		case "four":return 4;
		case "five":return 5;
		case "six":return 6;
		case "seven":return 7;
		case "eight":return 8;
		case "nine":return 9;
		case "ten":return 10;
		case "jack":return 11;
		case "queen":return 12;
		case "king":return 13;
		default:System.out.println("getting choice is not from:\nace\ndeuce\nthree\nfour\n...\n"); return 0;
		}
	}
	
	public boolean checkType(String type)
	{
	if(typeValue(type)<=4 && typeValue(type)>=1) {return true;}
		else
		return false;
	}
	
	public boolean checkCard(String type)
	{
		System.out.println("checking card....");
	if(SingleCard.cardValue(type)<=13 && SingleCard.cardValue(type)>=1) 
	{
		System.out.println("card valid");
		return true;
	}
	else
	{
		System.out.println("card invalid");	
		return false;
	}
}


	public static void main(String [] args)
	{
		assert cardValue("acE") == 1;
		assert typeValue("diAmond") == 1;
		assert cardValue("sd") == 2;
		System.out.println("in main");
		SingleCard sc3 = new SingleCard("diamond","ace");
		SingleCard sc = new SingleCard("ace","diamond");
		SingleCard sc1 = new SingleCard("diamond","ace");
	}

}
