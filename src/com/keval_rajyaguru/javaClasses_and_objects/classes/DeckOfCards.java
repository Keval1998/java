package com.keval_rajyaguru.javaClasses_and_objects.classes;
import java.util.Scanner;

public class DeckOfCards {

		int num_valid_rank_value=0;
		int num_valid_suit_value=0;
	public DeckOfCards() {
 
				SingleCard [][] sc;
				sc =new SingleCard[4][13];
				
				Scanner sc4 = new Scanner(System.in);
				System.out.println("Enter type and card");
				String t=sc4.next();
				String c=sc4.next();
			    sc[0][0]=new SingleCard(t,c);
			    assert sc[0][0].checkType(t) : num_valid_suit_value++;
			    assert sc[0][0].checkCard(c) : num_valid_rank_value++;
				
            }        
    }
	

