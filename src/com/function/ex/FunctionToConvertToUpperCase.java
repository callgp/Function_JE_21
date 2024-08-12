package com.function.ex;

import java.util.function.Function;

public class FunctionToConvertToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<String, String> f=s->s.toUpperCase();
		System.out.println(f.apply("hello"));
		System.out.println(f.apply("hellos"));
		System.out.println(f.apply("hellooo"));

	}

}
