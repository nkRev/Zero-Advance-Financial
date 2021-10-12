package com.nicky.ZeroAdvanceFinancials.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long accountNumber;

    private long cId;
    private double balance, openingBalance, interest, depositAmt, withdrawAmt;
    private Date date;

}
