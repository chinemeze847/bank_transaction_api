package com.fcmb.bankapi.services;

import java.math.BigDecimal;

public interface CustomerService
{
	String doTransfer(String sourceAcct, String destAct, BigDecimal amount);
	String buyAirtime(String sourceAcct, String networkProvider, BigDecimal amount, String phoneNumber);
}
