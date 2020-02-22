package com.madhurtoppo.multiplication.controller;

import com.madhurtoppo.multiplication.domain.MultiplicationResultAttempt;
import com.madhurtoppo.multiplication.service.MultiplicationService;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/results")
final class MultiplicationResultAttemptController {
  private final MultiplicationService multiplicationService;

  @Autowired
  public MultiplicationResultAttemptController(
  final MultiplicationService multiplicationService) {
          this.multiplicationService = multiplicationService;
  }

  // Here we'll implement our POST later
  @PostMapping
  ResponseEntity<MultiplicationResultAttempt> postResult(@RequestBody MultiplicationResultAttempt multiplicationResultAttempt) {
    boolean isCorrect = multiplicationService.checkAttempt(multiplicationResultAttempt);
    MultiplicationResultAttempt attemptCopy = new MultiplicationResultAttempt(
      multiplicationResultAttempt.getUser(),
      multiplicationResultAttempt.getMultiplication(),
      multiplicationResultAttempt.getResultAttempt(),
      isCorrect
    );
    //return ResponseEntity.ok(new ResultResponse(multiplicationService.checkAttempt(multiplicationResultAttempt)));
    //return null;
    //return ResponseEntity.ok(newResultResponse(multiplicationService.checkAttempt(attemptCopy)));
    return ResponseEntity.ok(attemptCopy);
  }

  @RequiredArgsConstructor
  @NoArgsConstructor(force = true)
  @Getter
  public static class ResultResponse {
    private final boolean correct;
  }
}
