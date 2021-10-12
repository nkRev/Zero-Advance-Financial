package com.nicky.ZeroAdvanceFinancials.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
    @UniqueConstraint(name="email_unique", columnNames = "email"),
    @UniqueConstraint(name="username_unique", columnNames = "username")
})
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long uID;

    @Column(nullable=false)
    private String username;

    @Column(nullable = false)
    private String password;

    private boolean isLoggedIn;
}
