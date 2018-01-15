package com.test.bank;

public class Bank {
	
	private IFundTransfer ifundtransfer;
	public void setIfundtransfer(IFundTransfer ifundtransfer) {
		this.ifundtransfer = ifundtransfer;
	}
	public void transfer(int amount, String sAccount, String dAccount) {
		ifundtransfer.transfer(amount, sAccount, dAccount);
	}

}
