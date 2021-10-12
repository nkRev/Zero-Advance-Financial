package com.nicky.ZeroAdvanceFinancials.repositories;

import com.nicky.ZeroAdvanceFinancials.model.Transaction;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

}
