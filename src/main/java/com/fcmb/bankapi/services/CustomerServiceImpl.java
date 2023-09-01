package com.fcmb.bankapi.services;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import com.fcmb.bankapi.models.Account;
import com.fcmb.bankapi.repositories.TransactionRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	private TransactionRepository repository;


	public CustomerServiceImpl(TransactionRepository repository) {
		this.repository = repository;
	}

	@Override
	public String doTransfer(String sourceAcct, String destAct, BigDecimal amount)
	{

		return " ";
	}

	@Override
	public String buyAirtime(String sourceAcct, String networkProvider, BigDecimal amount, String phoneNumber) {
		return null;
	}

}
