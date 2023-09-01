package com.fcmb.bankapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fcmb.bankapi.models.Transaction;


@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
}
