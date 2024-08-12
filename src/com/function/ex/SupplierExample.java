package com.function.ex;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Supplier<String> s1=()->"java";
		System.out.println(s1.get());
		
		Supplier<Integer> s2=()->
		new Random().nextInt(100);
		System.out.println(s2.get());
		System.out.println(s2.get());
		System.out.println(s2.get());
	}

}
