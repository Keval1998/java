package com.keval_rajyaguru.NumberAndStrings.Numbers;

public class ValueOfDemo {
	
	    public static void main(String[] args) {

	        // this program requires two 
	        // arguments on the command line 
	        if (args.length >= 2) {
	        	int sum=0;
	            // convert strings to numbers
	        	for(String i: args)
	        	{
	        		sum+=(Integer.valueOf(i)).floatValue();
	        	}
	           

	            // do some arithmetic
	            System.out.println(sum);
	        } else {
	            System.out.println("This program " +
	                "requires two command-line arguments.");
	        }
	    }
	}

