package com.nicky.ZeroAdvanceFinancials.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.nicky.ZeroAdvanceFinancials.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
