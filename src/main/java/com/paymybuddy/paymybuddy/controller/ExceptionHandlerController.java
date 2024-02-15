package com.paymybuddy.paymybuddy.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.paymybuddy.paymybuddy.exceptions.AlreadyABuddyException;
import com.paymybuddy.paymybuddy.exceptions.BuddyNotFoundException;
import com.paymybuddy.paymybuddy.exceptions.EmailAlreadyUsedException;
import com.paymybuddy.paymybuddy.exceptions.InsufficientBalanceException;
import com.paymybuddy.paymybuddy.exceptions.InvalidAmountException;
import com.paymybuddy.paymybuddy.exceptions.InvalidPayeeException;
import com.paymybuddy.paymybuddy.exceptions.NotAuthenticatedException;

import lombok.extern.slf4j.Slf4j;

/**
 * Exception thrown when a resource is not found.
 */
@Slf4j
@RestControllerAdvice
public class ExceptionHandlerController {

  private static final Logger log = LoggerFactory.getLogger(ExceptionHandlerController.class);

  @ExceptionHandler(BuddyNotFoundException.class)
  @ResponseStatus(HttpStatus.NOT_FOUND)
  public String resourceNotFoundException(final BuddyNotFoundException notFoundException) {
    log.error("Resource not found.", notFoundException);
    return "Resource not found:\n" + notFoundException.getMessage();
  }

  @ExceptionHandler(InvalidAmountException.class)
  @ResponseStatus(HttpStatus.BAD_REQUEST)
  public String illegalValueException(final InvalidAmountException invalidAmountException) {
    log.error("Illegal argument value.", invalidAmountException);
    return "Illegal argument value:\n" + invalidAmountException.getMessage();
  }

  @ExceptionHandler(InvalidPayeeException.class)
  @ResponseStatus(HttpStatus.BAD_REQUEST)
  public String illegalValueException(final InvalidPayeeException invalidPayeeException) {
    log.error("Illegal argument value.", invalidPayeeException);
    return "Illegal argument value:\n" + invalidPayeeException.getMessage();
  }

  @ExceptionHandler(InsufficientBalanceException.class)
  @ResponseStatus(HttpStatus.BAD_REQUEST)
  public String illegalValueException(final InsufficientBalanceException insufficientBalanceException) {
    log.error("Illegal argument value.", insufficientBalanceException);
    return "Illegal argument value:\n" + insufficientBalanceException.getMessage();
  }

  @ExceptionHandler(AlreadyABuddyException.class)
  @ResponseStatus(HttpStatus.BAD_REQUEST)
  public String illegalValueException(final AlreadyABuddyException alreadyABuddyException) {
    log.error("Illegal argument value.", alreadyABuddyException);
    return "Illegal argument value:\n" + alreadyABuddyException.getMessage();
  }

  @ExceptionHandler(EmailAlreadyUsedException.class)
  @ResponseStatus(HttpStatus.BAD_REQUEST)
  public String illegalValueException(final EmailAlreadyUsedException emailAlreadyUsedException) {
    log.error("Illegal argument value.", emailAlreadyUsedException);
    return "Illegal argument value:\n" + emailAlreadyUsedException.getMessage();
  }

  @ExceptionHandler(NotAuthenticatedException.class)
  @ResponseStatus(HttpStatus.UNAUTHORIZED)
  public String notAuthenticatedException(final NotAuthenticatedException notAuthenticatedException) {
    log.error("Not authenticated", notAuthenticatedException);
    return "Unauthorized.\n" + notAuthenticatedException.getMessage();
  }

  @ExceptionHandler(Exception.class)
  @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
  public String returnMessage(final Exception exception) {
    log.error("An error occurred.", exception);
    return "An error occurred:\n " + exception.getMessage();
  }
}
