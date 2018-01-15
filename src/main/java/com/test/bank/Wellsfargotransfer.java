package com.test.bank;

public class Wellsfargotransfer implements IFundTransfer {

	@Override
	public void transfer(int amount, String sAccount, String dAccount) {
		System.out.println("amount ::" + amount + "sAccount ::" + sAccount + "dAccount ::" + dAccount);
		
	}
	

}
