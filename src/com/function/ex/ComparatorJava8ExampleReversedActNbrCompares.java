package com.function.ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class ComparatorJava8ExampleReversedActNbrCompares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Bank> list=new ArrayList<>();
		list.add(new Bank(234,"mike"));
		list.add(new Bank(222,"john"));
		list.add(new Bank(111,"aga"));
		list.add(new Bank(332,"aga"));
		list.add(new Bank(566,"zerek"));
	//	Function<Bank, Integer> f=bank->bank.getId();
		
	//	Comparator<Bank> comparator=Comparator.comparing(f);
	//	Comparator<Bank> comparator=Comparator.comparing(bank->bank.getId());
	//	Comparator<Bank> comparator=Comparator.comparing(Bank::getCustomerName);
		Comparator<Bank> comparator=Comparator.comparing(Bank::getCustomerName).reversed()
				.thenComparing(Bank::getId);
		Collections.sort(list, comparator);
		list.forEach(System.out::println);

	}

}
