package com.paymybuddy.paymybuddy.model.viewmodel;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TransactionViewModel {

  private Integer id;
  private UserViewModel issuer;
  private UserViewModel payee;

  private LocalDateTime date;

  private BigDecimal amount;

  private String description;

  @Override
  public boolean equals(final Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionViewModel transactionViewModel = (TransactionViewModel) o;
    return (id.equals(transactionViewModel.id) &&
        issuer.equals(transactionViewModel.issuer) &&
        payee.equals(transactionViewModel.payee) &&
        date.isEqual(transactionViewModel.date) &&
        amount.equals(transactionViewModel.amount) &&
        description.equalsIgnoreCase(transactionViewModel.description));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, issuer, payee, date, amount, description);
  }

  public Integer getId() {
    return id;
  }

  public void setId(final Integer id) {
    this.id = id;
  }

  public UserViewModel getIssuer() {
    return issuer;
  }

  public void setIssuer(final UserViewModel issuer) {
    this.issuer = issuer;
  }

  public UserViewModel getPayee() {
    return payee;
  }

  public void setPayee(final UserViewModel payee) {
    this.payee = payee;
  }

  public LocalDateTime getDate() {
    return date;
  }

  public void setDate(final LocalDateTime date) {
    this.date = date;
  }

  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(final BigDecimal amount) {
    this.amount = amount;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(final String description) {
    this.description = description;
  }

}
