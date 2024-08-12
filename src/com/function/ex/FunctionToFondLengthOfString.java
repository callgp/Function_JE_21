package com.function.ex;

import java.util.function.Function;

public class FunctionToFondLengthOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<String, Integer> f=s->s.length();
		System.out.println(f.apply("hello"));
		System.out.println(f.apply("hellos"));
		System.out.println(f.apply("hellooo"));

	}

}
