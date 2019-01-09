package com.keval_rajyaguru.collectionAns;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class FindDups{
	
	
	 public static void main(String[] args) {
		 
		  Comparator<String> comp = new Comparator<String>() {
			    public int compare(String s1, String s2) {
			        return s1.compareToIgnoreCase(s2);
			    
		 			}
		 };
	        SortedSet<String> s =  new TreeSet<String>(comp);
	        for (String a : args)
	        {
	               s.add(a);
	        }
	               System.out.println(s.size() + " distinct words: " + s);
	 				}}