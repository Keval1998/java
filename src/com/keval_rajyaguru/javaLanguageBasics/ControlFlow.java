package com.keval_rajyaguru.javaLanguageBasics;

public class ControlFlow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int aNumber = 3;
		/*Solution 1b :Write a test program 
        if (aNumber >= 0)
        if (aNumber == 0) System.out.println("first string");
        else System.out.println("second string");
        System.out.println("third string");*/
		
		/*Solution 1c : Using only spaces and line breaks, reformat the code snippet to make the control flow easier to understand
		  	if (aNumber >= 0)
		 
		    if (aNumber == 0)
		        System.out.println("first string");
		    else
		        System.out.println("second string");

		System.out.println("third string");*/
		
		/*Solution 1d: Use braces { and } to further clarify 
		 the code and reduce the possibility of errors by future maintainers of the code */
		
		if (aNumber >= 0) {
		    if (aNumber == 0) {
		        System.out.println("first string");
		    } else {
		        System.out.println("second string");
		    }
		}

		System.out.println("third string");
	}

}
