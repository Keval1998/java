package com.keval_rajyaguru.NumberAndStrings.Strings;

public class Anagram {

	public static void main(String[] args) 
	{
		String s1="this is me";
		String s2="is them si";
		String str1 = null,str2=null;
		for(int i=0;i<s1.length();i++)
		{
			if(Character.isLetter(s1.charAt(i)))
			{
				str1+=s1.charAt(i);
			}
		}
		
		for(int j=0;j<s2.length();j++)
		{
			if(Character.isLetter(s2.charAt(j)))
			{
				str2+=s2.charAt(j);
			}
		}
		char arr1[]=s1.toCharArray();
		char arr2[]=s2.toCharArray();
		java.util.Arrays.sort(arr1);
		java.util.Arrays.sort(arr2);
		int x=1;
		if(arr1.length == arr2.length)
		{
			for(int k=0;k<arr1.length;k++)
			{
				if(arr1[k]!=arr2[k]) {
					x=0;
					break;}
			}
		}
		else {
			x=0;
		}
		if(x==1) {System.out.println("Yes Anagram");}
		else {System.out.println("Not Anagram");}
	}
}