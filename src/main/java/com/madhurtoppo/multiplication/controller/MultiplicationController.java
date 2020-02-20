package com.madhurtoppo.multiplication.controller;

import com.madhurtoppo.multiplication.domain.Multiplication;
import com.madhurtoppo.multiplication.service.MultiplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/multiplications")
public class MultiplicationController {
  private final MultiplicationService multiplicationService;

  @Autowired
  public MultiplicationController(MultiplicationService multiplicationService) {
    this.multiplicationService = multiplicationService;
  }

  @GetMapping("/random")
  Multiplication getRandomMultiplication() {
    return multiplicationService.createRandomMultiplication();
  }
}
