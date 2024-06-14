package pl.pjatk.RentalService.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import pl.pjatk.RentalService.exception.ExceptionEvent;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler({ExceptionEvent.class})
    public ResponseEntity<String> handleException(ExceptionEvent exceptionEvent) {
        return ResponseEntity.status(exceptionEvent.getHttpStatus())
                .contentType(MediaType.APPLICATION_JSON)
                .body(exceptionEvent.getErrorMessage());
    }
}
