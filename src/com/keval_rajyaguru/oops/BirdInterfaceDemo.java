package com.keval_rajyaguru.oops;

public class BirdInterfaceDemo implements BirdInterface{

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BirdInterfaceDemo bid = new BirdInterfaceDemo();
		System.out.println(bid.getName());
	}

	@Override
	public void setName(String nm) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "fly catcher";
	}

	@Override
	public void setEats(String e) {
		// TODO Auto-generated method stub
		
	}

}
