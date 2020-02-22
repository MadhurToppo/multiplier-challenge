/***
 * The Multiplier Challenge program implements an application that presents user
 * with a multiplication challenge to test their multiplying ability.
 *
 * @author Madhur Toppo
 * @version 1.0
 * @since 11-02-2020
 */
package com.madhurtoppo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class MultiplierChallengeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultiplierChallengeApplication.class, args);
	}
}
