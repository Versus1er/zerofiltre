package com.paymybuddy.paymybuddy.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "\"user\"")
@DynamicUpdate
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "user_id")
  private Integer id;

  private String email;

  public Integer getId() {
    return id;
  }

  public void setId(final Integer id) {
    this.id = id;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(final String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(final String password) {
    this.password = password;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(final String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(final String lastName) {
    this.lastName = lastName;
  }

  public BigDecimal getBalance() {
    return balance;
  }

  public void setBalance(final BigDecimal balance) {
    this.balance = balance;
  }

  public List<Connection> getInitializedConnections() {
    return initializedConnections;
  }

  public void setInitializedConnections(final List<Connection> initializedConnections) {
    this.initializedConnections = initializedConnections;
  }

  public List<Connection> getReceivedConnections() {
    return receivedConnections;
  }

  public void setReceivedConnections(final List<Connection> receivedConnections) {
    this.receivedConnections = receivedConnections;
  }

  public List<Transaction> getInitiatedTransactions() {
    return initiatedTransactions;
  }

  public void setInitiatedTransactions(final List<Transaction> initiatedTransactions) {
    this.initiatedTransactions = initiatedTransactions;
  }

  public List<Transaction> getReceivedTransactions() {
    return receivedTransactions;
  }

  public void setReceivedTransactions(final List<Transaction> receivedTransactions) {
    this.receivedTransactions = receivedTransactions;
  }

  private String password;

  @Column(name = "firstname")
  private String firstName;

  @Column(name = "lastname")
  private String lastName;

  @Column(name = "balance")
  private BigDecimal balance;

  @OneToMany(mappedBy = "initializer")
  private List<Connection> initializedConnections = new ArrayList<>();

  @OneToMany(mappedBy = "receiver")
  private List<Connection> receivedConnections = new ArrayList<>();

  @OneToMany(mappedBy = "issuer")
  private List<Transaction> initiatedTransactions = new ArrayList<>();

  @OneToMany(mappedBy = "payee")
  private List<Transaction> receivedTransactions = new ArrayList<>();

}
