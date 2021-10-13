package com.nicky.transaction.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long accountNumber;

    private double amt;
    private String txType;
    private Date date;
}
