package com.keval_rajyaguru.annotation;

public @interface enreq {
	
		String id();
		String synopsys();
		String engineer() default "unsigned";
		String date() default "unknown";
	
}
