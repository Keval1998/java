package com.keval_rajyaguru.NumberAndStrings.Numbers;

import java.text.DecimalFormat;

public class ValueOfDemo2 {
	
	public static void main(String[] args) {

        // this program requires two 
        // arguments on the command line 
        if (args.length >= 2) {
        	double sum=0.0;
            // convert strings to numbers
        	for(String i: args)
        	{
        		sum+=((Double.valueOf(i)).doubleValue());
        	}
       

           DecimalFormat df = new DecimalFormat("####,#####.##");
         String sum1 = df.format(sum);
            // do some arithmetic
            System.out.println(sum1);
        } else {
            System.out.println("This program " +
                "requires two command-line arguments.");
        }
    }

}
