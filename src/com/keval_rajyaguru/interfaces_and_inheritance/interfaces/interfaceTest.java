package com.keval_rajyaguru.interfaces_and_inheritance.interfaces;

public class interfaceTest implements CharSequence{
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interfaceTest ift = new interfaceTest();
		System.out.println(ift.reverse("An interface name can be used anywhere a type can be used."));
	}

	@Override
	public int length() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public char charAt(int index) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public CharSequence subSequence(int start, int end) {
		// TODO Auto-generated method stub
		return null;
	}
	
	String revstr=null;
	public String reverse(String str)
	{
		
		for(int i=0;i<str.length();i++)
		{
			revstr = revstr + str.charAt(str.length()-1-i);
		}
		return revstr;
	}

}
