package com.fcmb.bankapi.dtos;

import java.math.BigDecimal;

public class BuyAirtimeDto {
	String sourceAcct;
	String networkProvider;
	String phoneNumber;
	BigDecimal amount;

	public BuyAirtimeDto(){

	}


	public BuyAirtimeDto(String sourceAcct, String networkProvider, String phoneNumber, BigDecimal amount) {
		this.sourceAcct = sourceAcct;
		this.networkProvider = networkProvider;
		this.phoneNumber = phoneNumber;
		this.amount = amount;
	}

	public String getSourceAcct() {
		return sourceAcct;
	}

	public void setSourceAcct(String sourceAcct) {
		this.sourceAcct = sourceAcct;
	}

	public String getNetworkProvider() {
		return networkProvider;
	}

	public void setNetworkProvider(String networkProvider) {
		this.networkProvider = networkProvider;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
}
