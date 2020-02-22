package com.madhurtoppo.multiplication.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

/**
 * Stores information to identify the user
 */
@RequiredArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "user", catalog = "multiplier_challenge")
public class User {
  @Id
  @GeneratedValue
  @Column(name = "USER_ID")
  private Long id;

  private final String alias;

  // Empty constructor for JSON (de)serialization
  protected User() {
    alias = null;
  }
}