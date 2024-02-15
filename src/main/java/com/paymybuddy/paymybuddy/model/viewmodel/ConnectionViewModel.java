package com.paymybuddy.paymybuddy.model.viewmodel;

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
public class ConnectionViewModel {

  private Integer id;
  private UserViewModel initializer;
  private UserViewModel receiver;
  private LocalDateTime startingDate;

  @Override
  public boolean equals(final Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectionViewModel connectionViewModel = (ConnectionViewModel) o;
    return (id.equals(connectionViewModel.id) &&
        initializer.equals(connectionViewModel.initializer) &&
        receiver.equals(connectionViewModel.receiver) &&
        startingDate.isEqual(connectionViewModel.startingDate));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, initializer, receiver, startingDate);
  }

  public Integer getId() {
    return id;
  }

  public void setId(final Integer id) {
    this.id = id;
  }

  public UserViewModel getInitializer() {
    return initializer;
  }

  public void setInitializer(final UserViewModel initializer) {
    this.initializer = initializer;
  }

  public UserViewModel getReceiver() {
    return receiver;
  }

  public void setReceiver(final UserViewModel receiver) {
    this.receiver = receiver;
  }

  public LocalDateTime getStartingDate() {
    return startingDate;
  }

  public void setStartingDate(final LocalDateTime startingDate) {
    this.startingDate = startingDate;
  }

}
