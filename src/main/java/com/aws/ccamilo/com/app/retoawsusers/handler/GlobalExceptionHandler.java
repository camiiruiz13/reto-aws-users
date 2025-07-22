package com.aws.ccamilo.com.app.retoawsusers.handler;

import com.aws.ccamilo.com.app.retoawsusers.commons.constast.ErrorException;
import com.aws.ccamilo.com.app.retoawsusers.exception.EntityMappingException;
import com.aws.ccamilo.com.app.retoawsusers.exception.UserAlreadyExistsException;
import com.aws.ccamilo.com.app.retoawsusers.exception.UserNotFoundException;
import com.aws.ccamilo.com.app.retoawsusers.exception.UserPersistenceException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<ErrorResponseDTO> handleUserNotFound(UserNotFoundException ex) {
        return new ResponseEntity<>(
                new ErrorResponseDTO(ex.getMessage(),ErrorException.USER_NOT_FOUND_ERROR_MESSAGE.getMessage()),
                HttpStatus.NOT_FOUND
        );
    }

    @ExceptionHandler(UserAlreadyExistsException.class)
    public ResponseEntity<ErrorResponseDTO> handleUserAlreadyExists(UserAlreadyExistsException ex) {
        return new ResponseEntity<>(
                new ErrorResponseDTO(ex.getMessage(),ErrorException.USER_WITH_IDENTIFICATION_EXISTS.getMessage()),
                HttpStatus.CONFLICT
        );
    }

    @ExceptionHandler(UserPersistenceException.class)
    public ResponseEntity<ErrorResponseDTO> handleUserPersistence(UserPersistenceException ex) {
        return new ResponseEntity<>(
                new ErrorResponseDTO(ex.getMessage(),ErrorException.USER_PERSISTENCE_ERROR_MESSAGE.getMessage()),
                HttpStatus.INTERNAL_SERVER_ERROR
        );
    }

    @ExceptionHandler(EntityMappingException.class)
    public ResponseEntity<ErrorResponseDTO> handleEntityMapping(EntityMappingException ex) {
        return new ResponseEntity<>(
                new ErrorResponseDTO(ex.getMessage(), ErrorException.ENTITY_MAPPING_ERROR_MESSAGE.getMessage()),
                HttpStatus.INTERNAL_SERVER_ERROR
        );
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponseDTO> handleGeneral(Exception ex) {
        return new ResponseEntity<>(
                new ErrorResponseDTO(ex.getMessage(), ErrorException.GENERAL_ERROR_MESSAGE.getMessage()),
                HttpStatus.INTERNAL_SERVER_ERROR
        );
    }
}
