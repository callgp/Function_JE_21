package com.function.ex;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionToFindBankCustomerNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Bank> list=new ArrayList<>();
		list.add(new Bank(234,"mike"));
		list.add(new Bank(222,"john"));
		list.add(new Bank(111,"json"));
		list.add(new Bank(566,"marta"));
		Function<Bank, String> f=bank->bank.getCustomerName();
		
		
		List<String> list2=new ArrayList<>();
		for(Bank bank:list) {
			if(f.apply(bank)!=null) {
				list2.add(bank.getCustomerName());
			}
		}
		System.out.println(list2);

	}

}
