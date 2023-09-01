package com.fcmb.bankapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.fcmb.bankapi.dtos.TransferDto;
import com.fcmb.bankapi.models.Transaction;
import com.fcmb.bankapi.services.TransactionService;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

	@Autowired
	private TransactionService transactionService;

	public TransactionController(TransactionService transactionService) {
		this.transactionService = transactionService;
	}

	@GetMapping("/{account_num}")
	public ResponseEntity<List<Transaction>> getTransactions(@PathVariable String account_num ){
		List<Transaction> transactions = transactionService.findByAccountNumber(account_num);
		return ResponseEntity.ok(transactions);
	}
}
