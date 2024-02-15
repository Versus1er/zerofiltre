package com.paymybuddy.paymybuddy.model.viewmodel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TransferViewModel {

  String payeeEmail;
  double amount;
  double amountWithFee;
  String description;

  public String getPayeeEmail() {
    return payeeEmail;
  }

  public void setPayeeEmail(final String payeeEmail) {
    this.payeeEmail = payeeEmail;
  }

  public double getAmount() {
    return amount;
  }

  public void setAmount(final double amount) {
    this.amount = amount;
  }

  public double getAmountWithFee() {
    return amountWithFee;
  }

  public void setAmountWithFee(final double amountWithFee) {
    this.amountWithFee = amountWithFee;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(final String description) {
    this.description = description;
  }

}
