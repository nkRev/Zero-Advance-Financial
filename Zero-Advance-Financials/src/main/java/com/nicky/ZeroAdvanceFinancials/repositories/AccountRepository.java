package com.nicky.ZeroAdvanceFinancials.repositories;

import com.nicky.ZeroAdvanceFinancials.model.Account;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
