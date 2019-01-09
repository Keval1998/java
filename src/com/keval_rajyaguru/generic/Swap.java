package com.keval_rajyaguru.generic;

public class Swap {

	public <T> void swap(T[] arr,int i,int j)
	{
		T temp;
		temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Swap s = new Swap();
		Integer arr[]={1,2,3,2,3,7,54,6};
		s.swap(arr, 3, 7);
		for(int k:arr)
		System.out.print(k+" ");
	}

}
