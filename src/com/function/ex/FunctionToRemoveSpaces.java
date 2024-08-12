package com.function.ex;

import java.util.function.Function;

public class FunctionToRemoveSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<String, String > f=s->s.replaceAll(" ","");
		System.out.println(f.apply("he ll  o"));
		System.out.println(f.apply("hellos"));
		System.out.println(f.apply("hello  oo"));

	}

}
