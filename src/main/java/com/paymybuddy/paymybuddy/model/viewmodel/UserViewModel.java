package com.paymybuddy.paymybuddy.model.viewmodel;

import java.math.BigDecimal;
import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserViewModel {

  private Integer id;
  private String email;
  private String firstname;
  private String lastname;
  private BigDecimal balance;

  @Override
  public boolean equals(final Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserViewModel userViewModel = (UserViewModel) o;
    if (userViewModel.balance == null) {
      userViewModel.balance = new BigDecimal("0.00"); // add check of null value
    }
    return (id.equals(userViewModel.id) &&
        email.equalsIgnoreCase(userViewModel.email) &&
        firstname.equalsIgnoreCase(userViewModel.firstname) &&
        lastname.equalsIgnoreCase(userViewModel.lastname) &&
        balance.equals(userViewModel.balance));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, email, firstname, lastname, balance);
  }

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

  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(final String firstname) {
    this.firstname = firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(final String lastname) {
    this.lastname = lastname;
  }

  public BigDecimal getBalance() {
    return balance;
  }

  public void setBalance(final BigDecimal balance) {
    this.balance = balance;
  }

}
