package com.cg.framework1;
//abstract class
public abstract class BankFactory 
{
	//abstract method
     abstract public SavingAcc getNewSavingAcc(int AccNo, String accNm, float accBal, boolean isSalary);
     abstract public CurrentAcc getNewCurrentAcc(int AccNo, String accNm, float accBal, float creditLimit);
    
}
