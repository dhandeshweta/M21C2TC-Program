package com.cg.client;

import com.cg.application1.MMBankFactory;
import com.cg.application1.MMCurrentAcc;
import com.cg.application1.MMSavingAcc;
import com.cg.framework1.BankFactory;
import com.cg.framework1.CurrentAcc;
import com.cg.framework1.SavingAcc;

public class Client {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		BankFactory b = new MMBankFactory();
		SavingAcc s = new MMSavingAcc(101,"Shweta",52160,true);
		CurrentAcc c = new MMCurrentAcc(102,"Sneha",62160,30000);
		s.withdraw(20000);
		c.withdraw(30000);
		System.out.println(s);
		System.out.println(c);
	}
}