package com.keval_rajyaguru.generic;

import java.util.ArrayList;
import java.util.Collection;

public class Count<T> {	
	
	public int oddcount(Collection<T> c) 
	{
		int count=0;
		for(T i:c)
		{
			if((int)i%2 != 0)
			count++;
		}
		return count;
	}
	
	public int primecount(Collection<T> c) 
	{
		int count=0;
		for(T i:c)
		{
			if(prime(i))
			{
			count++;
			}
		}
		return count;
	}
	public <T> boolean prime(T i)
	{
		for(int j = 2;j<=Math.floor(Math.sqrt(Double.valueOf(i.toString())));j++)
		{
			if(((int)i % j) == 0) {return false;}
		}
		return true;
	}
	
	public <T> int palindromeCount(Collection<T> c)
	{
		int count = 0;
		for(T i : c)
		{
			//System.out.println(i);
			if(palindrome(i)) 
			{
				count++;
			}
		}
		return count;
	}	
	
	public <T> boolean palindrome(T s)
	{
		
		StringBuilder str = new StringBuilder();
		//System.out.println("in palindrome");
		str.append(s);
		str.reverse();
		System.out.println(str+ "->" +s);
		if(str.toString().equals(s)) {return true;}
		
	
		return false;
	}
	
	public static void main(String[] args) {
			ArrayList<Integer> al = new ArrayList<>();
			ArrayList<String> al2 = new ArrayList<>();
			al2.add("abba");
			al2.add("aba");
			al2.add("a");
			al2.add("abcba");
			al2.add("abbhdsa");
			al2.add("abefewfba");
			al.add(0, 1);
			al.add(1,2);
			al.add(2,5);
			al.add(3,9);
			al.add(4,2);
			Count<Integer> c1 = new Count<>();
			System.out.println(c1.primecount(al));
			System.out.println(c1.oddcount(al));
			System.out.println(c1.palindromeCount(al2));
	}

}
