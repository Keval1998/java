package com.keval_rajyaguru.generic;

import java.util.ArrayList;
import java.util.List;

public class MaxInListRange {

	public <T extends Comparable> T max(List<T>list,int begin,int end)
	{
		T max=list.get(begin);
		for(int i=begin+1;i<end;i++)
		{
			if(max.compareTo(list.get(i))<0) max=list.get(i);
		}
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ls = new ArrayList<>();
		ArrayList<Integer> li = new ArrayList<>();
		for(int k=0;k<10;k++) 
		{
			ls.add(""+k);
			li.add(k);
		}
		
		MaxInListRange m = new MaxInListRange();
		System.out.println(m.max(ls, 1 , 10));
		System.out.println(m.max(li, 3 , 5));
		
	}

}
