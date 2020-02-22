package com.madhurtoppo.multiplication.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

/**
 * This class represents a Multiplication in our application.
 */
@RequiredArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "multiplication", catalog = "multiplier_challenge")
public class Multiplication {
  @Id
  @GeneratedValue
  @Column(name = "MULTIPLICATION_ID")
  private Long id;

  // Both factors
  private int factorA;
  private int factorB;

  public Multiplication(int factorA, int factorB) {
    this.factorA = factorA;
    this.factorB = factorB;
  }
}
