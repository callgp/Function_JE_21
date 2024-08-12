package com.function.ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class ComparatorJava8ExampleThirdWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Bank> list=new ArrayList<>();
		list.add(new Bank(234,"mike"));
		list.add(new Bank(222,"john"));
		list.add(new Bank(111,"json"));
		list.add(new Bank(566,"marta"));
	//	Function<Bank, Integer> f=bank->bank.getId();
		
	//	Comparator<Bank> comparator=Comparator.comparing(f);
		Comparator<Bank> comparator=Comparator.comparing(bank->bank.getId());
		Collections.sort(list, comparator);
		list.forEach(System.out::println);

	}

}
