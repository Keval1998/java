package com.keval_rajyaguru.collectionAns;
import java.util.*;

public class TrimAns {

	public static void trimmer(List<String> list)
	{
		int i=0;
		for(String s: list)
		{
			list.set(i, s.trim());
			i++;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l = new ArrayList<>();
		l.add("A  jdb djd  ");
		l.add(" B df");
		for(String s : l) {System.out.println(s);}
		trimmer(l);
		for(String s : l) {System.out.println(s);}
	}

}
