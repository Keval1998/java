package com.keval_rajyaguru.NumberAndStrings.Strings;

public class Initial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Keval Atulkumar Rajyaguru ";
		String in="";
		for(int i=0;i<name.length();i++)
		{
			if(Character.isUpperCase(name.charAt(i))) 
			{
				in+=(name.charAt(i));
			}
		}
		//in.replace(null," ");
		System.out.print(in);
	}

}
