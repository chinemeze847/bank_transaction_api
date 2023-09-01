package com.fcmb.bankapi.services;

import java.util.List;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fcmb.bankapi.models.Transaction;
import com.fcmb.bankapi.repositories.TransactionRepository;

@Slf4j
@Service
public class TransactionServiceImpl implements TransactionService {

	@Autowired
	private TransactionRepository transactionRepository;

	public TransactionServiceImpl(TransactionRepository transactionRepository) {
		this.transactionRepository = transactionRepository;
	}

	@Override
	public List<Transaction> findByAccountNumber(String accountNumber) {
		return transactionRepository.findAllByAcctNumber(accountNumber);
	}
}
