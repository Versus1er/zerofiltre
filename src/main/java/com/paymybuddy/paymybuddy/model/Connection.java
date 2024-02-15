package com.paymybuddy.paymybuddy.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "connection")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Connection {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "connection_id")
  private Integer id;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "fk_initializer_id")
  private User initializer;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "fk_receiver_id")
  private User receiver;

  private LocalDateTime startingDate;

  public Integer getId() {
    return id;
  }

  public void setId(final Integer id) {
    this.id = id;
  }

  public User getInitializer() {
    return initializer;
  }

  public void setInitializer(final User initializer) {
    this.initializer = initializer;
  }

  public User getReceiver() {
    return receiver;
  }

  public void setReceiver(final User receiver) {
    this.receiver = receiver;
  }

  public LocalDateTime getStartingDate() {
    return startingDate;
  }

  public void setStartingDate(final LocalDateTime startingDate) {
    this.startingDate = startingDate;
  }

}
