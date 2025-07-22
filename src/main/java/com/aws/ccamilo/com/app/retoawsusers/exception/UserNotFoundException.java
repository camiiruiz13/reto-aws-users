package com.aws.ccamilo.com.app.retoawsusers.exception;

public class UserNotFoundException  extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message);
    }
}
