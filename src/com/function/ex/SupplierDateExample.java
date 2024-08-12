package com.function.ex;

import java.util.Date;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierDateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Supplier<Date> s1=()->new Date();
		System.out.println(s1.get());
		System.out.println(s1.get());
		System.out.println(s1.get());
		//Supplier<Integer> s2=()->
		//new Random().nextInt(100);
		//System.out.println(s2.get());
		//System.out.println(s2.get());
		//System.out.println(s2.get());
	}

}
