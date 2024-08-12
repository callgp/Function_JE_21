package com.function.ex;

import java.util.Date;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierOTP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Supplier<String> s1=()->{
			
			String otp="OD-";
			for(int i=0;i<6;i++) {
				otp=otp+new Random().nextInt(10);
			}
			return otp;
			};
			
		System.out.println(s1.get());
	}

}
