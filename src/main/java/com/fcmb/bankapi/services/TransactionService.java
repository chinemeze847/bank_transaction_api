package com.fcmb.bankapi.services;

import java.util.List;

import lombok.extern.slf4j.Slf4j;

import com.fcmb.bankapi.models.Transaction;

public interface TransactionService {
	List<Transaction> findByAccountNumber(String accountNumber);
}
