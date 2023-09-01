package com.fcmb.bankapi.dtos;

import java.math.BigDecimal;

public class TransferDto {
	String sourceAcct;
	String destAcct;
	BigDecimal amount;

	public TransferDto(){

	}

	public TransferDto(String sourceAcct, String destAcct, BigDecimal amount) {
		this.sourceAcct = sourceAcct;
		this.destAcct = destAcct;
		this.amount = amount;
	}

	public String getSourceAcct() {
		return sourceAcct;
	}

	public void setSourceAcct(String sourceAcct) {
		this.sourceAcct = sourceAcct;
	}

	public String getDestAcct() {
		return destAcct;
	}

	public void setDestAcct(String destAcct) {
		this.destAcct = destAcct;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
}
