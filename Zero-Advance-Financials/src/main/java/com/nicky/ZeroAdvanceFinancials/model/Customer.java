package com.nicky.ZeroAdvanceFinancials.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(uniqueConstraints = {
    @UniqueConstraint(name = "ssn_unique", columnNames = "ssn" )
})
public class Customer {
    @Id
    private int cId;
    private String firstName, lastName, address, city, state, phone, ssn;
    private Date date;
}
